package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Classe da frame sobre do sistema.
 * 
 * @author Emmanuel Kant
 *
 */
public class AboutFrame extends JDialog{

	/**
	 * Construtor da frame.
	 * 
	 * @param mainFrame
	 *            Passando a classe principal para ser colocada no
	 *            setLocationRelativeTo().
	 */
	public AboutFrame(MainFrame mainFrame) {
		build(mainFrame);
	}
	
	/**
	 * Método que constroi a frame.
	 * 
	 * @param mainFrame
	 *            Passando a classe principal para ser colocada no
	 *            setLocationRelativeTo().
	 */
	private void build(MainFrame mainFrame) {
		buildComponents();
		setLayout(new GridBagLayout());
		pack();
		setTitle("Sobre");
		setResizable(false);
		setLocationRelativeTo(mainFrame);
		setVisible(true);
	}
	
	/**
	 * Método que constroi os componentes da frame.
	 */
	private void buildComponents() {
		JPanel panel = new JPanel(new GridBagLayout());
		String text = "Esse programa foi criado por Emmanuel Kant.";
		JLabel textlabel = new JLabel(text);
		panel.add(textlabel, new GBC(0, 0));
		String text1 = "Em Março de 2017.";
		JLabel text1label = new JLabel(text1);
		panel.add(text1label, new GBC(0, 1));
		add(panel);
	}

}
