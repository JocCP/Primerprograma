package Clase01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List<String> vehiculosDisponble;

		vehiculosDisponble = new ArrayList<>();

		vehiculosDisponble.add("Chevrolet");
		vehiculosDisponble.add("BMW");
		vehiculosDisponble.add("Hyundai");
		vehiculosDisponble.add("Ford");
		vehiculosDisponble.add("Fiat");


		System.out.println(vehiculosDisponble.get(0));
		System.out.println(vehiculosDisponble.get(1));
		System.out.println(vehiculosDisponble.get(2));
		
*/
		
	
/*
		Vehiculos vehiculo1 = new Vehiculos("Renault", "Symbol", "Gris", 2020, "AXBX20");
		Conductor conductor1 = new Conductor(1, "Conductor 1", 1234, vehiculo1);

		Vehiculo vehiculo2 = new Vehiculo("Toyota", "Alfo", "Blanco", 2010, "CX3XZ4");
		Conductor conductor2 = new Conductor(2, "Conductor 2", 5678, vehiculo2);

		String Conductores[][] = {{conductor1.getNombre(),vehiculo1.getMarca()},{conductor2.getNombre(),vehiculo2.getMarca()}};

		System.out.println("Matriz de conductores y marca de su auto: ");
		for(int i = 0; i < 2; i++) { //corresponde al numero de filas
		for(int j = 0; j < 2; j++) { //corresponde al numero de columnas
		System.out.print("|" + Conductores[i][j] + "|");
		}
		System.out.println("");
		}*/
		
		List<Vehiculos> vehiculosDisponble = new ArrayList<>();

		Vehiculos v1 = new Vehiculos("");
			v1.setMarca("Chevrolet");

		Vehiculos v2 = new Vehiculos("");
			v2.setMarca("BMW");

		Vehiculos v3 = new Vehiculos("");
			v3.setMarca("Hyundai");

		Vehiculos v4 = new Vehiculos("");
			v4.setMarca("Ford");

			vehiculosDisponble.add(v1);
			vehiculosDisponble.add(v2);
			vehiculosDisponble.add(v3);
			vehiculosDisponble.add(v4);

		for (Vehiculos marca : vehiculosDisponble) {
			System.out.println(marca.getMarca());
		}
	}

}
