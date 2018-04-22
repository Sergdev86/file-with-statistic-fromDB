package com.examples.model;

import javax.persistence.*;

@Entity
@Table(name="lines_statistic")
public class LineObj {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="line")
    private String line;

    @Column(name="line_length")
    private int lineLength;

    @Column(name="min_word")
    private int minWord;

    @Column(name="max_word")
    private int maxWord;

    @Column(name="average_word")
    private int averageWord;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="file_id", nullable = false)
    private FileObj file;

    public LineObj() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getLineLength() {
        return lineLength;
    }

    public void setLineLength(int lineLength) {
        this.lineLength = lineLength;
    }

    public int getMinWord() {
        return minWord;
    }

    public void setMinWord(int minWord) {
        this.minWord = minWord;
    }

    public int getMaxWord() {
        return maxWord;
    }

    public void setMaxWord(int maxWord) {
        this.maxWord = maxWord;
    }

    public int getAverageWord() {
        return averageWord;
    }

    public void setAverageWord(int averageWord) {
        this.averageWord = averageWord;
    }



}
