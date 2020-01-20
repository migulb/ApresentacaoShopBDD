#language:pt
#coding: utf-8



@CadastroInvalido
Funcionalidade: Cadastrar usuario com senhas diferentes


Contexto: acessar o site e cadastrar um usuario com senhas diferentes

  Eu como usuário vou cadastrar usuario com senhas diferentes

  Cenário: Cadastro de usuário
    Dado a abertura do site
    E o menu do lado direito superior for acionado
    Quando deverá clicar em CREATE NEW ACCOUNT 
    E preencher os dados no site e senhas diferentes
    E apertar em REGISTER
    Então fechar o site
