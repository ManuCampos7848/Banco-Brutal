package Model;

public class MetodosBanco {
	
	/*
	 * Declaracion para acceder a la clase banco
	 */
	public static Banco banco = new Banco();
	//__________________________________________________________________
	
	/*
	 * Metodo que permite consultar el saldo
	 */
	public static boolean consultarSaldo(Cliente clienteSeleccionado) {
		return banco.verificarCedulaCliente(clienteSeleccionado);
	}
	//__________________________________________________________________

	
	/*
	 * Metodo que permite crear un empleado
	 */
	public static  void crearEmpleado(Empleado nuevoEmpleado) {
		banco.crearEmpleado(nuevoEmpleado);
	}
	//__________________________________________________________________
	
	
	/*
	 * Metodo que permite actualozar un empleado
	 */
	public static  void actualizarEmpleado(Empleado nuevoEmpleado) {
		banco.modificarEmpleado(nuevoEmpleado);
	}
	//__________________________________________________________________
	
	
	/*
	 * Metodo que permite eliminar un empleado
	 */
	public static boolean eliminarEmpleado(Empleado empleadoSeleccionado) {
		return banco.eliminarEmpleado(empleadoSeleccionado);
	}
	//__________________________________________________________________
	
	
	/*
	 * Metodo que permite obtener un empleado
	 */
	public static  String obtenerEmpleado(String cedula) {
		return banco.obtenerEmpleado(cedula);
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que permite obtener un objeto de tipo empleado
	 */
	public static Empleado obtenerObjetoEmpleado(String cedula) {
		return banco.obtenerObjetoEmpleado(cedula);
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que permite crear un cliente
	 */
	public static boolean crearCliente(Cliente nuevoCliente) {
		return banco.crearCliente(nuevoCliente);
	}
	//__________________________________________________________________
	
	 /*
	  * Metodo que permite actualizar un cliente
	  */
	public static void actualizarCliente(Cliente nuevoCliente) {
		banco.modificarCliente(nuevoCliente);
	}
	//__________________________________________________________________
	
	public static boolean eliminarCliente(Cliente clienteSeleccionado) {
		return banco.eliminarCliente(clienteSeleccionado);
	}
	//__________________________________________________________________
	
	public static String obtenerCliente(String cedula) {
		return banco.obtenerCliente(cedula);
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que permite obtener un objeto de tipo cliente
	 */
	public static Cliente obtenerObjetoCliente(String cedula) {
		return banco.obtenerObjetoCliente(cedula);
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que permite realizar una transaccion
	 */
	public static  void realizarTransaccion(Transaccion transaccionNueva) {
		banco.crearTransaccion(transaccionNueva);
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que permite retirar dinero de una cuenta
	 */
	public static Cliente retirarDinero() {
		return banco.getCliente();
	}
	//__________________________________________________________________
	
	/*
	 * Metodo que permite depositar dinero en una cuenta
	 */
	public static  Cliente depositarDineroCuenta() {
		return banco.getCliente();
	}
	//__________________________________________________________________
	
	public static void init() {
		banco.init();
	}

}
