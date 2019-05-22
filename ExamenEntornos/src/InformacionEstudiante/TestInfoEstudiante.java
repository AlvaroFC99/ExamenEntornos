package InformacionEstudiante;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;





class TestInfoEstudiante {

	@Test
	public void promedioNotasEs(){
		Asignatura espanol = new Asignatura(2.5, 3.5);
		double promedioEs = (espanol.nota1+espanol.nota1)/2;
	}
	
	public double promedioNotasEspanol(){
		Asignatura espanol = new Asignatura(2.5, 3.5);
		double promedioEs = (espanol.nota1+espanol.nota1)/2;
		return promedioEs;
		
	}
	@Test
	public void promedioNotasIn(){
		Asignatura ingles = new Asignatura(4.5, 3.4);
		double promedioIn = (ingles.nota1+ingles.nota1)/2;
	}
	public double promedioNotasIngles(){
		Asignatura ingles = new Asignatura(4.5, 3.4);
		double promedioIn = (ingles.nota1+ingles.nota1)/2;
		return promedioIn;
	}
	@Test
	public void promedioSemestre(){
		double fin = (promedioNotasEspanol()+promedioNotasIngles())/2;
	}

}
