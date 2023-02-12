package pratica_pedidos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Producto {

	String nombre;
	double precio;
	int cantidad;

	//METODO Producto
	
	public Producto(String name, double precio, int amount) {
		//Esto esta hecho para que el nombre de los productos esten en mayusculas
		this.nombre = name.toUpperCase();
		//Calculo para redondear los precios de producto1
		BigDecimal precioCortado = new BigDecimal(precio).setScale(2, RoundingMode.DOWN);
	       precio = precioCortado.doubleValue();
	       
	       this.cantidad = amount;
	}
	
	//METODO Producto2
	
	public void Producto2 (String name, double precio, int amount) {
		//Esto esta hecho para que el nombre de los productos esten en mayusculas
		this.nombre = name.toUpperCase();
		//Calculo para redondear los precios de producto2
		BigDecimal precioCortado = new BigDecimal(precio).setScale(2, RoundingMode.DOWN);
	       precio = precioCortado.doubleValue();
	       
	       this.cantidad = amount;	
	}
	
	
	public Producto nuevoproducto (Producto nuevoproducto) {
		Scanner sc = new Scanner (System.in);
		//En este metodo declaramos el nombre, precio, cantidad de los productos y nos muestra los datos del producto
		System.out.println("Introduzca el nombre del producto:");
		String nombreproducto = sc.nextLine();
		nuevoproducto.setNombre(nombreproducto);
		System.out.println("Introduzca el precio del producto:");
		double precioproducto = sc.nextDouble();
		nuevoproducto.setPrecio(precioproducto);
		System.out.println("");
		System.out.println("Introduzca la cantidad de stock disponible");
		int cantidad = sc.nextInt();
		nuevoproducto.setCantidad(cantidad);
		System.out.println("##### DATOS PRODUCTO #####");
		System.out.println("Nombre: " + nuevoproducto.getNombre() +" Precio: "+ nuevoproducto.getPrecio()+ "\n" + "Stock:" + nuevoproducto.getCantidad());
		return nuevoproducto;
	}
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}
	/**
	 * @return el precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio el precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return el cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad el cantidad a establecer
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
