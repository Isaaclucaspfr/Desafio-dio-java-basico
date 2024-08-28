import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero; String agencia,nome_cliente; float saldo;

        System.out.println("Ola! Sou o assistente do unibanco e irei começar seu atendimento. \n Por favor digite o seu nome: ");
        nome_cliente = input.nextLine();
        System.out.println("Agora digite a sua agencia: ");
        agencia = input.nextLine();
        

        do{
            System.out.println("E por ultimo, digite seu numero da conta: ");
            numero = input.nextInt();
            if (numero < 1000000 || numero > 9999999) {
                System.out.println("Numero invalido! O numero deve contar exatamente 7 digitos.)");
            }
        } while (numero < 1000000 || numero > 9999999);
        saldo = (float)(Math.random()* 1000000);
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " reais já está disponível para saque.");
    }
}
