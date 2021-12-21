# ProjetoFinalTechGrupo05

# <h3> Projeto Final - ItauTECH

# <h3> VISÃO GERAL

Estamos em um contexto de gerenciamento de clientes e contas bancárias da instituição.
Precisamos disponibilizar uma API que forneça dados de clientes e contas (inicialmente para
consulta).
OBJETIVOS
1. Construir uma API Spring BOOT que possua 2 endpoints principais:
  a. Recuperação de todas as contas bancárias
  b. Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)
2.ESPECIFICAÇÕES
Algumas tecnologias são obrigatórias para este projeto:
Banco de Dados: MySQL
API: SpringBoot
Modelagem de Dados:
Toda conta bancária possui os seguintes dados
  - numero
  - agência
  - tipo da conta (0 - conta corrente, 1 - poupança, 2 - investimento)
  - saldo
  - titular da conta (nome do titular)


Funções:
Cliente:
- Codigo
- CPF
- email
- nome
- telefone

Conta:
- numero
-agencia
- saldo
- tipo
- cod_cliente
