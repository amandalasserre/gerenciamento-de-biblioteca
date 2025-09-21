package org.example;

public class Revista implements Catalogavel, Emprestavel {
    private final String titulo;
    private final int numeroEdicao;
    private boolean emprestado;

    public Revista(String titulo, int numeroEdicao) {
        this.titulo = titulo;
        this.numeroEdicao = numeroEdicao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da Revista: " + this.toString() + ", Status: " + (estaEmprestado() ? "Emprestada" : "Disponivel"));
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + " (Edicao #" + numeroEdicao + ")";
    }

    @Override
    public void emprestar() {
        if (!estaEmprestado()) {
            this.emprestado = true;
            System.out.println("A revista '" + this.titulo + "' foi emprestada.");
        } else {
            System.out.println("A revista '" + this.titulo + "' já está emprestada.");
        }
    }

    @Override
    public void devolver() {
        if (estaEmprestado()) {
            this.emprestado = false;
            System.out.println("A revista '" + this.titulo + "' foi devolvida.");
        } else {
            System.out.println("A revista '" + this.titulo + "' não estava emprestada.");
        }
    }

    @Override
    public boolean estaEmprestado() {
        return this.emprestado;
    }
}
