import { ProdutoServiceService } from './../../../services/produto-service.service';
import { Produto } from './../../../models/produto';
import { Component, Input, OnInit } from '@angular/core';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-produto-modal-delete',
  templateUrl: './produto-modal-delete.component.html',
  styleUrls: ['./produto-modal-delete.component.scss'],
})
export class ProdutoModalDeleteComponent implements OnInit {
  @Input()
  produtoDel = new Produto({});

  @Input()
  statusDelete$ = new Subject<boolean>();

  constructor(private service: ProdutoServiceService) {}

  ngOnInit(): void {}

  updateStatus(status: boolean) {
    this.produtoDel = new Produto({});
    this.statusDelete$.next(status);
  }

  delete(id?: number) {
    if (!id) {
      return;
    }

    this.service.delete(id).subscribe((resp) => {
      if (resp) {
        console.log('Produto excluído!');
        this.updateStatus(true);
      } else {
        this.updateStatus(false);
      }
    });
  }
}
