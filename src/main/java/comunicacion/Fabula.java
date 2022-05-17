package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion; 
	}
	
	// --> Metodos get-set
	// - ensenanza	
	public String getEnsenanza() {
        return this.ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
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
 		return (this.getPaginas())*parametro;
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
				+ this.ensenanza;
	}
 	
}
