package model.beans;

import java.util.ArrayList;

public class Cliente {
	
	private String username;
	private String password;
	private String email;
	private String cellulare;
	private String telefono;
	private ArrayList<Indirizzo> indirizzoCliente;
	private String ragioneSociale;
	private String pIva;
	private String codiceFiscale;
	private boolean isAffidabile;
	private TipologiaCliente tipologia;
	private boolean isAdmin;
	private Indirizzo indirizzoFattturazione;
	
	
	
	
	public ArrayList<Indirizzo> getIndirizzoCliente() {
		return indirizzoCliente;
	}
	public void setIndirizzoCliente(ArrayList<Indirizzo> indirizzoCliente) {
		this.indirizzoCliente = indirizzoCliente;
	}
	public Indirizzo getIndirizzoFattturazione() {
		return indirizzoFattturazione;
	}
	public void setIndirizzoFattturazione(Indirizzo indirizzoFattturazione) {
		this.indirizzoFattturazione = indirizzoFattturazione;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellulare() {
		return cellulare;
	}
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getpIva() {
		return pIva;
	}
	public void setpIva(String pIva) {
		this.pIva = pIva;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public boolean isAffidabile() {
		return isAffidabile;
	}
	public void setAffidabile(boolean isAffidabile) {
		this.isAffidabile = isAffidabile;
	}
	public TipologiaCliente getTipologia() {
		return tipologia;
	}
	public void setTipologia(TipologiaCliente tipologia) {
		this.tipologia = tipologia;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "Cliente [username=" + username + ", password=" + password + ", email=" + email + ", cellulare="
				+ cellulare + ", telefono=" + telefono + ", indirizzoFatturazione=" +", ragioneSociale=" + ragioneSociale + ", pIva=" + pIva + ", codiceFiscale=" + codiceFiscale
				+ ", isAffidabile=" + isAffidabile + ", tipologia=" + tipologia + ", isAdmin=" + isAdmin + "]";
	}
	
	
}
