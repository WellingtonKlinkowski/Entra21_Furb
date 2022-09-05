var nome1: string = "Wellington";
var sobrenome: typeof nome1 = "Wellington";

interface Pessoas{
    nome1: string,
    idade: number
}

function mostraAtributosPessoa(pPessoa: Pessoas, pAtributo: keyof Pessoas){
    console.log("O atributo " + pAtributo + " tem o valor " + pPessoa[pAtributo]);
    console.log(`O atributo ${pAtributo} tem o valor ${pPessoa[pAtributo]}`);
}

var xPessoas : Pessoas = {
    nome1: "Wellz1n",
    idade: 23
}

mostraAtributosPessoa(xPessoas, "nome1");
mostraAtributosPessoa(xPessoas, "idade");

//------------------------------------------------------------------------------------

function applyMixins(derivedCtor: any, constructors: any[]) {
    constructors.forEach((baseCtor) => {
      Object.getOwnPropertyNames(baseCtor.prototype).forEach((name) => {
        Object.defineProperty(
          derivedCtor.prototype,
          name,
          Object.getOwnPropertyDescriptor(baseCtor.prototype, name) ||
            Object.create(null)
        );
      });
    });
}

class classe1 {
    metodo1(){
        console.log('Sou o metodo1 da Classe1');
    }
}

class classe2 {
    metodo2(){
        console.log('Sou o metodo2 da Classe2');
    }
}

class Classe3 {};

interface Classe3 extends classe1, classe2 {};
applyMixins(Classe3,[classe1, classe2]);

var vClasse3 = new Classe3;
vClasse3.metodo1();
vClasse3.metodo2();