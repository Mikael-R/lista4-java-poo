public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return quantidadeEstoque > 0;
    }

    public void emprestar() {
        if (quantidadeEstoque > 0) {
            quantidadeEstoque--;
        } else {
            System.out.println("Nenhum exemplar disponível.");
        }
    }

    public void devolver() {
        quantidadeEstoque++;
    }
}
