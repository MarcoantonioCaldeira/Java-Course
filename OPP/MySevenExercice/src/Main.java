import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       //Ordenation Function
        int[] numbers = new int[]{10, 30, 3, 2, 1, 5, 2, 3, 10};
        Arrays.sort(numbers);
        System.out.println(numbers); // <- hashcode int[] (identificador)

        System.out.println(Arrays.toString(numbers)); //O Arrays.ToSting vai transformar toda
        // a coleção de objetos em strings e vamos conseguir imprimir
    }
}