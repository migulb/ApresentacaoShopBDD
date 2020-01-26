package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteNegativo;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPelaLupaNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaLupaNegativo_Test",
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility" }, tags = { "@BuscaPelaLupaNegativo" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/BuscaLupa_testNegativo.html" }, monochrome = true)
public class BuscaPelaLupa_negativo {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("Miguel", System.getProperty("user.name"));
		Reporter.setSystemInfo("SO", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}
