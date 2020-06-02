package org.fundacion.s;


import java.util.ArrayList;
import java.util.List;

public class PostStructure {

    private  ArrayList<Post> publicaciones = new ArrayList<>();

    public  PostStructure(Post [] posts) {
        for(Post post : posts){
            this.publicaciones.add(post);
        }
    }

    public int size(){
        return publicaciones.size();
    }

    public Post get(int index){
        return publicaciones.get(index);
    }

}
