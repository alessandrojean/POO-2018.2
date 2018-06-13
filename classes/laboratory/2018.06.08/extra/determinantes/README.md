# Calculando Determinantes

## Enunciado

Sabe-se que o determinante de uma matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/6e7cf60cf2defe59ef3152ff933be82d.svg?invert_in_darkmode" align=middle width=57.63318pt height=22.46574pt/> (quadrada)
pode ser calculado a partir da seguinte fórmula recursiva:

Se <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/e1358fc9fbfa5b82243d29c7f4a7bbb2.svg?invert_in_darkmode" align=middle width=40.003755pt height=21.18732pt/>: <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/afeafd9ac561e09fb6bb5a66b159820f.svg?invert_in_darkmode" align=middle width=95.296905pt height=24.65759999999998pt/>

Se <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/64a72b8c9c5b8f75fec2f7108bae6bc2.svg?invert_in_darkmode" align=middle width=40.003755pt height=21.18732pt/>: <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/fb17de1d667a9cbf9fbfbfa49cec1006.svg?invert_in_darkmode" align=middle width=255.92110499999998pt height=27.159000000000013pt/>

em que <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/dc6b5ccf198047733af4dcc23076a544.svg?invert_in_darkmode" align=middle width=23.084325000000007pt height=22.46574pt/> representa o elemento da matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/> na posição 
<img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/77a3b857d53fb44e33b53e4c8b68351a.svg?invert_in_darkmode" align=middle width=5.663295000000005pt height=21.683310000000006pt/>, <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/36b5afebdba34564d884d347484ac0c7.svg?invert_in_darkmode" align=middle width=7.710483000000004pt height=21.683310000000006pt/> e <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/680d898aad9d599f4627030113b66734.svg?invert_in_darkmode" align=middle width=26.70294pt height=22.46574pt/> representa a submatriz de <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/>, de tamanho
<img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/9c778f6a8599441696582d80886ab776.svg?invert_in_darkmode" align=middle width=122.01667499999999pt height=24.65759999999998pt/>, construída a partir da remoção da
<img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/77a3b857d53fb44e33b53e4c8b68351a.svg?invert_in_darkmode" align=middle width=5.663295000000005pt height=21.683310000000006pt/>-ésima linha e da <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/36b5afebdba34564d884d347484ac0c7.svg?invert_in_darkmode" align=middle width=7.710483000000004pt height=21.683310000000006pt/>-ésima coluna da matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/>.

Por exemplo, se <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/> for dada por

<p align="center"><img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/7de56d011785733012d8e0dc38359680.svg?invert_in_darkmode" align=middle width=130.136985pt height=59.178735pt/></p>

temos que:

<p align="center"><img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/14023048a42c0a6bb2b8afba6c5721a2.svg?invert_in_darkmode" align=middle width=519.6345pt height=39.45249pt/></p>

Implemente uma função recursiva que calcula o determinante de uma matriz
<img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/3add1221abfa79cb14021bc2dacd5725.svg?invert_in_darkmode" align=middle width=39.82506pt height=19.178279999999994pt/> usando a expressão dada acima. A função deve receber
como argumento uma matriz quadrada de números reais e retornar um
número real (o determinante). O programa principal deve ler os
dados de entrada e imprimir o resultado desta função na tela.
A entrada é composta pelo número <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/determinantes/svgs/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode" align=middle width=9.867000000000003pt height=14.155350000000013pt/> na primeira linha, representando
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