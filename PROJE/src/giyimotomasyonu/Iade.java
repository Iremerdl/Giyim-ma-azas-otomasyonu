package giyimotomasyonu;

//İade Sınıfı
class Iade {
 private int iadeId;
 private String iadeNedeni;
 private String iadeTarihi;

 public Iade(int iadeId, String iadeNedeni, String iadeTarihi) {
     this.setIadeId(iadeId);
     this.setIadeNedeni(iadeNedeni);
     this.setIadeTarihi(iadeTarihi);
 }
 // Getters ve Setters

public int getIadeId() {
	return iadeId;
}

public void setIadeId(int iadeId) {
	this.iadeId = iadeId;
}

public String getIadeNedeni() {
	return iadeNedeni;
}

public void setIadeNedeni(String iadeNedeni) {
	this.iadeNedeni = iadeNedeni;
}

public String getIadeTarihi() {
	return iadeTarihi;
}

public void setIadeTarihi(String iadeTarihi) {
	this.iadeTarihi = iadeTarihi;
}
}
