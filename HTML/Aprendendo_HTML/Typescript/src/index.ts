import { Pessoa, Aluno } from "./pessoa";

const anExampleVariable = "Hello World";
console.log(anExampleVariable);
var vPessoa: Pessoa = {
  nome: "Wellington Klinkowski",
  idade: 23
};

var vAluno: Aluno = { ...vPessoa, curso: "BCC", sala: "BA120" };

console.log(vPessoa);
console.log(vAluno);

import { Pessoas } from "./classPessoa";
import { criarDupla, olaMundo, soma, Generica } from "./function";

var vPessoas: Pessoas = new Pessoas("Wellz1n", 23);
console.log(vPessoas);
console.log(vPessoas.nome);

console.log(olaMundo());
console.log(soma(3, 1));

var numero: number = 100;
//var tamanho: number = ((numero as unknown) as string).length;
//console.log(tamanho);
//console.log((<string>numero.length);

console.log(criarDupla<string, number>("Bonoros", 17));
console.log(criarDupla<boolean, string>(true, "love"));
console.log(criarDupla<Pessoas, number>(vPessoas, 23));

var vGenerica: Generica<string> = {
  atributo: "Wellz1n"
};

console.log(vGenerica.atributo);
