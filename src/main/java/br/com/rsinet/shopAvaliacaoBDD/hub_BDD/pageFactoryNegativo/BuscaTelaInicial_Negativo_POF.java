package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuscaTelaInicial_Negativo_POF {

	public BuscaTelaInicial_Negativo_POF(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "details_10")
	private WebElement btn_notebook;

	@FindBy(how = How.XPATH, using = "//h1[@class='roboto-regular screen768 ng-binding']")
	private WebElement outroNot;

	@FindBy(how = How.XPATH, using = "//p[@name='popular_item_10_name']")
	private WebElement notInicial;

	public void buscaNoot(WebDriver driver) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,400)", "");

		btn_notebook.click();

	}

	public void clicaNoteInicial() {
		String primeiroNote = notInicial.getText();
		System.out.println("Estou clicando em: " + primeiroNote);
	}

	public void noteEncaminhado() {
		String outroNote = outroNot.getText();
		System.out.println("Fui encaminhado para: " + outroNote);
	}

	public WebElement getOutroNot() {
		return outroNot;
	}

	public WebElement getNotInicial() {
		return notInicial;
	}

}
