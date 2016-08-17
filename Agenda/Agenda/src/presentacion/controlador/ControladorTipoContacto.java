package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dto.TipoContactoDTO;
import modelo.Agenda;
import presentacion.vista.VentanaABM;

public class ControladorTipoContacto implements ActionListener {

	private VentanaABM vista;
	private Agenda agenda;

	public ControladorTipoContacto(VentanaABM vista, Agenda agenda) {
		// TODO Auto-generated constructor stub
		this.vista = vista;
		this.agenda = agenda;
		vista.getBtnAgregar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vista.getBtnAgregar()) {
			agenda.agregarTipoContacto(new TipoContactoDTO(0, vista.getTxtNombre().getText()));
		}
	}

}
