package partetres.criterios;

import java.util.List;
import java.util.Random;

import partetres.colas.ColaAbst;

public  class CriterioAzar extends Criterio {
		

	//Devuevlve una cola random de una cola abst dada
	
	@Override
	public ColaAbst getCola(List<ColaAbst> colas) {
		
		int aux=colas.size();
		
		Random rand=new Random();
		
		int pos =rand.nextInt(aux);
		
	
		return  ((ColaAbst)	colas.get(pos));
	}

	
	
	
}
