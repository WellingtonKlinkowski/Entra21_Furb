var nome:String = "Wellz1n";
nome = "5";

var idade = 49;

var aleatoria:any = "Wellz1n";

var varDoubleType:String | number = "Wellz1n";
varDoubleType = 49;

var vetorCidades = ["Blumenau", "Itapema", 5, true];
console.log(vetorCidades);

var vetorString:string[] = ["W", "E", "L", "L","Z", "1", "N"];
console.log(vetorString.push("7"));
console.log(vetorString);

var informacoesPessoas:[String | number | boolean, String | number | boolean, String | number | boolean];
informacoesPessoas = ["Wellz1n", 49, false];
informacoesPessoas = [49, false, "Wellz1n"];

console.log(informacoesPessoas);

const objPessoa: {nome: string, idade: number, endereco:{ rua: string, numero: number, complemento: string, bairro: string}} = {
    nome: "Wellington Klinkowski",
    idade: 23,
    endereco: {
        rua: "Professor Jacob Ineichen",
        numero: 3082,
        complemento: "Depois da Franz Volles",
        bairro: "Itoupavazinha"
    }
};

console.log(objPessoa);

const objPessoa2: {nome: string, idade?: number, endereco: string} = {
    nome: "Welitu",
    endereco:"Rua XV de Novembro"
};

console.log(objPessoa2);

