package model.service;

import java.util.ArrayList;

import model.beans.Prodotto;

public interface ProdottoService {
	
	public ArrayList<String> selectCategoria();
	public ArrayList <Prodotto> visualizzaProdottoByCategoria (String categoria);
	public Prodotto visualizzaProdotto(int idProdotto);
}
