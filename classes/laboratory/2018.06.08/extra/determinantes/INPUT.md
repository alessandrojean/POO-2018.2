# Calculando Determinantes

## Enunciado

Sabe-se que o determinante de uma matriz $A\ n \times n$ (quadrada)
pode ser calculado a partir da seguinte fórmula recursiva:

Se $n = 1$: $\det(A) = A_{11}$

Se $n > 1$: $\det(A) = \sum_{i = 1}^{n}(-1)^{i + 1}A_{1i}\det(M_{1i})$

em que $A_{ij}$ representa o elemento da matriz $A$ na posição 
$i$, $j$ e $M_{ij}$ representa a submatriz de $A$, de tamanho
$(n - 1) \times (n - 1)$, construída a partir da remoção da
$i$-ésima linha e da $j$-ésima coluna da matriz $A$.

Por exemplo, se $A$ for dada por

$$A = \left[\begin{array}{ccc}1 & 2 & 3\\4 & 5 & 6\\7 & 8 & 9\end{array}\right]$$

temos que:

$$\det(A) = 1 \cdot \det\left(\left[\begin{array}{cc}5 & 6\\8 & 9\end{array}\right]\right) - 2 \cdot \det\left(\left[\begin{array}{cc}4 & 6\\7 & 9\end{array}\right]\right) + 3 \cdot \det\left(\left[\begin{array}{cc}4 & 5\\7 & 8\end{array}\right]\right)$$

Implemente uma função recursiva que calcula o determinante de uma matriz
$n \times n$ usando a expressão dada acima. A função deve receber
como argumento uma matriz quadrada de números reais e retornar um
número real (o determinante). O programa principal deve ler os
dados de entrada e imprimir o resultado desta função na tela.
A entrada é composta pelo número $n$ na primeira linha, representando
o tamanho da matriz, seguido pelos elementos da matriz nas linhas
seguintes.

## Exemplos

Para a entrada

    3
    1 2 3
    2 5 6
    0 1 2

a saída deve ser

    2

Para a entrada

    4
    1 2 3 1
    2 5 6 0
    0 1 2 9
    1 2 0 8

a saída deve ser

    47