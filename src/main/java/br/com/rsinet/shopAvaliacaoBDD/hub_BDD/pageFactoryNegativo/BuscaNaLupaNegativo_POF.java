package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.Constante;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.ExcelUtil;

public class BuscaNaLupaNegativo_POF {

	public BuscaNaLupaNegativo_POF(WebDriver driver) {

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement erro;

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

	public void asserLupaNeg(WebDriver driver) throws Exception {

		String falha = erro.getText();
		String error = driver.getPageSource();
		System.out.println("Mensagem: " + falha);
		// Assert.assertTrue("Produto não encontrado", falha.equals("No results for
		// \"mesa\""));
		Assert.assertEquals(falha, "No results for \"Mesa\"");
	}

	public void detalhesProcuraLupa() throws Exception {
		ExcelUtil.setExcelFile(Constante.Path_TestData + Constante.File_TestData, "Planilha2");
		escreverBarraDePesquisa(ExcelUtil.getCellData(2, Constante.Col_busca) + Keys.ENTER);

	}

}
