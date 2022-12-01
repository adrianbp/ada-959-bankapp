import br.com.ada.modelo.*;

public class Aplicacao {
    public static void main(String[] args) {


        System.out.println("Cenario 1 - Criacao Conta PF");

        Cpf cpf = new Cpf("111.111.111-11");
        ClientPf clientePF = new ClientPf("Joao", cpf);

        Cpf cpf2 = new Cpf("111.111.111-11");
        ClientPf clientePF2 = new ClientPf("maria", cpf);

        ContaCorrentePF contaCorrentePF = new ContaCorrentePF("001",clientePF,0.0);
        ContaCorrentePF contaCorrentePF2 = new ContaCorrentePF("002",clientePF2,0.0);

        System.out.println("Salado Conta Origem Inicial " + contaCorrentePF.getSaldo() );

        contaCorrentePF.depositar(10.00);

        System.out.println("Saldo Conta Origem apos deposito " + contaCorrentePF.getSaldo() );

        contaCorrentePF.sacar(2.00);

        System.out.println("Salado Conta Origem apos saque " + contaCorrentePF.getSaldo() );

        System.out.println("Saldo Conta Destino Inicial " + contaCorrentePF2.getSaldo());

        contaCorrentePF.trasnferir(contaCorrentePF2,1.00);

        System.out.println("Salado Conta Origem apos transferencia " + contaCorrentePF.getSaldo() );
        System.out.println("Saldo Conta Destino apos trasnferencia " + contaCorrentePF2.getSaldo());


        System.out.println("Cenario 2 - Criacao Conta PJ");

        Cnpj cnpj = new Cnpj("11. 111. 111/0001-11");
        ClientePj clientePj = new ClientePj("Joao", cnpj);



        ContaCorrentePJ contaCorrentePJ = new ContaCorrentePJ("001",clientePj,0.0);

        System.out.println("Salado Conta Origem PJ Inicial " + contaCorrentePJ.getSaldo() );

        contaCorrentePJ.depositar(10.00);

        System.out.println("Saldo Conta Origem PJ apos deposito " + contaCorrentePJ.getSaldo() );

        contaCorrentePJ.sacar(2.00);

        System.out.println("Salado Conta Origem PJ apos saque " + contaCorrentePJ.getSaldo() );

        System.out.println("Saldo Conta Destino Inicial " + contaCorrentePF2.getSaldo());

        contaCorrentePJ.trasnferir(contaCorrentePF2,1.00);

        System.out.println("Salado Conta Origem PJ apos transferencia " + contaCorrentePJ.getSaldo() );
        System.out.println("Saldo Conta Destino apos trasnferencia " + contaCorrentePF2.getSaldo());



    }
}