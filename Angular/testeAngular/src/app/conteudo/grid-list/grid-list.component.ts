import { Component, OnInit } from '@angular/core';

export interface Album{
  userId: number;
  id: number,
  title: string
}

@Component({
  selector: 'app-grid-list',
  templateUrl: './grid-list.component.html',
  styleUrls: ['./grid-list.component.css']
})

export class GridListComponent implements OnInit {
vetAlbum: Album [] = []
contador: number = 1;
opcao: number = 0;
buscaAlbum: number = 0;
album: Album = {
  userId: 0,
  id:0,
  title: ""
}
  constructor() { }

  ngOnInit(): void {
    fetch('https://jsonplaceholder.typicode.com/albums')
      .then((response) => response.json())
      .then((json) => this.vetAlbum = json);

    /*fetch('https://jsonplaceholder.typicode.com/posts', {
      method: 'POST',
      body: JSON.stringify({
        title: 'foo',
        body: 'bar',
        userId: 1,
      }),
      headers: {
        'Content-type': 'application/json; charset=UTF-8',
      },
    })
      .then((response) => response.json())
      .then((json) => console.log(json));

      fetch('https://jsonplaceholder.typicode.com/posts/1', {
        method: 'PUT',
        body: JSON.stringify({
          id: 1,
          title: 'foo',
          body: 'bar',
          userId: 1,
      }),
      headers: {
        'Content-type': 'application/json; charset=UTF-8',
      },
    })
      .then((response) => response.json())
      .then((json) => console.log(json));


      fetch('https://jsonplaceholder.typicode.com/albums/1', {
        method: 'DELETE',
      });

      fetch('https://api.onlinewebtutorblog.com/employees/1', {
        method: 'DELETE',
      })
      .then((response) => response.json())
      .then((json) => console.log(json));*/


      
  }

  excluir(): void{
    fetch(`https://jsonplaceholder.typicode.com/albums/${this.album}`, {
  method: 'DELETE',
  
})
.then((response) => response.json())
.then((json) => window.alert("Excluído"));


  }
  

  buscarAlbum(): void{
    fetch(`https://jsonplaceholder.typicode.com/albums22/${this.buscaAlbum}`)
      .then((response) => response.json())
      .then((json) => this.album = json);
  }
}


