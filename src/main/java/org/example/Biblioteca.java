package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Catalogavel> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        this.itens.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    public void cadastrarRevista(Revista revista) {
        this.itens.add(revista);
        System.out.println("Revista cadastrada: " + revista.getTitulo());
    }

    public void descadastrarItemPorTitulo(String titulo) {
        boolean removido = false;
        for (Catalogavel item : itens) {
            if (item instanceof Livro && ((Livro) item).getTitulo().equalsIgnoreCase(titulo)) {
                this.itens.remove(item);
                removido = true;
                System.out.println("Item descadastrado: " + ((Livro) item).getTitulo());
                break;
            } else if (item instanceof Revista && ((Revista) item).getTitulo().equalsIgnoreCase(titulo)) {
                this.itens.remove(item);
                removido = true;
                System.out.println("Item descadastrado: " + ((Revista) item).getTitulo());
                break;
            }
        }
        if (!removido) {
            System.out.println("Erro: Item '" + titulo + "' nao encontrado para remocao.");
        }
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("A biblioteca esta vazia.");
            return;
        }

        System.out.println("\n---Acervo da Biblioteca ---");
        for (Catalogavel item : itens) {
            item.exibirDetalhes();
        }
    }
}