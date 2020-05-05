
public class alimentos {
	
	private String description;
	private int precio;
	
	public alimentos(String description, int precio) {
		this.description = description;
		this.precio = precio;
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
	
	public String getInicio() {
		return this.description = "Seleccione uno";
	}
}
