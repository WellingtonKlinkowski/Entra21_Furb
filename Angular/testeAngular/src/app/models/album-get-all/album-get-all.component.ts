import { Component, OnInit } from '@angular/core';
import { Album } from 'src/app/models/album';
import { AlbumService } from 'src/app/services/album.service';

@Component({
  selector: 'app-album-get-all',
  templateUrl: './album-get-all.component.html',
  styleUrls: ['./album-get-all.component.css']
})
export class AlbumGetAllComponent implements OnInit {
vetalbum : Album [] = [];
  constructor(private service : AlbumService) { }

  ngOnInit(): void {
    this.vetalbum = this.service.getAll();
  }

}
