package pjs.composicao;

public class Main {
    
    public static void main(String[] args) {
        Livro livro = new Livro();
        Capitulo cap1 = new Capitulo(livro);
        Capitulo cap2 = new Capitulo(livro);
        Capitulo cap3 = new Capitulo(livro);
        Capitulo cap4 = new Capitulo(livro);
    }
}
