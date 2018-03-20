package model.dao;

import java.util.ArrayList;


import model.beans.Cliente;
import model.beans.Ordine;
import model.beans.Prodotto;

public interface ClienteDao {
	
	public boolean insert (Cliente cliente) throws Exception;
	public boolean update (Cliente cliente)throws Exception;
	public boolean delete (String username )throws Exception;
	public Cliente select (String username)throws Exception;
	public ArrayList<Cliente> select () throws Exception;
	public boolean logIn(String username,String password) throws Exception;
	


}
