import { Injectable } from '@angular/core';
import { Album } from '../models/album';

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  constructor() { }

  getAll(): Album[]{
    var vetAlbuns: Album[];
    fetch('https://jsonplaceholder.typicode.com/albums')
    .then((response) => response.json())
    .then((json) => vetAlbuns = json);
  return vetAlbuns!;
  }

  getByID(pId: number): Album{
    var album: Album;
    fetch(`https://jsonplaceholder.typicode.com/albums/${pId}`)
    .then((response) => response.json())
    .then((json) => album = json);
  return album!;
  }
  
}
