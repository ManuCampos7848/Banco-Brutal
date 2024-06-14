package Model;

public class MetodosEmpleado {

	/*
	 * Declaracion para acceder a la clase banco
	 */
	public static Banco banco = new Banco();
	//__________________________________________________________________

	
	/*
	 * Metodo que permite hacer la verificación del empleado
	 */
	public static Empleado loginEmpleado(String correo, String contrasenia) {
		return banco.loginEmpleados(correo, contrasenia);
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que nos permite inicializar datos para los empleados
	 */
	public static void init() {
		banco.init();
	}
	//__________________________________________________________________
}
