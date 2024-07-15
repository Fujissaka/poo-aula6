package biblioteca;

import java.util.ArrayList;

class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        this.acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
    }

    boolean removerLivro(String isbn) {
        for (Livro livro : this.acervo) {
            if (isbn.equals(livro.isbn)) {
                this.acervo.remove(livro);

                return true;
            }
        }

        return false;
    }

    ArrayList<Livro> listaEmprestados() {
        ArrayList<Livro> emprestados = new ArrayList<Livro>();

        for (Livro livro : this.acervo) {
            if (livro.isEmprestado()) {
                emprestados.add(livro);
            }
        }
        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<Livro>();

        for (Livro livro : this.acervo) {
            if (!livro.isEmprestado()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
}
