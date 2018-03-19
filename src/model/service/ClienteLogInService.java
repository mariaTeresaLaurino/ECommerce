package model.service;

import java.util.ArrayList;


import model.beans.Cliente;
import model.beans.Ordine;
import model.beans.Prodotto;

public interface ClienteLogInService {
	
	
	
	public boolean registraUtente (Cliente cliente);
	public Cliente logIn (String username, String password);
	
	public Cliente modificaCliente (String username );
	public Cliente visualizzaCliente (String username);
	public ArrayList<Ordine> visualizzaOrdiniByData (String username);
	public Ordine visualizzaDettaglioOrdine (String username, int idOrdine);

	
	//2 gruppo(prodotto)
	public boolean aggiungiIndirizzo(String username);
	public ArrayList<Prodotto> selectCategoria();
	public ArrayList<Prodotto> visualizzaProdottoByCategoria (String categoria);
	public Prodotto visualizzaProdotto (int idProdotto);
	
	
	
	
	

}
