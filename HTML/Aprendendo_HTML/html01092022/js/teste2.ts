type CarroAno = number;
type CarroModelo = string;
type CarroCor = string;
type Carro = {
    ano: CarroAno,
    modelo: CarroModelo,
    cor: CarroCor
}

var carroAno: CarroAno = 2022;
var carroModelo: CarroModelo = "Diplomata";
var carroCor: CarroCor = "Bordô";
var carro: Carro = {
    ano: carroAno,
    modelo: carroModelo,
    cor: carroCor
};

interface Pessoa {
    nome: {
        primeiro: string,
        meio?: string,
        sobrenome: string
    },
    idade: number
}

interface Aluno extends Pessoa {
    curso: string
}

interface Professor extends Pessoa {
    departamento: string
}

var profe: Professor = {
    nome: {
        primeiro: "Marcos",
        sobrenome: "Cardoso"
    },
    idade: 49,
    departamento: "Computação",
}

var aluno: Aluno = {
    nome: {
        primeiro: "Tiago",
        sobrenome: "Melo"
    },
    idade: 15,
    curso: "Entra21"
}

function retornaAluno(pPessoa: Pessoa, pCurso: string): Aluno {
    var aluno: Aluno = { ...pPessoa, curso: pCurso };
    return aluno;
}

var pessoa: Pessoa = {
    nome: {
        primeiro: "Júlio",
        sobrenome: "Adão"
    },
    idade: 27
}

var aluno2: Aluno = retornaAluno(pessoa,'Entra21');
console.log(aluno2);