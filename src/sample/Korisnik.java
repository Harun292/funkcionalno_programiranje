package sample;

import java.time.LocalDate;

public class Korisnik {
    private String ime,prezime;
    private LocalDate datum;

    public Korisnik(String ime, String prezime, LocalDate datum) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum = datum;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return ime + " " + " "+prezime +" "+ datum;
    }
}
