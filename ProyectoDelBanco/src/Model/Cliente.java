package Model;

public class Cliente extends Persona{
	
	/*
	 * Atributos de la clase cliente
	 */
	private String cuenta;
	private String contrasenia;
	private Cuenta defCuenta;
	//_________________________________________________________________

	
	/*
	 * Metodos Get and Set
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public Cuenta getDefCuenta() {
		return defCuenta;
	}

	public void setDefCuenta(Cuenta defCuenta) {
		this.defCuenta = defCuenta;
	}

	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	//_________________________________________________________________
	
	
	/*
	 * Metodos Constructor
	 */
	public Cliente() {}
	public Cliente(String nombre, String apellido, String cedula, String direccion, String telefono, String correo,
			String fechaNacimiento, String tipoCuenta, String contrasenia) {
		super(nombre, apellido, cedula, direccion, telefono, correo, fechaNacimiento);
		this.cuenta = tipoCuenta;
		this.contrasenia = contrasenia;
	}

	public Cliente(String nombre, String apellido, String cedula, String direccion, String telefono, String correo,
			String fechaNacimiento, String cuenta, String contrasenia, Cuenta defCuenta) {
		super(nombre, apellido, cedula, direccion, telefono, correo, fechaNacimiento);
		this.cuenta = cuenta;
		this.contrasenia = contrasenia;
		this.defCuenta = defCuenta;
	}

	public Cliente(String nombre, String apellido, String cedula, String direccion, String telefono, String correo,
			String fechaNacimiento, String contrasenia) {
		super(nombre, apellido, cedula, direccion, telefono, correo, fechaNacimiento);
		this.contrasenia = contrasenia;
	}

	public Cliente(String correo, String contrasenia) {
		this.contrasenia = contrasenia;
	}
	//_________________________________________________________________
}
