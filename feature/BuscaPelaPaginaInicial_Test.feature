#language:pt
#coding: utf-8
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@BuscaPelaPaginaInicial
Funcionalidade: Buscar um produto pela tela Inicial

Contexto: Acessar o site e abrir um Produto exposto na tela inicial

	Eu como usuário quero entrar no site e busca um produto pela tela inical
	
	Cenário: Busca Pela Tela Inicial
		Dado a abertura do site de Produto
		E como usuario quero buscar um produto da tela inicial
		E então ao finalizar o a procura encerrar o navegador

