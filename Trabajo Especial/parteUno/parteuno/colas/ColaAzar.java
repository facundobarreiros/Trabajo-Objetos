package parteuno.colas;

import java.util.Random;

public class ColaAzar extends ColaMult {
		
	public void agregar(ColaAbst cola) {	
		
		super.agregar(cola);	
		
	}
	
	public int getRandom() {
		
		Random rand=new Random();
		
		int x =rand.nextInt(cola1.size());
		
		return x;
	}
	
	
	//agrega un nuevo elemento al azar entre las colas disponibles
	public void agregar(Object obj) {	
	
		agregar(getRandom(),obj);	
		
	}
	
	
	@Override  //devuelve elemento al azar
	public Object devolver() {
		
		return super.devolver(getRandom());
		
	}	
	
	
}
