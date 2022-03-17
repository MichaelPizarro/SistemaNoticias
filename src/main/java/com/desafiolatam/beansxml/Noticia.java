package com.desafiolatam.beansxml;

public class Noticia {
	
	private String titulo;
	private String bajada;
	private String imagen;
	
	public Noticia() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBajada() {
		return bajada;
	}

	public void setBajada(String bajada) {
		this.bajada = bajada;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", bajada=" + bajada + ", imagen=" + imagen + "]";
	}
	
	
	
	
}
