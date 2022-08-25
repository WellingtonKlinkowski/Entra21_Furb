class pessoa{
    constructor(pNome, pSobrenome, pDtNasc){
       this.nome = pNome;
       this.sobrenome = pSobrenome;
       this.nascimento = pDtNasc; 
    }

    getNome(){
        return this.nome;
    }

    getSobrenome(){
        return this.sobrenome;
    }

    getNascimento(){
        return this.nascimento;
    }

    nomeTodo(){
        let nomeTodo = this.nome + " " + this.sobrenome;
        return nomeTodo;
    }



}