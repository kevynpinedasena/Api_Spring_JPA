package co.kevyn.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mascota {

	@Id
	private Integer idMascota;
	
	@Column
	private String nombre;
	
	@Column
	private String edad;
	
	@Column
	private String raza;
	
	@Column
	private String color;
	
	@Column
	private String tipoMascota;

	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	
}
