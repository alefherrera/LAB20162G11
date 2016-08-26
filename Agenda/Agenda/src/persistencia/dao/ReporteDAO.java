package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.PersonaDTO;
import dto.PersonasPorLocalidadDTO;
import persistencia.conexion.Conexion;

public class ReporteDAO {
	
	private static final String QUERY_PERSONAS_X_LOCALIDAD = "SELECT COUNT(*) as cantidad, l.descripcion as localidad FROM personas INNER JOIN localidades as l on personas.localidad = l.id GROUP BY localidad";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<PersonasPorLocalidadDTO> reportePersonasPorLocalidad()
	{
		PreparedStatement statement;
		ResultSet resultSet;
		ArrayList<PersonasPorLocalidadDTO> personas = new ArrayList<PersonasPorLocalidadDTO>();
		try
		{
			statement = conexion.getSQLConexion().prepareStatement(QUERY_PERSONAS_X_LOCALIDAD);
			resultSet = statement.executeQuery();

			while(resultSet.next())
			{
				personas.add(
					new PersonasPorLocalidadDTO(
					resultSet.getInt("cantidad"),
					resultSet.getString("localidad")
					));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			conexion.cerrarConexion();
		}
		return personas;
	}
	
}
