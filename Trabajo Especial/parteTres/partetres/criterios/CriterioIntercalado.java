package partetres.criterios;

import java.util.List;

import partetres.colas.ColaAbst;

public class CriterioIntercalado extends Criterio{


	private int iter;
		

	public CriterioIntercalado( ) {
		
		 iter = 0;
			
	}
	
	
	@Override
	public ColaAbst getCola(List<ColaAbst> colas) {
		
		int max=colas.size();
		
		int pos=iter;
	  	
	  	iter=iter+1;

	  	if (iter>=max)
					
	  		iter=0;

		return ((ColaAbst)	colas.get(pos));
	}
	
	


}
