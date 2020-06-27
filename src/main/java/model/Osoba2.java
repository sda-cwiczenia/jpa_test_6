package model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Osoba2 {
    @Id
    @GeneratedValue
    private long Id;
    private String imie;
    private String nazwisko;
    private double zarobki;
    @Embedded
    private Adres2 adres;

    public Osoba2() {
    }

    public Osoba2(String imie, String nazwisko, double zarobki, Adres2 adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zarobki = zarobki;
        this.adres = adres;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    public Adres2 getAdres() {
        return adres;
    }

    public void setAdres(Adres2 adres) {
        this.adres = adres;
    }
}
