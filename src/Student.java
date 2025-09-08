public class Student {

    private String nome;
    private String cognome;
    private double voto;

    public Student(String nome, String cognome, double voto) {
        setNome(nome);
        setCognome(cognome);
        setVoto(voto);
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public double getVoto() {
        return voto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setVoto(double voto) {
        if(voto >= 0 && voto <= 10) {
            stampaDati();
        } else {
            System.out.println("Attenzione! Questo voto e` invalido.");
        }
    }

    private void stampaDati(){
        System.out.print("Il nome: " + getNome() + "il cognome: " + getCognome() + "il voto: " + getVoto());
    }
}
