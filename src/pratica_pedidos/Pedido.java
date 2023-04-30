package pratica_pedidos;

import java.util.Scanner;

public class Pedido {

	Cliente cliente;

	Producto producto1;
	Producto producto2;
	double importeTotal;
	PasarelaDePago pago;
	boolean pagado;
	boolean entregado;

	public Pedido() {		
	}
	
	public void AgregarProducto1 (Producto P1, Producto P2, Producto P3, Producto P4, Producto P5, Pedido Pedido1) {
		Scanner sc = new Scanner (System.in);
		double precio1;
		int unidades1 = 0;
		int stockIni1;
		boolean TamTrue;
		System.out.println("Elija el producto deseado");
		System.out.println("1. " + P1.getNombre());
		System.out.println("2. " + P2.getNombre());
		System.out.println("3. " + P3.getNombre());
		System.out.println("4. " + P4.getNombre());
		System.out.println("5. " + P5.getNombre());
		int eleccionpedido;
		eleccionpedido = sc.nextInt();
		//en este switch muestro la eleccion de cada uno de los productos y en cada case es lo mismo pero adaptado a cada uno de los productos
		switch (eleccionpedido) {
		case 1:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P1.getNombre() +" Precio: "+ P1.getPrecio()+ "\n" + "Stock:" + P1.getCantidad());
			precio1 = P1.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			//Este while esta hecho para crear un bucle hasta que no ingreses una cantidad igual o inferior a la del stock del productos
			while (!TamTrue) {
				unidades1 = sc.nextInt();
				if (unidades1 <= P1.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni1 = P1.getCantidad();
			P1.setCantidad(stockIni1 - unidades1);
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P1);
			break;
		
		case 2:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P2.getNombre() +" Precio: "+ P2.getPrecio()+ "\n" + "Stock:" + P2.getCantidad());
			precio1 = P2.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades1 = sc.nextInt();
				if (unidades1 <= P2.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni1 = P2.getCantidad();
			P2.setCantidad(stockIni1 - unidades1);
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P2);
			break;
		case 3:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P3.getNombre() +" Precio: "+ P3.getPrecio()+ "\n" + "Stock:" + P3.getCantidad());
			precio1 = P3.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades1 = sc.nextInt();
				if (unidades1 <= P3.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni1 = P3.getCantidad();
			P3.setCantidad(stockIni1 - unidades1);
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P3);
			break;
		case 4:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P4.getNombre() +" Precio: "+ P4.getPrecio()+ "\n" + "Stock:" + P4.getCantidad());
			precio1 = P4.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades1 = sc.nextInt();
				if (unidades1 <= P4.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni1 = P4.getCantidad();
			P4.setCantidad(stockIni1 - unidades1);
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P4);
			break;
		case 5:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P5.getNombre() +" Precio: "+ P5.getPrecio()+ "\n" + "Stock:" + P5.getCantidad());
			precio1 = P5.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades1 = sc.nextInt();
				if (unidades1 <= P5.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni1 = P5.getCantidad();
			P5.setCantidad(stockIni1 - unidades1);
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P5);
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	//En AgregarProducto2 es exactamente igual al 1
	public void AgregarProducto2 (Producto P1, Producto P2, Producto P3, Producto P4, Producto P5, Pedido Pedido1) {
		Scanner sc = new Scanner (System.in);
		double precio2;
		int unidades2 = 0;
		int stockIni2;
		boolean TamTrue;
		System.out.println("Elija el producto deseado");
		System.out.println("1. " + P1.getNombre()); 
		System.out.println("2. " + P2.getNombre());
		System.out.println("3. " + P3.getNombre());
		System.out.println("4. " + P4.getNombre());
		System.out.println("5. " + P5.getNombre());
		int eleccionpedido2;
		eleccionpedido2 = sc.nextInt();
		switch (eleccionpedido2) {
		case 1:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P1.getNombre() +" Precio: "+ P1.getPrecio()+ "\n" + "Stock:" + P1.getCantidad());
			precio2 = P1.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades2 = sc.nextInt();
				if (unidades2 <= P1.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni2 = P1.getCantidad();
			P1.setCantidad(stockIni2 - unidades2);
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(precio2);
			Pedido1.setProducto1(P1);
			break;
		
		case 2:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P2.getNombre() +" Precio: "+ P2.getPrecio()+ "\n" + "Stock:" + P2.getCantidad());
			precio2 = P2.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades2 = sc.nextInt();
				if (unidades2 <= P2.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni2 = P2.getCantidad();
			P2.setCantidad(stockIni2 - unidades2);
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(precio2);
			Pedido1.setProducto1(P2);
			break;
		case 3:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P3.getNombre() +" Precio: "+ P3.getPrecio()+ "\n" + "Stock:" + P3.getCantidad());
			precio2 = P3.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades2 = sc.nextInt();
				if (unidades2 <= P3.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni2 = P3.getCantidad();
			P3.setCantidad(stockIni2 - unidades2);
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(precio2);
			Pedido1.setProducto1(P3);
			break;
		case 4:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P4.getNombre() +" Precio: "+ P4.getPrecio()+ "\n" + "Stock:" + P4.getCantidad());
			precio2 = P4.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades2 = sc.nextInt();
				if (unidades2 <= P4.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni2 = P4.getCantidad();
			P4.setCantidad(stockIni2 - unidades2);
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(precio2);
			Pedido1.setProducto1(P4);
			break;
		case 5:
			System.out.println("##### DATOS PRODUCTO #####");
			System.out.println("Nombre: " + P5.getNombre() +" Precio: "+ P5.getPrecio()+ "\n" + "Stock:" + P5.getCantidad());
			precio2 = P5.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			TamTrue= false;
			while (!TamTrue) {
				unidades2 = sc.nextInt();
				if (unidades2 <= P5.getCantidad())  {
					TamTrue=true;
				} else {
					System.err.println("No puede ingresar una cantidad superior a la del stock actual por favor vuelva a ingresar su cantidad deseada");
					TamTrue=false;
				}
			}
			stockIni2 = P5.getCantidad();
			P5.setCantidad(stockIni2 - unidades2);
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(precio2);
			Pedido1.setProducto1(P5);
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	//METODO Pagar (TipoPago)
	
	public void Pagar (PasarelaDePago TipoPago) {
		this.pago = TipoPago;
	}
	
	//METODO AgregarCliente (Cliente Cliente)
	
	public void AgregarCliente (Cliente Cliente) {
	}
	
	//METODO AgregarProducto1
	
	public void AgregarProducto1 (Producto Producto) {
		
	}
	
	//METODO AgregarProducto2
	
	public void AgregarProducto2 (Producto Producto) {
		
	}
	
	//METODO EliminarProducto
	
	public void EliminarProducto (Producto Producto) {
		
	}
	
	public void ToString () {
		
	}
	
	/**
	 * @return el producto1
	 */
	public Producto getProducto1() {
		return producto1;
	}

	/**
	 * @param producto1 el producto1 a establecer
	 */
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	/**
	 * @return el producto2
	 */
	public Producto getProducto2() {
		return producto2;
	}

	/**
	 * @param producto2 el producto2 a establecer
	 */
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	/**
	 * @return el importeTotal
	 */
	public double getImporteTotal() {
		return importeTotal;
	}

	/**
	 * @param importeTotal el importeTotal a establecer
	 */
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	/**
	 * @return el pago
	 */
	public PasarelaDePago getPago() {
		return pago;
	}

	/**
	 * @param pago el pago a establecer
	 */
	public void setPago(PasarelaDePago pago) {
		this.pago = pago;
	}

	/**
	 * @return el pagado
	 */
	public boolean isPagado() {
		return pagado;
	}

	/**
	 * @param pagado el pagado a establecer
	 */
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	/**
	 * @return el cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente el cliente a establecer
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
