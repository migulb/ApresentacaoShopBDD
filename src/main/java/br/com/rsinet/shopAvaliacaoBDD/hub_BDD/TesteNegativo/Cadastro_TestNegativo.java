package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteNegativo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/CadastroNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.CadastroTesteNegativo" }, tags = {
				"@CadastroInvalido" }, monochrome = true)
public class Cadastro_TestNegativo {

}
