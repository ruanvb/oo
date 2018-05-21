package controladores;

import formularios.FormularioPrincipal;

public class Principal {

	public static void main(String[] args) {

		Acao action = new Acao();
		
		FormularioPrincipal f = new FormularioPrincipal();
		f.formularioJFrame();
		f.Formulario();
		f.cadastroo();
		action.cadastrar();


		
	}

}
