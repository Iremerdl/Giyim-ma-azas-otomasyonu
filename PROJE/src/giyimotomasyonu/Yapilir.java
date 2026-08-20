package giyimotomasyonu;

//Ürün ve Satış Arasındaki İlişki
class Yapilir {
 private int satisAdet;
 private String satisBilgisi;
 private Urun urun;
 private Satis satis;

 public Yapilir(int satisAdet, String satisBilgisi, Urun urun, Satis satis) {
     this.setSatisAdet(satisAdet);
     this.setSatisBilgisi(satisBilgisi);
     this.setUrun(urun);
     this.setSatis(satis);
 }
 // Getters ve Setters

public int getSatisAdet() {
	return satisAdet;
}

public void setSatisAdet(int satisAdet) {
	this.satisAdet = satisAdet;
}

public String getSatisBilgisi() {
	return satisBilgisi;
}

public void setSatisBilgisi(String satisBilgisi) {
	this.satisBilgisi = satisBilgisi;
}

public Urun getUrun() {
	return urun;
}

public void setUrun(Urun urun) {
	this.urun = urun;
}

public Satis getSatis() {
	return satis;
}

public void setSatis(Satis satis) {
	this.satis = satis;
}
}