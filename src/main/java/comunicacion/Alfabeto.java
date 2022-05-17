package comunicacion;

public class Alfabeto extends Pictograma{
	
	// ------- Atributos -------
	private String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	
	// --> Metodos get/set
	// - Letras
	public String[] getLetras() {
		return this.letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	// - Interpretacion 	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	// --> Metodos
	// - cantidadLetras
	public int cantidadLetras() {
		return this.letras.length;
	}
	
	// - interpretacion
	public String interpretacion() {
		return this.interpretacion;
	}
	
	
	// - toString
	public String toString() {
		//String lett = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}
	
	
	
	
	
}
