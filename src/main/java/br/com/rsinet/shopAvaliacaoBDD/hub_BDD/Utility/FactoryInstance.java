package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.Cadastro_POF;

public class FactoryInstance {

	public static Cadastro_POF cadastro;

	public static Cadastro_POF getInstance(WebDriver driver) {

		if (cadastro == null) {

			cadastro = new Cadastro_POF(driver);
		}
		return cadastro;
	}
}