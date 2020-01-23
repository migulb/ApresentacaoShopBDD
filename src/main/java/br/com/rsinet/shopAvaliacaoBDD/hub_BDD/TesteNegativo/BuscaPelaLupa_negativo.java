package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteNegativo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPelaLupaNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaLupaNegativo_Test" }, tags = {
				"@BuscaPelaLupaNegativo" }, monochrome = true)
public class BuscaPelaLupa_negativo {

}
