# Soma Transposta
*Exercício do Prof. Monael P. Ribeiro, CMCC/UFABC.*

Em matemática, **matriz transposta** é a matriz obtida através da
troca de linhas por colunas de uma dada matriz. A matriz transposta
de uma matriz $A$ é representada por $A^T$.

Veja alguns exemplos:

$$\left[\begin{array}{cc}1 & 2\end{array}\right]^T = \left[\begin{array}{c}1\\2\end{array}\right]$$

$$\left[\begin{array}{cc}1 & 2\\3 & 4\end{array}\right]^T = \left[\begin{array}{cc}1 & 3\\2 & 4\end{array}\right]$$

Faça um programa que leia uma matriz quadrada de tamanho $N \times N$ 
e realize a soma desta matriz com sua transposta.

## Entrada

A entrada contem apenas um caso de teste.

A primeira linha há um inteiro $N$, $1 < N \leq 100$, representando
a dimensão das matrizes.

A seguir haverá $N$ linhas com $N$ inteiros em cada linha
separados por um espaço em branco cada, representando 
os elementos da matriz $A$.

## Saída

A saída consiste de $N$ linhas com $N$ inteiros em cada linha separados
por um espaço em branco cada, representando a adição da matriz $A$
pela matriz $A^T$. Após a última linha da matriz, quebre uma linha.

## Exemplos

Para a entrada

    3
    1 2 3
    4 5 6
    7 8 9

a saída deve ser

    2 6 10
    6 10 14
    10 14 18

Para a entrada

    2
    34 23
    56 98

a saída deve ser

    68 79
    79 196