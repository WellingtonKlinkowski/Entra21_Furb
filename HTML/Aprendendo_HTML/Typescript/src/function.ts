function olaMundo(): void {
  console.log("Olá, mundo");
}

function soma(p1: number, p2: number): number {
  return p1 + p2;
}

function criarDupla<tipo1, tipo2>(
  primeira: tipo1,
  segunda: tipo2
): [tipo1, tipo2] {
  return [primeira, segunda];
}

interface Generica<tipo> {
  atributo: tipo;
}

export { olaMundo, soma, criarDupla, Generica };
