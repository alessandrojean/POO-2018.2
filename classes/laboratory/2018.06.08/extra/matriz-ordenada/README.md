# Matriz Ordenada (V2)

Faça um programa que, dada uma matriz `A` de dimensões
`N x N`, ordene de forma crescente as colunas da matriz.

**Não utilize `Arrays.sort();`**

## Entrada

A entrada contém apenas um caso de teste.

A primeira linha há um inteiro `N`, 1 < `N` ≤ 1000, representando
a dimensão da matriz.

A seguir haverão `N` linhas com `N` inteiros em cada linha separados
por um espaço em branco cada, representando os elementos da matriz
`A`.

## Saída

A saída consiste de `N` linhas com `N` inteiros em cada linha separados
por um espaço em branco cada, representando a matriz `A` após o processo
de ordenação de suas colunas. Após a última linha da matriz, quebre uma
linha.

## Exemplos

Para a entrada

    3
    1 2 11
    5 10 6
    7 8 9

a saída deve ser

    1 2 6
    5 8 9
    7 10 11

Para a entrada

    2
    34 23
    56 8

a saída deve ser

    34 8
    56 23