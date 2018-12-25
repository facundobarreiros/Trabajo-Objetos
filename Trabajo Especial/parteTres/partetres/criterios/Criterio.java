package partetres.criterios;

import java.util.List;

import partetres.colas.ColaAbst;

public abstract class Criterio {
	
	//Devuelve una cola de la cual se debe agregar o devolver un elem segun el criterio que lo invoque
	
	public abstract ColaAbst getCola(List<ColaAbst> colas);
	
}
