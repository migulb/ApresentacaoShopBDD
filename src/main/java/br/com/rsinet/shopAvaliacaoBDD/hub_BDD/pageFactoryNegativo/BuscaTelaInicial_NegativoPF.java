package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuscaTelaInicial_NegativoPF {

	public BuscaTelaInicial_NegativoPF(WebDriver driver) {

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

	public void assertPagIni() throws InterruptedException {

		String notDaPag = outroNot.getText();
		String notInit = notInicial.getText();
		System.out.println("Estou clicando em: " + notInit);
		System.out.println("Fui encaminhado para a página do note" + notDaPag);
		Assert.assertNotEquals(notInit, notDaPag);

	}
}
