package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class CaminhoBuscaPaginaInicial {

	public CaminhoBuscaPaginaInicial(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "miceImg")
	private WebElement btn_produto;

	@FindBy(how = How.ID, using = "27")
	private WebElement btn_mouse;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_mandaCart;

	@FindBy(how = How.XPATH, using = "//header//tfoot//td[2]")
	private WebElement btn_cart;

	@FindBy(how = How.XPATH, using = "//*[@id=\'checkOutButton\']")
	private WebElement confCompra;

	public void apertaNoProduto() {
		btn_produto.click();
	}

	public void apertanoMouse() {
		btn_mouse.click();
	}

	public void mandaParaOCarrinho() {
		btn_mandaCart.click();
	}

	public void carrinho() {
		btn_cart.click();
	}

	public void confirFinal() {

		confCompra.click();
	}

	public void assertPaginaIni(WebDriver driver) {
		String html = driver.getPageSource();
		Assert.assertTrue(html.contains("HP Z3600 WIRELESS MOUSE"));
	}

	public void detalhesBusca() {
		apertaNoProduto();
		apertanoMouse();
		mandaParaOCarrinho();
		carrinho();
		confirFinal();
	}
}
