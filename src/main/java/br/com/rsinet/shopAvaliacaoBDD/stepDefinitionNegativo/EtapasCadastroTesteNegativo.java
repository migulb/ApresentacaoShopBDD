package br.com.rsinet.shopAvaliacaoBDD.stepDefinitionNegativo;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.TelaDeLogin_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.TestContext;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.RealizaCadastro_POF;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EtapasCadastroTesteNegativo {

	private WebDriver driver;
	RealizaCadastro_POF cadasNegativo;
	TestContext testContext;
	TelaDeLogin_POF login1;

	public EtapasCadastroTesteNegativo(TestContext context) {
		testContext = context;
		cadasNegativo = testContext.getPageObjectManagerNegativo().getRealizaCadastroNegativo();
		login1 = testContext.getPageObjectManager().getTelaLogin();
	}

	@Dado("a abertura do site principal do ShopAdvance")
	public void a_abertura_do_site() {
		driver = testContext.getWebDriverManager().getDriver();
	}

	@E("o menu do lado direito superior for acionado")
	public void o_menu_do_lado_direito_superior_for_acionado() throws Exception {
		login1.apertarBotãoLogin();

	}

	@Quando("deverá clicar em CREATE NEW ACCOUNT")
	public void deverá_clicar_em_CREATE_NEW_ACCOUNT() throws Exception {
		login1.apertarBotaoCadastro();
	}

	@E("preencher os dados no site e senhas diferentes")
	public void preencher_os_dados_no_site_e_senhas_diferentes() throws Exception {
		cadasNegativo.Dados_Cadastro();
		cadasNegativo.escolherPais();
		cadasNegativo.clicaNoCheckBox();
	}

	@E("apertar em REGISTER")
	public void apertar_em_REGISTER() {
		cadasNegativo.confirmaCadastro();
	}

	@Então("fechar o site")
	public void fechar_o_site() {
		cadasNegativo.asserts(driver);
		// testContext.getWebDriverManager().fecharDriver();
	}

}
