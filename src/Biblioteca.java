import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livrosDisponiveis;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        if (livrosDisponiveis.size() < 100) {
            livrosDisponiveis.add(livro);
        } else {
            System.out.println("Limite de livros na biblioteca atingido.");
        }
    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("Livro disponível.");
                } else {
                    System.out.println("Livro indisponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void localizarLivroPorTitulo(String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.exibirInfo();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void localizarLivroPorAutor(String autor) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livro.exibirInfo();
            }
        }
    }

    public void emprestar(Usuario usuario, String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel() && usuario.podeEmprestar()) {
                    usuario.emprestarLivro(livro);
                    System.out.println("Livro emprestado com sucesso.");
                } else {
                    System.out.println("Empréstimo não disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolver(Usuario usuario, String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                usuario.devolverLivro(livro);
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void exibirInfo() {
        System.out.println("Nome da Biblioteca: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Livros disponíveis:");
        for (Livro livro : livrosDisponiveis) {
            livro.exibirInfo();
        }
    }
}
