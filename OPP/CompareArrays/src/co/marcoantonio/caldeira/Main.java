package co.marcoantonio.caldeira;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] numberA = new int[]{1,2,3};
        int[] numberB = new int[]{1,2,3};
        //Os dois arrays a pesar de terem o mesmo conteudo
        //São tratados como objetos diferentes. Então se tentarmos
        //usar .equals ou == para comparar o resultado sera false

        //Mais se estiver:
        System.out.println(Arrays.equals(numberA, numberB));

        ///Metodos do Array List

        List<String> names = new ArrayList<>();


        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");
        names.add("Nome 5");

        //Como buscar um elemento espedifico pelo indice get()
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //Como buscar o index a partir de um elemento
        int index = names.indexOf("Nome 2");
        System.out.print(index);

        //Verificar se a lista esta vazia
        System.out.println(names.isEmpty());


        //Verificar se a lista comtem algum elemento
        System.out.println(names.contains("Nome 14"));

        //Verificar o tamanho da lista
        System.out.println(names.size());

        //Limpar de vez a lista(remover todos os elementos)
        names.clear();
        System.out.print(names.isEmpty());

        User userA = new User("Marco Antonio", "");
        System.out.println(userA.output());
    }
}