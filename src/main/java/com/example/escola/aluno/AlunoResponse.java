package com.example.escola.aluno;

public class AlunoResponse {
    private Long id;
    private String nome;
    private String curso;
    private String professorNome;

    public AlunoResponse(Long id, String nome, String curso, String professorNome) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.professorNome = professorNome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCurso() {
        return curso;
    }

    public String getProfessorNome() {
        return professorNome;
    }
}