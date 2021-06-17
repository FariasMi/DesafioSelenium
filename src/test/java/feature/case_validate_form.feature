# language: pt
	# encoding: utf-8

Funcionalidade: Validar preenchimento das abas do formulário


Cenário: Preencher formulário de cadastro

	Dado que eu estou na tela de formulário do site de insurance
	Quando preencho informações válidas no formulário da aba enter Vehicle Data 
	E clico no botão para ir para a  próxima aba enter Insurant Data
	E preencho informações válidas no formulário da aba enter Insurant Data
	E clico no botão para ir para a próxima aba enter Product Data
	E preencho informações válidas no formulário da aba enter Product Data
	E clico no botão para ir para a  próxima aba Select Price Option
	E preencho informações válidas no formulário da aba Select Price Option
	E clico no botão para ir para a próxima aba Send Quote
	E preencho informações válidas no formulário da aba Send Quote 
	E clico no botão Send para enviar os formulários
	Então deve aparecer a mensagem <message>
	
	Exemplos:
		|message									|
		|"Sending e-mail success!"|