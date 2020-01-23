package br.com.rsinet.shopAvaliacaoBDD.hub_BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPelaPaginaInicial_Test.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteBuscaPágina" }, tags = { "@BuscaPelaPaginaInicial" })
public class TestBuscaPaginaInicial {

}
