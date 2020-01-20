package br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaLupaNegativo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPelaLupaNegativo.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaLupaNegativo_Test" }, tags = {
				"@BuscaPelaLupaNegativo" }, monochrome = true)
public class BuscaPelaLupa_negativo {

}
