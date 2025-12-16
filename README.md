v2.0 - Evolução do Projeto.

Descrição Geral

Este repositório contém a evolução do projeto "Mini Guia - Guatapará".

A **Versão 1.0** (entrega original) consistia em um guia de bolso estático com dados fixos no código.

A **Versão 2.0** (entrega atual) atende a novas demandas, focando em **performance, persistência de dados e interatividade**. O aplicativo foi completamente refatorado para se tornar uma plataforma dinâmica, onde os próprios usuários podem contribuir cadastrando novos estabelecimentos.


 Funcionalidades da Versão 2.0 (Entrega Atual)

*   **Banco de Dados Local com Room:** Todos os serviços agora são salvos em um banco de dados `SQLite` gerenciado pela biblioteca Room. Os dados persistem mesmo se o aplicativo for fechado.
*   **Lista Performática com RecyclerView:** A `ListView` original foi substituída por uma `RecyclerView` com `ListAdapter`, garantindo uma rolagem suave e um desempenho muito superior.
*   **Funcionalidade de Cadastro Completa:**
    *   Uma nova tela de cadastro permite que o usuário adicione novos estabelecimentos.
    *   O usuário pode **selecionar uma imagem da galeria** do celular para o novo serviço, utilizando o `ActivityResultLauncher`.
*   **Busca em Tempo Real:** Uma barra de busca na tela principal filtra a lista de serviços por nome, com os resultados sendo atualizados instantaneamente a partir do banco de dados.
*   **Pré-população de Dados:** Na primeira vez que o aplicativo é iniciado, o banco de dados é automaticamente populado com 6 serviços iniciais para que o usuário já tenha conteúdo para interagir.
*   **Estrutura de Código Profissional:** O projeto foi reorganizado em pacotes (`data`, `ui`, `model`, etc.) e todos os layouts foram refatorados para usar `ConstraintLayout`, seguindo as melhores práticas do Android.


**prints da parte de cadastrar novos estabelecimentos diretamente pelo app**
OBS: sei que era pra ser um video rápido de até 30 segundos igual da parte 1, mas assim q eu começo a gravar o emulador do meu app trava no meu notebook.
<img width="1080" height="2400" alt="Screenshot_20251215_190208" src="https://github.com/user-attachments/assets/9a6e5ac5-b12e-410f-83b2-302040291374" />
<img width="1080" height="2400" alt="Screenshot_20251215_164546" src="https://github.com/user-attachments/assets/f720c3df-2440-4daf-ae57-b19dc594bbdf" />




 **Vídeo rápido de Demonstração (v1.0)**
    > OBS: Sei que o video era pra ter apenas 30 segundos, mas como meu pc é lento demorou um pouco mais para mostrar o funcionamento geral do app. 
    https://youtube.com/shorts/zRLq5sCJkOA?feature=share


*   **Modo Claro vs. Modo Escuro**

| Modo Claro (Light) | Modo Escuro (Dark) |

| <img width="450" alt="claro" src="https://github.com/user-attachments/assets/a323fc4b-96ac-48f8-8717-e3c0200c5b9e" /> | <img width:="450" alt="escuro" src="https://github.com/user-attachments/assets/d7b09c47-bf5d-4af6-bf02-612aa46fccf5" /> |

*   **Idioma: Português vs. Inglês**

| Português | Inglês |

| <img width="450" alt="pt" src="https://github.com/user-attachments/assets/b1d542e2-a988-4c3d-a5d5-c0d8d31767ac" /> | <img width="450" alt="en" src="https://github.com/user-attachments/assets/c75b0c26-0597-4484-b412-cb2ebfb9d6b4" /> |

*   **Vídeo de Demonstração (v1.0)**
    https://youtube.com/shorts/zRLq5sCJkOA?feature=share
