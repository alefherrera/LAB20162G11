package modelo;


import java.util.List;

import persistencia.dao.LocalidadDAO;
import persistencia.dao.PersonaDAO;
import persistencia.dao.TipoContactoDAO;
import dto.LocalidadDTO;
import dto.PersonaDTO;
import dto.TipoContactoDTO;


public class Agenda
{
	private PersonaDAO persona;
	private LocalidadDAO localidad;
	private TipoContactoDAO tipoContacto;

	public Agenda()
	{
		persona = new PersonaDAO();
		localidad = new LocalidadDAO();
		tipoContacto = new TipoContactoDAO();
	}

	public void agregarPersona(PersonaDTO nuevaPersona)
	{
		persona.insert(nuevaPersona);
	}

	public void borrarPersona(PersonaDTO persona_a_eliminar)
	{
		persona.delete(persona_a_eliminar);
	}

	public void actualizarPersona(PersonaDTO persona_a_actualizar) {
		persona.update(persona_a_actualizar);
	}

	public List<PersonaDTO> obtenerPersonas()
	{
		return persona.readAll();
	}

	
	public List<LocalidadDTO> obtenerLocalides()
	{
		return localidad.readAll();
	}
	
	public List<TipoContactoDTO> obtenerTiposDeContacto()
	{
		return tipoContacto.readAll();
	}
	
}
