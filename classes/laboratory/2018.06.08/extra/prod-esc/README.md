# Produto Escalar

Em álgebra linear, o produto escalar de dois vetores <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/> e <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/61e84f854bc6258d4108d08d4c4a0852.svg?invert_in_darkmode" align=middle width=13.293555000000003pt height=22.46574pt/>
(denotado por <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/df38d07e48ba29024be60b4c169f6c8f.svg?invert_in_darkmode" align=middle width=37.49427000000001pt height=22.46574pt/>) é uma função que fornece um número real como
resultado. Matematicamente, o produto escalar é definido como uma função 
<img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/c8d2ed6a585f7e5341c49ead84e0d175.svg?invert_in_darkmode" align=middle width=101.383095pt height=22.46574pt/> da seguinte forma:

<p align="center"><img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/7562bb02ae1ce7d85deb5aecc68dca1a.svg?invert_in_darkmode" align=middle width=151.77574499999997pt height=44.897324999999995pt/></p>

Onde <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode" align=middle width=9.867000000000003pt height=14.155350000000013pt/> indica o número de elementos dos vetores <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/> e <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/61e84f854bc6258d4108d08d4c4a0852.svg?invert_in_darkmode" align=middle width=13.293555000000003pt height=22.46574pt/>.

Por exemplo, se <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/396ac751f9a8a1be2dde8cd699abcc69.svg?invert_in_darkmode" align=middle width=101.82645pt height=24.65759999999998pt/> e <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/316f065e13aabcf17b8c7f089f33ce1a.svg?invert_in_darkmode" align=middle width=102.79103999999998pt height=24.65759999999998pt/>, (ou seja,
<img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/d884595d37d0b1b135ceec467be5c324.svg?invert_in_darkmode" align=middle width=40.003755pt height=21.18732pt/>), temos que:

<p align="center"><img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/e6a63edafc9d665f6634ce7437ee51f9.svg?invert_in_darkmode" align=middle width=355.30109999999996pt height=16.438356pt/></p>

Neste problema você deverá fazer um programa para calcular o produto 
vetorial entre dois vetores de números inteiros. Assim, o resultado obtido
também será sempre um número inteiro.

## Entrada

O programa terá apenas um caso de teste.

O caso de teste é composto por três linhas. A primeira linha contém um 
número inteiro indicando o valor de <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode" align=middle width=9.867000000000003pt height=14.155350000000013pt/>, ou seja, o número de elementos dos
vetores <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/> e <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/61e84f854bc6258d4108d08d4c4a0852.svg?invert_in_darkmode" align=middle width=13.293555000000003pt height=22.46574pt/>. A segunda linha contém <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode" align=middle width=9.867000000000003pt height=14.155350000000013pt/> números inteiros, indicando o 
valor de cada um dos elementos do vetor <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/53d147e7f3fe6e47ee05b88b166bd3f6.svg?invert_in_darkmode" align=middle width=12.328800000000005pt height=22.46574pt/>. A terceira e última linha 
também contém <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode" align=middle width=9.867000000000003pt height=14.155350000000013pt/> números inteiros, dessa vez indicando cada um dos valores 
do vetor <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/61e84f854bc6258d4108d08d4c4a0852.svg?invert_in_darkmode" align=middle width=13.293555000000003pt height=22.46574pt/>.

**Restrições:** <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/1f6349a46f15350b761cd35931d5f729.svg?invert_in_darkmode" align=middle width=94.798275pt height=21.18732pt/>; <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/9d2eaa22fceb872e346323f942d255a7.svg?invert_in_darkmode" align=middle width=154.46442pt height=22.46574pt/>.

## Saída

Seu programa gera apenas uma linha de saída, contendo um valor inteiro, 
representando o valor do produto escalar <img src="https://rawgit.com/alessandrojean/POO-2018.2/master/classes/laboratory/2018.06.08/extra/prod-esc/svgs/df38d07e48ba29024be60b4c169f6c8f.svg?invert_in_darkmode" align=middle width=37.49427000000001pt height=22.46574pt/>.

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