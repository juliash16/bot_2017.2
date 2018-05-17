package exemplo;

import javax.swing.JOptionPane;

public class EstruturaDoWhile {
	public static void main(String[] args) {
		
		String senha;
		
		do {
			// Interface prompt do Swing/AWT
			senha = JOptionPane.showInputDialog("Informe a senha");
			
			if(senha == null) {
				break;
			}
			
		}while(!senha.equals("Senha123"));
		
		// Interface alert do Swing//AWT
		if(senha != null) {
			JOptionPane.showMessageDialog(null,  "Senha correta!");
		}
	}
}
