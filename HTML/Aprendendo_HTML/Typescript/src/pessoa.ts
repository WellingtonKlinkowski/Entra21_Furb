interface Pessoa {
  nome: string;
  idade: number;
}

interface Aluno extends Pessoa {
  curso: string;
  sala: string;
}

export { Pessoa, Aluno };
