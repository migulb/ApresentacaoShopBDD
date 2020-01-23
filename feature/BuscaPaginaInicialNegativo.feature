#language:pt
#coding: utf-8

@BuscaPaginaInicialNegativo
Funcionalidade: Buscar por um produto especifico na tela principal

Contexto: Ao acessar o site o usuario clica em um produto específico e é encaminhado a outro produto
	
	Cenário: Busca Pela lupa Tela Inicial
	Dado a abertura do site inicial do Shop
	E o usuario clica em um produto especifico mas e encaminhado a outro produto
	Então o navegador e finalizado após a abertura do produto errado
	
	