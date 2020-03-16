package br.com.rsinet.shopAvaliacaoBDD.TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Cadastro_Test.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.stepDefinition",
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility" }, tags = "@CadastroDeUsuario", plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Cadastros.html" }, monochrome = true)
public class TestCadastro {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("Miguel", System.getProperty("user.name"));
		Reporter.setSystemInfo("SO", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}
