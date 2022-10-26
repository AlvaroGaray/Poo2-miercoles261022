package Clasepractica;
import java.util.Scanner;
public class CuentaBancariaApp {

	static Scanner es=new Scanner(System.in);
	public static void main(String[] args) {
		
		CuentaBancaria cliente1=new CuentaBancaria();	
		System.out.println("Ingrese su Numero de cuenta");
		cliente1.PonerNumcuenta(es.next());
		
		System.out.println("Ingrese su Saldo");
		cliente1.ponerSaldo(es.nextDouble());

		System.out.println("Ingrese su Nombre");
		cliente1.ponerNombrecliente(es.next());
		
		System.out.println("Ingrese su Email");
		cliente1.ponerEmail(es.next());
		
		System.out.println("Ingrese su Numero de Telefono");
		cliente1.ponerNumtelefono(es.next());
		
		
		cliente1.Retirar(50.00);
		cliente1.Depositar(150.00);
		cliente1.Depositar(500.00);
		cliente1.Retirar(50.00);
		
		cliente1.MostrarDatos();
		
		CuentaBancaria Maria=new CuentaBancaria();
		
		
		System.out.println("Ingrese su Numero de cuenta");
		Maria.PonerNumcuenta(es.next());
		
		System.out.println("Ingrese su Saldo");
		Maria.ponerSaldo(es.nextDouble());

		System.out.println("Ingrese su Nombre");
		Maria.ponerNombrecliente(es.next());
		
		System.out.println("Ingrese su Email");
		Maria.ponerEmail(es.next());
		
		System.out.println("Ingrese su Numero de Telefono");
		Maria.ponerNumtelefono(es.next());
		
		
		
		
	}

}
