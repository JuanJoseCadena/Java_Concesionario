package Paquete;

public class Motocicleta {

	public static void Motocicleta1() 
	{
		Datos.codigo=9785412;
		Datos.nombre="Gixxer";
		Datos.marca="Suzuki";
		Tipo.TipoVehiculo=3;
		Datos.modelo=2020;
		Datos.kilometraje=0;
		Datos.precio=6500000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
	
	public static void Motocicleta2() 
	{
		Datos.codigo=2354477;
		Datos.nombre="NS-160";
		Datos.marca="Pulsar";
		Tipo.TipoVehiculo=3;
		Datos.modelo=2017;
		Datos.kilometraje=200;
		Datos.precio=5800000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
	
	public static void Motocicleta3() 
	{
		Datos.codigo=3458867;
		Datos.nombre="Ybr";
		Datos.marca="Yamaha";
		Tipo.TipoVehiculo=3;
		Datos.modelo=2018;
		Datos.kilometraje=75000;
		Datos.precio=300000;
		Tipo.DeterminarVehiculo();
		Mostrar.MostrarProducto();
	}
}
