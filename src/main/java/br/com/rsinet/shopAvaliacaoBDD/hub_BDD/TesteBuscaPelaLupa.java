package br.com.rsinet.shopAvaliacaoBDD.hub_BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/BuscaPelaLupa_Test.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.BuscaPelaLupa" }, tags = { "@BuscaPelaLupa" }, monochrome = true)
public class TesteBuscaPelaLupa {

}
