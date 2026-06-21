package com.example.escola.aluno;


public class AlunoRequest {
    private String nome;
    private String curso;
    private int idade;
    private Long professorId;
    public AlunoRequest() {}

    public AlunoRequest(String nome, String curso, int idade, Long professorId) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.professorId = professorId;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }

    public Long getProfessorId() {
        return professorId;
    }

}
