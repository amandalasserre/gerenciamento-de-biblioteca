package org.example;

public abstract class Livro implements Catalogavel {
    private final String titulo;
    private final int anoDePublicacao;
    private final Autor nomeDoAutor;
    private final Categoria categoriaDoLivro;

    public Livro(String titulo, int anoDePublicacao, Autor nomeDoAutor,Categoria categoriaDoLivro){
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.nomeDoAutor = nomeDoAutor;
        this.categoriaDoLivro = categoriaDoLivro;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public Autor getNomeDoAutor() {
        return nomeDoAutor;
    }

    public Categoria getCategoriaDoLivro() {
        return categoriaDoLivro;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " (" + anoDePublicacao + ") - " + nomeDoAutor + " - " + categoriaDoLivro;
    }

    public abstract void exibirDetalhes();
}
