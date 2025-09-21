## Requisitos do Projeto
O sistema deve ser estruturado e implementado para cumprir os seguintes requisitos:

1. Modelagem de Dados e Estrutura
  - Crie classes base como Livro, Autor e Categoria, aplicando encapsulamento e composição.
  - Utilize herança para criar subclasses de Livro: LivroDigital e LivroFisico.
  - Refatore as classes Autor e Categoria para serem records, garantindo imutabilidade e concisão no código.
    
2. Interfaces e Polimorfismo
  - Defina duas interfaces:
    - Emprestavel: para itens que podem ser emprestados (como livros e revistas).
    - Catalogavel: para itens que podem ser catalogados na biblioteca.
  - Implemente essas interfaces nas classes Livro e em uma nova classe Revista.
  - Desenvolva métodos que utilizem polimorfismo para buscar e filtrar itens de forma genérica, sem depender do tipo exato do objeto.

3. Gerenciamento e Tipos de Usuário
  - Crie a classe principal Biblioteca para gerenciar a coleção de itens. Ela deve ter métodos para adicionar, remover, listar e buscar itens.
  - Implemente um sistema de perfis de usuário usando sealed classes. Defina uma classe base PerfilUsuario com subtipos controlados como Bibliotecario e UsuarioComum.
  - Utilize text blocks para criar mensagens e relatórios formatados de maneira clara e legível para cada tipo de usuário.
    
4. Controle de Fluxo Avançado
  - Aplique switch expressions para gerenciar o estado dos empréstimos (por exemplo, "disponível", "emprestado", "atrasado").
  - Use pattern matching para lidar com diferentes tipos de itens (Livro, Revista) de maneira eficiente, permitindo operações específicas para cada um em um único bloco de código.
    
Desafio de Integração
  - O desafio final é garantir que todas as partes do sistema funcionem juntas de forma harmoniosa. Seu código deve ser coeso, ter baixo acoplamento e seguir as melhores práticas de design. Ao final, seu projeto deve ser uma solução completa e funcional, demonstrando sua habilidade em arquitetar e implementar uma aplicação do zero.
