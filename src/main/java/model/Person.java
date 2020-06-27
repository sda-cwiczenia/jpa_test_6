package model;

import javax.persistence.*;

@Entity
@Table(name = "osoba")
@SecondaryTable(name = "adres", pkJoinColumns = @PrimaryKeyJoinColumn(name = "osobaId"))
public class Person {
    @Id
    @GeneratedValue
    private long Id;
    private String imie;
    private String nazwisko;
    private double zarobki;
    @Column(table = "adres")
    private String miasto;
    @Column(table = "adres")
    private String ulica;
    @Column(table = "adres")
    private String kod;

    public Person(String imie, String nazwisko, double zarobki, String miasto, String ulica, String kod) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zarobki = zarobki;
        this.miasto = miasto;
        this.ulica = ulica;
        this.kod = kod;
    }

    public Person() {
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

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
