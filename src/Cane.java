public class Cane extends Animale{


    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void cosaMangia() {
        System.out.println("Il cane " + getNome() + " mangia maiale!");
    }

    public void abbaia() {
        System.out.println("Il cane " + super.getNome() + " sta abbaiando");
    }
}
