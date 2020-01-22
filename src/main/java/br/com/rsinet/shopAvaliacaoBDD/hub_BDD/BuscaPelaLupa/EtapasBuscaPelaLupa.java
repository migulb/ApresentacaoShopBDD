package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPelaLupa;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.CaminhoBuscaPelaLupa;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class EtapasBuscaPelaLupa {

	WebDriver driver;

	@Dado("a abertura do site inicial do ShopAdvance")
	public void a_abertura_do_site_inicial_do_ShopAdvance() {

		driver = AcoesDoNavegador.inicializarDriver();
	}

	@Então("irei apertar na lupa")
	public void eu_irei_apertar_na_lupa() throws Exception {

		CaminhoBuscaPelaLupa lupa = new CaminhoBuscaPelaLupa(driver);
		lupa.apertarLupa();
		lupa.apertarBarraDePesquisa();
	}

	@E("digitar a procura de um produto especifico")
	public void digitar_a_procura_de_um_produto_especifico() throws Exception {
		CaminhoBuscaPelaLupa search = new CaminhoBuscaPelaLupa(driver);
		search.detalhesProcuraLupa();

	}

	@Então("finalizar o Navegador")
	public void finalizar_o_Navegador() {

		CaminhoBuscaPelaLupa lupa = new CaminhoBuscaPelaLupa(driver);
		lupa.assertLupa(driver);
		// AcoesDoNavegador.fecharDriver();
	}

}