package pjs;

public class Main {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new PessoaFisica();
        pessoa1.setNome("Venilton");
        
        Pessoa pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Luiz");
        
        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
