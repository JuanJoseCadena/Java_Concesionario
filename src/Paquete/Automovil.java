package Paquete;

public class Automovil {

	
	public static void Auto1() 
	{
		Datos.codigo=5147890;
		Datos.nombre="Spark GT";
		Datos.marca="Chevrolet";
		Tipo.TipoVehiculo=1;
		Datos.modelo=2018;
		Datos.kilometraje=30500;
		Datos.precio=30000000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
	
	public static void Auto2() 
	{
		Datos.codigo=4879955;
		Datos.nombre="Logan Life";
		Datos.marca="Chevrolet";
		Tipo.TipoVehiculo=1;
		Datos.modelo=2020;
		Datos.kilometraje=80000;
		Datos.precio=40500000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
	
	public static void Auto3() 
	{
		Datos.codigo=3578924;
		Datos.nombre="Picanto";
		Datos.marca="Kia";
		Tipo.TipoVehiculo=1;
		Datos.modelo=2019;
		Datos.kilometraje=150000;
		Datos.precio=28500000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
}
