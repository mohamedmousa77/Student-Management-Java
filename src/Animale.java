public class Animale {
    private String nome = "Arias";
    private int eta = 12;

    public Animale(String nome) {
        this.nome = nome;
    }


    public void cammina() {
        System.out.println("Animale " + nome + " sta camminando");
    }

    public void cosaMangia() {
        System.out.println("Animale mangia!");
    }

    public String getNome() {
        return nome;
    }


    public int getEta() {
        return eta;
    }
}
