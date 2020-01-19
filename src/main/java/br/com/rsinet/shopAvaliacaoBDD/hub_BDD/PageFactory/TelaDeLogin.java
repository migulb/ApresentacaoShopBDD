package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TelaDeLogin {

	public TelaDeLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btn_Login;

	@FindBy(how = How.XPATH, using = "//a[@class='create-new-account ng-scope']")
	private WebElement btn_cadastro;

	public void apertarBotãoLogin() throws Exception {
		btn_Login.click();
	}

	public void apertarBotaoCadastro() throws Exception {
		btn_cadastro.sendKeys(Keys.ENTER);
	}

}
