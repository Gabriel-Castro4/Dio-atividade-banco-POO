import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaUsuario conta1 = new ContaUsuario();

        /*System.out.println("Bem vindo ao banco ....");
        System.out.println("Digite seu nome: ");
        String nomeUser = scan.next();
        System.out.println("Digite sua senha: ");
        String senha = scan.next();
        System.out.println("Digite seu CPF: ");
        String cpf = scan.next();
        System.out.println("Digite seu saldo: ");
        Double saldo = scan.nextDouble();

         */

        /*conta1.setNomeUser(nomeUser);
        conta1.setSenha(senha);
        conta1.setCpf(cpf);
        conta1.setSaldo(saldo);

         */
        conta1.consultarSaldo();
        conta1.consultarChequeEspecial();


    }

}
