package StructuralDesignPatterns.Decorator;

public class DriverDecorator {
	
	public static void main(String[] args) {
		Sorvete sorvete = new SorteveSimples();
		// adding additional (decorating the "base class")
		sorvete = new ComCalda(sorvete);
		sorvete = new ComGotasDeChocolate(sorvete);
		// methods call the base class method first, then the next one on the stack... continuing until the last one
		System.out.println(sorvete.informaPreco());
		System.out.println(sorvete.informaAdicionais());
	}

}
