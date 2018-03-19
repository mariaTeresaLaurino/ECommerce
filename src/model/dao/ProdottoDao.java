package model.dao;

import model.beans.Immagine;
import model.beans.Ordine;
import model.beans.Prodotto;

public interface ProdottoDao {
	
	public boolean insert (Prodotto prodotto) throws Exception;
	public boolean update (Prodotto prodotto)throws Exception;
	public boolean delete (int idProdotto )throws Exception;
	public Prodotto select (int idProdotto)throws Exception;
	public boolean deletebyCategoria (String nome) throws Exception;
	public Prodotto insertImmagine (int idProdotto, Immagine immagine);
	public Prodotto deleteImmagine(int idProdotto, Immagine immagine);
	
}
