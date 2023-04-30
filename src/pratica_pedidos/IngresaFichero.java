package pratica_pedidos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class IngresaFichero {
	//Funcionalidad de escritura de clientes en txt
	public static void LectorFichero(Cliente Cliente1, Cliente Cliente2, Cliente Cliente3) throws IOException {
	FileOutputStream fos=new FileOutputStream("Cliente.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(Cliente1);
	oos.writeObject(Cliente2);
	oos.writeObject(Cliente3);
	oos.flush();
	if (oos!=null) {
		oos.close();
		fos.close();
	}
		
	}
}
