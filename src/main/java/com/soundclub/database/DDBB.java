package com.soundclub.database;



import java.util.ArrayList;
import java.util.List;

import com.soundclub.models.Genero_Musical;
import com.soundclub.models.Instrumento;
import com.soundclub.models.Usuario;


public class DDBB {
	private static DDBB Instancia = null;
	private static List<Usuario> listaUsuario = new ArrayList<>();
	private static List<Genero_Musical> listaGeneroMusical = new ArrayList<>();
	private static List<Instrumento> listaInstrumento = new ArrayList<>();

	public static final DDBB getInstancia() {
		if(Instancia == null) Instancia = new DDBB(); 
		return Instancia;
	}
	private DDBB() {
		CargarUsuario();
		CargarInstrumento();
		CargarGeneroMusical();
	}
	private static final boolean CargarUsuario() {
		//listaUsuario.add(new Usuario(1,"Carla","Perez","c@mail.es","123","España","Barcelona","C/Fontsanta","30/07/1988","M","foto.jpg",null,null,null));
		listaUsuario.add(new Usuario(1,"Carla","Perez","c@mail.es","123"));
		return true;
	}
	
	private static final boolean CargarInstrumento() {
		//listaUsuario.add(new Usuario(1,"Carla","Perez","c@mail.es","123","España","Barcelona","C/Fontsanta","30/07/1988","M","foto.jpg",null,null,null));
		listaInstrumento.add(new Instrumento("guitarra"));
		return true;
	}
	private static final boolean CargarGeneroMusical() {
		//listaUsuario.add(new Usuario(1,"Carla","Perez","c@mail.es","123","España","Barcelona","C/Fontsanta","30/07/1988","M","foto.jpg",null,null,null));
		listaGeneroMusical.add(new Genero_Musical("pop"));
		return true;
	}
	/**************************************************************/
	
	
}
