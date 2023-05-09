public class Corridore implements Runnable {
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("\nil corridore " + nome + " è a " + i + " metri");

        System.out.println("\n" + nome + " HA FINITO LA CORSA");
    }

}
