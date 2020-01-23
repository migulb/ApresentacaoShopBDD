package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteCadastro;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.Cadastro;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.TelaDeLogin;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EtapasDoCadastro {

	WebDriver driver;

	@Dado("a abertura do site principal")
	public void a_abertura_do_site() {

		driver = AcoesDoNavegador.inicializarDriver();

	}

	@E("o menu do lado direito superior for ativado")
	public void o_menu_do_lado_direito_superior_for_acionado() throws Exception {

		TelaDeLogin login = new TelaDeLogin(driver);
		login.apertarBotãoLogin();
	}

	@Então("deve clicar em CREATE NEW ACCOUNT")
	public void deverá_clicar_em_CREATE_NEW_ACCOUNT() throws Exception {

		TelaDeLogin login = new TelaDeLogin(driver);
		login.apertarBotaoCadastro();

	}

	@E("preencher todos os dados necessários do site")
	public void preencher_todos_os_dados_necessários_do_site() throws Exception {

		Cadastro cadastro = new Cadastro(driver);
		cadastro.Detalhes_Cadastro();
		cadastro.escolherPais();
		cadastro.clicaNoCheckBox();
	}

	@E("clica em REGISTER")
	public void apertar_em_REGISTER() {

		Cadastro cadastro = new Cadastro(driver);
		cadastro.confirmaCadastro();

	}

	@Então("finalizar o navegador")
	public void fechar_o_site() throws Exception {
		Cadastro cadastro = new Cadastro(driver);
		cadastro.assertCadastro();
		AcoesDoNavegador.fecharDriver();
	}

}
