#language:pt
#coding: utf-8


@BuscaPelaLupaNegativo
Funcionalidade: Buscar um produto um produto inexistente pela lupa

Contexto: Acessar o site e procurar um produto inexistente pela lupa
	
	Cenário: Busca Pela Lupa de item inexistente
		Dado a abertura do site de Produto
		E usuario busca um produto pela lupa que não existe
		Então ao finalizar a procura encerrar o navegador
