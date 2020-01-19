package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteBuscaPágina;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.CaminhoBuscaPaginaInicial;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class TestBuscaPelaPaginaInicial {

	WebDriver driver;

	@Dado("a abertura do site de Produto")
	public void a_abertura_do_site_de_Produto() {
		driver = AcoesDoNavegador.inicializarDriver();
	}

	@E("como usuario quero buscar um produto da tela inicial")
	public void como_usuario_quero_buscar_um_produto_da_tela_inicial() {

		CaminhoBuscaPaginaInicial mouse = new CaminhoBuscaPaginaInicial(driver);
		mouse.detalhesBusca();

	}

	@E("então ao finalizar o a procura encerrar o navegador")
	public void então_ao_finalizar_o_a_procura_encerrar_o_navegador() {

		AcoesDoNavegador.fecharDriver();
	}

}
