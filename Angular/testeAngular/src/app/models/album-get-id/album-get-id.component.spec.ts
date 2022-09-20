import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlbumGetIdComponent } from './album-get-id.component';

describe('AlbumGetIdComponent', () => {
  let component: AlbumGetIdComponent;
  let fixture: ComponentFixture<AlbumGetIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AlbumGetIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlbumGetIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
