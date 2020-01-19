package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteCadastro;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.Cadastro;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.TelaDeLogin;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class EtapasDoCadastro {

	WebDriver driver;

	@Dado("a abertura do site")
	public void a_abertura_do_site() {
		driver = AcoesDoNavegador.inicializarDriver();

	}

	@Dado("o menu do lado direito superior for acionado")
	public void o_menu_do_lado_direito_superior_for_acionado() throws Exception {

		TelaDeLogin login = new TelaDeLogin(driver);
		Thread.sleep(4000);
		login.apertarBotãoLogin();
	}

	@Então("deverá clicar em CREATE NEW ACCOUNT")
	public void deverá_clicar_em_CREATE_NEW_ACCOUNT() throws Exception {

		TelaDeLogin login = new TelaDeLogin(driver);
		login.apertarBotaoCadastro();

	}

	@Então("preencher todos os dados necessários do site")
	public void preencher_todos_os_dados_necessários_do_site() throws Exception {

		Cadastro cadastro = new Cadastro(driver);
		cadastro.Detalhes_Cadastro();
		cadastro.escolherPais();
		cadastro.clicaNoCheckBox();
	}

	@Então("apertar em REGISTER")
	public void apertar_em_REGISTER() {

		Cadastro cadastro = new Cadastro(driver);
		cadastro.confirmaCadastro();
	}

	@Então("fechar o site")
	public void fechar_o_site() {
		// AcoesDoNavegador.fecharDriver();
	}

}
