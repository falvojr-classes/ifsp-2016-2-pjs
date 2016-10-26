package pjs.agregacao;

public class Main {
    
    public static void main(String[] args) {
        Equipe equipe = new Equipe();
        
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();
        
        equipe.getJogadores().add(j1);
        equipe.getJogadores().add(j2);
    }
}
