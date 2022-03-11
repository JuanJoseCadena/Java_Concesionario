package Paquete;

import java.util.Scanner;

public class RegistroVentas {

	public static String nombre;
	public static String apellido;
	public static int documento;
	public static Scanner LeerCodigo = new Scanner(System.in);
	public static Scanner Verificar = new Scanner(System.in);
	public static int aux2;
	public static int aux3;
	
	public static void DesarrolloCompra()
	{
		System.out.println("Introduzca el c�digo del producto que desea comprar:");
		
		try {
		String cadenaaux;
		cadenaaux = LeerCodigo.nextLine();
		
		if (cadenaaux.trim().equals(""))
		{
			System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un n�mero entero de 7 digitos");
			System.exit(0);
		}
		
		aux2 = Integer.parseInt(cadenaaux);
		Datos.codigo = aux2;
		}
		catch(Exception e) 
		{
			System.out.println("Se ha detectado un valor no v�lido. Por favor asegurese de introducir un n�mero entero de 7 digitos");
			System.exit(0);
		}
		
		if (aux2==5147890)
		{
			Automovil.Auto1();
		}
		
		else if (aux2==4879955)
		{
			Automovil.Auto2();
		}
		
		else if (aux2==3578924)
		{
			Automovil.Auto3();
		}
		
		else if (aux2==8447962)
		{
			Camioneta.Camioneta1();
		}
		
		else if (aux2==5874962)
		{
			Camioneta.Camioneta2();
		}
		
		else if (aux2==4896235)
		{
			Camioneta.Camioneta3();
		}
		
		else if (aux2==9785412)
		{
			Motocicleta.Motocicleta1();
		}
		
		else if (aux2==2354477)
		{
			Motocicleta.Motocicleta2();
		}
		
		else if (aux2==3458867)
		{
			Motocicleta.Motocicleta3();
		}
		
		else 
		{
			System.out.println("El c�digo introducido no es v�lido, asegurese de que el c�digo sea correcto e intentelo de nuevo");
			System.exit(0);
		}
		
		System.out.println("�Esta seguro que desea comprar este producto?");
		System.out.println("0: No");
		System.out.println("1: Si");
		
		try {
		String cadenaaux2;
		cadenaaux2 = Verificar.nextLine();
		
		if (cadenaaux2.trim().equals(""))
		{
			System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un n�mero entero entre 0 y 1");
			System.out.println("La compra no se realiz�");
			System.exit(0);
		}
		
		aux3=Integer.parseInt(cadenaaux2);
		}
		catch (Exception e) 
		{
			System.out.println("Se ha detectado un valor no v�lido, por favor asegurese de introducir un n�mero entero entre 0 y 1");
			System.out.println("La compra no se realiz�");
			System.exit(0);
		}
		if (aux3==0) 
		{
			System.out.println("La compra no se realiz�");
			System.exit(0);
		}
		
		else if (aux3==1) 
		{
			DatosCliente.TomaDatos();
		}
		
		else 
		{
			System.out.println("Se ha detectado un valor no v�lido, por favor asegurese de introducir un n�mero entero entre 0 y 1");
			System.out.println("La compra no se realiz�");
			System.exit(0);
		}
	}
	
	public static void Imprimir()
	{
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println("N�mero de documento: " + documento);
		System.out.println("C�digo del producto: " + Datos.codigo);
		System.out.println(Datos.marca);
		System.out.println(Datos.nombre);
		System.out.println(Datos.modelo);
		System.out.println(Tipo.Vehiculo);
		System.out.println("$" + Datos.precio);
		
		
	}
}
