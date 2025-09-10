public class Contatto {

    private String nome;
    private String numero;

    public Contatto(String nome, String numero) {
        setNome(nome);
        setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Numero: " + getNumero();
    }
}
