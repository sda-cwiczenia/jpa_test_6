package model;

import javax.persistence.Embeddable;

@Embeddable
public class Adres2 {
    private String miasto;
    private String ulica;
    private String kod;

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

    public Adres2() {
    }

    public Adres2(String miasto, String ulica, String kod) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.kod = kod;
    }
}
