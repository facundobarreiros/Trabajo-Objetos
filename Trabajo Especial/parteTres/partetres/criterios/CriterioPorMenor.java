package partetres.criterios;

import java.util.Collections;
import java.util.List;

import partetres.colas.ColaAbst;

public class CriterioPorMenor extends Criterio {
	
	//Devuelve la cola con menos elementos
	@Override
	public ColaAbst getCola(List<ColaAbst> colas) {
		
		return Collections.min(colas);
		
	}
	
}

	
