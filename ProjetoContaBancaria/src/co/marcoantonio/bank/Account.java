package co.marcoantonio.bank;

public class Account {

    //Quando definimos constantes no Java, definimos elas com letrar maiusculas
    private static final int MAX_LENGTH = 12; //final: propriedade constante que nunca pode mudar
    private String ag;
    private String  cc;
    private String name;
    private double balance;
    private Log logger;

    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

    public void setName(String name){
        if(name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        }else{
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("DEPOSITO - " + value + " Sua conta agora é de R$ " + balance);
    }

    public boolean withDraw(double value){
        if(balance < value){
            logger.out("SAQUE - " + value + " Seu saldo atual é de R$ " + balance);
            return false;
        }
        balance -= value;
        logger.out("SAQUE - " + value + " Sua conta agora é de R$ " + balance);
        return true;
    }

    public double getBalance() {
        return  balance;
    }
    @Override
    public String toString() {
        return  "A conta " + this.name + " " + this.ag + " / " + this.cc + "possui: R$ " + balance;
    }
}
