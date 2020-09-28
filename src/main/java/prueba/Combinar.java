package prueba;
import org.apache.commons.lang3.StringUtils;

public class Combinar {

	public static String combinar(Object [] array)
	{
		String cadena = StringUtils.join(array, " ");
		return cadena;
	}
	
	public static void main(String[] args) {
		
		Object [] array = {"hola", 3.1416, "adios", 15, true};
		System.out.println(combinar(array));
	}

}
