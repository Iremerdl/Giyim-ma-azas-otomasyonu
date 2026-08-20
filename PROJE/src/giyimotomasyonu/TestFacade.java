package giyimotomasyonu;

public class TestFacade {
    public static void main(String[] args) {
        UrunStokFacade urunStokFacade = new UrunStokFacade();

        // Başlangıç stoklarını göster
        System.out.println("Başlangıç stokları:");
        urunStokFacade.stokGoster();

        // Stok güncelle
        urunStokFacade.stokGuncelle("kiyafet", 5);
        urunStokFacade.stokGuncelle("ayakkabi", 18);
        urunStokFacade.stokGuncelle("taki", 22);
        urunStokFacade.stokGuncelle("canta", 12);
        urunStokFacade.stokGuncelle("sapka", 20);

        // Güncellenmiş stokları göster
        System.out.println("\nGüncellenmiş stoklar:");
        urunStokFacade.stokGoster();
    }
}
