# Contar
*Exercício do Prof. Monael P. Ribeiro, CMCC/UFABC.*

Dado um vetor `V` com `N` números inteiros, seu programa deve determinar
quantos elementos de `V` são maiores ou iguais a um determinado valor
`X`.

**Escreva um método recursivo para realizar a contagem.**

## Entrada

O programa terá apenas um caso de teste.

O caso de teste é composto por três linhas. A primeira linha contém um
número inteiro indicando o valor de `N`, ou seja, o número de elementos
do vetor. A segunda linha contém `N` números inteiros, indicando o valor
de cada um dos elementos do vetor . A terceira e última linha contém
somente um número inteiro, indicando o valor de `X`.

**Restrição:** 1 ≤ `N` ≤ 1000; -10<sup>6</sup> ≤ `Ai`, `X` ≤ 10<sup>6</sup>.

## Saída

Seu programa gera apenas uma linha de saída, contendo um único número
inteiro, que indica o número de elementos de `V` maiores ou iguais a `X`.

Não se esqueça de quebrar a linha após a saída.

## Exemplos

Para a entrada

    10
    1 2 3 4 5 6 7 8 9 10
    20

a saída deve ser

    0

Para a entrada

    1
    2
    3

a saída deve ser

    0

Para a entrada

    4
    1 4 6 4
    4

a saída deve ser

    3