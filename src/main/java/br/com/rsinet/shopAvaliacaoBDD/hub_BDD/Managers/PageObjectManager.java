package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.Cadastro_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.CaminhoBuscaPaginaInicial_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.CaminhoBuscaPelaLupa_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.TelaDeLogin_POF;

public class PageObjectManager {

	private WebDriver driver;
	private Cadastro_POF cadas;
	private CaminhoBuscaPaginaInicial_POF pagInicial;
	private CaminhoBuscaPelaLupa_POF buscaLupa;
	private TelaDeLogin_POF login;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public Cadastro_POF getCadastro() {

		return (cadas == null) ? cadas = new Cadastro_POF(driver) : cadas;

	}

	public CaminhoBuscaPaginaInicial_POF getPageInicial() {

		return (pagInicial == null) ? pagInicial = new CaminhoBuscaPaginaInicial_POF(driver) : pagInicial;
	}

	public CaminhoBuscaPelaLupa_POF getPagLupa() {

		return (buscaLupa == null) ? buscaLupa = new CaminhoBuscaPelaLupa_POF(driver) : buscaLupa;
	}

	public TelaDeLogin_POF getTelaLogin() {

		return (login == null) ? login = new TelaDeLogin_POF(driver) : login;
	}
}
