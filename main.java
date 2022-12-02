import java.util.Scanner;

public class main {
	
	public static int pedirOpcion() {
		Scanner sc=new Scanner(System.in);
		int opcion=sc.nextInt();
		return opcion;
	}
	
	public static void imprimirLista(String[] lista) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lista de nombres: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista[i]+" ");
		}
		sc.nextLine();
	}
	public static String [] llenarLista(String [] lista) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Llena la lista de nombres:");
		String nombre;
		for(int i=0;i<lista.length;i++) {
			System.out.println("Nombre "+(i+1)+": ");
			nombre=sc.nextLine();
			lista[i]=nombre;
		}
		return lista;
	}
	public static String[] llenarSinDups(String[]lista) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Llena la lista de nombres sin repetir:");
		String nombre;
		for(int i=0;i<lista.length;i++) {
			System.out.println("Nombre "+(i+1)+": ");
			nombre=sc.nextLine();
			for(int j=0;j<lista.length;j++) {
				if(nombre.equals(lista[j])) {  //Con este bucle hacemos que si se repite un nombre el iterador no avance hasta que sea diferente
					System.out.print("");
					i--;
				}
			}
			lista[i]=nombre;
		}
		return lista;
	}
	
	public static void replaceChar(String[]lista) {
		String[] lista1=new String[lista.length];
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Qué letra desea reemplazar?");
		char letra1=sc.next().charAt(0);
		System.out.println("Nueva letra:");
		char letra2=sc.next().charAt(0);
		for(int i=0;i<lista.length;i++) {
			lista1[i]=lista[i].replace(letra1, letra2);
		}
		System.out.println("Lista modificada: ");
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista1[i]);
		}
		
	}
	public static void eliminarEspacios(String [] lista) {
		String[] lista1=new String[lista.length];
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<lista.length;i++) {
			lista1[i]=lista[i].trim();
		}
		System.out.println("Lista modificada: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista1[i]);
		}
		System.out.println("");
	}
	public static void replaceName(String [] lista) {
		String[]lista1=new String[lista.length];
		Scanner sc=new Scanner (System.in);
		int control;
		String nombre;
		for(int i=0;i<lista.length;i++) {
			lista1[i]=lista[i];
			System.out.println("¿Desea cambiar el nombre: "+lista1[i]+"?");
			System.out.println("Pulsa 1 para cambiar nombre o 0 para no cambiarlo:");
			control=sc.nextInt();
			sc.nextLine();
			if(control==1) {
				System.out.println("Introduzca nuevo nombre: ");
				nombre=sc.nextLine();
				lista1[i]=nombre;
			}else {
				System.out.println("");
			}
		}
		System.out.println("Lista modificada: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista1[i]+" ");
		}
		System.out.println("");
	}
	
	public static void minus(String[] lista) {
		String [] lista1=new String[lista.length];
		for(int i=0;i<lista.length;i++) {
			lista1[i]=lista[i].toLowerCase();
		}
		System.out.println("Lista modificada: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista1[i]+" ");
		}
		System.out.println("");
	
	}
	public static void mayus(String[] lista) {
		String [] lista1=new String[lista.length];
		for(int i=0;i<lista.length;i++) {
			lista1[i]=lista[i].toUpperCase();
		}
		System.out.println("Lista modificada: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista1[i]+" ");
		}
		System.out.println("");
	
	}
	
	public static void replaceNameByIndex(String[] lista) {
		String[]lista1=new String[lista.length];
		Scanner sc=new Scanner(System.in);
		int control;
		String nombre;
		int index;
		for(int j=0;j<lista.length;j++) {
				lista1[j]=lista[j];
		}
		do {
			System.out.println("¿Quieres cambiar algun nombre? Si (1) No (0)");
			control=sc.nextInt();
			if(control==1) {
				System.out.println("Dime la posicion del nombre de la lista a cambiar: ");
				index=sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca nuevo nombre: ");
				nombre=sc.nextLine();
				lista1[index]=nombre;
			}
		}while(control!=0);
			
		System.out.println("Lista: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista1[i]+" ");
		}
		System.out.println("");
	}
	
	public static void indexName(String [] lista) {
		Scanner sc=new Scanner (System.in);
		int control;
		do {
			System.out.println("Salir (0) o pedir indice por nombre (1)");
			control=sc.nextInt();
			sc.nextLine();
			if(control==1) {
				System.out.println("Dime el nombre que quieras y te diré su posicion:");
				String nombre=sc.nextLine();
				for(int j=0;j<lista.length;j++) {
					if(lista[j].equals(nombre)) {
						System.out.println("Posicion del nombre "+nombre+": "+j);
					}
				}
			}
			
		}while(control!=0);
		
		System.out.println("Lista: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista[i]+" ");
		}
		System.out.println("");
	}
	
	public static void vaciarArray(String[]lista) {
		for(int i=0;i<lista.length;i++) {
			lista[i]="";
		}
		System.out.println("Lista modificada: ");
		for(int j=0;j<lista.length;j++) {
			System.out.print(lista[j]+" ");
		}
	}
	
	public static void formarPalabra(String[]lista) {
		char[] totalWord=new char[lista.length];
		for(int i=0;i<lista.length;i++) {
			totalWord[i]=lista[i].charAt(0);
		}
		System.out.println(totalWord);
	}
	
	public static void numeroCaracteres(String[]lista) {
		Scanner sc=new Scanner(System.in);
		int numCarac;
		int index;
		int control;
		do {
			System.out.println("Seguir (1) / salir (0)");
			control=sc.nextInt();
				if(control==1) {
					System.out.println("¿De qué elemento quieres conocer el numero de caracteres?");
					index=sc.nextInt();
					numCarac=lista[index].length();
					System.out.println("El nombre "+lista[index]+" tiene "+numCarac+" caracteres");
				}
		}while(control!=0);
		
		System.out.println("Pulsa intro para continuar");
	}
	
	public static String[] cambiarTamano(String[]lista) {
		int tamaño;
		Scanner sc=new Scanner(System.in);
		System.out.println("¿De que tamaño quieres el nuevo array?");
		tamaño=sc.nextInt();
		String[]lista1=new String[tamaño];
		for(int i=0;i<lista1.length;i++) {
			lista1[i]=lista[i];
		}
		return lista1;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int tamaño;
		int opcion;
		System.out.println("--------------Jugando con Arrays y Strings---------------");
		System.out.println("Usuario dime el tamaño del array: ");
		tamaño=sc.nextInt();
		
		String [] lista=new String[tamaño];
		
		do {
			System.out.println("Selecciona una opcion: ");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. LLenar el Array");
			System.out.println("2. LLenar el Array sin duplicados");
			System.out.println("3. LLenar el Array uno a uno (inserar un solo nombre, despues del ultimo insertado");
			System.out.println("4. Cambia todas una letra en todo el array por la que le indiquemos.");
			System.out.println("5. Quita todos los espacios que tenga una palabra al principio y/o al final");
			System.out.println("6. Imprimir lista original");
			System.out.println("7. Reemplazar un nombre dandole la posición");
			System.out.println("8. Imprimir toda la lista en mayusculas");
			System.out.println("9. Imprimir toda la lista en minusculas");
			System.out.println("10. Cambia un nombre que te doy por otro que tambien te doy");
			System.out.println("11. Dame la posición de un nombre que te indico");
			System.out.println("12. Vacia el array poniendo una cadena vacia en cada posición");
			System.out.println("13. Te doy un nombre y una posición y la remplazas en el array");
			System.out.println("14. Escribe una palabra formada de la primera letra de cada una que tenemos en el array");
			System.out.println("15. Cambia el tamaño del array");
			System.out.println("16. Dime el número de caracteres que tiene una palabra si te doy su posición");
			System.out.println("17. Cuantos elementos tengo en el Array");
			System.out.println("0. Salir");
			System.out.println("------------------------------------------------------------------------------------");
			opcion=pedirOpcion();
			if(opcion<0 || opcion>17) {
				System.out.println("Usuario introduce un numero del 0 al 17");
				sc.nextLine();		
			}
			switch(opcion) {
				case 1:
					lista=llenarLista(lista);
					imprimirLista(lista);			
					break;
				
				case 2:
					lista=llenarSinDups(lista);
					imprimirLista(lista);
					break;
				
				case 3:
					lista=llenarLista(lista);
					imprimirLista(lista);
					break;
				
				case 4:
					replaceChar(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 5:
					eliminarEspacios(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 6:
					imprimirLista(lista);
					break;
				
				case 7:
					replaceNameByIndex(lista);
					sc.nextLine();
					sc.nextLine();
					
					break;
				
				case 8:
					mayus(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 9:
					minus(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 10:
					replaceName(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 11:
					indexName(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 12:
					vaciarArray(lista);
					sc.nextLine();
					System.out.println("");
					System.out.println("Ahora debe pulsar de nuevo la opcion 1, 2 o 3 para llenar el array de nuevo, ya que se ha vaciado");
					sc.nextLine();		
					break;
				
				case 13:
					replaceNameByIndex(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 14:
					formarPalabra(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 15:
					lista=cambiarTamano(lista);
					sc.nextLine();
					sc.nextLine();
					break;
				
				case 16:
					numeroCaracteres(lista);
					sc.nextLine();
					sc.nextLine();
					
					break;
				
				case 17:
					int longitud=lista.length;
					System.out.println("El array tiene "+longitud+" elementos");
					sc.nextLine();
					break;
					
			}   
			
		}while(opcion!=0);
		
		System.out.println("Fin del programa.");

	}

}
