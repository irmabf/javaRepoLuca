package domain;

public class Asignatura {
	private String nombre;
	private int id;
	private String curso;
	
	public Asignatura(){}
	
	public Asignatura(String nombre, int id, String curso){
		this.nombre = nombre;
		this.id = id;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void crearAsignatura() {
		System.out.println("FACTORIA DE ASIGNATURAS");
		this.setCurso(curso);
		this.setId(id);
		this.setNombre(nombre);
	}
}
