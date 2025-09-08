public class Femina extends Saluto {
    private String nome = "";

    public Femina(String nome ) {
        this.nome = nome;
    }

    @Override
    public String titolo() {
        return "signora";
    }

    @Override
    public String nome() {
        return this.nome;
    }
}
