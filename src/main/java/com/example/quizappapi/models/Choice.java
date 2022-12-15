package com.example.quizappapi.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Choice {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @OneToMany(mappedBy = "choice", cascade={CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<Answer> answers;

    private Long id;

    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "quiz=" + quiz +
                ", answers=" + answers +
                ", id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
