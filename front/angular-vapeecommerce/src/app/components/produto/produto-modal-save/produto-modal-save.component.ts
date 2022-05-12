import { Produto } from './../../../models/produto';
import { Subject } from 'rxjs';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-produto-modal-save',
  templateUrl: './produto-modal-save.component.html',
  styleUrls: ['./produto-modal-save.component.scss'],
})
export class ProdutoModalSaveComponent implements OnInit {
  @Input()
  statusSave$ = new Subject<boolean>();

  @Input()
  produtoSave = new Produto({});

  constructor() {}

  ngOnInit(): void {}

  updateStatus(status: boolean) {
    this.produtoSave = new Produto({});
    this.statusSave$.next(status);
  }
}
