package br.com.rsinet.shopAvaliacaoBDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.Cadastro_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.TelaDeLogin_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class EtapasDoCadastro {

	TestContext testContext;
	TelaDeLogin_POF login;
	private WebDriver driver;
	Cadastro_POF cadas;

	public EtapasDoCadastro(TestContext context) {
		testContext = context;
		login = testContext.getPageObjectManager().getTelaLogin();
		cadas = testContext.getPageObjectManager().getCadastro();

	}

	@Dado("^a abertura do site principal$")
	public void a_abertura_do_site_principal() throws Throwable {
		driver = testContext.getWebDriverManager().getDriver();
	}

	@E("^o menu do lado direito superior for ativado$")
	public void o_menu_do_lado_direito_superior_for_ativado() throws Throwable {
		login.apertarBotãoLogin();
	}

	@Quando("^deve clicar em CREATE NEW ACCOUNT$")
	public void deve_clicar_em_CREATE_NEW_ACCOUNT() throws Throwable {
		login.apertarBotaoCadastro();

	}

	@E("^preencher todos os dados necessários do site$")
	public void preencher_todos_os_dados_necessários_do_site() throws Throwable {
		cadas.Detalhes_Cadastro();
		cadas.escolherPais();
		cadas.clicaNoCheckBox();
	}

	@E("^clica em REGISTER$")
	public void clica_em_REGISTER() throws Throwable {
		cadas.confirmaCadastro();

	}

	@Então("^finalizar o navegador$")
	public void finalizar_o_navegador() throws Throwable {
		cadas.assertCadastro(driver);
		// testContext.getWebDriverManager().fecharDriver();
	}

}
