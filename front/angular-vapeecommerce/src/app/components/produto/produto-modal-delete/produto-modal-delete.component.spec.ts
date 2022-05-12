import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdutoModalDeleteComponent } from './produto-modal-delete.component';

describe('ProdutoModalDeleteComponent', () => {
  let component: ProdutoModalDeleteComponent;
  let fixture: ComponentFixture<ProdutoModalDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProdutoModalDeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProdutoModalDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
