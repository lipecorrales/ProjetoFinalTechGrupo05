# Projeto Final Tech Grupo 05

# <h3> Projeto Final - ItauTECH 🚀: <h3/>

<h1 align="center">
  <img alt="ProjetoFinalTechGrupo05" title="ProjetoFinalTechGrupo05" src="https://user-images.githubusercontent.com/20006038/148591948-aaee6b6a-13f1-4c80-871c-b28e95eeeb27.jpeg" />
</h1>

<p style="color: orange;">O Desafio Final - ItauTECH é um projeto em grupo que foi desenvolvido durante o Programa de Formação Tech do Itaú em parceria com a Gama Academy.</p>

#
### Topicos:

- [x] [Descrição do projeto](#Desafio)
- [x] [Objetivo ](#Objetivos)
- [x] [Especificações](#Especificações)
- [x] [Entregaveis](#Entregáveis)
- [x] [Consultas Extras](#Consultas)

#
### Contribuição:

### Entre em contato conosco:
    
<summary>Philippe Corrales</summary>
	
[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/philippecorrales/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/lipecorrales)

<summary>Rogério Tavares</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rogtavares/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rogtavares)
	
<summary>Nicole Ferreira</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nicole-ferreira-8438a4139/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/lefeani)

<summary>Rian Rodrigues</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rian-rodrigues-pcd-08447270/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rianrodrigues16)
	
<summary>Shirley Coelho</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](http://linkedin.com/in/shirley-esteves-5786a9187)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Shirley1317)
	
<summary>Marcos Alexandre</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcos-alexandre-gomes-cea/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/marcosalexandre100)
	
#
### Desafio:
<p>Estamos em um contexto de gerenciamento de clientes e contas bancárias da instituição, e
precisamos disponibilizar uma API que forneça dados de clientes e contas inicialmente para
consulta!</p>
	
#

### Tecnologias Utilizadas: 

### Objetivos:
Construir uma API Spring BOOT que possua 2 endpoints principais:

a. Recuperação de todas as contas bancárias

b. Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)
#

### Especificações:

Algumas tecnologias são obrigatórias para este projeto:

Banco de Dados: MySQL

API: SpringBoot

Modelagem de Dados:
Todo cliente possui os seguintes dados para serem cadastrados

● `Código Interno` 

● `CPF`

● `Email`

● `Nome`

● `Telefone`
#

### Toda conta bancária possui os seguintes dados

● `Número`

● `Agência`

● `Tipo da Conta (0 - conta corrente, 1 - poupança, 2 - investimento)`

● `Saldo`

● `Titular da Conta`
#

### Entregáveis:

Endpoint para consulta de todas as contas (deve retornar uma lista de objetos do tipo
que armazena Conta Bancária):

    /conta/contas

Endpoint para consultas do detalhe da conta

    /conta/contas/{id}

Todos os dados devem ser retornados em formato JSON.

#

## Consultas Extras:

Endpoint para incluir novo cliente: 

    /cliente/novo

Endpoint para debitar saldo da conta:

    /conta/debito

Endpoint para creditar saldo da conta:

    /conta/credito

Endpoint para deletar conta se saldo estiver zerado:

    /conta//excluir/{numero}

#
### Ferramenta:

Visual Studio Code

Thunder

MySQL Workbench 8.0 CE

#
<div style="display: inline_block">
    <img align="center" alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
    <img align="center" alt="Spring" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
    <img align="center" alt="Mysql" src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
</div>


