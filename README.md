# A final o que é JSMutable
JSMutable - Java Simple Mutable
É uma biblioteca para a serialização de objetos em Java criada por Diego Geronimo D Onofre com licença MIT
que utiliza programação reflexiva nos principais métodos de serialização e validação da estruturação das classe que
herdam jsm.Mutable. Para quem está querendo saber como um objeto pode ser serializado utilizando o framework Java de 
programação reflexiva este projeto é sua solução. Se você está querendo usar uma forma alternativa para serializar objetos
a JSMutable pode ser sua opção, entretanto leve em consideração que na versão 1.0 esta biblioteca suporta somente serializar
objetos que possuem campos de valores primitivos como byte, short, int, long, float, double, boolean, char objeto String,
vetor de tipos primitivos e vetor de String. Se quiser aprimorar a biblioteca para que a mesma suporte praticamente qualquer
tipo de objeto no processo de serialização, então fique a vontade. Recomendo que deixe os métodos de serialização recursivos
para que seja possível obter todos os valores da cadeia de campos dos objetos, mas ainda sim deixo um aviso importante para quem
está querendo aprimorar a biblioteca: Não é qual quer objeto que pode ser serializado, principalmente aqueles objetos que
dependem de algum contexto, como um arquivo, banco de dados, uma Thread, uma conexão TCP, entre outros. Por isso digo que para
várias ocasiões a biblioteca será suficiente em outros não. Apesar de estar na versão 1.0 a biblioteca está bem estável já
que foi utilizada em uma aplicação complexa que possui várias Threads e até então nenhum erro ocorreu. 

# Como usar JSMutable
Abaixo estou descrevendo como usar JSMutable
1 - Baixe o projeto em seu computador

2 - Abra o mesmo no Netbeans ou adapte para sua IDE
3 - Leia a documentação que se encontra no arquivo jsm.Mutable.java
4 - Leia a documentação que se encontra no arquivo ComoUsar.java
5 - Execute o comando "Limpar e construir"
6 - Execute o projeto
7 - Respeitando as regras do MIT, use o projeto para sua necessidade

#Obs:
Se pretendo somente usar o jar, recomendo que leia a documentação
que está nos códigos fontes jsm.Mutable.java e application.ComoUsar.java
