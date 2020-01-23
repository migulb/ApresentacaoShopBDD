package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.Constante;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.ExcelUtil;
import junit.framework.Assert;

public class CaminhoBuscaPelaLupa_POF {
	public CaminhoBuscaPelaLupa_POF(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement btn_lupa;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement barraDePesquisa;

	@FindBy(how = How.ID, using = "30")
	private WebElement btn_mouse;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_addCart;

	@FindBy(how = How.XPATH, using = "//tool-tip-cart[@id='toolTipCart']//div//table//tfoot")
	private WebElement btn_Cart;

	@FindBy(how = How.XPATH, using = "//*[@id=\'checkOutButton\']")
	private WebElement confCompra;

	public void apertarLupa() throws InterruptedException {
		btn_lupa.click();
	}

	public void apertarBarraDePesquisa() {

		barraDePesquisa.click();
	}

	public void escreverBarraDePesquisa(String produto) throws Exception {

		barraDePesquisa.sendKeys(produto);
	}

	public void apertaNoMouse() {

		btn_mouse.click();
	}

	public void adicionaCarrinho() {

		btn_addCart.click();

	}

	public void vaiParaCart() {

		btn_Cart.click();
	}

	public void confirFinal() {

		confCompra.click();
	}

	public void assertLupa(WebDriver driver) {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,
				"https://www.advantageonlineshopping.com/#/login?viewAll=HP%20Z4000%20WIRELESS%20MOUSE");
	}

	public void detalhesProcuraLupa() throws Exception {
		ExcelUtil.setExcelFile(Constante.Path_TestData + Constante.File_TestData, "Planilha2");
		escreverBarraDePesquisa(ExcelUtil.getCellData(1, Constante.Col_busca) + Keys.ENTER);
		apertaNoMouse();
		adicionaCarrinho();
		vaiParaCart();
		confirFinal();
	}
}
