package parteuno;

import java.util.ArrayList;
import java.util.List;

import parteuno.colas.Cola;
import parteuno.colas.ColaAbst;
import parteuno.colas.ColaAzar;
import parteuno.colas.ColaIntercalada;

public class Principal {

	public static void main(String[] args) {
		
		
		Cola c=new Cola();

		Cola c1=new Cola();

		Cola c2=new Cola();
		
		Cola c3=new Cola();
		
		Cola c4=new Cola();
		
		//las inicializo para que no den error si estan vacias y se les pide devolver un elmento
		
		c.agregar("vacio 0");
		
		c1.agregar("vacio 1");
		
		c2.agregar("vacio 2");
		
		c3.agregar("vacio 3");
		
		c4.agregar("vacio 4");
		
		
		/*
		c.agregar("1");
		
		c2.agregar("8");

		*/
		
		ColaIntercalada EstInter2=new ColaIntercalada();
		
		ColaIntercalada EstInter1=new ColaIntercalada();
		
		ColaAzar EstInter=new ColaAzar();
		
		EstInter2.agregar(c2);
		
		EstInter1.agregar(EstInter2);

		EstInter1.agregar(c);

		EstInter.agregar(EstInter1);
		
	
		EstInter.agregar("a");
	
		EstInter.agregar("b");
	
		EstInter.agregar("c");
	
		EstInter.agregar("e");

		EstInter.agregar("f");
		
		EstInter.agregar("g");
	
		EstInter.agregar("h");
		

		Cola aux=EstInter.getColaMaxima();
			
		
		System.out.println("Cola con mas elementos : " + aux.getTamano());
		
		System.out.println("Devuelve un elemento : " + aux.devolver());

		System.out.println("Devuelve cantidad de colas terminales : " + EstInter.getCantColas());

		System.out.println("Devuelve la cantidad de elementos totales : " + EstInter.getTamano());
		
		
		
       	}

	

}
