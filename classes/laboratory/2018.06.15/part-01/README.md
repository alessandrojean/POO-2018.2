# Classes, objetos, mensagens, UML (prática)

## Exercício 01

- Crie o pacote universidade
- Crie a classe `Pessoa` com atributos `String nome` e
  `String cpf` (no pacote)
- Crie os métodos que devolvam o `nome` e o `cpf`
- Crie a classe `Principal` (pacote `default`) que:
  - Instancie duas pessoas
  - Imprima o nome das duas pessoas
- Execute o programa
- (Extra 1) faça o diagrama de classes (UML) desse
  programa
- (Extra 2) faça o mesmo exercício, mas com a
  classe `Principal` no pacote `programa`

## Exercício 02

- Criar o pacote pctbanco
- Criar uma classe `Conta` dentro do pacote `pctbanco`
- Atributos `id` e `saldo` com métodos get e set.
- Criar método `imprimirSaldo`, que imprime o `id`
  e o `saldo` da conta.
- Criar a classe `Principal` (instanciando 3 contas)
- Instanciar duas contas
- Modificar os atributos das contas
- Fazer a chamada de `imprimirSaldo`
- Executar o programa

## Exercício 03

- Continuando o exercício anterior, crie uma classe
  `Banco` dentro do `pctbanco`, que contém um vetor de 10
  objetos da classe `Conta` com os seguintes métodos:
  - `abrirConta`: recebe como argumento o depósito inicial e
    retorna o `id` da nova conta. (Esse `id` pode iniciar com 1 
    e ir aumentando a medida que novas contas são criadas).
  - `transacao`: recebe o `id` da conta e um valor como argumento.
    Um valor negativo representa saque. O método deve imprimir
    um erro caso a conta fique negativa.
  - `saldo`: recebe como argumento o `id` da conta e imprime o
    saldo atual.
- Altere a definição da classe `Conta` para que não seja acessível
  fora do pacote. Na classe `Principal`, instancie um banco, 
  crie contas e faça transações. Ao final imprima o saldo das contas.