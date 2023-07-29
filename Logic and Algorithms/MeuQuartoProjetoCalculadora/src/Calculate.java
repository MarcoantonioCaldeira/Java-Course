public class Calculate {

    public static void main(String[] args) {
        //Argumento 0:  nome da função

        double x = Integer.parseInt(args[1]);
        //Como é String temos que usar o Integer.parseInt
        // para converter a string para float
        double y = Integer.parseInt(args[2]);

        if(args[0].equals("Somar") || args[0].equals("somar")){
            sum(x, y);
        }else{
            if(args[0].equals("Subtrair") || args[0].equals("subtrair")){
                sub(x, y);
            }else{
                if(args[0].equals("Dividir") || args[0].equals("dividir")){
                    div(x, y);
                }else{
                    if(args[0].equals("Multiplicar") || args[0].equals("multiplicar")){
                        mul(x, y);
                    }
                }
            }
        }
    }

    static void sum(double x, double y){
        System.out.println(x + y);
    }

    static void sub(double x, double y){
        System.out.println(x - y);
    }

    static void div(double x, double y){
        System.out.println(x / y);
    }

    static void mul(double x, double y){
        System.out.println(x * y);
    }
}