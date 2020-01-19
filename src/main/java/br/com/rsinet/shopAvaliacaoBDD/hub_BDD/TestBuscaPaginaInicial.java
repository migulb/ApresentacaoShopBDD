package br.com.rsinet.shopAvaliacaoBDD.hub_BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPelaPaginaInicial_Test.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteBuscaPágina" }, tags = { "@BuscaPelaPaginaInicial" })
public class TestBuscaPaginaInicial {

}
