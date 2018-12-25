package criterios;


public class CriterioIntercalada extends Criterio{

	protected int iter;

	public CriterioIntercalada( ) {
		
		iter=0;
			
	}
	
	
	public int getCola(int aux) {
		
	  	int a=iter;
	  	
	  	iter=iter+1;

	  	if (iter>=aux)
					
	  		iter=0;
	  	
	  	return a;
	
	}


}
