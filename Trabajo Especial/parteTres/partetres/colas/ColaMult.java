package partetres.colas;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Collections;
import java.util.List;

import partetres.criterios.Criterio;

public class ColaMult extends ColaAbst{
	
	protected Criterio criterioDeDevolver;

	protected Criterio criterioDeAgregar;
		
	protected List<ColaAbst> cola1 = new ArrayList<ColaAbst>();
			
	public ColaMult(Criterio criterioDeAgregar,Criterio criterioDeDevolver) {
	
		this.criterioDeAgregar=criterioDeAgregar;	
		
		this.criterioDeDevolver=criterioDeDevolver;	
					
	} 
	
    public ColaMult() {}
	
	public void agregar(ColaAbst cola) {
	   	
		cola1.add(cola);
			
	};
	
	public void agregar(Object obj) {
				
		((criterioDeAgregar.getCola(cola1))).agregar(obj);
	}
	
	public void  setCriterioAgregar(Criterio criterioDeAgregar) {
		
		this.criterioDeAgregar=criterioDeAgregar;	
		
	}	
	
	public void  setCriterioDevolver(Criterio criterioDeDevolver) {
		
		this.criterioDeDevolver=criterioDeDevolver;	

	}	
	
	@Override
	public Object devolver() {

		return ((criterioDeDevolver.getCola(cola1))).devolver();
	}

	@Override //devuelve la cantidad de elementos 
	public int getTamano() {
		
		int acumulador=0;
		
		for(ColaAbst c:cola1)
			 
			 acumulador=acumulador+(c.getTamano());
		 
		return acumulador;
			
	}
	
	public List<Cola> getTerminals() {																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
		
		List<Cola> res = new ArrayList<Cola>();
		
		for (ColaAbst c : cola1) {
			
			res.addAll(c.getTerminals());
		}
		
		return res;
	}
	
	
	 //Cola con mas elementos 
		public Cola getColaMaxima() {
			
			List<Cola> lista=getTerminals();
			
			Cola solucion = Collections.max(lista);
			
			return ((Cola)solucion);
			
		}
		
		
		//devolver contidad de colas terminales
		public int getCantColas() {
			
			return getTerminals().size();
			
		}
		 
	
}
	
	


		
	

