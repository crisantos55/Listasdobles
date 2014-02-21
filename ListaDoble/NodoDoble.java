package ListaDoble;

public class NodoDoble {

	public NodoDoble siguiente;
	public NodoDoble anterior;
	public Integer dato;

	public NodoDoble(Integer d) {
		this.dato = d;
		this.siguiente = null;
		this.anterior = null;
	}

	public NodoDoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}

	public Integer getDato() {
		return dato;
	}

	public void setDato(Integer dato) {
		this.dato = dato;
	}

}
