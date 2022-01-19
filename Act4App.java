import javax.swing.JOptionPane;

public class Act4App {	
	
	public static void main(String[] args) {
		
		Raices raiz1 = new Raices(0,0,0);
		
		JOptionPane.showMessageDialog(null, "CALCULAR RAIZ");
		raiz1.setA(Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a:")));
		raiz1.setB(Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de b:")));
		raiz1.setC(Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de c:")));
		
		raiz1.calcular();
	}
}
