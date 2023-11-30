package ProyectoBiblioteca.modelo1;

import ProyectoBiblioteca.Datos1.*;
import java.util.*;
import ProyectoBiblioteca.*;

public class Libro implements FuenteDatosLibro {

	Collection<Usuario> usuario;
	private String titulo;
	private String autor;
	private Especialidad especialidad;
	private List<Usuario> usuarios;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * 
	 * @param titulo
	 * @param autor
	 * @param especialidad
	 */
	public Libro(String titulo, String autor, Especialidad especialidad) {
		// TODO - implement Libro.Libro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param titulo
	 */
	public void buscarPorTitulo(String titulo) {
		// TODO - implement Libro.buscarPorTitulo
		throw new UnsupportedOperationException();
	}

}