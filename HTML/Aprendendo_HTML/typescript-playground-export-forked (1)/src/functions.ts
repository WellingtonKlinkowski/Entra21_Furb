function olaMundo(): void {
  console.log("Olá, mundo!");
}

function soma(p1: number, p2: number): number {
  return p1 + p2;
}

function criaDupla<tipo1, tipo2>(p1: tipo1, p2: tipo2): [tipo1, tipo2] {
  return [p1, p2];
}

export { olaMundo, soma, criaDupla };
