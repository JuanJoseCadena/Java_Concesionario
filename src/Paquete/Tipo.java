package Paquete;

public class Tipo {

	public static int TipoVehiculo;
	public static String Vehiculo;
	
	public static void DeterminarVehiculo() {
		
		if (TipoVehiculo == 1) 
		{
			Vehiculo = "Automóvil";
		}
		
		else if (TipoVehiculo == 2) 
		{
			Vehiculo = "Camioneta";
		}
		
		else if (TipoVehiculo == 3) 
		{
			Vehiculo = "Motocicleta";
		}
		
		else
		{
			Vehiculo = "No especificado";
		}
	}
}
