public class Usuario {
    private String nome;
    private String id;
    private String email;
    private Livro[] livrosEmprestados;
    private int livrosEmPosse;

    public Usuario(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.livrosEmprestados = new Livro[5];
        this.livrosEmPosse = 0;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("E-mail: " + email);
        System.out.println("Livros em Posse: " + livrosEmPosse);
        for (int i = 0; i < livrosEmPosse; i++) {
            livrosEmprestados[i].exibirInfo();
        }
    }

    public boolean podeEmprestar() {
        return livrosEmPosse < 5;
    }

    public void emprestarLivro(Livro livro) {
        if (podeEmprestar()) {
            livrosEmprestados[livrosEmPosse] = livro;
            livrosEmPosse++;
            livro.emprestar();
        } else {
            System.out.println("Limite de empréstimos atingido.");
        }
    }

    public void devolverLivro(Livro livro) {
        for (int i = 0; i < livrosEmPosse; i++) {
            if (livrosEmprestados[i].equals(livro)) {
                livrosEmprestados[i] = livrosEmprestados[livrosEmPosse - 1];
                livrosEmprestados[livrosEmPosse - 1] = null;
                livrosEmPosse--;
                livro.devolver();
                break;
            }
        }
    }
}
