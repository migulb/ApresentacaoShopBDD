package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPaginaInicial_Negativo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.TestContext;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.BuscaTelaInicial_Negativo_POF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class BuscaTelaInicial_TestNegativo {

	WebDriver driver;
	TestContext testContext;
	BuscaTelaInicial_Negativo_POF telaInitNegativo;

	public BuscaTelaInicial_TestNegativo(TestContext context) {
		testContext = context;
		telaInitNegativo = testContext.getPageObjectManagerNegativo().getBuscaPagInitNegativo();

	}

	@Dado("a abertura do site inicial do Shop")
	public void a_abertura_do_site_inicial_do_ShopAdvance() {

		driver = testContext.getWebDriverManager().getDriver();
	}

	@E("o usuario clica em um produto especifico mas e encaminhado a outro produto")
	public void o_usuario_clica_em_um_produto_especifico_mas_e_encaminhado_a_outro_produto()
			throws InterruptedException {
		// BuscaTelaInicial_Negativo_POF busca = new
		// BuscaTelaInicial_Negativo_POF(driver);

		String asser = telaInitNegativo.getNotInicial().getText();
		telaInitNegativo.clicaNoteInicial();
		telaInitNegativo.buscaNoot(driver);
		String asse = telaInitNegativo.getOutroNot().getText();
		telaInitNegativo.noteEncaminhado();
		Assert.assertNotEquals(asser, asse);

	}

	@Então("o navegador e finalizado após a abertura do produto errado")
	public void o_navegador_e_finalizado_após_a_abertura_do_produto_errado() throws InterruptedException {
		testContext.getWebDriverManager().fecharDriver();
	}

}
