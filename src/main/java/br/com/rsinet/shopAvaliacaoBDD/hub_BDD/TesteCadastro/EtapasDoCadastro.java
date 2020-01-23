package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteCadastro;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.Cadastro_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory.TelaDeLogin_POF;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.AcoesDoNavegador;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class EtapasDoCadastro {

	WebDriver driver;

	@Dado("^a abertura do site principal$")
	public void a_abertura_do_site_principal() throws Throwable {
		driver = AcoesDoNavegador.inicializarDriver();
	}

	@E("^o menu do lado direito superior for ativado$")
	public void o_menu_do_lado_direito_superior_for_ativado() throws Throwable {
		TelaDeLogin_POF login = new TelaDeLogin_POF(driver);
		login.apertarBotãoLogin();
	}

	@Quando("^deve clicar em CREATE NEW ACCOUNT$")
	public void deve_clicar_em_CREATE_NEW_ACCOUNT() throws Throwable {
		TelaDeLogin_POF logn = new TelaDeLogin_POF(driver);
		logn.apertarBotaoCadastro();
	}

	@E("^preencher todos os dados necessários do site$")
	public void preencher_todos_os_dados_necessários_do_site() throws Throwable {
		Cadastro_POF cadas = new Cadastro_POF(driver);
		cadas.Detalhes_Cadastro();
		cadas.escolherPais();
		cadas.clicaNoCheckBox();
	}

	@E("^clica em REGISTER$")
	public void clica_em_REGISTER() throws Throwable {
		Cadastro_POF conf = new Cadastro_POF(driver);
		conf.confirmaCadastro();
	}

	@Então("^finalizar o navegador$")
	public void finalizar_o_navegador() throws Throwable {
		// AcoesDoNavegador.fecharDriver();
	}

}
