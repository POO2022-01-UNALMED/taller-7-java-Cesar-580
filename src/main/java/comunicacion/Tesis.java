package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private String [] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen,String titulo, String autor, int paginas,String idea,String[] argumentos,String conclusion,String referencias, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	// --> Metodos get-set
	// - idea
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	// - argumentos	
	public String[] getArgumentos() {
	    return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
	    this.argumentos = argumentos;
	}
	
	// - conclusion	
	public String getConclusion() {
	    return conclusion;
	}
	public void setConclusion(String conclusion) {
	    this.conclusion = conclusion;
	}
	
	// - referencias	
	public String getReferencias() {
	    return referencias;
	}
	public void setReferencias(String referencias) {
	    this.referencias = referencias;
	}
	
	// - interpretacion	
	public String getInterpretacion() {
	    return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
	    this.interpretacion = interpretacion;
	}
	
	// Metodos
    
	// - palabrasTotales
	public int palabrasTotales(int parametro) {
		return 5*(this.getPaginas())*parametro;
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
				+ this.idea+"\n"
				+ this.getArgumentos().length+"\n"
				+ this.conclusion+"\n"
				+ this.referencias;
	}
	
	

}
