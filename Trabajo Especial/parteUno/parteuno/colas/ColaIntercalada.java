package parteuno.colas;


public class ColaIntercalada extends ColaMult{

	private int iter;
	private int iter2;

	public ColaIntercalada( ) {
		
		iter=0;
		iter2=0;
	
	}
	
	public void agregar(ColaAbst cola) {
		

		super.agregar(cola);	

	}
	
	
	//agrega un nuevo elemento intercalado entre las colas disponibles
		public void agregar(Object obj) {
			
	  	agregar(iter,obj);
	  	
	  	iter=iter+1;

	  	if (iter>=cola1.size())
					
			iter=0;
	
		}
		

		public Object devolver() {
				
		int aux=iter2;
		
		
		iter2=iter2+1;
		
		if (iter2>=cola1.size())
			
			iter2=0;
			
			return super.devolver(aux);
		}
		

}
