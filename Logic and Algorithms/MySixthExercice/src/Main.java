import java.util.Scanner;
import co.marcoantonio.calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        do{

            System.out.println("Digite um numero: ");
            double num1 = scanner.nextDouble(); //Leitura dos numeros

            System.out.println("Digite outro numero: ");
            double num2 = scanner.nextDouble(); //Leitura dos numeros

            System.out.println("Somar");
            System.out.println("Subtrair");
            System.out.println("Multiplicar");
            System.out.println("Dividir");
            int operacao = scanner.nextInt();
            double resultado = 0;


            if(operacao == 1){
                resultado = Calculadora.som(num1, num2);

            }else{
                if(operacao == 2){
                    resultado = Calculadora.sub(num1, num2);

                }else{
                    if(operacao == 3){
                        resultado = Calculadora.multi(num1, num2);

                    }else{
                        if(operacao == 4){
                            resultado = Calculadora.dividir(num1, num2);

                        }
                    }
                }
            }

            System.out.println("O resultado é: " + resultado);

            System.out.println("Deseja fazer outra opração?: S/N");
            String S = scanner.next();
            if(!S.equalsIgnoreCase("S")){
                System.out.println("Encerrando programa, até logo");
                break;
            }

        }while(true);
    }
}
