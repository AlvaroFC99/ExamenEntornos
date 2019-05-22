package InformacionEstudiante;

public class InfoEstudiante {
	private Asignatura espanol;
	private Asignatura Ingles;
	private Estudiante e1;

	public static void main(String[] args) {
		Estudiante alumno = new Estudiante("H2O", "Juanito", "hombre",12);
		
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" EspaÃ±ol final: "+promediarEs() +" sexo: "+alumno.sexo);
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" Ingles final: "+promediarIn() +" sexo: "+alumno.sexo);
		System.out.println("promedio Definitiva Final: "+promediarSemestre());
	}
	
	
	
	public static double promediarEs() {
		Asignatura espanol = new Asignatura("Español",2.5, 3.5);
		double promedioEs = (espanol.nota1+espanol.nota1)/2;
		return promedioEs;
	}
	public static double promediarIn() {
		Asignatura ingles = new Asignatura("Ingles",4.5, 3.4);
		double promedioIn = (ingles.nota1+ingles.nota1)/2;
		return promedioIn;
	}
	public static double promediarSemestre() {
		double fin = (promediarEs()+promediarIn())/2;
		return fin;
	}
	
	
}
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
package InformacionEstudiante;

public class InfoEstudiante {
	private Asignatura espanol;
	private Asignatura Ingles;
	private Estudiante e1;

	public static void main(String[] args) {
		Estudiante alumno = new Estudiante("H2O", "Juanito", "hombre",12);
		
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" EspaÃ±ol final: "+promediarEs() +" sexo: "+alumno.sexo);
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" Ingles final: "+promediarIn() +" sexo: "+alumno.sexo);
		System.out.println("promedio Definitiva Final: "+promediarSemestre());
	}
	
	
	
	public static double promediarEs() {
		Asignatura espanol = new Asignatura("Español",2.5, 3.5);
		double promedioEs = (espanol.nota1+espanol.nota1)/2;
		return promedioEs;
	}
	public static double promediarIn() {
		Asignatura ingles = new Asignatura("Ingles",4.5, 3.4);
		double promedioIn = (ingles.nota1+ingles.nota1)/2;
		return promedioIn;
	}
	public static double promediarSemestre() {
		double fin = (promediarEs()+promediarIn())/2;
		return fin;
	}
	
	
}
