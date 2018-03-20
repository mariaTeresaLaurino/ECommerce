package model.dao;

import java.util.ArrayList;

import model.beans.Cliente;
import model.beans.Ordine;

public interface OrdineDao {
	
	public boolean insert (Ordine ordine) throws Exception;
	public Ordine select (int idOrdine)throws Exception;
	public ArrayList<Ordine> select () throws Exception;
	public ArrayList<Ordine> selectOrderByData ()throws Exception;
}
