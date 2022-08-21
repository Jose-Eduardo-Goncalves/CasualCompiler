Projeto TComp

José Eduardo Esperança Gonçalves
49457

Dependencias
============

Antes de correr o script casualc.sh é preciso compilar o programa java com as suas dependencias para isto é necessário correr os seguintes comandos na pasta do CasualCompiler:

`javac -cp lib/antlr-4.8-complete.jar src/casual/grammar/*.java -d bin/`

`javac -cp lib/antlr-4.8-complete.jar:bin/ src/casual/CasualListener.java -d bin/`

`javac -cp lib/antlr-4.8-complete.jar:bin/ src/casual/Main.java -d bin/`


Também é possivel que seja necessário recriar os ficheiro Casual*.java para isto é necessário correr o comando `java org.antlr.v4.Tool .\src\grammar\Cas.g4 -o .\src\cas\grammar\` ou o plugin de `antler` para o eclipse IDE

O script deve também ser corrido na pasta CasualCompiler para tomar efeito.

Report
======

Arrays
------
Arrays foram implementados na gramática de forma a aceitarem exclusivamente conjuntos de literais do mesmo tipo, com a possibilidade de serem vazios, o compilador no entanto verifica, durante a inicialzação de uma variável array, se o tipo da variável e do primeiro elemento do array são iguais, logo não permite arrays vazios.

Para implementar arrays foram utilizados os array de c++ `type*` sendo que Strings são `char*` e arrays de Strings são `char**`. De momento não são suportadas matrizes para os outros tipos.

Metodos Exteriores
------------------
São suportados três metodos exteriores `printLine`, `printInt` e `stringToInt`, os dois prints usão o printf da package stdio.h e o ultimo usa o atoi da package stdlib.h.

Main
----
Para ter acerteza da compatibilidade com o c++ é sempre adicionado um parametro do tipo int ao metodo main.

Termos protegidos
-----------------
Por razões cemelhantes há uma lista de termos protegidos que não podem se utilizados em ficheiros `.cas`.

Known Problems
==============
Devido á forma como a gramática está organizada literais float sem casas decimais são sempre reconhecidos como ints, isto causa exceções na execução do compilador mas não fazem com que o mesmo falhe.