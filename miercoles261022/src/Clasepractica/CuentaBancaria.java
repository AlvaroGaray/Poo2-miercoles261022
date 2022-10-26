package Clasepractica;

public class CuentaBancaria {

	
	
	
	
	private String Numcuenta;
	private double Saldo;
	private String Nombrecliente;
	private String Email;
	private String Numtelefono;
	
	//Metodos Constructores
	// Sin Parametros
	
	public CuentaBancaria() {
		System.out.println("Metodo constructor"); //Se ejecutan cada vez que se crea un objeto de la clase pero no hacen anda en particular por si solos	
	}
	// Con parametros
	public CuentaBancaria(String Numcuenta,double Saldo,String Nombrecliente,String Email,String Numtelefono) {
		this.Numcuenta=Numcuenta;
		this.Saldo=Saldo;
		this.Nombrecliente=Nombrecliente;
		this.Email=Email;
		this.Numtelefono=Numtelefono;

	}
	
	//Setters
	
	public void PonerNumcuenta(String Numcuenta) {
		this.Numcuenta=Numcuenta;
	}
	
	public void ponerSaldo(double Saldo) {
		this.Saldo=Saldo;
	}
	
	public void ponerNombrecliente(String Nombrecliente) {
		this.Nombrecliente=Nombrecliente;
	}
	
	public void ponerEmail(String Email) {
		this.Email=Email;
	}
	
	public void ponerNumtelefono(String Numtelefono) {
		this.Numtelefono=Numtelefono;
	}
	
	//Getters
	
	public String MostrarNumcuenta() {
		return Numcuenta;
	}
	
	public double MostrarSaldo() {
		return Saldo;
	}
	
	public String MostrarNombrecliente() {
		return Nombrecliente;
	}
	
	public String MostrarEmail() {
		return Email;
	}
	
	public String MostrarNumtelefono() {
		return Numtelefono;
	}
	
	public void Depositar(double montodeposito) {
		
		this.Saldo+=montodeposito;
		System.out.println("El monto depositado fue de C$= "+ montodeposito);
		System.out.println("Su saldo es de C$"+ MostrarSaldo());
	}
	
	public void Retirar(double montoretiro) {
		
		if(montoretiro>= this.Saldo) {
			System.out.println("No tiene Saldo Suficiente :(");
			System.out.println("Su saldo actual es de C$: "+MostrarSaldo());
		}else {
			this.Saldo-=montoretiro;
			System.out.println("El monto retirado fue de C$ "+ montoretiro);
			System.out.println("El Saldo actual es de C$ "+MostrarSaldo());
		}
	}
	
	public void MostrarDatos() {
		
		System.out.println("Nombre: " +MostrarNombrecliente());
		System.out.println("Numero de cuenta :"+MostrarNumcuenta());
		System.out.println("Email : "+MostrarEmail());
		System.out.println("Numero de telefono : "+MostrarNumtelefono());
	}

}
