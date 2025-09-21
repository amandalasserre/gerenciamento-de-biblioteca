package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        adicionarItem(minhaBiblioteca, scanner);
                        break;
                    case 2:
                        removerItem(minhaBiblioteca, scanner);
                        break;
                    case 3:
                        minhaBiblioteca.listarItens();
                        break;
                    case 0:
                        System.out.println("Saindo do programa. Ate mais!");
                        break;
                    default:
                        System.out.println("Opção invalida. Por favor, escolha uma opcao entre 0 e 3.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                scanner.nextLine();
                opcao = -1;
            }
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Gerenciador de Biblioteca ---");
        System.out.println("1. Adicionar novo item (Livro ou Revista)");
        System.out.println("2. Remover item por titulo");
        System.out.println("3. Listar todos os itens");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static void adicionarItem(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("\n--- Adicionar Novo Item ---");
        System.out.print("Digite o tipo do item (livro/revista): ");
        String tipoItem = scanner.nextLine().toLowerCase();

        if (tipoItem.equals("livro")) {
            System.out.print("Digite o tipo do livro (fisico/digital): ");
            String tipoLivro = scanner.nextLine().toLowerCase();

            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();

            System.out.print("Ano de Publicacao: ");
            int anoPublicacao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome do Autor: ");
            String nomeAutor = scanner.nextLine();

            System.out.print("Nacionalidade do Autor: ");
            String nacionalidadeAutor = scanner.nextLine();

            System.out.print("Categoria: ");
            String categoria = scanner.nextLine();

            Autor autor = new Autor(nomeAutor, nacionalidadeAutor);
            Categoria cat = new Categoria(categoria);

            if (tipoLivro.equals("fisico")) {
                System.out.print("Localizacao: ");
                String localizacao = scanner.nextLine();
                LivroFisico livro = new LivroFisico(titulo, anoPublicacao, autor, cat, localizacao);
                biblioteca.cadastrarLivro(livro);
            } else if (tipoLivro.equals("digital")) {
                System.out.print("Formato (PDF ou EPUB): ");
                String formato = scanner.nextLine();
                LivroDigital livro = new LivroDigital(titulo, anoPublicacao, autor, cat, formato);
                biblioteca.cadastrarLivro(livro);
            } else {
                System.out.println("Tipo de livro invalido. Nenhum item foi adicionado.");
            }
        } else if (tipoItem.equals("revista")) {
            System.out.print("Titulo da Revista: ");
            String tituloRevista = scanner.nextLine();

            System.out.print("Numero da Edicao: ");
            int numeroEdicao = scanner.nextInt();
            scanner.nextLine();

            Revista revista = new Revista(tituloRevista, numeroEdicao);
            biblioteca.cadastrarRevista(revista);
        } else {
            System.out.println("Tipo de item invalido. Por favor, digite 'livro' ou 'revista'.");
        }
    }

    private static void removerItem(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("\n--- Remover Item ---");
        System.out.print("Digite o titulo do item a ser removido: ");
        String titulo = scanner.nextLine();

        biblioteca.descadastrarItemPorTitulo(titulo);
    }
}