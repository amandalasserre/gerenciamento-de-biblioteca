package org.example;

public class LivroFisico extends Livro implements Emprestavel {
    private String localizacao;
    private boolean emprestado;

    public LivroFisico(String titulo, int anoPublicacao, Autor autor, Categoria categoria, String localizacao) {
        super(titulo, anoPublicacao, autor, categoria);
        this.localizacao = localizacao;
        this.emprestado = false;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Localizacao Fisica: " + localizacao;
    }

    @Override
    public void emprestar() {
        if (!estaEmprestado()) {
            this.emprestado = true;
            System.out.println("O livro '" + this.getTitulo() + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + this.getTitulo() + "' já esta emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (estaEmprestado()) {
            this.emprestado = false;
            System.out.println("O livro '" + this.getTitulo() + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + this.getTitulo() + "' nao estava emprestado.");
        }
    }

    @Override
    public boolean estaEmprestado() {
        return this.emprestado;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Livro Fisico: " + this.toString() + ", Status: " + (this.estaEmprestado() ? "Emprestado" : "Disponivel"));
    }
}

