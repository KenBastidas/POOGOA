package Sobreescritura;

public class Perro extends Animal{
	@Override
	public void comer() {
		System.out.println("Estoy comiendo sentado en mi plato");
	}

}
