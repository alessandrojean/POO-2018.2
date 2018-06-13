# Senha Segura 5

Em um determinado sistema que estão construindo exigem que a senha tenha os 
seguintes critérios de segurança:

- A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula
  e um número;
- A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
- Além disso, a senha pode ter de 6 a 32 caracteres.

Faça um programa que valide se uma determinada sequencia alfanumérica 
pode ou não pode ser senha para esse sistema.

## Entrada

A entrada conta com vários casos de testes e termina com marcador de final 
de arquivo. Cada linha da entrada tem uma string `S`, correspondente a 
senha que é inserida pelo usuário no momento do cadastro. ( 0 < |`S`| ≤ 40).

## Saída

A saída consiste de várias linhas, uma linha para cada senha informada na 
entrada.

Em casa linha haverá uma frase, que pode ser `"Senha valida."`, caso a 
senha atenda todos os critérios de segurança ou `"Senha invalida."`, caso 
contrário. Observe que a frase começa com letra maiúscula e as demais são 
minúsculas, atente-se ao ponto final e que as palavras não possuel acento. 
Também não se esqueça de saltar uma linha a cada frase impressa,
inclusive a última.

## Exemplos

Para a entrada

    AgoraQuemDaBolaEhOSantos
    Porco9campeao
    V@1C0r1nth1@n5
    SPTRIMUNDIAL
    Welcome2MySite!
    123Mudar

a saída deve ser

    Senha invalida.
    Senha valida.
    Senha invalida.
    Senha invalida.
    Senha invalida.
    Senha valida.