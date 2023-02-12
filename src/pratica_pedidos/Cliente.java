package pratica_pedidos;

import java.util.Scanner;

public class Cliente {
	
	String nombre;
	String apellidos;
	String telefono;
	String TypePhone;
	String direccion;
	String historial;
	String FechaDeAlta;
	
	//METODO Cliente (DATOS DEL CLIENTE)
	public Cliente (String name, String ape, String phone, String direction, String histo, String FechaDeAlta) {
		this.nombre = name.toLowerCase();
		this.apellidos = ape.toLowerCase();
		this.telefono = phone;
		this.direccion = direction;
		this.historial = histo;
		this.FechaDeAlta = FechaDeAlta;
	}
	
	public Cliente crearCliente (Cliente nuevocliente) {
		//Metodo de creacion del cliente
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el nombre del cliente");
		String nombre = sc.next();
		nuevocliente.setNombre(nombre);
		System.out.println("Introduzca su apellido");
		String apellido = sc.next();
		nuevocliente.setApellidos(apellido);
		//Verificacion del numero, solo acepta numeros de telefono que tengan un tamaño de 9 digitos y que inicie por 7, 6, 8 y 9
		boolean Numero = false;
		while (!Numero) {
		System.out.println("Introduzca su telefono");
		String telnum = sc.next();
		if ((telnum.length() == 9) && (telnum.startsWith("7") || telnum.startsWith("6") || telnum.startsWith("8") || telnum.startsWith("9"))) {
			if ((telnum.startsWith("6") || telnum.startsWith("7"))) {
				TypePhone = "Movil";
				System.out.println("Tu numero es valido");
				Numero = true;
			} else {
				System.out.println("Tu numero es valido");
				TypePhone ="Fijo";
				Numero = true;
			}	
		} else {
			System.out.println("Tu numero no es valido");
			Numero = false;
		}
		nuevocliente.setTelefono(telnum);
		}
		
		System.out.println("Introduzca su direccion actual");
		String calle = sc.next();
		nuevocliente.setDireccion(calle);
		//Muestra de datos del cliente
		System.out.println("##### DATOS CLIENTE #####");
		System.out.println("Nombre: " + nuevocliente.getNombre()+" Apellido: "+ nuevocliente.getApellidos()+"\r\nTelefono: "+nuevocliente.getTelefono()+" Direccion: "+nuevocliente.getDireccion() + "\n");
		return nuevocliente;
		
	}
	
	// METODO (agregarpedido (Pedido pedido))
	public void agregarpedido () {
		Producto producto1;
		Producto producto2;
		double importeTotal;
		String historial;
	}
	//METODO (AñadirHistorial(Historial))
	public void AnadirHistorial () {
		historial = historial.concat(PasarelaDePago.CodigoPago);
	}
	
	//CONSTRUCTORES
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		nombre = nombre.toLowerCase();
		this.nombre = nombre;
	}
	/**
	 * @return el apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos el apellidos a establecer
	 */
	public void setApellidos(String apellidos) {
		apellidos = apellidos.toUpperCase();
		this.apellidos = apellidos;
	}
	/**
	 * @return el telefono  
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion el direccion a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el historial
	 */
	public String getHistorial() {
		return historial;
	}
	/**
	 * @param historial el historial a establecer
	 */
	public void setHistorial(String historial) {
		this.historial = historial;
	}
	/**
	 * @return el fechaDeAlta
	 */
	public String getFechaDeAlta() {
		return FechaDeAlta;
	}
}
