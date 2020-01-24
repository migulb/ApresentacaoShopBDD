package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPelaLupa;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.CaminhoBuscaPelaLupa_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EtapasBuscaPelaLupa {

	WebDriver driver;
	TestContext testContext;
	CaminhoBuscaPelaLupa_POF lupa;

	public EtapasBuscaPelaLupa(TestContext context) {
		testContext = context;
		lupa = testContext.getPageObjectManager().getPagLupa();

	}

	@Dado("a abertura do site inicial do ShopAdvance")
	public void a_abertura_do_site_inicial_do_ShopAdvance() {

		driver = testContext.getWebDriverManager().getDriver();
	}

	@Então("irei apertar na lupa")
	public void eu_irei_apertar_na_lupa() throws Exception {
		lupa.apertarLupa();
		lupa.apertarBarraDePesquisa();
	}

	@E("digitar a procura de um produto especifico")
	public void digitar_a_procura_de_um_produto_especifico() throws Exception {
		lupa.detalhesProcuraLupa();

	}

	@Então("finalizar o Navegador")
	public void finalizar_o_Navegador() {
		lupa.assertLupa(driver);
		testContext.getWebDriverManager().fecharDriver();
	}

}
