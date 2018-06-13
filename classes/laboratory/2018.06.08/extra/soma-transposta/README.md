# Soma Transposta

Em matemática, **matriz transposta** é a matriz obtida através da
troca de linhas por colunas de uma dada matriz. A matriz transposta
de uma matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/> é representada por <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/99f7812af37ee7004df7177a1e821ec5.svg?invert_in_darkmode" align=middle width=21.862500000000004pt height=27.656969999999987pt/>.

Veja alguns exemplos:

<p align="center"><img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/c764688ca8000794d79688a9f589a558.svg?invert_in_darkmode" align=middle width=137.296335pt height=39.45249pt/></p>

<p align="center"><img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/efe947538344aab7a956ae30d6058ac4.svg?invert_in_darkmode" align=middle width=165.60719999999998pt height=43.251615pt/></p>

Faça um programa que leia uma matriz quadrada de tamanho <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/a964749a6b635295960fe89162eda4de.svg?invert_in_darkmode" align=middle width=50.091195pt height=22.46574pt/> 
e realize a soma desta matriz com sua transposta.

## Entrada

A entrada contem apenas um caso de teste.

A primeira linha há um inteiro <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode" align=middle width=14.999985000000004pt height=22.46574pt/>, <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/086ffa642ea3ceb92535d0d050e5b5cc.svg?invert_in_darkmode" align=middle width=91.712115pt height=22.46574pt/>, representando
a dimensão das matrizes.

A seguir haverá <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode" align=middle width=14.999985000000004pt height=22.46574pt/> linhas com <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode" align=middle width=14.999985000000004pt height=22.46574pt/> inteiros em cada linha
separados por um espaço em branco cada, representando 
os elementos da matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/>.

## Saída

A saída consiste de <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode" align=middle width=14.999985000000004pt height=22.46574pt/> linhas com <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/f9c4988898e7f532b9f826a75014ed3c.svg?invert_in_darkmode" align=middle width=14.999985000000004pt height=22.46574pt/> inteiros em cada linha separados
por um espaço em branco cada, representando a adição da matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/>
pela matriz <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/svgs/99f7812af37ee7004df7177a1e821ec5.svg?invert_in_darkmode" align=middle width=21.862500000000004pt height=27.656969999999987pt/>. Após a última linha da matriz, quebre uma linha.

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