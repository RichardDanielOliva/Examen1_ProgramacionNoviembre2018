// RICHARD DANIEL OLIVA DENIS

public class Texto {
	private final int MAXLINEA = 10;
	private int maxCaract;
	private int contadorNumLineas;
	private String [] texto;

	public Texto (int maxCaract){
		setMaxCaract(maxCaract);
		contadorNumLineas = 0;
		texto = new String [MAXLINEA];
	}

	public void setMaxCaract(int maxCaract){
		this.maxCaract = maxCaract;
	}

	public int numeroLineas(){
		return contadorNumLineas;
	}

	public int tamanoLinea(String linea){
		int resultado = 0;

		for (int a = 0; a < linea.length(); a++) { 
			if (linea.charAt(a) != ' ') resultado++; //No toma en consideracion los espacios en blanco "";
		}

		return resultado;
	}

	public int tamano(){
		int resultado = 0;

		for (int a = 0; a < contadorNumLineas; a++){
			resultado += tamanoLinea(texto[a]);
		}

		return resultado;
	}

	public boolean sePuedeAnadir(String linea){
		return (contadorNumLineas < MAXLINEA) && (tamanoLinea(linea) < maxCaract);
	}

	public boolean anadirLinea(String linea){
		boolean resultado = sePuedeAnadir(linea);

		if (resultado) {
			texto [contadorNumLineas] = linea;
			contadorNumLineas++;
		}

		return resultado;
	}
		

	public int contarVocales(){
		int resultado = 0;

		for (int a = 0; a < contadorNumLineas; a++) { 
			for (int b = 0; b < texto[a].length(); b++) {
				char letraAux = texto[a].charAt(b);

				if (letraAux == 'a' ||
				 letraAux == 'e' || 
				 letraAux == 'i' ||
				 letraAux == 'o' ||
				 letraAux == 'u') resultado++;
				}
		}

		return resultado;
	}

	public int contarNoVocales(){
		return (tamano() - contarVocales());
	}

	public void mostrar(){

		for (int a = 0; a < contadorNumLineas; a++){
			System.out.println(texto[a]);
		}
	}
}