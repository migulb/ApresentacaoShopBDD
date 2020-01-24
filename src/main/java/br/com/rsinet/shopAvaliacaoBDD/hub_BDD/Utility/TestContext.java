package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Managers.PageObjectManager;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Managers.PageObjectManager_Negativo;

public class TestContext {

	private AcoesDoNavegador webDriverManager;
	private PageObjectManager pageObjectManager;
	private PageObjectManager_Negativo pageObjectManagerNegativo;

	public TestContext() {

		webDriverManager = new AcoesDoNavegador();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		pageObjectManagerNegativo = new PageObjectManager_Negativo(webDriverManager.getDriver());

	}

	public AcoesDoNavegador getWebDriverManager() {

		return webDriverManager;

	}

	public PageObjectManager getPageObjectManager() {

		return pageObjectManager;
	}

	public PageObjectManager_Negativo getPageObjectManagerNegativo() {

		return pageObjectManagerNegativo;
	}

}
