package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteBuscaPágina;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.CaminhoBuscaPaginaInicial_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class TestBuscaPelaPaginaInicial {

	WebDriver driver;
	CaminhoBuscaPaginaInicial_POF pagInit;
	TestContext testContext;

	public TestBuscaPelaPaginaInicial(TestContext context) {

		testContext = context;
		pagInit = testContext.getPageObjectManager().getPageInicial();

	}

	@Dado("a abertura do site dos Produto")
	public void a_abertura_do_site_de_Produto() {
		driver = testContext.getWebDriverManager().getDriver();
	}

	@E("como usuario quero buscar um produto da tela inicial")
	public void como_usuario_quero_buscar_um_produto_da_tela_inicial() {
		pagInit.detalhesBusca();

	}

	@Então("ao finalizar a busca encerrar o navegador")
	public void então_ao_finalizar_o_a_procura_encerrar_o_navegador() {
		pagInit.assertPaginaIni(driver);

		testContext.getWebDriverManager().fecharDriver();
	}

}
