package pjs.composicao;

public class Capitulo {
    
    private Livro livro;

    public Capitulo(Livro livro) {
        this.livro = livro;
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
}
