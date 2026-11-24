# Diagrama de casos de usos
Aluno: Daniel de Alcântara Araújo

AT-11-17: Básico de UML com PlantUML

## UML:
```
@startuml
left to right direction

actor Coletor
actor Analista
rectangle "Gerenciamento de Amostras de Plantas" {
  usecase "Coleta e Envio de amostras" as UC1



Coletor --> UC1

  usecase "Receber amostras" as UC2
  usecase "Registrar processamento" as UC3
  usecase "Registrar extração" as UC4
  usecase "Registrar determinação" as UC5
  usecase "Visualizar relatórios" as UC6
  usecase "Registrar descarte" as UC7


Analista --> UC2
Analista --> UC3
Analista --> UC4
Analista --> UC5
Analista --> UC6
Analista --> UC7
}


@enduml
```
<img width="543" height="698" alt="image" src="https://github.com/user-attachments/assets/a5fc69ce-ca43-4125-9c7c-a237fdd68c8c" />

O diagrama de casos de uso apresentado na figura representa as principais funcionalidades do sistema de Gerenciamento de Amostras de Plantas e a forma como os usuários interagem com elas. O retângulo central delimita a fronteira do sistema, e os atores aparecem do lado de fora, ligados por associações aos casos de uso que utilizam.

O modelo possui dois atores. O Coletor é o responsável por obter as amostras em campo e encaminhá-las ao laboratório. O Analista atua no laboratório e conduz as etapas de recebimento, tratamento e análise do material, além do acompanhamento por meio de relatórios.
