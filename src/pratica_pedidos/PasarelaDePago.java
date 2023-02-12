package pratica_pedidos;

import java.util.Scanner;

public class PasarelaDePago {
	
	static String CodigoPago;
	String tarjeta;
	String cuenta;
	
	
	//METODO PagoEfectivo

	public void PagoEfectivo (Pedido importeTotal, PasarelaDePago Efectivo1) {
		Scanner sc = new Scanner (System.in);
		float cuenta1 = (float) importeTotal.getImporteTotal();
		System.out.println("El metodo seleccionado fue en EFECTIVO.");
		//Si el pago es suficiente para pagar el producto comprado te permitira realizar el pago
		System.out.println("Escriba el pago");
		float pago =sc.nextFloat();
			if (cuenta1>pago) {
				System.out.println("Rechazado no dispones de suficiente credito");
			} else {
				//Aqui hace los calculos necesarios y divisiones necesarias para separar el dinero en billetes como maximo billetes de 50
				float cambio = pago - cuenta1;
				int cambio_euros = (int)cambio;
				cambio = cambio-cambio_euros;
				cambio = cambio*100;
				int cambio_centimos = (int)cambio;
				int billete50 = cambio_euros/50;
				cambio_euros = cambio_euros%50;
				int billete20 = cambio_euros/20;
				cambio_euros = cambio_euros%20;
				int billete10 = cambio_euros/10;
				cambio_euros = cambio_euros%10;
				int billete5 = cambio_euros/5;
				cambio_euros = cambio_euros%5;
				int moneda2 = cambio_euros/2;
				cambio_euros = cambio_euros%2;
				int moneda1 = cambio_euros/1;
				cambio_euros = cambio_euros%1;
				int centimo50 = cambio_centimos/50;
				cambio_centimos = cambio_centimos%50;
				int centimo20 = cambio_centimos/20;
				cambio_centimos = cambio_centimos%20;
				int centimo10 = cambio_centimos/10;
				cambio_centimos = cambio_centimos%10;
				int centimo5 = cambio_centimos/5;
				cambio_centimos = cambio_centimos%5;
				int centimo2 = cambio_centimos/2;
				cambio_centimos = cambio_centimos%2;
				int centimo1 = cambio_centimos/1;
				cambio_centimos = cambio_centimos%1;
				System.out.println("Tu cambio es de:");
				if (billete50>0) {
					System.out.println("Billetes de 50 euros "+billete50);
					} if (billete20>0) {
						System.out.println("Billetes de 20 euros "+billete20);
					} if (billete10>0) {
						System.out.println("Billetes de 10 euros "+billete10);
					} if (billete5>0) {
						System.out.println("Billetes de 5 euros "+billete5);
					} if (moneda2>0) {
						System.out.println("Monedas de 2 euros "+moneda2);
					} if (moneda1>0) {
						System.out.println("Monedas de 1 euros "+moneda1);
					} if (centimo50>0) {
						System.out.println("Monedas de 50 centimos "+centimo50);
					} if (centimo20>0) {
						System.out.println("Monedas de 20 centimos "+centimo20);
					} if (centimo10>0) {
						System.out.println("Monedas de 10 centimos "+centimo10);
					} if (centimo5>0) {
						System.out.println("Monedas de 5 centimos "+centimo5);
					} if (centimo2>0) {
						System.out.println("Monedas de 2 centimos "+centimo2);
					} if (centimo1>0) {
						System.out.println("Monedas de 1 centimos "+centimo1);
					}
				}
	sc.close();
	}
	
	public void PagoTarjeta (Pedido importeTotal, PasarelaDePago Tarjeta1) {
		Scanner sc = new Scanner (System.in);
		System.out.println("El metodo seleccionado fue TARJETA.");
		System.out.println("Ahora por favor escribe tu tarjeta.");
		sc.nextLine();
		
		//Este metodo esta hecho para que solo admita tarjetas que empiezen por el digito 4, 3 o 5  y con un tamaño de 16 o 15 digitos y cataloga la tarjeta dependiendo de que sea
		String tarjeta =sc.nextLine();
		String tarjeta2=tarjeta.replace(" ","");
			if(tarjeta2.startsWith("4") && tarjeta2.length() == 16) {
				System.out.println("Tu tarjeta es visa");
				System.out.println("Has pagado " + importeTotal.getImporteTotal());
				} else if (tarjeta2.startsWith("3") && tarjeta2.length() == 15) {
					System.out.println("Tu tarjeta es AmericanExpress");
					System.out.println("Has pagado " + importeTotal.getImporteTotal());
					} else if (tarjeta2.startsWith("5") && tarjeta2.length() == 16) {
						System.out.println("Tu tarjeta es MasterCard");
						System.out.println("Has pagado " + importeTotal.getImporteTotal());
						} else {
						System.out.println("Tu tarjeta no es valida.");
						}
	sc.close();
	}
	
	public void tarjeta (String numtarjeta) {
		this.tarjeta = numtarjeta;
	}
	
	public void cuenta (String account) {
		this.cuenta = account;
	}
	
	/**
	 * @return el codigoPago
	 */
	public static String getCodigoPago() {
		
		return CodigoPago;
	}

	/**
	 * @param codigoPago el codigoPago a establecer
	 */
	public void setCodigoPago(String codigoPago) {
		CodigoPago = codigoPago;
	}

	/**
	 * @return el tarjeta
	 */
	public String getTarjeta() {
		return tarjeta;
	}

	/**
	 * @param tarjeta el tarjeta a establecer
	 */
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	/**
	 * @return el cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta el cuenta a establecer
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


}
