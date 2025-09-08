public class Quadro extends Dipendente{

    @Override
    public void pagaGiornaliera() {
        super.pagaGiornaliera();
        double giorno = 100;
    }

    @Override
    public double calcolaStipendio(int giorniLavorativi) {
        super.calcolaStipendio(giorniLavorativi);
        double stipendio = 100 * giorniLavorativi;
        return stipendio;
    }
}
