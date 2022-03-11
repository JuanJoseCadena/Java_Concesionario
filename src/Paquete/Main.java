package Paquete;

import java.util.Scanner;

public class Main {

	static int aux;
	static int auxver;
	static String cadena;
	static String cadena2;
	static Scanner Lector = new Scanner(System.in);
	
	public static void Muestra() 
	{
		System.out.println("Introduzca el número correspondiente a la categoría que desea revisar:");
		System.out.println("1: Automóviles");
		System.out.println("2: Camionetas");
		System.out.println("3: Motocicletas");
		System.out.println("4: Todos\n");
		
		try {
		cadena=Lector.nextLine();
		
		if (cadena.trim().equals(""))
		{
			System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un número entero entre 0 y 1");
			System.exit(0);
		}
		
		aux=Integer.parseInt(cadena);
		}
		catch (Exception e) 
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un número entero entre 1 y 4");
			System.exit(0);
		}
		
		if (aux==1) 
		{
			Automovil.Auto1();
			Automovil.Auto2();
			Automovil.Auto3();
		}
		
		else if (aux==2) 
		{
			Camioneta.Camioneta1();
			Camioneta.Camioneta2();
			Camioneta.Camioneta3();
		}
		
		else if (aux==3) 
		{
			Motocicleta.Motocicleta1();
			Motocicleta.Motocicleta2();
			Motocicleta.Motocicleta3();
		}
		
		else if (aux==4)
		{
			Automovil.Auto1();
			Automovil.Auto2();
			Automovil.Auto3();
			Camioneta.Camioneta1();
			Camioneta.Camioneta2();
			Camioneta.Camioneta3();
			Motocicleta.Motocicleta1();
			Motocicleta.Motocicleta2();
			Motocicleta.Motocicleta3();
		}
		
		else 
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un número entero entre 1 y 4");
			System.exit(0);
		}
	}
	
	
	public static void Compra() 
	{
		System.out.println("¿Desea comprar algún producto presente en nuestro catálogo?");
		System.out.println("0: No");
		System.out.println("1: Si");
		
		try {
		cadena2 = Lector.nextLine();
		
		if (cadena2.trim().equals(""))
			{
				System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un número entero entre 0 y 1");
				System.exit(0);
			}
				
		
		auxver=Integer.parseInt(cadena2);
		}
		catch (Exception e) 
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un número entero entre 0 y 1");
			System.exit(0);
		}
	
		if (auxver==0) 
		{
			System.out.println("No se realizó ninguna compra");
			System.exit(0);
		}
		
		else if (auxver==1) 
		{
			RegistroVentas.DesarrolloCompra();
			System.out.println("Factura:\n");
			RegistroVentas.Imprimir();
			System.out.println("");
			System.out.println("Muchas gracias por su compra");
			System.exit(0);
		}
		
		else
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un número entero entre 0 y 1");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		Muestra();
		Compra();
	}
}
