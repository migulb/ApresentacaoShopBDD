package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TestNormal;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.shopAvaliacaoBDD.hub_BDD.Utility.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Cadastro_Test.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteCadastro" }, tags = "@CadastroDeUsuario", plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Cadastros.html" }, monochrome = true)
public class TestCadastro {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}
