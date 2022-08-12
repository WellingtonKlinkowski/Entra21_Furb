window.alert('Um alert em JS para ver se lembro ainda.');
console.log('Olá mundo em JS');
//document.write('Olá seus lindos...')

var x = 32;
console.log(x);
x = "Marcos";
console.log(x);
x = ["Marcos", 5, true];
console.log(x);
y = " Klinkowski";
console.log(x + y)
a = 6;
b = 7;
console.log(a + b);
z = "Wellington";
console.log(z + ' ' + y)

const nome = "Wellington Klinkowski";

c = a + b; //a -b; a * b; a / b; a % b;
a = a + b;//a += b;
if(a > b){
    console.log('A é maior que B');
}
else{
    console.log('B é maior que A');
}



var var1 = 10;
var var2 = "10";
if (var1 == var2){
    console.log('é igual')
}
else{
    console.log('strings diferentes')
}

str1 = "Wellington";
str2 = "WELLINGTON";
if(str1 == str2){
    console.log('iguais')
}
else{
    console.log('diferentes')
}

x = 5;
y = 3;
if(x != y) {
    console.log('váriaveis diferentes')
}

(x == y) ? console.log('váriaveis iguais') : console.log('váriaveis diferentes');

z = (x == y) ? x + y : x - y;
console.log(z);

a = "5";
b = "3";
console.log(Number(a) + Number(b));

a = 5;
b = 3;
console.log(String(a) + String(b));
console.log(a.toString() + b.toString());

string1 = "Blumenau";
for(i = 0; i < string1.length; i++){
    console.log(string1[i]);
}
for(j = string1.length; j > 0; j--){
    console.log(string1[j]);
}