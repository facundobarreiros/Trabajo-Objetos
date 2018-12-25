package partedos;

import cola.Cola;
import cola.ColaMult;
import criterios.Criterio;
import criterios.CriterioAzar;
import criterios.CriterioIntercalada;

public class Principal {

	public static void main(String[] args) {
		

		Cola c=new Cola();

		Cola c1=new Cola();

		
		Cola c2=new Cola();
		
		Cola c3=new Cola();
		
		Cola c4=new Cola();
		
		
		c.agregar("vacio");
		
		c1.agregar("vacio 1");
		
		c2.agregar("vacio 2");
		
		c3.agregar("vacio 3");
		
		c4.agregar("vacio 4");
		
		
	
		Criterio criterio_azar=new CriterioAzar();
		
		Criterio criterio_intercalada=new CriterioIntercalada();


		ColaMult est=new ColaMult(criterio_azar);
		ColaMult est2=new ColaMult(criterio_azar);


		
		est2.agregar(c);	
		
		est.agregar(c1);
		
		est.agregar(est2);
		
		est.agregar("a");	
		est.agregar("b");
		est.agregar("c");	
		est.agregar("d");
		est.agregar("e");	
		est.agregar("f");

		

		//System.out.println("Devuelve forma azar:   " +est.devolver());
		
		System.out.println("-------------------------------   ");

		est.setCriterio(criterio_azar);
		
		System.out.println("Devuelve forma intercalado c :   " +est.devolver());
		System.out.println("Devuelve forma intercalado c1 :   " +est.devolver());
		System.out.println("Devuelve forma intercalado c:   " +est.devolver());

		
		System.out.println("-------------------------------   ");

		est.setCriterio(criterio_intercalada);
		
		System.out.println("Devuelve forma intercalado c :   " +est.devolver());
		System.out.println("Devuelve forma intercalado c1 :   " +est.devolver());
		System.out.println("Devuelve forma intercalado c:   " +est.devolver());

		//Cola a=est.getColaMasElementos();	
		
		System.out.println("-------------------------------   ");
		
		Cola aux=est.getColaMaxima();
			
		
		System.out.println("Cola con mas elementos : " + aux.getTamano());
		
		System.out.println("Devuelve un elemento : " + aux.devolver());

		System.out.println("Devuelve cantidad de colas terminales : " + est.getCantColas());

		System.out.println("Devuelve la cantidad de elementos totales : " + est.getTamano());

		
		
	}

	
}
