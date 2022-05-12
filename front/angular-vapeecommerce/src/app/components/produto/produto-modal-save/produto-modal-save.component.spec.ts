import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdutoModalSaveComponent } from './produto-modal-save.component';

describe('ProdutoModalSaveComponent', () => {
  let component: ProdutoModalSaveComponent;
  let fixture: ComponentFixture<ProdutoModalSaveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProdutoModalSaveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProdutoModalSaveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
