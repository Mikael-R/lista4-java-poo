# Sistema de Gerenciamento de Biblioteca

## Descrição
Você foi contratado para desenvolver um sistema de gerenciamento de biblioteca que permitirá aos usuários realizar diversas operações, como cadastrar livros, verificar disponibilidade, empréstimos e devoluções. O sistema deve ser baseado em objetos e classes para facilitar a organização e reutilização do código.

## Classes e seus requisitos

### 1. Classe Livro
#### 1.1. Atributos:
- Título
- Autor
- ISBN
- Ano de Publicação
- Quantidade em Estoque

#### 1.2. Métodos:
- `exibirInfo()`: Exibe informações detalhadas sobre o livro.

---

### 2. Classe Usuário (aluno e professor)
#### 2.1. Atributos:
- Nome
- ID
- E-mail
- Livros em posse (limite de 5 livros)

#### 2.2. Métodos:
- `exibirInfo()`: Exibe informações detalhadas sobre o usuário.

---

### 3. Classe Biblioteca
#### 3.1. Atributos:
- Nome
- Endereço
- Lista de Livros Disponíveis (limite de 100 livros)

#### 3.2. Métodos:
- `verificarDisponibilidade()`: Verifica se há pelo menos um exemplar disponível em estoque.
- `cadastrarLivro()`: Adiciona um novo livro à lista de livros disponíveis.
- `localizarLivroPorTitulo()`: Permite a busca de livros por título.
- `localizarLivroPorAutor()`: Permite a busca de livros por autor.
- `devolver()`: Registra a devolução do livro, incrementando a quantidade em estoque.
- `emprestar()`: Registra o empréstimo do livro, decrementando a quantidade em estoque.
- `exibirInfo()`: Exibe informações detalhadas sobre o livro.
