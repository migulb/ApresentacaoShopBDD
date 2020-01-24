package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.pageFactoryNegativo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.Constante;
import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.ExcelUtil;

public class RealizaCadastro_POF {

	public RealizaCadastro_POF(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbx_Usuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txbx_email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txbx_senha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txbx_ConfirmaSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txbx_primeiroNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txbx_ultimoNome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txbx_Telefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement cbbx_pais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txbx_cidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txbx_endereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txbx_estado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txbx_cep;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement ckbx_Aceite;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_ConfirmaCadastro;

	@FindBy(how = How.XPATH, using = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/label")
	private WebElement senhadiferente;

	public void digitar_usuario(String usuario) throws Exception {

		txtbx_Usuario.sendKeys(usuario);
	}

	public void digitar_email(String email) throws Exception {

		txbx_email.sendKeys(email);
	}

	public void digitar_senha(String senha) throws Exception {

		txbx_senha.sendKeys(senha);

	}

	public void confirmarSenha(String confSenha) throws Exception {

		txbx_ConfirmaSenha.sendKeys(confSenha);
	}

	public void primeiroNome(String nome) throws Exception {

		txbx_primeiroNome.sendKeys(nome);
	}

	public void ultimoNome(String ultimoNome) throws Exception {

		txbx_ultimoNome.sendKeys(ultimoNome);
	}

	public void digitarTelefone(String tel) {

		txbx_Telefone.sendKeys(tel);

	}

	public void escolherPais() {

		new Select(cbbx_pais).selectByVisibleText("Brazil");

	}

	public void digitar_cidade(String cidade) {

		txbx_cidade.sendKeys(cidade);
	}

	public void digitar_endereco(String endereco) {

		txbx_endereco.sendKeys(endereco);
	}

	public void digita_estado(String estado) {

		txbx_estado.sendKeys(estado);
	}

	public void digita_cep(String cep) {

		txbx_cep.sendKeys(cep);
	}

	public void clicaNoCheckBox() {

		ckbx_Aceite.click();
	}

	public void confirmaCadastro() {

		btn_ConfirmaCadastro.click();
	}

	public void asserts(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,-400)", "");
		String valida = driver.getPageSource();
		Assert.assertTrue(valida.contains("Passwords do not match"));
	}

	public void Dados_Cadastro() throws Exception {
		ExcelUtil.setExcelFile(Constante.Path_TestData + Constante.File_TestData, "Planilha1");

		digitar_usuario(ExcelUtil.getCellData(2, Constante.Col_UserName));
		digitar_email(ExcelUtil.getCellData(2, Constante.Col_email));
		digitar_senha(ExcelUtil.getCellData(2, Constante.Col_senha));
		confirmarSenha(ExcelUtil.getCellData(2, Constante.Col_confSenha));
		primeiroNome(ExcelUtil.getCellData(2, Constante.Col_Nome));
		ultimoNome(ExcelUtil.getCellData(2, Constante.Col_endName));
		digitarTelefone(ExcelUtil.getCellData(2, Constante.Col_Tel));
		digitar_cidade(ExcelUtil.getCellData(2, Constante.Col_cidade));
		digitar_endereco(ExcelUtil.getCellData(2, Constante.Col_endereco));
		digita_estado(ExcelUtil.getCellData(2, Constante.Col_estado));
		digita_cep(ExcelUtil.getCellData(2, Constante.COl_cep));
	}

}
