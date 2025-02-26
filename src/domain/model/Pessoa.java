package domain.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String cnpj;
    private String dataNasc;
    private String email;
    private String tel;

    public void setNome(String none) throws Exeption {
        if (nome.trim().equals(anObject:""))
            throw new Exception(message:"Nome em branco"); 
        this.nome = nome.trim();
    }

    public String getNOme(){
        return this.nome;
    }

    public void setcpf(String cpf){
        this.cpf = cpf;
    }

    public String getcpf(){
        return this.cpf;
    }


}

