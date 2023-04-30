package pratica_pedidos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Producto {
	Scanner sc = new Scanner (System.in);
	String nombre;
	double precio;
	int cantidad;

	//METODO Producto
	
	public Producto(String name, double precio, int amount) {
		
		this.nombre = name.toUpperCase();
		//Calculo para redondear los precios de producto1
		BigDecimal precioCortado = new BigDecimal(precio).setScale(2, RoundingMode.DOWN);
	       precio = precioCortado.doubleValue();
	       
	       this.cantidad = amount;
	}
	
	//METODO Producto2
	
	public void Producto2 (String name, double precio, int amount) {
		
		this.nombre = name.toUpperCase();
		//Calculo para redondear los precios de producto2
		BigDecimal precioCortado = new BigDecimal(precio).setScale(2, RoundingMode.DOWN);
	       precio = precioCortado.doubleValue();
	       
	       this.cantidad = amount;	
	}
	
	
	public Producto nuevoproducto (Producto nuevoproducto, Scanner sc) {
		//Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el nombre del producto:");
		nuevoproducto.setNombre(sc.next());
		System.out.println("Introduzca el precio del producto:");
		nuevoproducto.setPrecio(sc.nextDouble());
		System.out.println("");
		System.out.println("##### DATOS PRODUCTO #####");
		System.out.println("Nombre: " + nuevoproducto.getNombre() +" Precio: "+ nuevoproducto.getPrecio()+ "\n");
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
