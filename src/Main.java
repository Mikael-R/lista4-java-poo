public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java: Como Programar", "Deitel", "123456789", 2015, 3);
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", "987654321", 2008, 2);

        Usuario usuario1 = new Usuario("João", "001", "joao@example.com");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua Principal, 123");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.exibirInfo();

        biblioteca.verificarDisponibilidade("Java: Como Programar");

        biblioteca.emprestar(usuario1, "Java: Como Programar");

        usuario1.exibirInfo();

        biblioteca.devolver(usuario1, "Java: Como Programar");

        usuario1.exibirInfo();
    }
}
