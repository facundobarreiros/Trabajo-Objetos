package partetres.criterios;

import partetres.colas.Cola;
import partetres.colas.ColaMult;

public class Principal {

	public static void main(String[] args) {
		

		Cola c=new Cola();

		Cola c1=new Cola();
		
		Cola c2=new Cola();
		
		Cola c3=new Cola();
		
		Cola c4=new Cola();
		
		
		c.agregar("vacio 0");
		 
		c1.agregar("vacio 1");
		
		c2.agregar("vacio 2");
		
		c3.agregar("vacio 3");
		
		c4.agregar("vacio 4");
		
		/*
		c.agregar("menos");
		
	
		c1.agregar("1");
		
		c4.agregar("1");
		
		c4.agregar("1");
*/
		Criterio criterio_mayor=new CriterioPorMayor();
		
		Criterio criterio_azar=new CriterioAzar();
		
		Criterio criterio_menor=new CriterioPorMenor();
		
		Criterio criterio_intercalado=new CriterioIntercalado();


		ColaMult est=new ColaMult(criterio_azar,criterio_azar);
		
		ColaMult est2=new ColaMult(criterio_mayor,criterio_mayor);
		
		ColaMult est3=new ColaMult(criterio_mayor,criterio_mayor);


		
		est.agregar(c);
		
		est.agregar(c1);	
		
		est.agregar(c4);	


		
		/*est.agregar(c4);


	    est3.agregar(c2);
		
		est2.agregar(est3);
		
		est.agregar(est2);

		est.agregar("a");
		
		est.agregar("b");

		est.agregar("c");
		
		est.agregar("d");
		
		est.agregar("e");

		est.agregar("f");
		
		System.out.println("   ");
		*/
	/*	
		System.out.println("devolver elemento al azar :" +est.devolver() );
		
		
		est.setCriterioDevolver(t3);

		System.out.println("  ");

		System.out.println(" devolver elemento de la cola con menos elemntos : "+est.devolver());
		
		System.out.println("  ");
		
		est.setCriterioDevolver(t4);
		
		System.out.println(" devolver elemento de  forma intercalada : "+est.devolver());
		
		
		System.out.println("  ");
		
		est.setCriterioDevolver(t);
		
		System.out.println(" devolver elemento de  la cola con mas elemntos  :"+est.devolver());
		
		Cola c33=est.getColaMasElementos();
		
		System.out.println(c33.devolver());
		
		
*/

		Cola aux=est.getColaMaxima();
		
		System.out.println("Cola con mas elementos : " + aux.getTamano());
		
		System.out.println("Devuelve un elemento : " + aux.devolver());

		System.out.println("Devuelve cantidad de colas terminales : " + est.getCantColas());

		
		System.out.println("------------------ ");


		System.out.println("Devuelve un elemento : " + est.getTamano());

	}

	
}
