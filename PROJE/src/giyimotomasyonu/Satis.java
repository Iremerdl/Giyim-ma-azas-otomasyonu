package giyimotomasyonu;

//Satış Sınıfı
class Satis {
 private int satisId;
 private String satisTarihi;

 public Satis(int satisId, String satisTarihi) {
     this.setSatisId(satisId);
     this.setSatisTarihi(satisTarihi);
 }
 // Getters ve Setters

public int getSatisId() {
	return satisId;
}

public void setSatisId(int satisId) {
	this.satisId = satisId;
}

public String getSatisTarihi() {
	return satisTarihi;
}

public void setSatisTarihi(String satisTarihi) {
	this.satisTarihi = satisTarihi;
}
}