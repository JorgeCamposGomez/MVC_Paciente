package controlador;
import java.awt.event.ActionListener;

import modelo.Modelo_Paciente;
import vista.class_Paciente;

public class Controlador_Paciente<Vista_Paciente> implements ActionListener{
	private  Modelo_Paciente model;
	private Vista_Paciente view;
	
	public Controlador_Paciente(class_Paciente view, Modelo_Paciente model) {
		this.view = view;
		this.model = model;
		
	}
	public void iniciar () {
	
	}
}

