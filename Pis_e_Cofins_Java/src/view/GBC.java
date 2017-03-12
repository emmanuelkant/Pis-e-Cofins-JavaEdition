package view;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Classe utilitária de GridBagConstraints.
 *
 * @author Alis Tecnologia
 */
public class GBC extends GridBagConstraints {

	/**
	 * Construtor padrão.
	 *
	 * @param gridx
	 *            x da grade.
	 * @param gridy
	 *            y da grade.
	 */
	public GBC(int gridx, int gridy) {
		this.gridx = gridx;
		this.gridy = gridy;
		this.insets = new Insets(2, 2, 2, 2);
	}

	/**
	 * Define a expansão como horizintal apenas.
	 *
	 * @return O próprio GBC.
	 */
	public GBC horizontal() {
		this.weightx = 1;
		this.fill = GridBagConstraints.HORIZONTAL;
		return this;
	}

	/**
	 * Define a expansão como vertical apenas.
	 *
	 * @return O próprio GBC.
	 */
	public GBC vertical() {
		this.weighty = 1;
		this.fill = GridBagConstraints.VERTICAL;
		return this;
	}

	/**
	 * Define a expansão para ambos os lados.
	 *
	 * @return O próprio GBC.
	 */
	public GBC both() {
		this.weightx = 1;
		this.weighty = 1;
		this.fill = GridBagConstraints.BOTH;
		return this;
	}

	/**
	 * Faz merge de linhas e colunas.
	 *
	 * @param w
	 *            Número de células da linha.
	 * @param h
	 *            Número de células da coluna.
	 * @return O próprio GBC.
	 */
	public GBC gridwh(int w, int h) {
		this.gridwidth = w;
		this.gridheight = h;
		return this;
	}

	/**
	 * Alinha ao topo.
	 *
	 * @return O próprio GBC.
	 */
	public GBC top() {
		this.anchor = GridBagConstraints.NORTH;
		return this;
	}

	/**
	 * Alinha na esquerda.
	 *
	 * @return O próprio GBC.
	 */
	public GBC left() {
		this.anchor = GridBagConstraints.WEST;
		return this;
	}

	/**
	 * Alinha na esquerda.
	 * 
	 * @param weightx
	 *            Peso para deslocar a esquerda.
	 * 
	 * @return O próprio GBC.
	 */
	public GBC left(int weightx) {
		this.anchor = GridBagConstraints.WEST;
		this.weightx = weightx;
		return this;
	}

	/**
	 * Alinha na direita.
	 *
	 * @return O próprio GBC.
	 */
	public GBC right() {
		this.anchor = GridBagConstraints.EAST;
		return this;
	}

	/**
	 * Alinha ao centro.
	 *
	 * @return O próprio GBC.
	 */
	public GBC center() {
		this.anchor = GridBagConstraints.CENTER;
		return this;
	}

	/**
	 * Define a margem entre a célula e o componente.
	 *
	 * @param top
	 *            Margem entre o topo da célula e o componente.
	 * @param left
	 *            Margem entre o canto esquerdo da célula e o componente.
	 * @param bottom
	 *            Margem entre a base da célula e o componente.
	 * @param right
	 *            Margem entre o canto direito da célula e o componente.
	 *
	 * @return O próprio GBC.
	 */
	public GBC insets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}

}