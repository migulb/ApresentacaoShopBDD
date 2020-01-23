package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteNegativo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/CadastroNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.CadastroTesteNegativo" }, tags = {
				"@CadastroInvalido" }, monochrome = true)
public class Cadastro_TestNegativo {

}
