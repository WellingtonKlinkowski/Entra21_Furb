
let contador = 1;
function novaTable(){
    const novaLinha = document.createElement( "tr");
    novaLinha.id = "tomba" + contador;
    novasLinha();
    document.getElementById("tabela").appendChild(novaLinha);
    contador++;
}

function novasLinha(){
    const letras = document.createElement("td");
    letras.innerHTML = entrada;
    var palavra = letras;
    for(let i = 0; i <= 4; i++){
        palavra.innerHTML = palavra[i];
        document.getElementById("tomba" + contador).appendChild("letras");
    }
}