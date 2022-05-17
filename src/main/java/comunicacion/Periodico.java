package comunicacion;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico (String origen,String titulo, String autor, int paginas, String fecha,String primicia,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion; 
	}
	
	// --> Metodos get-set
	// - fecha
	 public String getFecha() {
		 return this.fecha;
	 }
	 public void setFecha(String fecha) {
		 this.fecha = fecha;
	 }
	 
	 // - primicia	
	 public String getPrimicia() {
		 return this.primicia;
     }   
	 public void setPrimicia(String primicia) {   
		 this.primicia = primicia;
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
		 return 10*(this.getPaginas())*parametro;
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
					+ this.getFecha()+"\n"
					+ this.getPrimicia()+"\n";
		}
	
}
