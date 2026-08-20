package giyimotomasyonu;

//Çalışan sınıfı
class Calisan {
 private int calisanId;
 private String iban;
 private String telNo;
 private String adSoyad;

 // Getter ve setter metotları
 public int getCalisanId() {
     return calisanId;
 }

 public void setCalisanId(int calisanId) {
     this.calisanId = calisanId;
 }

 public String getIban() {
     return iban;
 }

 public void setIban(String iban) {
     this.iban = iban;
 }

 public String getTelNo() {
     return telNo;
 }

 public void setTelNo(String telNo) {
     this.telNo = telNo;
 }

 public String getAdSoyad() {
     return adSoyad;
 }

 public void setAdSoyad(String adSoyad) {
     this.adSoyad = adSoyad;
 }
}
