import domain.model.Agencia;
import domain.model.Pessoa;
import domain.model.conta;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Agencia agencia = new Agencia();
        Pessoa pessoa = new Pessoa();
        conta conta = new conta();


        agencia.nome = "campo grande";
        agencia.numero = "001";
        agencia.email = "campogrande@bankweb.com";
        agencia.tel = "+55 (21) 555-55555";

        pessoa.cpf = "111.222.444.-99";
        pessoa.nome = "carla dias";
        pessoa.tel = "+55 (21) 4444-55555";
        pessoa.email = "carladias@email.com";

        conta.numero = "100001";
        conta.agencia = agencia;
        conta.pessoa = pessoa;
        conta.saldo = 1000;
        
        System.out.println("Agencia: "+ conta.agencia.nome);
        System.out.println("Cliente:"+ conta.pessoa.nome);
        System.out.println("Saldo:" + conta.saldo);
    }
}
