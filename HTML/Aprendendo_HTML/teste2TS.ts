type CarroAno = number;
type CarroModelo = string;
type CarroCor = string;
type Car = {
    ano: CarroAno,
    modelo: CarroModelo,
    cor: CarroCor
}

var carroAno: CarroAno = 2022;
var carroModelo: CarroModelo = "Diplomata";
var carroCor: CarroCor = "Bordô";

var carro: Car = {
    ano: carroAno,
    modelo: carroModelo,
    cor: carroCor
}

console.log(carro);

interface Pessoa{
    nome:{
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
    nome:{
        primeiro: "Wellington",
        sobrenome: "Klinkowski",
    },
    idade: 23,
    departamento: "Computação",
}

console.log(profe);

var aluno: Aluno = {
    nome:{
        primeiro: "Wellington",
        sobrenome: "Klinkowski",
    },
    idade: 23,
    curso: "Entra21"
}

console.log(aluno);