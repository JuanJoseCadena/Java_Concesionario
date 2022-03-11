package Paquete;

import java.util.Scanner;

public class DatosCliente {

	public static Scanner lector = new Scanner(System.in);
	static String cadena1;
	static String cadena2;
	static String cadena3;
	
	
	public static void TomaDatos() 
	{
		System.out.println("Por favor introduzca sus datos, asegurese de no introducir caracteres no alfabéticos ni acentos:\n");
		System.out.println("Nombre:");
		
		try {
			cadena1 = lector.nextLine();
			if (cadena1.trim().equals(""))
			{
				System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un valor de caracteres correcto");
				System.out.println("La compra no se realizó");
				System.exit(0);
			}
			
			if (cadena1.matches(".*[0-9].*") || cadena1.matches(".*\\W.*"))
			{
				System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un valor de caracteres correcto");
				System.out.println("La compra no se realizó");
				System.exit(0);
			}
			
			RegistroVentas.nombre = cadena1;
		}
		catch (Exception e) 
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un valor válido");
			System.out.println("La compra no se realizó");
			System.exit(0);
		}
		
		System.out.println("Apellido:");
		
		try {
			cadena2 = lector.nextLine();
			if (cadena2.trim().equals(""))
			{
				System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un valor de caracteres correcto");
				System.out.println("La compra no se realizó");
				System.exit(0);
			}
		
			if (cadena2.matches(".*[0-9].*") || cadena2.matches(".*\\W.*"))
			{
				System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un valor de caracteres correcto");
				System.out.println("La compra no se realizó");
				System.exit(0);
			}
			
			RegistroVentas.apellido = cadena2;
		}
		catch (Exception e) 
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un valor válido");
			System.out.println("La compra no se realizó");
			System.exit(0);
		}
		
		System.out.println("Numero de Documento:");
		
		try {
			cadena3 = lector.nextLine();
			if (cadena3.trim().equals(""))
			{
				System.out.println("No se ha detectado ningun valor, por favor asegurese de introducir un número entero");
				System.out.println("La compra no se realizó");
				System.exit(0);
			}
		
			RegistroVentas.documento = Integer.parseInt(cadena3);
		}
		catch (Exception e) 
		{
			System.out.println("Se ha detectado un valor no válido, por favor asegurese de introducir un número entero");
			System.out.println("La compra no se realizó");
			System.exit(0);
		}
	}
	
}
