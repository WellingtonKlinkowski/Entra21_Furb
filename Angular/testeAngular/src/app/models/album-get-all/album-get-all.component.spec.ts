import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlbumGetAllComponent } from './album-get-all.component';

describe('AlbumGetAllComponent', () => {
  let component: AlbumGetAllComponent;
  let fixture: ComponentFixture<AlbumGetAllComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AlbumGetAllComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlbumGetAllComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
