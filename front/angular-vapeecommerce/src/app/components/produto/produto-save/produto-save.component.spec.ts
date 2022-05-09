import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdutoSaveComponent } from './produto-save.component';

describe('ProdutoSaveComponent', () => {
  let component: ProdutoSaveComponent;
  let fixture: ComponentFixture<ProdutoSaveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProdutoSaveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProdutoSaveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
