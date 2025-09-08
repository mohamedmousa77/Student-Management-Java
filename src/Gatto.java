public class Gatto extends Animale{

    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void cosaMangia() {
        System.out.println("Il gatto " + getNome() + " mangia formaggio!");
    }

    public void maigola( ) {
        System.out.println("Il gatto " + super.getNome() + " sta miagoalndo! ");
    }
}
