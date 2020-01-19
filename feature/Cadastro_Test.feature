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

@CadastroDeUsuario
Funcionalidade: Cadastro de usuário


Contexto: acessar o site e realizar um cadastro

  Eu como usuário desejo realizar um cadastro

  Cenário: Cadastro de usuário
    Dado a abertura do site
    E o menu do lado direito superior for acionado
    Então deverá clicar em CREATE NEW ACCOUNT 
    E preencher todos os dados necessários do site
    Então apertar em REGISTER
    E fechar o site



	
