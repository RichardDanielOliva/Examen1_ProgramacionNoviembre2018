// RICHARD DANIEL OLIVA DENIS

public class ProgramaTexto {

	public static void main (String[] args) {
		String textoPrueba = "hola mundo";
		String textoPrueba2 = "hola mundo hola mundo hola mundo hola mundo hola mundo hola mundo hola mundo"; //String que supere el numero maximo de carateres

		Texto prueba1 = new Texto(50);

		System.out.println(prueba1.anadirLinea(textoPrueba)); //Añadimos una linea valida
		System.out.println(prueba1.anadirLinea(textoPrueba2)); //Añadimos una linea no-valida

		System.out.println(prueba1.numeroLineas()); //comprobamos que haya entrado la linea
		System.out.println(prueba1.tamanoLinea(textoPrueba));

		System.out.println(prueba1.anadirLinea(textoPrueba));  //comprobamos que el metodo tamano funciones
		System.out.println(prueba1.tamano()); 

		System.out.println(prueba1.contarVocales());//comprobamos metodo 
		System.out.println(prueba1.contarNoVocales());//comprobamos metodo 

		System.out.println(prueba1.anadirLinea(textoPrueba));
		System.out.println(prueba1.anadirLinea(textoPrueba));
		System.out.println(prueba1.anadirLinea(textoPrueba));
		System.out.println(prueba1.anadirLinea(textoPrueba));
		System.out.println(prueba1.anadirLinea(textoPrueba));
		System.out.println(prueba1.anadirLinea(textoPrueba));
		System.out.println(prueba1.anadirLinea(textoPrueba)); 
		System.out.println(prueba1.anadirLinea(textoPrueba)); 
		System.out.println(prueba1.numeroLineas()); //comprobamos metodo 

		System.out.println(prueba1.anadirLinea(textoPrueba));  //comprobamos que el metodo tamano funciones
		System.out.println(prueba1.contarVocales());//comprobamos metodo 
		System.out.println(prueba1.contarNoVocales());//comprobamos metodo 
		
		prueba1.mostrar();
	}
}