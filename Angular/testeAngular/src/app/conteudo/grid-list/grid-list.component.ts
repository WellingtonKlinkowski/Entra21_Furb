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
    fetch('https://jsonplaceholder.typicode.com/posts/1')
      .then((response) => {console.log(response); response.json()})
      .then((json) => console.log(json));
  }

  buscarAlbum(): void{
    fetch(`https://jsonplaceholder.typicode.com/albums/${this.buscaAlbum}`)
      .then((response) => response.json())
      .then((json) => this.album = json);
  }

}


