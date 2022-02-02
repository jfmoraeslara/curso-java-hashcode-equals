package application;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "mariamaria@gmail.com");
		Cliente c3 = new Cliente("Alex", "alex@gmail.com");		
		Cliente c4 = new Cliente("Alex", "alex@gmail.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println("Os objetos são iguais? " + c1.equals(c2));
		System.out.println("Os objetos são iguais? " + c1.equals(c3));
		System.out.println("Os objetos são iguais? " + c3.equals(c4));
		// == vai comparar o posição (referencia) dos elementos, dando false		
		System.out.println("Os objetos são iguais? " + (c3 == c4));
		// == compilador dá um tratamento especial para forma como foi escrita o String
		System.out.println("Comparando s1 e s2: " + (s1 == s2));
	}
}
