package giyimotomasyonu;

public class Kargo {
    private int kargoId;
    private int kargoTarih;
    private String kargoKonum;
    private String teslimEden;
    private String teslimAlan;

    public Kargo(int kargoId, int kargoTarih, String kargoKonum, String teslimEden, String teslimAlan) {
        this.kargoId = kargoId;
        this.setKargoTarih(kargoTarih);
        this.setKargoKonum(kargoKonum);
        this.setTeslimEden(teslimEden);
        this.setTeslimAlan(teslimAlan);
    }

    // Getters and Setters
    public int getKargoId() {
        return kargoId;
    }

	public int getKargoTarih() {
		return kargoTarih;
	}

	public void setKargoTarih(int kargoTarih) {
		this.kargoTarih = kargoTarih;
	}

	public String getKargoKonum() {
		return kargoKonum;
	}

	public void setKargoKonum(String kargoKonum) {
		this.kargoKonum = kargoKonum;
	}

	public String getTeslimEden() {
		return teslimEden;
	}

	public void setTeslimEden(String teslimEden) {
		this.teslimEden = teslimEden;
	}

	public String getTeslimAlan() {
		return teslimAlan;
	}

	public void setTeslimAlan(String teslimAlan) {
		this.teslimAlan = teslimAlan;
	}

}
