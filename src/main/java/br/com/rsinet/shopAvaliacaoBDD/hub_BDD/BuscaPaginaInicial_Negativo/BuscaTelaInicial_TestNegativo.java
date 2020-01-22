package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPaginaInicial_Negativo;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.BuscaTelaInicial_NegativoPF;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class BuscaTelaInicial_TestNegativo {

	WebDriver driver;

	@Dado("a abertura do site inicial do ShopAdvance")
	public void a_abertura_do_site_inicial_do_ShopAdvance() {

		driver = AcoesDoNavegador.inicializarDriver();
	}

	@E("o usuario clica em um produto especifico mas e encaminhado a outro produto")
	public void o_usuario_clica_em_um_produto_especifico_mas_e_encaminhado_a_outro_produto()
			throws InterruptedException {

		BuscaTelaInicial_NegativoPF busca = new BuscaTelaInicial_NegativoPF(driver);
		busca.buscaNoot(driver);

	}

	@Então("o navegador e finalizado após a abertura do produto errado")
	public void o_navegador_e_finalizado_após_a_abertura_do_produto_errado() throws InterruptedException {

		// BuscaTelaInicial_NegativoPF asse = new BuscaTelaInicial_NegativoPF(driver);
		// AcoesDoNavegador.fecharDriver();
	}

}
