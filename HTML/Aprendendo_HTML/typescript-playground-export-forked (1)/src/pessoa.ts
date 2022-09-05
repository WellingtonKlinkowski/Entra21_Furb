interface Pessoa {
  nome: string;
  idade: number;
}

interface Aluno extends Pessoa {
  curso: string;
}

interface Generica<tipo> {
  atributo: tipo;
}

export { Pessoa, Aluno, Generica };
