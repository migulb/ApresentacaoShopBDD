package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.BuscaNaLupaNegativo_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.BuscaTelaInicial_Negativo_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.RealizaCadastro_POF;

public class PageObjectManager_Negativo {

	WebDriver driver;
	BuscaNaLupaNegativo_POF lupaNeg;
	BuscaTelaInicial_Negativo_POF pagInitNeg;
	RealizaCadastro_POF cadasNeg;

	public PageObjectManager_Negativo(WebDriver driver) {
		this.driver = driver;
	}

	public BuscaNaLupaNegativo_POF getBuscaLupaNega() {

		return (lupaNeg == null) ? lupaNeg = new BuscaNaLupaNegativo_POF(driver) : lupaNeg;
	}

	public BuscaTelaInicial_Negativo_POF getBuscaPagInitNegativo() {
		return (pagInitNeg == null) ? pagInitNeg = new BuscaTelaInicial_Negativo_POF(driver) : pagInitNeg;
	}

	public RealizaCadastro_POF getRealizaCadastroNegativo() {

		return (cadasNeg == null) ? cadasNeg = new RealizaCadastro_POF(driver) : cadasNeg;
	}

}
