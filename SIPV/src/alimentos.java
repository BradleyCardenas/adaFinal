
public class alimentos {
	
	private String description;
	private int precio;
	private int cantidad;
	
	
	public alimentos(String description, int precio) {
		this.description = description;
		this.precio = precio;
	}
	
	public alimentos(String description, int precio, int cantidad) {
		this.description = description;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescrition(String description) {
		this.description = description;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	  public String toString() {
	  return this.description;
	  }
}
