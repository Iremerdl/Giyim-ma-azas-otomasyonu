package giyimotomasyonu;

class UrunStokFacade {
    private Kiyafet kiyafet;
    private Ayakkabi ayakkabi;
    private Taki taki;
    private Canta canta;
    private Sapka sapka;

    public UrunStokFacade() {
        this.kiyafet = new Kiyafet();
        this.ayakkabi = new Ayakkabi();
        this.taki = new Taki();
        this.canta = new Canta();
        this.sapka = new Sapka();
    }

    public void stokGoster() {
        System.out.println("Kıyafet stok: " + kiyafet.getStok());
        System.out.println("Ayakkabı stok: " + ayakkabi.getStok());
        System.out.println("Takı stok: " + taki.getStok());
        System.out.println("Çanta stok: " + canta.getStok());
        System.out.println("Şapka stok: " + sapka.getStok());
    }

    public void stokGuncelle(String urunTipi, int yeniStok) {
        switch (urunTipi.toLowerCase()) {
            case "kiyafet":
                kiyafet.setStok(yeniStok);
                break;
            case "ayakkabi":
                ayakkabi.setStok(yeniStok);
                break;
            case "taki":
                taki.setStok(yeniStok);
                break;
            case "canta":
                canta.setStok(yeniStok);
                break;
            case "sapka":
                sapka.setStok(yeniStok);
                break;
            default:
                System.out.println("Geçersiz ürün tipi!");
        }
    }
}
