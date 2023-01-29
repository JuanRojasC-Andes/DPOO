package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;

public class Modificacion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		1. Agregue un nuevo paquete al proyecto llamado uniandes.dpoo.taller0.modificacion.
//		2. Dentro del nuevo paquete agregue una clase llamada Modificacion.
//		3. Agregue un método main a la nueva clase, el cual debe tener únicamente el siguiente contenido
		System.out.println("Hola, mundo!");
	
//		4. Ejecute su nueva clase y asegúrese de que en la consola aparece el mensaje.
//		5. Modifique su método main para que cargue la información de los atletas y luego imprima el nombre del
//		país con más medallistas. Para eso puede utilizar las siguientes dos instrucciones dentro de la
//		implementación del método:
//		6. Si se produce un error, analice el mensaje de error que aparece en la vista “Problems”. Revise las opciones
//		de corrección automática que le da Eclipse: corrija el error.
//		7. Cuando no aparezcan errores en la vista de problemas (no aparece nada marcado en rojo dentro de los
//		archivos .java), ejecute la aplicación.
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		Map<String, Integer> resultados = calc.paisConMasMedallistas();
		System.out.println(resultados.keySet().toArray()[0]);
	}

}
