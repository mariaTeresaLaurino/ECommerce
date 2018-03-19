package model.beans;

import java.util.ArrayList;

public class Prodotto {
	
		private int idProdotto;
		private String descrizione;
		private String marca;
		private String modello;
		private String codiceEAN;
		private double prezzoUnitario;
		private int disponibilita;
		private String linkUrlProduttore;
		private double costiSpedizione;
		private String tempiConsegna;
		private ArrayList<Immagine> immaginiAssociate;
		private String categoria;
		
		
		
		
		
		
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public int getIdProdotto() {
			return idProdotto;
		}
		public void setIdProdotto(int idProdotto) {
			this.idProdotto = idProdotto;
		}
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModello() {
			return modello;
		}
		public void setModello(String modello) {
			this.modello = modello;
		}
		public String getCodiceEAN() {
			return codiceEAN;
		}
		public void setCodiceEAN(String codiceEAN) {
			this.codiceEAN = codiceEAN;
		}
		public double getPrezzoUnitario() {
			return prezzoUnitario;
		}
		public void setPrezzoUnitario(double prezzoUnitario) {
			this.prezzoUnitario = prezzoUnitario;
		}
		public int getDisponibilita() {
			return disponibilita;
		}
		public void setDisponibilita(int disponibilita) {
			this.disponibilita = disponibilita;
		}
		public String getLinkUrlProduttore() {
			return linkUrlProduttore;
		}
		public void setLinkUrlProduttore(String linkUrlProduttore) {
			this.linkUrlProduttore = linkUrlProduttore;
		}
		public double getCostiSpedizione() {
			return costiSpedizione;
		}
		public void setCostiSpedizione(double costiSpedizione) {
			this.costiSpedizione = costiSpedizione;
		}
		public String getTempiConsegna() {
			return tempiConsegna;
		}
		public void setTempiConsegna(String tempiConsegna) {
			this.tempiConsegna = tempiConsegna;
		}
		public ArrayList<Immagine> getImmaginiAssociate() {
			return immaginiAssociate;
		}
		public void setImmaginiAssociate(ArrayList<Immagine> immaginiAssociate) {
			this.immaginiAssociate = immaginiAssociate;
		}
		@Override
		public String toString() {
			return "Prodotto [idProdotto=" + idProdotto + ", descrizione=" + descrizione + ", marca=" + marca
					+ ", modello=" + modello + ", codiceEAN=" + codiceEAN + ", prezzoUnitario=" + prezzoUnitario
					+ ", disponibilita=" + disponibilita + ", linkUrlProduttore=" + linkUrlProduttore
					+ ", costiSpedizione=" + costiSpedizione + ", tempiConsegna=" + tempiConsegna
					+ ", immaginiAssociate=" + immaginiAssociate + "]";
		}
		
		
		
		

}
