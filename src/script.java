/**
 * Created by naxsel on 7/03/16.
 */

import java.util.*;
import java.io.*;

public class script {

	public static void main (String [] args){
		try{

			Scanner b = new Scanner(new File("/home/carlos/Cuatrimestre6/BD2/BD2/src/cuentas.txt"));
			String aux, antes, despues, linea, date, lineaF = "";
			while(b.hasNextLine()){
				linea = b.nextLine();
				antes = linea.substring(0, linea.indexOf(',', 120) + 1);
				despues = linea.substring(linea.indexOf(',', 125), linea.length());
				aux = linea.substring(linea.indexOf(',', 120) + 1, linea.indexOf(',', 125));
				date = "TO_DATE(" + aux + ", 'yyyy-mm-dd')";
				lineaF = antes+date+despues;
				System.out.println(lineaF);
			}
		}catch(FileNotFoundException e){}
	}
}
