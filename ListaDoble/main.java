package ListaDoble;

public class main {
	public static void main(String... args) {
		Lista doble = new Lista();

		// doble.insertarInicio(3);
		// doble.insertarInicio(4);
		// doble.insertarInicio(5);

		doble.insertarFinal(3);
		doble.insertarFinal(4);
		doble.insertarFinal(5);

		doble.recorrerAtras();
	}

}
