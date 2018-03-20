package model.service;

import model.beans.Ordine;

public interface OrdineService {
	
	public Ordine pagaOrdine ();
	/*chiamare il metodo
	 *1 calcolaTotale () da Controller
	 *2 if (isFinanziato==true){ >>>>> nella parte html è necessario che il valore sia opzionale 
	 *in modo che si abbiano due possibilità :
	 *
	 *<select> Vuoi un finanziamento/ vuoi pagare a rate ????
  			<option value="true">true</option>
  			<option value="false">false</option>
  			
		</select> questo codice parte solo per un valore di totale ordine (ad esempio 100 euro )
		, in tutti gli altri casi isFinanziato è autosettato a false!!!!!!
			 autocommit =false
	 *		calcolaRata;
	 *		insertModlitaPagamento;
	 *		insertOrdine()
	 *commit}
	 *else{
	 *	insertModlitaPagamento;
	 *	insertOrdine()
	 *}
	 */
	
	
}
