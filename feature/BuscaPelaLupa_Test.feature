#language:pt
#coding: utf-8


@BuscaPelaLupa
Funcionalidade: Buscar um produto pela lupa da tela principal

Contexto: Acessar o site e pesquisar sobre um produto pela lupa
	
	Cenário: Busca Pela lupa Tela Inicial
	Dado a abertura do site inicial do ShopAdvance
	Então irei apertar na lupa
	E digitar a procura de um produto especifico
	Então finalizar o Navegador