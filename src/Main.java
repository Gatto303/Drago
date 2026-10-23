import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner intTastiera = new Scanner(System.in);
        System.out.println("inserisci numero di battitit ");
        int nBattiti = intTastiera.nextInt();

        Thread drago1 = new Thread(new Drago("sergio",nBattiti));

        drago1.start();
        for(int i=0;i<=5;i++){
            System.out.println("sta succedendo qualcosa" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}