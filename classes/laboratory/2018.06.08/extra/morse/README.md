# Código Morse

Código Morse é um sistema de representação de letras, números e sinais de 
pontuação através de um sinal codificado enviado intermitentemente. Foi 
desenvolvido por Samuel Morse em 1835, criador do telégrafo elétrico.

Este sistema representa letras e números apenas com uma sequência de pontos,
traços, e espaços, conforme a tabela a seguir:

| Letra | Código Morse | Letra | Código Morse |
| :---: | ------------ | :---: | ------------ |
| a     | `.-`         | n     | `-.`         |
| b     | `-...`       | o     | `---`        |
| c     | `-.-.`       | p     | `.--.`       |
| d     | `-..`        | q     | `--.-`       |
| e     | `.`          | r     | `.-.`        |
| f     | `..-.`       | s     | `...`        |
| g     | `--.`        | t     | `-`          |
| h     | `....`       | u     | `..-`        |
| i     | `..`         | v     | `...-`       |
| j     | `.---`       | w     | `.--`        |
| k     | `-.-`        | x     | `-..-`       |
| l     | `.-..`       | y     | `-.--`       |
| m     | `--`         | z     | `--..`       |
| 1     | `.----`      | 6     | `-....`      |
| 2     | `..---`      | 7     | `--...`      |
| 3     | `...--`      | 8     | `---..`      |
| 4     | `....-`      | 9     | `----.`      |
| 5     | `.....`      | 0     | `-----`      |

Em código Morse, cada letra será representada por uma sequencia de pontos 
(`.`) e traços (`-`) e o espaço em branco define a separação de letras. 
Por exemplo, para a palavra MORSE o código Morse equivalente seria:

| M    | O     | R     | S     | E   |
| :--: | :---: | :---: | :---: | :-: |
| `--` | `---` | `.-.` | `...` | `.` |

Faça um programa que receba várias palavras e as codifique de acordo com
o código morse.

## Entrada

A entrada consiste de vários casos de testes.

Na primeira linha da entrada haverá um número inteiro `N`, 0 < `N` ≤ 1000000,
representando a quantidade de palavras.

A seguir haverá `N` linhas, em cada linha haverá uma palavra com no máximo 
100 caracteres.

Todos os caracteres serão letras maiúsculas ou minúsculas ou números.

## Saída

A saída consiste de `N` linhas, em cada linha você deve imprimir a palavra 
informada na entrada códificada em código morse. Lembre-se que entre cada 
caractere deve existir um espaço. Após a impressão da última palavra 
codificada quebre uma linha.

## Exemplos

Para a entrada

    7
    Morse
    algoritmos
    canela
    PARALELEPIPEDO
    MORSE
    31415
    07821

a saída deve ser

    -- --- .-. ... .
    .- .-.. --. --- .-. .. - -- --- ...
    -.-. .- -. . .-.. .-
    .--. .- .-. .- .-.. . .-.. . .--. .. .--. . -.. ---
    -- --- .-. ... .
    ...-- .---- ....- .---- .....
    ----- --... ---.. ..--- .----