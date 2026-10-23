public class Drago implements Runnable {
    String nome;
    int nBattiti;

    public Drago(String nome, int nBattiti) {
        this.nome = nome;
        this.nBattiti = nBattiti;
    }


    @Override
    public void run() {
        for (int i = 0; i < nBattiti; i++) {
            System.out.println(this.nome + "vola per la: " + (i + 1) + "volta");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}