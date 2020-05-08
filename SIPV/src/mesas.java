
public class mesas {
	
	private int clave;
	private String numMesa;
	private alimentos PedidosMesa[];

	
	public mesas(int clave) {
		this.clave = clave;
		numMesa = String.valueOf(clave);
		PedidosMesa = new alimentos[5];
	}
	
	public int getClave() {
		return this.clave;
	}
	
	public void setClave(int clave) {
		this.clave = clave;
	}

	public alimentos[] getPedidosMesa() {
		return PedidosMesa;
	}

	public alimentos getPedidosMesa(int posicion) {
		return PedidosMesa[posicion];
		
	}
	
	public void setPedidosMesa(alimentos[] pedidosMesa) {
		PedidosMesa = pedidosMesa;
	}
	
	@Override
	  public String toString() {
	  return numMesa;
	  }
}
