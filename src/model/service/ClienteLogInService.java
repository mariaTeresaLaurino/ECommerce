package model.service;

import java.util.ArrayList;


import model.beans.Cliente;
import model.beans.Ordine;
import model.beans.Prodotto;

public interface ClienteLogInService {
	
	
	
	public boolean registraUtente (Cliente cliente);
	public boolean logIn (String username, String password);
	
	public Cliente modificaCliente (String username );
	public Cliente visualizzaCliente (String username);
	public ArrayList<Ordine> visualizzaOrdiniByData (String username);
	public Ordine visualizzaDettaglioOrdine (String username, int idOrdine);

	
	
	public boolean aggiungiIndirizzo(String username);
	
	
	
	
	

}
