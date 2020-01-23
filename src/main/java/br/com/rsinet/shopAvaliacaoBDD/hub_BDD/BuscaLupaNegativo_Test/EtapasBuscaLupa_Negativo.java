package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaLupaNegativo_Test;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.BuscaNaLupaNegativo;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EtapasBuscaLupa_Negativo {

	WebDriver driver;

	@Dado("a abertura do site de Produto")
	public void a_abertura_do_site_de_Produto() {

		driver = AcoesDoNavegador.inicializarDriver();

	}

	@E("usuario busca um produto pela lupa que não existe")
	public void usuario_busca_um_produto_pela_lupa_que_não_existe() throws Exception {

		BuscaNaLupaNegativo lupa = new BuscaNaLupaNegativo(driver);
		lupa.detalhesProcuraLupa();
	}

	@Então("ao finalizar a procura encerrar o navegador")
	public void ao_finalizar_a_procura_encerrar_o_navegador() throws Exception {

		BuscaNaLupaNegativo asser = new BuscaNaLupaNegativo(driver);
		asser.asserLupaNeg(driver);
		AcoesDoNavegador.fecharDriver();
	}

}
