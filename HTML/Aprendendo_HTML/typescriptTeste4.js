var nome1 = "Wellington";
var sobrenome = "Wellington";
function mostraAtributosPessoa(pPessoa, pAtributo) {
    console.log("O atributo " + pAtributo + " tem o valor " + pPessoa[pAtributo]);
    console.log("O atributo ".concat(pAtributo, " tem o valor ").concat(pPessoa[pAtributo]));
}
var xPessoas = {
    nome1: "Wellz1n",
    idade: 23
};
mostraAtributosPessoa(xPessoas, "nome1");
mostraAtributosPessoa(xPessoas, "idade");
//------------------------------------------------------------------------------------
function applyMixins(derivedCtor, constructors) {
    constructors.forEach(function (baseCtor) {
        Object.getOwnPropertyNames(baseCtor.prototype).forEach(function (name) {
            Object.defineProperty(derivedCtor.prototype, name, Object.getOwnPropertyDescriptor(baseCtor.prototype, name) ||
                Object.create(null));
        });
    });
}
var classe1 = /** @class */ (function () {
    function classe1() {
    }
    classe1.prototype.metodo1 = function () {
        console.log('Sou o metodo1 da Classe1');
    };
    return classe1;
}());
var classe2 = /** @class */ (function () {
    function classe2() {
    }
    classe2.prototype.metodo2 = function () {
        console.log('Sou o metodo2 da Classe2');
    };
    return classe2;
}());
var Classe3 = /** @class */ (function () {
    function Classe3() {
    }
    return Classe3;
}());
;
;
applyMixins(Classe3, [classe1, classe2]);
var vClasse3 = new Classe3;
vClasse3.metodo1();
vClasse3.metodo2();
