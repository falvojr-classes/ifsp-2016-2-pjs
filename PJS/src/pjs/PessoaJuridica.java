package pjs;

public class PessoaJuridica extends Pessoa  {
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void apresentar() {
        
    }
}
