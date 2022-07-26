Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:  
•	Criar uma pessoa
•	Editar uma pessoa 
•	Consultar uma pessoa
•	Listar pessoas 
•	Criar endereço para pessoa 
•	Poder informar qual endereço é o principal da pessoa

Uma Pessoa deve ter os seguintes campos:  
•	Nome
•	Data de nascimento
•	Endereço:
	o	Logradouro
	o	CEP
	o	Número
	o	Cidade

Requisitos  
•	Todas as respostas da API devem ser JSON  
•	Banco de dados H2

===============================================

A Classe DBService faz a povoação do H2 automaticamente.

- O Relacionameno das classes Pessoa e Endereço é de Uma Pessoa Para Muitos Endereços (OneToMany), onde na classe Pessoa
há um array que irá armazenar os endereços.

Endpoits testados no Postman:

•	Criar uma pessoa: http://localhost:8080/pessoas
	- Método POST usando a seguinte estrutura Json
		{
			"nome": "nome desejado",
			"dtNascimento": dd/MM/yyyy
		}

•	Editar uma pessoa
	- Método PUT http://localhost:8080/pessoas/id da pessoa 
		Usando a seguinte estrutura Json:
		{
			"nome": "novo nome desejado",
			"dtNascimento": nova data no formato dd/MM/yyyy
		}
		
•	Consultar uma pessoa
	- Método GET http://localhost:8080/pessoas/1 <-id desejado

•	Listar pessoas
	- Método GET http://localhost:8080/pessoas
	
•	Criar endereço para pessoa
	- Método POST http://localhost:8080/enderecos
		Usando a seguinte estrutura Json:
		{
	        "logradouro": "Rua das Arvores",
	        "cep": "74000-000",
	        "numero": 27,
	        "cidade": "Springfield",
	        "tipo": "PRINCIPAL"
   		}

