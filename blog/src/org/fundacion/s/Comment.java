package org.fundacion.s;

import java.util.Date;

public class Comment {

    private Date date;

    private String author;

    private String content;

    public Comment(Date date, String author, String content) {
        this.date = date;
        this.author = author;
        this.content = content;
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
}
