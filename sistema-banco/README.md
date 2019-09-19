# sistema-banco
Implementação de classes abstratas e interface, desenvolvendo um sistema bancário. 

# What is it?
### O sistema consiste na criação das seguintes etapas abaixo:

### 1. 
Crie uma classe abstrata Conta Bancaria que contém como atributos o numero daconta e o saldo, e como métodos abstratos sacar e depositar que recebem umparâmetro do tipo double.

### 2. 
Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria. A primeira possui um atributo taxaDeOperação que é descontado sempre que um saque e um depósito são feitos. A segunda possui um atributo limite que dá credito a mais para o correntista caso ele precise sacar mais que o saldo. Neste caso, o saldo pode ficar negativo desde que não ultrapasse o limite. Contudo isso não pode acontecer na classe Conta Corrente.

### 3. 
Crie uma interface Imprimível que declara um método mostrarDados.

### 4. 
Faça as classes Conta Corrente e Conta Poupança implementarem a interface e na implementação do método mostre os atributos de cada conta.

### 5. 
Crie uma classe Relatório que possui um método gerarRelatório que receba um objeto imprimível e executa o método mostrarDados do objeto.

### 6. 
Crie uma classe executável na qual você instancia duas contas (uma de cada tipo), credita algum valor para elas e efetua um saque (obs: no objeto conta poupança, faça um saque maior que o saldo atual). Crie um objeto relatório e execute o método gerar relatório para cada conta criada.

### 7.
Incremente a classe Conta Bancaria com o método transferir que recebe o parâmetro o valor (double) e um objeto conta bancaria e transfere o valor desejado da conta atual para cada conta informada. Use os métodos sacar e depositar para isso.

### 8.
Crie uma classe Banco que possui um arraylist de contas bancárias e implemente os métodos inserir, remover e procurarConta. O primeiro e o segundo recebem um objeto conta (que pode ser corrente ou poupança) e o insere e remove no arraylist, respectivamente. O terceiro recebe um inteiro como parâmetro representando o número da conta e retorna um objeto conta bancária, caso essa conta exista no arraylist, ou null, caso contrário.

### 9. 
Faça a classe banco implementar a interface imprimível, onde a implementação de método consiste em executar método mostrar dados de cada conta.
