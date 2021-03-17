package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaVehículos {
public static void main(String[] args) {
	List<Alquilable> vehículos = new ArrayList<>(4);
	
	vehículos.add(new Coche("O-8374-bz", 5));
	vehículos.add(new Microbús("O-9243-sp", 20));
	vehículos.add(new Furgoneta("O-8392-pj", 0.5));
	vehículos.add(new Camión("O-4443-av", 4.5));
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Introduzca número de días para alguilar: ");
	
	int días = in.nextInt();
in.close();	
	for (Alquilable v: vehículos) {
		System.out.println(v);
		System.out.println(v.getPrecioAlquiler(días));
	}
	
}
}
