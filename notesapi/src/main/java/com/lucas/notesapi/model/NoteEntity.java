package com.lucas.notesapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NoteEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    public NoteEntity(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    protected NoteEntity() {
    }

    @Override
    public String toString() {
        return "NoteEntity [id=" + id + ", title=" + title + ", content=" + content + "]";
    }


    //Getter
    public Long getId() {
        return id;
    }

   public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    //Setter
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
