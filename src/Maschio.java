public class Maschio extends Saluto {

    String nome;

    public Maschio(String nome) {
        this.nome = nome;
    }


    @Override
    public String titolo() {
        return "signor";
    }

    @Override
    public String nome() {
        return this.nome;
    }
}
