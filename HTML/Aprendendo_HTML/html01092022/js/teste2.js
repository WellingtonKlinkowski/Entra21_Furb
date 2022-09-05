"use strict";
var carroAno = 2022;
var carroModelo = "Diplomata";
var carroCor = "Bordô";
var carro = {
    ano: carroAno,
    modelo: carroModelo,
    cor: carroCor
};
var profe = {
    nome: {
        primeiro: "Marcos",
        sobrenome: "Cardoso"
    },
    idade: 49,
    departamento: "Computação",
};
var aluno = {
    nome: {
        primeiro: "Tiago",
        sobrenome: "Melo"
    },
    idade: 15,
    curso: "Entra21"
};
function retornaAluno(pPessoa, pCurso) {
    var aluno = Object.assign(Object.assign({}, pPessoa), { curso: pCurso });
    return aluno;
}
var pessoa = {
    nome: {
        primeiro: "Júlio",
        sobrenome: "Adão"
    },
    idade: 27
};
var aluno2 = retornaAluno(pessoa, 'Entra21');
console.log(aluno2);
