package co.marcoantonio.bank;

import java.util.Scanner;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank santander = new Bank("0001");
        //C = Criar conta
        //E  = Sair(exit)
        while(true){
            System.out.println("O que deseja fazer? C=Criar Conta, E=Sair");
            String op = scanner.nextLine();

            if(op.equals("C")){
                System.out.print("Digite o seu nome: ");
                String name = scanner.nextLine();

                Account account = santander.generateAccount(name);
                santander.insertAccount(account);

                operateAccount(account);

            }else if( op.equals("E")){
                break;
            }
        }

        List<Account> accountsList = santander.getAccounts();
        for(Account cc: accountsList){
            System.out.println(cc);
        }
        santander.outputTotal();

    }


    static void operateAccount(Account account){

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("O que deseja fazer? D=Deseposito, S=Sacar, E=Sair da Conta");
            String op = scanner.nextLine();

            if(op.equals("D")){
                System.out.println("Qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);

            }else if(op.equals("S")){

                System.out.println("Qual valor voce deseja sacar?");
                double value = scanner.nextDouble();
                if(!account.withDraw(value)){
                    System.out.println("Ops! Não foi possivel fazer o  saque de: " + value);
                }

            } else if(op.equals("E")){
                break;
            }else {
                System.out.println("Comando invalido, tente novamente");
            }
        }
    }
}