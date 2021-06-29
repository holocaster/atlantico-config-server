# Config Server

* Config server tem profiles de dev e prod para os dois projetos criados.
* Foi usado classpath das configurações dos arquivos dentro do próprio projeto para não precisar criar 
um repositório git e apontar sua URI.
  * Caso tivesse criado, seria necessário colocar o chipher em dev para não mostrar as senhas já que o
    perfil de prod, os valores vem através de variáveis de ambiente.
