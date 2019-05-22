package InformacionEstudiante;

public class Estudiante {
	String codigo;
	String nombre;
	String sexo;
	int edad;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Estudiante(String codigo, String nombre, String sexo,int edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad=edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
