# Atividade 4 - Viking Activities - Interfaces

## Melhore o seu projeto da Atividade 3 (Viking Activities), considerando o seguinte: ##

Utilize ConstraintLayout para todas as interfaces gráficas da aplicação.
Testar em diferentes tamanhos de tela para que sempre fique "agradável".
Produza uma versão alternativa em landscape (modo paisagem) para cada tela.
Traduza e adapte todas as strings visíveis ao usuário para português, espanhol e inglês.
O idioma padrão deve ser o inglês.
Procure uma logo da série em SVG (vetorial) e crie um novo ícone para a aplicação utilizando a mesma.
Dica: File | New | Vector Asset




### Atividade 3 - Viking Activities ###

Desenvolva um aplicativo para mostrar alguns personagens da série Vikings.

A aplicação deve iniciar mostrando uma tela (activity) com a logo da série e mais 6 botões, com o nome de cada um dos personagens da tabela abaixo. Ao tocar no botão, o usuário é levado para a tela do personagem selecionado. Dica: O botão também pode ser uma foto (ImageView).

Cada personagem deve possuir sua própria Activity (exemplo: RagnarActivity. Eu sei, eu sei: nada dinâmico.), que deve apresentar: seu nome, foto e um texto com uma breve descrição do personagem (ache na Wikipédia), além de botões com os nomes de seus "amigos favoritos", que, ao serem tocados, levam para as respectivas Activities.

A tela do personagem também deve mostrar em um TextView a seguinte mensagem: "Você chegou neste personagem através do personagem \[NOME]", indicando ao usuário que ele navegou de um personagem para outro. Esta informação deve ser enviada de uma Activity para outra.

A aplicação deve seguir funcionando (mostrando todas as informações corretamente) mesmo que o usuário rotacione o celular.

Para finds de Debug, mostre no LogCat cada vez que o usuário entrar ou sair de uma Activity, informando o nome do personagem.

| Foto        | Nome           | Amigos favoritos  |
|:------------------------:|:---------------:|:-------------------------------------------------------:|
| ![](images/ragnar.jpg)   | Ragnar Lothbrok | Lagertha <br> Bjorn <br> Ironside Floki                 |
| ![](images/lagertha.jpg) | Lagertha        | Bjorn Ironside <br> Ragnar Lothbrok                     |
| ![](images/rollo.jpg)    | Rollo           | Bjorn Ironside                                          |
| ![](images/floki.jpg)    | Floki           | Ragnar Lothbrok                                         |
| ![](images/athelstan.jpg)| Athelstan       | Ragnar Lothbrok <br> Bjorn Ironside                     |
| ![](images/bjorn.jpg)    | Bjorn Ironside  | Lagertha <br> Ragnar Lothbrok <br> Floki <br> Athelstan |

