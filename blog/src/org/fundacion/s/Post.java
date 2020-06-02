package org.fundacion.s;

import java.util.ArrayList;
import java.util.Date;
import java.util.EmptyStackException;

public class Post {

    private String title;

    private Date date;

    private String author;

    private String content;


    private ArrayList<Comment> comentarios = new ArrayList<>();


    public Post(String title, Date date, String author, String content) {
        this.title = title;
        this.date = date;
        this.author = author;
        this.content = content;

    }

    public void addcommentss(String content, String author, Date date){
        Comment comment = new Comment(date, author, content);
        comentarios.add(0, comment);
    }

    public int numberCommentaries(){
        return comentarios.size();
    }

    public Comment getComment(int index){
        return comentarios.get(index);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCommentSize(){
        return comentarios.size();
    }

}
