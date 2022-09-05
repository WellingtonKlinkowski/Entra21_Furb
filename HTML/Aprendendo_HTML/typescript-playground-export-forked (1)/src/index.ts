//import { Pessoa, Aluno } from "./pessoa";
import { Generica } from "./pessoa";
import { Pessoa } from "./classPessoa";
import { olaMundo, soma, criaDupla } from "./functions";

// Welcome to the TypeScript Playground, this is a website
// which gives you a chance to write, share and learn TypeScript.

// You could think of it in three ways:
//
//  - A location to learn TypeScript where nothing can break
//  - A place to experiment with TypeScript syntax, and share the URLs with others
//  - A sandbox to experiment with different compiler features of TypeScript

const anExampleVariable = "Hello World";
console.log(anExampleVariable);
/*var vPessoa: Pessoa = {
  nome: "Marcos",
  idade: 49
};
var vAluno: Aluno = { ...vPessoa, curso: "Entra21" };
console.log(vPessoa);*/
/*var vAluno: Aluno = {
  nome: "Marcos",
  idade: 49,
  curso: "Entra21"
};
console.log(vAluno);*/
var vPessoa: Pessoa = new Pessoa("Marcos", 49);
console.log(vPessoa);
console.log(vPessoa.getNome());
olaMundo();
console.log(soma(3, 1));

var numero: unknown = 100;
var tamanho: number = (numero as string).length;
console.log(tamanho);
console.log((<string>numero).length);

console.log(criaDupla<string, number>("Marcos", 49));
console.log(criaDupla<boolean, string>(false, "Blumenau"));
console.log(criaDupla<Pessoa, string>(vPessoa, "Blumenau"));

var vGenerica: Generica<boolean> = {
  atributo: false
};
console.log(vGenerica.atributo);
// To learn more about the language, click above in "Examples" or "What's New".
// Otherwise, get started by removing these comments and the world is your playground.
