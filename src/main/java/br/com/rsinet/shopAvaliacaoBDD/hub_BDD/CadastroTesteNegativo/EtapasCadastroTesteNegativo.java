package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.CadastroTesteNegativo;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.RealizaCadastro_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo.TelaDeLogin_POF;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class EtapasCadastroTesteNegativo {

	WebDriver driver;

	@Dado("a abertura do site principal do ShopAdvance")
	public void a_abertura_do_site() {

		driver = AcoesDoNavegador.inicializarDriver();
	}

	@E("o menu do lado direito superior for acionado")
	public void o_menu_do_lado_direito_superior_for_acionado() throws Exception {

		TelaDeLogin_POF login = new TelaDeLogin_POF(driver);
		Thread.sleep(3000);
		login.apertarBotãoLogin();

	}

	@Quando("deverá clicar em CREATE NEW ACCOUNT")
	public void deverá_clicar_em_CREATE_NEW_ACCOUNT() throws Exception {

		TelaDeLogin_POF login = new TelaDeLogin_POF(driver);
		login.apertarBotaoCadastro();
	}

	@E("preencher os dados no site e senhas diferentes")
	public void preencher_os_dados_no_site_e_senhas_diferentes() throws Exception {

		RealizaCadastro_POF cadastro = new RealizaCadastro_POF(driver);
		cadastro.Dados_Cadastro();
		cadastro.escolherPais();
		cadastro.clicaNoCheckBox();
	}

	@E("apertar em REGISTER")
	public void apertar_em_REGISTER() {
		RealizaCadastro_POF btn_confirma = new RealizaCadastro_POF(driver);
		btn_confirma.confirmaCadastro();
	}

	@Então("fechar o site")
	public void fechar_o_site() {
		RealizaCadastro_POF asserts = new RealizaCadastro_POF(driver);
		asserts.asserts(driver);
		// AcoesDoNavegador.fecharDriver();
	}

}
