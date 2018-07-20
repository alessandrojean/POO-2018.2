# Produto Escalar
*Exercício do Prof. Monael P. Ribeiro, CMCC/UFABC.*

Em álgebra linear, o produto escalar de dois vetores $A$ e $B$
(denotado por $A \cdot B$) é uma função que fornece um número real como
resultado. Matematicamente, o produto escalar é definido como uma função 
$R^n \times R^n \rightarrow R$ da seguinte forma:

$$A \cdot B = \sum_{i = 1}^{n}(A_i \times B_i)$$

Onde $n$ indica o número de elementos dos vetores $A$ e $B$.

Por exemplo, se $A = (1, 2, 3, 4)$ e $B = (5, 6, 7, 8)$, (ou seja,
$n = 4$), temos que:

$$A \cdot B = (1 \times 5) + (2 \times 6) + (3 \times 7) + (4 \times 8) = 70$$

Neste problema você deverá fazer um programa para calcular o produto 
vetorial entre dois vetores de números inteiros. Assim, o resultado obtido
também será sempre um número inteiro.

## Entrada

O programa terá apenas um caso de teste.

O caso de teste é composto por três linhas. A primeira linha contém um 
número inteiro indicando o valor de $n$, ou seja, o número de elementos dos
vetores $A$ e $B$. A segunda linha contém $n$ números inteiros, indicando o 
valor de cada um dos elementos do vetor $A$. A terceira e última linha 
também contém $n$ números inteiros, dessa vez indicando cada um dos valores 
do vetor $B$.

**Restrições:** $1 \leq n \leq 1000$; $-100 \leq A_i,\ B_i \leq 100$.

## Saída

Seu programa gera apenas uma linha de saída, contendo um valor inteiro, 
representando o valor do produto escalar $A \cdot B$.

Não se esqueça de terminar a linha após a impressão da resposta.

## Exemplos

Para as entradas

    4
    1 2 3 4
    5 6 7 8

a saída deve ser

    70

Para as entradas

    3
    1 3 -5
    4 -2 1

a saída deve ser

    -7

Para as entradas

    9
    0 1 2 3 4 5 6 7 8
    0 1 2 3 4 5 6 7 8

a saída deve ser

    204