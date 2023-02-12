package pratica_pedidos;

import java.util.ArrayList;
import java.util.Scanner;
public class GestionPedidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//GENERAMOS CLIENTES, PRODUCTOS, PEDIDO, PAGOEFECTIVO Y PAGOTARJETA de base para luego modificarlo
		Cliente Cliente1 = new Cliente("", "", "633567880", "A1", "", "");
		Cliente Cliente2 = new Cliente("", "", "633567880", "A2", "", "");
		Cliente Cliente3 = new Cliente("", "", "633567880", "A3", "", "");
		
		Producto Producto1 = new Producto("A", 1, 1);
		Producto Producto2 = new Producto("A", 1, 1);
		Producto Producto3 = new Producto("A", 1, 1);
		Producto Producto4 = new Producto("A", 1, 1);
		Producto Producto5 = new Producto("A", 1, 1);
		
		Pedido Pedido1 = new Pedido();
		
		PasarelaDePago Efectivo1 = new PasarelaDePago();
		
		PasarelaDePago Tarjeta1 = new PasarelaDePago();
		
		//Array hecho para generar los clientes de forma automatica del 1 al 3
		System.out.println("##### MENU INICIAL #####\r\n1.Crear clientes\r\n2.Crear productos");
		System.out.println("");
		
		int i;
		ArrayList<Cliente> al=new ArrayList<Cliente>();
		al.add(Cliente1);
		al.add(Cliente2);
		al.add(Cliente3);
		for (i = 0; i < al.size(); i++) {
			System.out.println("Introduzca los datos del cliente " + (i + 1));
			al.get(i).crearCliente(al.get(i));
			
		}
		
		//Creacion de productos los 5 productos empezando por el producto1 al igual que con los clientes
			
		System.out.println("Ahora se solicitara la creacion de 5 productos.\n");

		ArrayList<Producto> alpro=new ArrayList<Producto>();
		alpro.add(Producto1);
		alpro.add(Producto2);
		alpro.add(Producto3);
		alpro.add(Producto4);
		alpro.add(Producto5);
		for (i = 0; i < alpro.size(); i++) {
			System.out.println("Introduzca los datos del producto " + (i + 1));
			alpro.get(i).nuevoproducto(alpro.get(i));
			
		}
		
		System.out.println("#### MENU PEDIDOS ####");
		System.out.println("1. Realizar pedido");
		int eleccion = sc.nextInt();
			switch (eleccion) {
			case 1:
				boolean inicio= false;
				//Esto verifica que el telefono que ingresamos es uno de los que estan puestos dentro de uno de los clientes.
				while (!inicio) {
					System.out.println("Introduzca su numero de telefono");
					String TelInicio=sc.next();
					if (TelInicio.equals(Cliente1.getTelefono() ) || TelInicio.equals(Cliente2.getTelefono()) || TelInicio.equals(Cliente3.getTelefono()))  {
						inicio=true;
					} else {
						System.err.println("Su telefono no coincide con el de ningun cliente por favor vuelva a ingresarlo");
						inicio=false;
					}
				}
				
				break;

			default:
				System.err.println("Opcion no valida");
				break;
			}
		//Esto permite la generacion del producto llamando a la clase "AgregarProducto"
		Pedido1.AgregarProducto1(Producto1, Producto2, Producto3, Producto4, Producto5, Pedido1);
			
		System.out.println("El precio de su pedido es de: " + Pedido1.getImporteTotal());
			
		System.out.println("Desea añadir otro producto a la cesta? (y/n)");
		char siono = sc.next().charAt(0);
		//Con esto dependiendo de la respuesta puede generar otro producto
		if (siono == 'y') {
			
			Pedido1.AgregarProducto2(Producto1, Producto2, Producto3, Producto4, Producto5, Pedido1);
			
			System.out.println("El precio de su pedido es de: " + Pedido1.getImporteTotal());
			
		} else {
			System.out.println("El precio de su pedido es de: " + Pedido1.getImporteTotal());
		}
		
		System.out.println("Eliga su metodo de pago:#\r\n1.Efectivo\r\n2.Tarjeta");
		
		int opcionpago = sc.nextInt();
		//Con este switch elegimos entre uno de los dos metodos de pago llamando a la clase "PagoEfectivo" y "PagoTarjeta"
		switch (opcionpago) {
		case 1:
			Efectivo1.PagoEfectivo(Pedido1, Efectivo1);
			break;
		case 2:
			Tarjeta1.PagoTarjeta(Pedido1, Efectivo1);
			break;
		default:
			System.err.println("Opcion no valida");
			break;
		}
		
		boolean salir = false;
		while (!salir) {
			
		
			System.out.println("Quieres revisar el stock de los productos?" + "\n 1. Si" + "\n 2. No");
			//Aqui mostraria al usuario el stock de cada uno de los productos
			
			//AQUI HE TENIDO UN PROBLEMA POR ALGUN MOTIVO QUE AUN NO HE DESCUBIERTO ME DA ERROR EN EL SCANNER SIGUIENTE
			int revisionstock = sc.nextInt();
			if (revisionstock == 1) {
				System.out.println("Stock Producto 1: " + Producto1.getCantidad() + "\n" + "Stock Producto 2: " + Producto2.getCantidad()
				+ "Stock Producto 3: " + Producto3.getCantidad() + "Stock Producto 4: " + Producto4.getCantidad() + "Stock Producto 5: " + Producto5.getCantidad());
				System.out.println("Para modificar el stock de alguno de estos productos seleccione una de estas opciones");
				System.out.println("1. Producto1" + "\n 2. Producto2" + "\n 3. Producto3" + "\n 4. Producto4" + "\n 5. Producto5" + "\n 6.Salir");
				int eleccionstock = 0;
				
				switch (eleccionstock) {
				//En cada uno de estos case daria al usuario la posibilidad de alterar el stock aumentandolo
				case 1:
					System.out.println("Ingresa la cantidad a aumentar del stock");
					int cantidadplus = sc.nextInt();
					Producto1.setCantidad(cantidadplus);
					break;
				case 2:
					System.out.println("Ingresa la cantidad a aumentar del stock");
					int cantidadplus1 = sc.nextInt();
					Producto1.setCantidad(cantidadplus1);
					break;
				case 3:
					System.out.println("Ingresa la cantidad a aumentar del stock");
					int cantidadplus2 = sc.nextInt();
					Producto1.setCantidad(cantidadplus2);
					break;
				case 4:
					System.out.println("Ingresa la cantidad a aumentar del stock");
					int cantidadplus3 = sc.nextInt();
					Producto1.setCantidad(cantidadplus3);
					break;
				case 5:
					System.out.println("Ingresa la cantidad a aumentar del stock");
					int cantidadplus4 = sc.nextInt();
					Producto1.setCantidad(cantidadplus4);
					break;
				case 6:
					salir = true;
					break;
				default:
					break;
				}
			} else {
				System.out.println("Que pase un buen dia");
			}
		}
	}
}