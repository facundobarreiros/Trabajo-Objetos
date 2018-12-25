package criterios;

import java.util.Random;

public  class CriterioAzar extends Criterio {
		
	
	//@Override
	public int getCola(int aux) {	
		
		Random rand=new Random();
		
		int x =rand.nextInt(aux);
						
		return x;		
	}

	
}
