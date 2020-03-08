#language: pt
Funcionalidade: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Contexto:
    Dado que estou acessando a aplicação
    Quando informo o usuário "a@a"
    E a senha "a"
    E seleciono entrar
    Então visualizo a página inicial
    Quando seleciono Contas
    E seleciono Adicionar

Esquema do Cenário:
    Quando informo a conta "<conta>"
    E seleciono Salvar
    Então recebo a mensagem "<mensagem>"

Exemplos:
	|			 conta			 | 							mensagem 							|
	| Conta de Teste	 | Conta adicionada com sucesso! 			|
	| 								 | Informe o nome da conta 						|
	| Conta mesmo nome | Já existe uma conta com esse nome! |
	
	@ignore
  Cenário: Deve inserir uma conta com sucesso
    E informo a conta "Conta de Teste"
    E seleciono Salvar
    Então a conta é inserida com sucesso

	@ignore
  Cenário: Não deve inserir uma conta sem nome
    E informo a conta ""
    E seleciono Salvar
    Então sou notificado que o nome da conta é obrigatório

  @ignore
  Cenário: Não deve inserir uma conta com nome já existente
    E informo a conta "Conta mesmo nome"
    E seleciono Salvar
    Então sou notificado que já existe uma conta com esse nome
