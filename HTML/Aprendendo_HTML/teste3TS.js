function soma(param1, param2) {
    return param1 + param2;
}
var soma1 = soma(2, 3);
console.log(soma1);
function olaMundo() {
    console.log("Olá mundo!");
}
olaMundo();
var nome = "Wellington";
var sobrenome = "Wellington";
function mostraAtributosPessoa(pPessoa, pAtributo) {
    console.log("O atributo " + pAtributo + " tem o valor" + pPessoa[pAtributo]);
}
var vPessoa = {
    nome: "Wellz1n",
    idade: 23
};
mostraAtributosPessoa(vPessoa, "nome");
mostraAtributosPessoa(vPessoa, "idade");
