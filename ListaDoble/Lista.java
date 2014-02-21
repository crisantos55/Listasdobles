package ListaDoble;

public class Lista {
	public NodoDoble inicio;

	public void insertarInicio(Integer d) {
		NodoDoble nuevo = new NodoDoble(d);
		if (inicio == null) {
			inicio = nuevo;

		} else {
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio = inicio.getAnterior();

		}

	}

	public void insertarFinal(Integer d) {
		NodoDoble nuevo = new NodoDoble(d);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			NodoDoble aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);

		}
	}

	public void recorrer() {
		NodoDoble aux = inicio;
		while (aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getSiguiente();
		}
	}

	public void recorrerAtras() {
		NodoDoble aux = inicio;
		while (aux.getSiguiente() != null) {
			aux = aux.getSiguiente();
		}

		while (aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getAnterior();
		}

	}

}