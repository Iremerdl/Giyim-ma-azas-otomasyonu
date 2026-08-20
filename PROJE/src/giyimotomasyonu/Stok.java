package giyimotomasyonu;

//Stok Sınıfı
class Stok {
 private int stokAdet;
 private int stokNo;
 private String stokBilgisi;

 public Stok(int stokAdet, int stokNo, String stokBilgisi) {
     this.setStokAdet(stokAdet);
     this.setStokNo(stokNo);
     this.setStokBilgisi(stokBilgisi);
 }
 // Getters ve Setters

public int getStokAdet() {
	return stokAdet;
}

public void setStokAdet(int stokAdet) {
	this.stokAdet = stokAdet;
}

public String getStokBilgisi() {
	return stokBilgisi;
}

public void setStokBilgisi(String stokBilgisi) {
	this.stokBilgisi = stokBilgisi;
}

public int getStokNo() {
	return stokNo;
}

public void setStokNo(int stokNo) {
	this.stokNo = stokNo;
}
}