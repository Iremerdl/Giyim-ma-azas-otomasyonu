package giyimotomasyonu;

public class Musteri {
    private int musteriId;
    private String musteriAd;
    private String musteriTel;
    private String musteriAdres;

    public Musteri(int musteriId, String musteriAd, String musteriTel, String musteriAdres) {
        this.musteriId = musteriId;
        this.musteriAd = musteriAd;
        this.musteriTel = musteriTel;
        this.musteriAdres = musteriAdres;
    }

    // Getters and Setters
    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriTel() {
        return musteriTel;
    }

    public void setMusteriTel(String musteriTel) {
        this.musteriTel = musteriTel;
    }

    public String getMusteriAdres() {
        return musteriAdres;
    }

    public void setMusteriAdres(String musteriAdres) {
        this.musteriAdres = musteriAdres;
    }
}
