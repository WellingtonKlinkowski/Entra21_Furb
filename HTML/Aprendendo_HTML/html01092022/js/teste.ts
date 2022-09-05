var nome:string = "Marcos";
nome = "5";

var idade:number = 49;

var coringa:any = "Marcos";
coringa = 49;

var varLimitada:string | number = "Marcos";
varLimitada = 49;

console.log(nome+idade);

var vetCidades = ["Blumenau", "Gaspar", "Timbó", 5];
vetCidades.push(1);
//vetCidades.push(true);

var vetStrings:string[] = [];
//vetStrings.push(6);

var infoPessoa: [string, number, boolean];
infoPessoa = ["Marcos", 49, false];
//infoPessoa = [49, false, "Marcos"];

const objPessoa: { nome: string, idade: number, endereco: { rua: string, numero: number, complemento: string, bairro: string} } = {
    nome: "Marcos R. Cardoso",
    idade: 49,
    endereco: {
        rua: "7 de setembro",
        numero: 456,
        complemento: "apto 111",
        bairro: "Centro"
    }
};

const objPessoa2: { nome: string, idade?: number, endereco: string} = { nome: "Marcos", endereco:"Rua 7 de setembro"};

