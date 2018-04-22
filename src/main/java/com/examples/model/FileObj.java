package com.examples.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="files")
public class FileObj {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="text")
    private String text;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "file", cascade = CascadeType.ALL)
    private List<LineObj> linesList;

    public FileObj() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<LineObj> getLinesList() {
        return linesList;
    }

    public void setLinesList(List<LineObj> linesList) {
        this.linesList = linesList;
    }


    @Override
    public String toString() {
        return "FileObj{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", linesList=" + linesList +
                '}';
    }
}
