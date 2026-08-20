package giyimotomasyonu;

//Ürün ve İade Arasındaki İlişki
class Edilir {
 private int iadeAdet;
 private String iadeBilgisi;
  Urun urun;
  Iade iade;

 public Edilir(int iadeAdet, String iadeBilgisi, Urun urun, Iade iade) {
     this.setIadeAdet(iadeAdet);
     this.setIadeBilgisi(iadeBilgisi);
     this.urun = urun;
     this.iade = iade;
 }
 // Getters ve Setters

public int getIadeAdet() {
	return iadeAdet;
}

public void setIadeAdet(int iadeAdet) {
	this.iadeAdet = iadeAdet;
}

public String getIadeBilgisi() {
	return iadeBilgisi;
}

public void setIadeBilgisi(String iadeBilgisi) {
	this.iadeBilgisi = iadeBilgisi;
}
}