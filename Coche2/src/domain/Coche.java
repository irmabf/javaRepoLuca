package domain;

public class Coche {
	String tipo = "Tipo de coche desconocido";
	String modelo;
	String matricula;
	String seguro;
	
	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	boolean esMetalizada;
	
	public boolean isEsMetalizada() {
		return esMetalizada;
	}

	public void setEsMetalizada(boolean esMetalizada) {
		this.esMetalizada = esMetalizada;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Coche [tipo=" + tipo + "]";
	}
	
	
}

