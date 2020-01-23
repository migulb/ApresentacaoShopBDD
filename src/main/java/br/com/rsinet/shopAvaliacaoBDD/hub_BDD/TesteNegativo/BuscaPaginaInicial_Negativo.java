package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteNegativo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPaginaInicialNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPaginaInicial_Negativo" }, tags = {
				"@BuscaPaginaInicialNegativo" }, monochrome = true)
public class BuscaPaginaInicial_Negativo {

}
