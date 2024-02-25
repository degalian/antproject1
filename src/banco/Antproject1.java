package banco;
import java.util.Scanner;

public class Antproject1 {

    public static void main(String[] args) { 
        operativa_cuenta(0, null);
    }

    public static void operativa_cuenta(float imp, Object par1) {
   
        Pepito banco1 = new Pepito("Antonio López","1000-2365-85-1230456789",2500,0);
        double saldoActual = banco1.getSaldo();
        System.out.println("El saldo inicial es de "+ saldoActual +" euros");
        
        try {
            Scanner importe1 = new Scanner (System.in);
            System.out.println("Cuanto quiere retirar: ");  
            Double sacar = importe1.nextDouble();
            banco1.retiro(sacar);
            System.out.println("Su saldo después de retirar es: "+ banco1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner importe2 = new Scanner (System.in);
            System.out.println("Cuanto quiere ingresar: ");  
            Double meter = importe2.nextDouble();
            banco1.ingresar(meter);
            System.out.println("ingresó "+meter+" y ahora su saldo es: "+banco1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
