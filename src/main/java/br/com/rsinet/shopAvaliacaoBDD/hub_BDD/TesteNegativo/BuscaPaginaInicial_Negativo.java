package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteNegativo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPaginaInicialNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPaginaInicial_Negativo" }, tags = {
				"@BuscaPaginaInicialNegativo" }, monochrome = true)
public class BuscaPaginaInicial_Negativo {

}
