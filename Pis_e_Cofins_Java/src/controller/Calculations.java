package controller;

import java.text.DecimalFormat;

/**
 * Classe que realiza as contas.
 * 
 * @author Emmanuel Kant
 *
 */
public class Calculations {

	static DecimalFormat formatting = new DecimalFormat("#.##");

	/**
	 * Método que calcula o PIS.
	 * 
	 * @param revenue
	 *            Receita do usuário.
	 * @return O PIS.
	 */
	public static String calcOfPis(String revenue) {
		float floatRevenue = Float.parseFloat(revenue);
		float pisResult = (floatRevenue * 3) / 100;
		String tax = String.valueOf(formatting.format(pisResult));
		return tax;
	}

	/**
	 * Método que calcula o COFINS.
	 * 
	 * @param revenue
	 *            Receita do usuário.
	 * @return O COFINS.
	 */
	public static String calcOfCofins(String revenue) {
		float floatRevenue = Float.parseFloat(revenue);
		double cofinsResult = (floatRevenue * 0.65) / 100;
		String tax = String.valueOf(formatting.format(cofinsResult));
		return tax;
	}

	/**
	 * Método que calcula o CSSL.
	 * 
	 * @param revenue
	 *            Receita do usuário.
	 * @return O CSSL.
	 */
	public static String calcOfCssl(String revenue) {
		float floatRevenue = Float.parseFloat(revenue);
		double csslResult = (floatRevenue * 2.88) / 100;
		String tax = String.valueOf(formatting.format(csslResult));
		return tax;
	}

	/**
	 * Método que calcula o IRPJ.
	 * 
	 * @param revenue
	 *            Receita do usuário.
	 * @return O IRPJ.
	 */
	public static String calcOfIrpj(String revenue) {
		float floatRevenue = Float.parseFloat(revenue);
		double irpjResult = (floatRevenue * 4.8) / 100;
		String tax = String.valueOf(formatting.format(irpjResult));
		return tax;
	}

	/**
	 * Método que calcula a BC.
	 * 
	 * @param revenue
	 *            Receita do usuário.
	 * @return A BC.
	 */
	public static String calcOfBc(String revenue) {
		float floatRevenue = Float.parseFloat(revenue);
		double bcResult = (floatRevenue * 32) / 100;
		String bc = String.valueOf(formatting.format(bcResult));
		return bc;
	}

	/**
	 * Método que calcula o IPA.
	 * 
	 * @param bcField
	 *            O valor que está armazenado no field da Base de Cáculo.
	 * @return O Imposto Adicional.
	 */
	public static String calcOfIpa(String bcField) {
		float floatBcField = Float.parseFloat(bcField);
		double ipaResult = (floatBcField - 20000.00) * 10 / 100;
		String tax = String.valueOf(formatting.format(ipaResult));
		return tax;
	}

}
