package model.beans;

public class Immagine {
	
	private int idImmagine;
	private String url;
	private boolean isPrincipale;
	
	
	
	
	
	
	public int getIdImmagine() {
		return idImmagine;
	}
	public void setIdImmagine(int idImmagine) {
		this.idImmagine = idImmagine;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isPrincipale() {
		return isPrincipale;
	}
	public void setPrincipale(boolean isPrincipale) {
		this.isPrincipale = isPrincipale;
	}
	@Override
	public String toString() {
		return "Immagine [idImmagine=" + idImmagine + ", url=" + url + ", isPrincipale=" + isPrincipale + "]";
	}
	
	
	

}
