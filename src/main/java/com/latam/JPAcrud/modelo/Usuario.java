package com.latam.JPAcrud.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@SequenceGenerator(name="SQ_USUARIO", initialValue=1, allocationSize=1,sequenceName = "SQ_USUARIO")

public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_USUARIO")
	@SequenceGenerator(name="SQ_USUARIO", sequenceName="SQ_USUARIO", allocationSize=1)
//	@SequenceGenerator(name="SQ_USUARIO", initialValue=1, allocationSize=1,sequenceName = "SQ_USUARIO")
	private Integer idUsuario;
	private String nombre;
	private String clave;
	private Integer rut;
	private String dv;
	

//	public Usuario() {
//		super();
//		// No sé por qué genero este.
//	}
//
//	public Usuario(Integer idUsuario, String nombre, String clave, Integer rut, String dv) {
//		super();
//		this.idUsuario = idUsuario;
//		this.nombre = nombre;
//		this.clave = clave;
//		this.rut = rut;
//		this.dv = dv;
//	}
//
//
//	public Integer getIdUsuario() {
//		return idUsuario;
//	}
//
//
//	public void setIdUsuario(Integer idUsuario) {
//		this.idUsuario = idUsuario;
//	}
//
//
//	public String getNombre() {
//		return nombre;
//	}
//
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//
//	public String getClave() {
//		return clave;
//	}
//
//
//	public void setClave(String clave) {
//		this.clave = clave;
//	}
//
//
//	public Integer getRut() {
//		return rut;
//	}
//
//
//	public void setRut(Integer rut) {
//		this.rut = rut;
//	}
//
//
//	public String getDv() {
//		return dv;
//	}
//
//
//	public void setDv(String dv) {
//		this.dv = dv;
//	}
//
//
//	@Override
//	public String toString() {
//	return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", clave=" + clave + ", rut=" + rut + ", dv="+ dv + "]";
//	}


}
