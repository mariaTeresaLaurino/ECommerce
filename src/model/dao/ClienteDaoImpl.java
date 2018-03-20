package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.beans.Cliente;
import model.beans.Indirizzo;
import model.beans.TipologiaCliente;

public class ClienteDaoImpl implements ClienteDao {


	private Connection conn;
	
	@Override
	public boolean insert(Cliente cliente) throws Exception {

		conn = SingletonConnection.getInstance().getConnection();

		try {
		
			PreparedStatement pstmt = conn.prepareStatement("insert into clienti values(Clienti_ID.nextval,?,?,?,?,?,?,?,?,?,?,?)");
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {				
				pstmt.setString(9, cliente.getUsername());
				
				pstmt.setString(1, cliente.getPassword());
				pstmt.setString(7, cliente.getCellulare());
				pstmt.setString(8, cliente.getEmail());
				pstmt.setString(6, cliente.getTelefono());
				pstmt.setString(2, cliente.getCodiceFiscale());
				pstmt.setString(3, cliente.getpIva());
				pstmt.setString(4, cliente.getRagioneSociale());
				pstmt.setBoolean(12,cliente.isAffidabile());
				pstmt.setBoolean(11, cliente.isAdmin());
				pstmt.setObject(10, cliente.getTipologia());
				pstmt.setObject(5, cliente.getIndirizzoFatturazione());	
			}
 
			Indirizzo indirizzoSpedizione = new Indirizzo();
			PreparedStatement pstmt1 = conn.prepareStatement("insert into indirizziclienti values(Indirizzi_Id.nextval,?,?,?,?,?,?,?)");
			ResultSet res1 = pstmt1.executeQuery();
			while (res1.next()) {				
				
				pstmt1.setString(1, indirizzoSpedizione.getNazione());
				pstmt1.setString(2, indirizzoSpedizione.getVia());
				pstmt1.setInt(3, indirizzoSpedizione.getCap());
				pstmt1.setString(4, indirizzoSpedizione.getProvincia());
				pstmt1.setString(7, indirizzoSpedizione.getComune());
				pstmt1.setInt(5,cliente.getIdCliente());
				pstmt1.setInt(6, cliente.getIdCliente());
	
			}
		} catch (SQLException e) {
			return false;
		}
		return true;
		

	}

	@Override
	public boolean update(Cliente cliente) throws Exception {

		conn = SingletonConnection.getInstance().getConnection();

		Indirizzo indirizzo=new Indirizzo();
		try {

			PreparedStatement pstmt = conn.prepareStatement(
					"update clienti set password=?,codicefiscale=?,email=?,cellulare=?,telefono=?,partitaiva=?,"
							+ "isAffidabile=?,tipologia=?,isAdmin=?,ragionesociale=? where username=?");

            pstmt.setString(1, cliente.getPassword());
            pstmt.setString(2, cliente.getCodiceFiscale());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getCellulare());
            pstmt.setString(5, cliente.getTelefono());
            pstmt.setString(6, cliente.getpIva());
            pstmt.setBoolean(7, cliente.isAffidabile());
            pstmt.setObject(8, cliente.getTipologia());
            pstmt.setBoolean(9, cliente.isAdmin());
            pstmt.setString(10, cliente.getRagioneSociale());
            pstmt.setString(11, cliente.getUsername());
			pstmt.executeQuery();

			PreparedStatement pstmt1 = conn.prepareStatement(
					"update indirizziclienti set nazione=?,via=?,cap=?,provincia=?,comune=? where idc_fk=?");
            
            pstmt1.setString(1, indirizzo.getNazione());
            pstmt1.setString(2, indirizzo.getVia());
            pstmt1.setInt(3, indirizzo.getCap());
            pstmt1.setString(4, indirizzo.getProvincia());
            pstmt1.setString(5, indirizzo.getComune());
            pstmt1.setInt(6, cliente.getIdCliente());
           	pstmt1.executeQuery();
           	
		} catch (SQLException e) {
			return false;
		}
		return true;

	}

	@Override
	public boolean delete(String username) throws Exception {
		
		conn = SingletonConnection.getInstance().getConnection();

		try {

			PreparedStatement pstmt = conn.prepareStatement("delete from clienti where username=? ");
			pstmt.setString(1, username);
			pstmt.executeQuery();

		} catch (SQLException e) {
			return false;
		}
		return true;

	}
	

	@Override
	public Cliente select(String username) throws Exception {
		
		conn = SingletonConnection.getInstance().getConnection();
		Cliente cliente = new Cliente();
		Indirizzo indirizzo = new Indirizzo();
		
		try {
            
		
			PreparedStatement pstmt = conn.prepareStatement("select * from clienti inner join indirizziclienti on "
					+ "clienti.idcliente=indirizziclienti.idc_fk where username=?");
			pstmt.setString(1, username);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {	
			    cliente.setPassword(res.getString("password"));
			    cliente.setCodiceFiscale(res.getString("codiceFiscale"));
			    cliente.setpIva(res.getString("partitaiva"));
			    cliente.setRagioneSociale(res.getString("ragioneSociale"));
			    indirizzo.setNazione(res.getString("nazione"));
			    indirizzo.setVia(res.getString("via"));
			    indirizzo.setCap(res.getInt("cap"));
			    indirizzo.setProvincia(res.getString("provincia"));
			    indirizzo.setComune(res.getString("comune"));
			    cliente.setIndirizzoFatturazione(indirizzo);
			    
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cliente;

	}

	@Override
	public ArrayList<Cliente> select() throws Exception {
		
		conn = SingletonConnection.getInstance().getConnection();
		
		ArrayList<Cliente> listaClienti= new ArrayList<Cliente>();
		try {
            
		
			PreparedStatement pstmt = conn.prepareStatement("select * from clienti inner join indirizziclienti on "
					+ "clienti.idcliente=indirizziclienti.idc_fk");

			ResultSet res = pstmt.executeQuery();
			while (res.next()) {	
				Cliente cliente = new Cliente();
				Indirizzo indirizzo = new Indirizzo();
			    cliente.setPassword(res.getString("password"));
			    cliente.setCodiceFiscale(res.getString("codiceFiscale"));
			    cliente.setpIva(res.getString("partitaiva"));
			    cliente.setRagioneSociale(res.getString("ragioneSociale"));
			    indirizzo.setNazione(res.getString("nazione"));
			    indirizzo.setVia(res.getString("via"));
			    indirizzo.setCap(res.getInt("cap"));
			    indirizzo.setProvincia(res.getString("provincia"));
			    indirizzo.setComune(res.getString("comune"));
			    cliente.setIndirizzoFatturazione(indirizzo);
			    listaClienti.add(cliente);
			    
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaClienti ;

	

		

	

	}

	@Override
	public boolean logIn(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
