public class Cacciatore {
    private String nome;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void lanciaDardi(Thread d) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("il cacciatore: " +nome+ " sta lanciando il dardo " +i);
            d.interrupt();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main");
            }

        }
    }
}
