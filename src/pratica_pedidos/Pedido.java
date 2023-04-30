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
		int unidades1;
		System.out.println("Elija el producto deseado");
		System.out.println("1. " + P1.getNombre());
		System.out.println("2. " + P2.getNombre());
		System.out.println("3. " + P3.getNombre());
		System.out.println("4. " + P4.getNombre());
		System.out.println("5. " + P5.getNombre());
		int eleccionpedido;
		eleccionpedido = sc.nextInt();
		switch (eleccionpedido) {
		case 1:
			precio1 = P1.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades1 = sc.nextInt();
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P1);
			break;
		
		case 2:
			precio1 = P2.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades1 = sc.nextInt();
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P2);
			break;
		case 3:
			precio1 = P3.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades1 = sc.nextInt();
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P3);
			break;
		case 4:
			precio1 = P4.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades1 = sc.nextInt();
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P4);
			break;
		case 5:
			precio1 = P5.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades1 = sc.nextInt();
			precio1 = precio1 * unidades1;
			Pedido1.setImporteTotal(precio1);
			Pedido1.setProducto1(P5);
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	
	public void AgregarProducto2 (Producto P1, Producto P2, Producto P3, Producto P4, Producto P5, Pedido Pedido1) {
		Scanner sc = new Scanner (System.in);
		double precio2;
		int unidades2;
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
			
			precio2 = P1.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades2 = sc.nextInt();
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(Pedido1.getImporteTotal() + precio2);
			Pedido1.setProducto2(P1);
			break;
		
		case 2:
			precio2 = P2.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades2 = sc.nextInt();
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(Pedido1.getImporteTotal() + precio2);
			Pedido1.setProducto2(P2);
			break;
		case 3:
			precio2 = P3.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades2 = sc.nextInt();
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(Pedido1.getImporteTotal() + precio2);
			Pedido1.setProducto2(P3);
			break;
		case 4:
			precio2 = P4.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades2 = sc.nextInt();
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(Pedido1.getImporteTotal() + precio2);
			Pedido1.setProducto2(P4);
			break;
		case 5:
			precio2 = P5.getPrecio();
			System.out.println("Escriba la cantidad de unidades del producto a comprar");
			unidades2 = sc.nextInt();
			precio2 = precio2 * unidades2;
			Pedido1.setImporteTotal(Pedido1.getImporteTotal() + precio2);
			Pedido1.setProducto2(P5);
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
