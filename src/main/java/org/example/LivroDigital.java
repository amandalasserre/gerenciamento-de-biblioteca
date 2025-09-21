package org.example;

public class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(String titulo, int anoDePublicacao, Autor nomeDoAutor, Categoria categoriaDoLivro, String formato) {
        super(titulo, anoDePublicacao, nomeDoAutor, categoriaDoLivro);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Livro Digital: " + this.toString());
    }
}

