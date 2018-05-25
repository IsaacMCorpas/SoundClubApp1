package com.soundclub.models;

import java.sql.Date;
import java.util.List;

public class Usuario {
	private int id;
 	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	private String pais_recide;
	private String ciudad_recide;
	private String calle;
	private Date fecha_nacimiento;
	private int sexo;
	private String foto;
	private List <Instrumento> listaInstrumento=null;
	private List <Genero_Musical> listaGenero_musical;
	private List <Usuario> listaAmigos;
	
	
	public Usuario(int id, String nombre, String apellidos, String email, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPais_recide() {
		return pais_recide;
	}

	public void setPais_recide(String pais_recide) {
		this.pais_recide = pais_recide;
	}

	public String getCiudad_recide() {
		return ciudad_recide;
	}

	public void setCiudad_recide(String ciudad_recide) {
		this.ciudad_recide = ciudad_recide;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Instrumento> getInstrumento() {
		return this.listaInstrumento;
	}

	public void setInstrumento(List<Instrumento> instrumento) {
		this.listaInstrumento = instrumento;
	}

	public List<Genero_Musical> getGenero_musical() {
		return this.listaGenero_musical;
	}

	public void setGenero_musical(List<Genero_Musical> genero_musical) {
		this.listaGenero_musical = genero_musical;
	}

	public List<Usuario> getlistaAmigos() {
		return this.listaAmigos;
	}
	public void setlistaAmigos(Usuario unAmigo) {
		this.listaAmigos.add(unAmigo);
	}


	
	
	
	
}
