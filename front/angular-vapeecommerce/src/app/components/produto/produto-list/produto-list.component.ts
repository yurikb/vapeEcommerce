import { ProdutoServiceService } from './../../../services/produto-service.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Produto } from 'src/app/models/produto';

@Component({
  selector: 'app-produto-list',
  templateUrl: './produto-list.component.html',
  styleUrls: ['./produto-list.component.scss'],
})
export class ProdutoListComponent implements OnInit {
  listaProdutos$ = new Observable<Produto[]>();
  produtoDel = new Produto({});

  constructor(private service: ProdutoServiceService) {}

  ngOnInit(): void {
    this.list();
  }

  list() {
    this.listaProdutos$ = this.service.getAll();
    return this.listaProdutos$;
  }

  getById(id: number) {
    return this.service.getById(id);
  }

  save(produto: Produto) {
    return this.service.save(produto);
  }

  update(produto: Produto) {
    return this.service.update(produto);
  }

  delete(id?: number) {
    return this.service.delete(id).subscribe((resp) => {
      this.produtoDel = resp;
      this.list();
    });
  }
}
