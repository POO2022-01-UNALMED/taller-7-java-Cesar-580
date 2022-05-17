package comunicacion;

public class Libro extends Escrito{
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen,String titulo, String autor, int paginas, String co_autor,String editorial,String edicion, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	// --> Metodos get/set
	// - co_autor
	public String getCo_autor() {
		return this.co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	
	// - editorial 	
	public String getEditorial() {
		return this.editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	// - edicion 
	public String getEdicion() {
		return this.edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	// - interpretacion
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	// Metodos
	
	// - palabrasTotales
	public int palabrasTotales(int parametro) {
		return 2*(this.getPaginas())*parametro;
	}
	
	// - interpretacion
	public String interpretacion() {
		return this.interpretacion;
	}
	
	// - toString()
	public String toString() {
		return    this.getOrigen()+"\n"
				+ this.getTitulo()+"\n"
				+ this.getAutor()+"\n"
				+ this.getPaginas()+"\n"
				+ this.getCo_autor()+"\n"
				+ this.getEditorial()+"\n"
				+ this.getEdicion()+"\n";
	}
	
	
}
