package org.fundacion.s;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Application {

    private static PostStructure postStructure;


    public static void main(String[] args) throws Exception {
        boolean appRunning = true;

        initializePosts();
        while(appRunning){
            showPosts();
            String option = askForAnOption();
            if("s".equals(option)){
                appRunning = false;
            }
            else{
                showPost(Integer.valueOf(option));
            }
        }
    }

    private static void initializePosts() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        postStructure = new PostStructure(new Post[]{
                new Post("This is my first Post!!", format.parse("05/01/2020"), "JuanD",
                        "This is the content of my first post. \n \n more content here!!"),
                new Post("Working from home", format.parse("05/10/2020"), "Diego",
                        "Working from home rocks!!"),
                new Post("Programming in Java", format.parse("05/15/2020"), "Diego",
                        "These are my experiences working with Java. \n Java is awesome but...")
        });
    }

    private static void showPosts() {
        System.out.println("*********************************************************");
        System.out.println("                      Posts                              ");
        System.out.println("*********************************************************");

        // TODO Completar. Se deben mostrar las entradas de los post tal cual como se detalla en el enunciado del
        //      proyecto

        int sizeOfPublicaciones = postStructure.size();
        for(int i = 0; i < sizeOfPublicaciones; i++){
            Post post = postStructure.get(i);
            System.out.println("("+ Integer.toString(i) +") Titulo: " + post.getTitle());
            System.out.println("    Fecha: " + post.getDate().toString() + "  -  Autor: " + post.getAuthor());
        }
    }

    private static String askForAnOption(){
        Scanner in = new Scanner(System.in);
        System.out.print("Para ver alguna entrada escriba el número de la misma, sino escriba 's' para salir:\t");
        return in.nextLine();
    }

    private static void showPost(Integer postId) {

        Post post = postStructure.get(postId);
        System.out.println("*********************************************************");
        System.out.println("                   " + post.getTitle());
        System.out.println("*********************************************************");

        System.out.printf("Fecha: %td, - Autor: %s", post.getDate(), post.getAuthor());
        System.out.print("\n");

        System.out.println(post.getContent());
        System.out.print("\n");
        System.out.print("-----------\n");

        System.out.println("Comentarios: ");
        System.out.print("\n");
            for(int i = 0;i < post.getCommentSize(); i++){
                Comment comment = post.getComment(i);
                System.out.println("     Fecha:" + comment.getDate().toString() + "-" + "Autor: " + comment.getAuthor());
                System.out.println("     "+comment.getContent());
                System.out.println("    ----");
            }
            System.out.println();


        boolean showOptions = true;
        while(showOptions){
            showPostOptions();
            int postOption = askForAPostOption();
            if(postOption == 2){
                showOptions = false;
            }
            else{
                addComment(postId);
            }
        }
    }

    private static void addComment(Integer postId) {

        String jesus;
        String maria;
        String autor = null;
        String coment = null;

        Scanner textIn = new Scanner(System.in);
        System.out.println("Autor: ");
        jesus = textIn.nextLine();

        if(jesus.length() > 0 && jesus.length() <= 10){
            autor = jesus;
        }else if(jesus.length() > 10){
            System.out.println("Nombre muy largo, menos de 10 caracteres o sin nombre");
            addComment(postId);
        }else{
            autor = "anonimo";
        }

        Scanner comentario = new Scanner(System.in);
        System.out.println("Comentario: ");
        maria = comentario.nextLine();

        if(maria.length() > 0 && maria.length() <= 100){
            coment = maria;
        }else {
            System.out.println("Comentario muy largo, tiene que ser menor a 100 caracteres");
            addComment(postId);
        }

        Date fecha = new Date();

        Post post = postStructure.get(postId);

        post.addcommentss(coment, autor, fecha);

        showPost(postId);
    }

    private static void showPostOptions(){
        System.out.println("*********************************************************");
        System.out.println("Por favor digite la opción para continuar.");
        System.out.println("(1) Agregar un comentario");
        System.out.println("(2) Volver a la lista de los post");
        System.out.println("");
    }

    private static int askForAPostOption() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite su opción:\t");
        return in.nextInt();
    }


}
