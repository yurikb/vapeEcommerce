import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoriaSaveComponent } from './categoria-save.component';

describe('CategoriaSaveComponent', () => {
  let component: CategoriaSaveComponent;
  let fixture: ComponentFixture<CategoriaSaveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategoriaSaveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoriaSaveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
