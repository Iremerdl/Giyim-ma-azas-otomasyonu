package giyimotomasyonu;

interface Urun {
    void urunBilgisi();
    double urunFiyati();
    int getStok();
    void setStok(int stok);
}

class Kiyafet implements Urun {
    private double fiyat = 100.0; 
    private int stok = 10; 

    @Override
    public void urunBilgisi() {
        System.out.println("Kıyafet seçildi. Fiyat: " + urunFiyati() + " TL");
    }

    @Override
    public double urunFiyati() {
        return fiyat;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
}

class Ayakkabi implements Urun {
    private double fiyat = 150.0; 
    private int stok = 20; 

    @Override
    public void urunBilgisi() {
        System.out.println("Ayakkabı seçildi. Fiyat: " + urunFiyati() + " TL");
    }

    @Override
    public double urunFiyati() {
        return fiyat;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
}


class Taki implements Urun {
    private double fiyat = 50.0; 
    private int stok = 30; 

    @Override
    public void urunBilgisi() {
        System.out.println("Takı seçildi. Fiyat: " + urunFiyati() + " TL");
    }

    @Override
    public double urunFiyati() {
        return fiyat;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
}

class Canta implements Urun {
    private double fiyat = 80.0; 
    private int stok = 15; 

    @Override
    public void urunBilgisi() {
        System.out.println("Çanta seçildi. Fiyat: " + urunFiyati() + " TL");
    }

    @Override
    public double urunFiyati() {
        return fiyat;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
}

class Sapka implements Urun {
    private double fiyat = 40.0; 
    private int stok = 25; 

    @Override
    public void urunBilgisi() {
        System.out.println("Şapka seçildi. Fiyat: " + urunFiyati() + " TL");
    }

    @Override
    public double urunFiyati() {
        return fiyat;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
}