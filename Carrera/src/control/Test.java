package control;

import domain.Asignatura;

public class Test {
	public static Asignatura factoriaAsignaturas() {
		return new Asignatura();
	}
	public static void miTest(){
		Asignatura asignatura = factoriaAsignaturas();
		asignatura.crearAsignatura();
		asignatura.imprimeInforme();
	}
	
}
