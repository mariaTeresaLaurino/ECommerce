package model.beans;

import java.util.Map;

public class Ordine {
	
	private String dataOrdine;
	private String idOrdine;
	private double totaleOrdine;
	private Map<Prodotto,Integer> prodottiAcquistati;
	private Cliente cliente;
	private boolean isFinanziato=false;
	private Indirizzo indirizzoSpedizione;
	private String modalitaPagamento;
	
	
	
	
	
	
	
	
	public String getModalitaPagamento() {
		return modalitaPagamento;
	}
	public void setModalitaPagamento(String modalitaPagamento) {
		this.modalitaPagamento = modalitaPagamento;
	}
	public Indirizzo getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}
	public void setIndirizzoSpedizione(Indirizzo indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public boolean isFinanziato() {
		return isFinanziato;
	}
	public void setFinanziato(boolean isFinanziato) {
		this.isFinanziato = isFinanziato;
	}
	public String getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(String dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	public String getIdOrdine() {
		return idOrdine;
	}
	public void setIdOrdine(String idOrdine) {
		this.idOrdine = idOrdine;
	}
	public double getTotaleOrdine() {
		return totaleOrdine;
	}
	public void setTotaleOrdine(double totaleOrdine) {
		this.totaleOrdine = totaleOrdine;
	}
	public Map<Prodotto, Integer> getProdottiAcquistati() {
		return prodottiAcquistati;
	}
	public void setProdottiAcquistati(Map<Prodotto, Integer> prodottiAcquistati) {
		this.prodottiAcquistati = prodottiAcquistati;
	}
	@Override
	public String toString() {
		return "Ordine [dataOrdine=" + dataOrdine + ", idOrdine=" + idOrdine + ", totaleOrdine=" + totaleOrdine
				+ ", prodottiAcquistati=" + prodottiAcquistati + "]";
	}
	
	
	

}
