package Paquete;

public class Mostrar {

	public static void MostrarProducto()
	{
		System.out.println("Código: " + Datos.codigo);
		System.out.println("Marca: " + Datos.marca);
		System.out.println("Nombre: " + Datos.nombre);
		System.out.println("Modelo: " + Datos.modelo);
		System.out.println("Kilometraje: " + Datos.kilometraje + " km");
		System.out.println(Tipo.Vehiculo);
		System.out.println("Precio: $" + Datos.precio);
		System.out.println("");
	}
}
