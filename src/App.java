import domain.model.Agencia;
import domain.model.Pessoa;
import domain.model.conta;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        try {

        Agencia agencia = new Agencia();
        Pessoa pessoa = new Pessoa(nome:"Carla Dias", email:"carladias@email.com",tel:"+55 (21) 4444-55555");
        conta Conta = new conta();


        agencia.nome = "campo grande";
        agencia.numero = "001";
        agencia.email = "campogrande@bankweb.com";
        agencia.tel = "+55 (21) 555-55555";

        pessoa.setcpf("111.222.444.-99");
        pessoa.setNome("Carla Dias");
        pessoa.getTel("+55 (21) 4444-55555");
        pessoa.getEmail("carladias@email.com");

        conta.numero = "100001";
        conta.agencia = agencia;
        conta.pessoa = pessoa;
        conta.saldo = 1000;
        
        System.out.println("Agencia: "+ conta.agencia.nome);
        System.out.println("Cliente:"+ conta.pessoa.nome);
        System.out.println("Saldo:" + conta.saldo);
         catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        // TODO: handle exception
    }
}
