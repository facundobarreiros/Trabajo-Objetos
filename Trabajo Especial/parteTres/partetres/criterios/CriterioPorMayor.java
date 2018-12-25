package partetres.criterios;

import java.util.Collections;
import java.util.List;

import partetres.colas.ColaAbst;

public class CriterioPorMayor extends Criterio{
	
	//Devuelve la cola con mas elementos
	@Override
	public ColaAbst getCola(List<ColaAbst> colas) {
	
		return 	Collections.max(colas);
	}

	

}
