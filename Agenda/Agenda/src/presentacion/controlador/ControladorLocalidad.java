package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dto.LocalidadDTO;
import modelo.Agenda;
import presentacion.vista.VentanaABM;

public class ControladorLocalidad implements ActionListener {

	private VentanaABM vista;
	private Agenda agenda;

	public ControladorLocalidad(VentanaABM vista, Agenda agenda) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.agenda = agenda;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnAgregarPersona()) {
			agenda.agregarLocalidad(new LocalidadDTO(0, vista.getTxtNombre().getText()));
		}
	}

}
