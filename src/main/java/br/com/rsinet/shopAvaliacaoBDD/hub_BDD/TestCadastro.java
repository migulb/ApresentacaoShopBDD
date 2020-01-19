package br.com.rsinet.shopAvaliacaoBDD.hub_BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Cadastro_Test.feature", glue = {
		"br.com.rsinet.shopAvaliacaoBDD.hub_BDD.TesteCadastro" }, plugin = { "pretty" }, monochrome = true)
public class TestCadastro {

}
