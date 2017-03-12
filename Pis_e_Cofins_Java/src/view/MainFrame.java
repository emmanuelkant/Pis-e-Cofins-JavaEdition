package view;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	/**
	 * Esse método chama o método que constrói a frame.
	 */
	public MainFrame() {
		build();
	}

	/**
	 * Constroi a frame principal.
	 */
	private void build() {
		buildComponets();
		pack();
		setResizable(false);
		setTitle("Calculador de Impostos");
		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Constroi os componentes da tela.
	 */
	private void buildComponets() {
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel revenueLabel = new JLabel("Receita:");
		panel.add(revenueLabel, new GBC(0, 0).insets(0, 5, 0, 5));
		JTextField revenueField = new JTextField(20);
		panel.add(revenueField, new GBC(1, 0).insets(10, 0, 10, 5));
		JButton button = new JButton("Calcular");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// Caso o usuário digite um número com virgula o sistema
					// altera isso.
					revenueField.setText(revenueField.getText().replace(",", "."));
					Float.parseFloat(revenueField.getText());
					new ResultFrame(MainFrame.this, revenueField.getText());
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Por Favor digite apenas números!");
				}
			}
		});
		panel.add(button, new GBC(1, 1).right());
		JButton aboutButton = new JButton("Sobre");
		aboutButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutFrame(MainFrame.this);
			}
		});
		panel.add(aboutButton, new GBC(1, 1).insets(0, 0, 0, 15));

		add(panel);
	}

}
