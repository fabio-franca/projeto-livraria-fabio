# Projeto Livraria Novo Olhar
Projeto final do curso de Java / Spring Boot

Introdução: 
O projeto foi criado para que o cliente possa visualizar a home-page e conhecer mais sobre a livraria e se desejar, comprar os livros disponíveis. 
Já para o administrador e funcionários, foi criado um sistema de gerenciamento.

Modelo utilizado: MVC.

<strong>Observação:</strong> Foi criado um arquivo "criar_banco_e_tabelas_livraria.sql", para criar a base de dados e as suas respectivas tabelas com inserts.

<hr>

Home-page:  http://localhost:8080/home
A home-page conta com um navbar, logomarca da livria, nome da empresa e menu superior para navegação. No menu superior, em "Logins" é possível definir o acesso para clientes ou funcionários.

Em seu corpo, possui um carousel que exibe imagens, algumas frases de incentivo à leitura, card's com os sucessos da livraria e uma lista contendo os livros para que ao clicar no carrinho, o cliente seja direcionado para tela de venda do livro.

Também possui rodapé com as redes sociais e informações da livraria.

<hr>

<strong>------SISTEMA DE GERENCIAMENTO------</strong>

-Login Funcionário:  http://localhost:8080/login/funcionario

Na home-page, no menu superior, clicando em "Logins" e após "Funcionários", é possível ter acesso ao login do funcionário ou seu cadastro em "Não tem usuário? Clique aqui para se cadastrar. Clicar no link para se cadastrar.

-Cadastro Funcionário: http://localhost:8080/cadastro/funcionarios/extra

Após preencher os dados de cadastro, clicar em salvar.

-Principal: http://localhost:8080/principal

Já na página principal, também foi criado um navbar com as informações da empresa e um menu lateral para naveção entre as telas.

-Cadastro de Livro: http://localhost:8080/cadastro/livro

Os registros inseridos nesta tela serão enviados a home-page e aparecerão na listagem para compra.

-Cadastro de Funcionário: http://localhost:8080/cadastro/funcionarios

Além do cadastro de funcionário citado anteriormente, existe um cadastro interno para melhor gerenciamento das informações.

-Lista de Livros: http://localhost:8080/livros/listar

Listagem contendo todos os livros cadastrados. Na coluna "Ações", é possível clicar no botão "Editar" para editar ou no botão "Excluir" para remover um registro.

-Lista de Funcionários: http://localhost:8080/funcionarios/listar

Listagem contendo todos os funcionários cadastrados. Na coluna "Ações", é possível clicar no botão "Editar" para editar ou no botão "Excluir" para remover um registro.

-Lista de Clientes: http://localhost:8080/clientes/listar

Listagem contendo todos os clientes cadastrados. Na coluna "Ações", é possível clicar no botão "Editar" para editar ou no botão "Excluir" para remover um registro.

<hr>

<strong>-----------UTILIZAÇÃO CLIENTE----------------</strong>

-Login Cliente: http://localhost:8080/loginClientes

Na home-page, no menu superior, clicando em "Logins" e após "Clientes", é possível ter acesso ao login do cliente ou seu cadastro em "Não tem usuário? Clique aqui para se cadastrar.  Clicar no link para se cadastrar.

-Cadastro Cliente: http://localhost:8080/clientes/cadastroClientes

Após preencher os dados de cadastro, clicar em salvar. O usuário será redirecionado a home-page para que possa realizar suas compras. Clicar no carrinho de compras para ir a página de vendas.

-Venda: http://localhost:8080/vendas/cadastroVendas

No cadastro da venda é possível selecionar o cliente e o livro que deseja comprar.

-Lista de Vendas: http://localhost:8080/vendas/listar

Listagem de todas as vendas realizadas aos clientes.
