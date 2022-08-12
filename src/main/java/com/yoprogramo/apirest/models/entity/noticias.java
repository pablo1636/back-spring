package com.yoprogramo.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="noticias")
public class noticias implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String titulo;
	private String cuerpo;
	private String imagen;
	private int activo;
	
	
	
	
	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getCuerpo() {
		return cuerpo;
	}




	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}




	public String getImagen() {
		return imagen;
	}




	public void setImagen(String imagen) {
		this.imagen = imagen;
	}




	public int getActivo() {
		return activo;
	}




	public void setActivo(int activo) {
		this.activo = activo;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
