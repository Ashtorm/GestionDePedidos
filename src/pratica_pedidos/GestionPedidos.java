package pratica_pedidos;

import java.util.ArrayList;
import java.util.Scanner;
public class GestionPedidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Cliente Cliente1 = new Cliente(null, null, "633567880", "A1", "", "");
		Cliente Cliente2 = new Cliente(null, null, "633567880", "A2", "", "");
		Cliente Cliente3 = new Cliente(null, null, "633567880", "A3", "", "");
		
		Producto Producto1 = new Producto("A", 1, 1);
		Producto Producto2 = new Producto("A", 1, 1);
		Producto Producto3 = new Producto("A", 1, 1);
		Producto Producto4 = new Producto("A", 1, 1);
		Producto Producto5 = new Producto("A", 1, 1);
		
		Pedido Pedido1 = new Pedido();
		
		PasarelaDePago Efectivo1 = new PasarelaDePago();
		
		PasarelaDePago Tarjeta1 = new PasarelaDePago();
		
		//String name, String ape, String phone, String direction, String histo, Date Alta
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
		
		//Creacion de productos los 5 productos empezando por el producto1
			
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
		Pedido1.AgregarProducto1(Producto1, Producto2, Producto3, Producto4, Producto5, Pedido1);
			
		System.out.println("El precio de su pedido es de: " + Pedido1.getImporteTotal());
			
		System.out.println("Desea añadir otro producto a la cesta? (y/n)");
		char siono = sc.next().charAt(0);
			
		if (siono == 'y') {
			
			Pedido1.AgregarProducto2(Producto1, Producto2, Producto3, Producto4, Producto5, Pedido1);
			
			System.out.println("El precio de su pedido es de: " + Pedido1.getImporteTotal());
			
		} else {
			System.out.println("El precio de su pedido es de: " + Pedido1.getImporteTotal());
		}
		
		System.out.println("Eliga su metodo de pago:#\r\n1.Efectivo\r\n2.Tarjeta");
		
		int opcionpago = sc.nextInt();
		
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
	}
}