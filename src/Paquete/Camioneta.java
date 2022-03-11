package Paquete;

public class Camioneta {

	public static void Camioneta1() 
	{
		Datos.codigo=8447962;
		Datos.nombre="Vitara";
		Datos.marca="Chevrolet";
		Tipo.TipoVehiculo=2;
		Datos.modelo=2012;
		Datos.kilometraje=100000;
		Datos.precio=23700000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
	
	public static void Camioneta2() 
	{
		Datos.codigo=5874962;
		Datos.nombre="Duster";
		Datos.marca="Renault";
		Tipo.TipoVehiculo=2;
		Datos.modelo=2015;
		Datos.kilometraje=300000;
		Datos.precio=39800000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
	
	public static void Camioneta3() 
	{
		Datos.codigo=4896235;
		Datos.nombre="Hilux";
		Datos.marca="Toyota";
		Tipo.TipoVehiculo=2;
		Datos.modelo=2017;
		Datos.kilometraje=30;
		Datos.precio=72000000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
}
