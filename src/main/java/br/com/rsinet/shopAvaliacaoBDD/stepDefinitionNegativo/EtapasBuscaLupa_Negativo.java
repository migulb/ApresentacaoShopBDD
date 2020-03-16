package br.com.rsinet.shopAvaliacaoBDD.stepDefinitionNegativo;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.TestContext;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.BuscaNaLupaNegativo_POF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EtapasBuscaLupa_Negativo {

	WebDriver driver;
	BuscaNaLupaNegativo_POF buscaLupa;
	TestContext testContext;

	public EtapasBuscaLupa_Negativo(TestContext context) {
		testContext = context;
		buscaLupa = testContext.getPageObjectManagerNegativo().getBuscaLupaNega();

	}

	@Dado("a abertura do site de Produto")
	public void a_abertura_do_site_de_Produto() {
		driver = testContext.getWebDriverManager().getDriver();

	}

	@E("usuario busca um produto pela lupa que não existe")
	public void usuario_busca_um_produto_pela_lupa_que_não_existe() throws Exception {
		buscaLupa.detalhesProcuraLupa();
	}

	@Então("ao finalizar a procura encerrar o navegador")
	public void ao_finalizar_a_procura_encerrar_o_navegador() throws Exception {

		buscaLupa.asserLupaNeg(driver);
		// testContext.getWebDriverManager().fecharDriver();
	}

}
