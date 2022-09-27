package gson;

public class Persona {
 
	private String nombre;
	
	private String apellidos;
	
	private int edad;
	
	public String  getNombre() {
		return nombre;
	}
	
	public String  getApellidos() {
		return apellidos;
	}
	
	public int  getEdad() {
		return edad;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
