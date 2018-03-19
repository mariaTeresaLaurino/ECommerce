package model.beans;

public class Indirizzo {
	
	private String nazione;
	private String via;
	private int cap;
	private String comune;
	private String provincia;
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	@Override
	public String toString() {
		return "Indirizzo [nazione=" + nazione + ", via=" + via + ", cap=" + cap + ", comune=" + comune + ", provincia="
				+ provincia + "]";
	}
	
	

}
