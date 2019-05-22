/**
Se desea crear una aplicacion para manejar la informacion de un estudiante
Un estudiante tiene: Un codigo, Un nombre, Un sexo, dos Asisgnaturas Asignadas
(cada una de ellas con codigo y dos notas parciales)

Se debe permitir Calcular la nota definitiva de cada asignatura 
si se hace atravez de un primedio calcular la nota promedio del 
semestre es decir la nota que surge al promediar la nota definitiva 
de la asignatura 1  y la asignatura 2
**/

package InformacionEstudiante;

public class Asignatura {
	
	double nota1;
	double nota2;
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public Asignatura(double nota1, double nota2) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	

}