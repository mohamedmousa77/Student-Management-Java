public abstract class Saluto {
    public String buongiorno() {
        return "Buongiorno ";
    }

    public abstract String titolo();

    public abstract String nome();

    public void saluta(){
        System.out.println(buongiorno() + " " + titolo() +  " " + nome() );
    }
}
