import { ProdutoServiceService } from './../../../services/produto-service.service';
import { CategoriaService } from './../../../services/categoria.service';
import { Produto } from './../../../models/produto';
import { Categoria } from './../../../models/categoria';
import { Subject, Observable } from 'rxjs';
import { Component, Input, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-produto-save',
  templateUrl: './produto-save.component.html',
  styleUrls: ['./produto-save.component.scss'],
})
export class ProdutoSaveComponent implements OnInit {
  @Input()
  status = new Subject<boolean>();

  @Input()
  produtoSave = new Produto({});

  categoriasList$ = new Observable<Categoria[]>();

  constructor(
    private produtoService: ProdutoServiceService,
    private categoriaService: CategoriaService,
    private location: Location
  ) {}

  ngOnInit(): void {
    this.getAllCategoria();
  }

  getAllCategoria() {
    this.categoriasList$ = this.categoriaService.getAll();
  }

  save() {
    console.log(this.produtoSave);
    if (this.validate()) {
      this.produtoService.save(this.produtoSave).subscribe((produtoSaved) => {
        if (produtoSaved.idProduto) {
          this.location.back();
        }
      });
    }
  }

  cancel() {
    this.status.next(false);
  }

  validate() {
    if (typeof this.produtoSave.categoriaProduto == 'undefined') {
      return false;
    }

    return true;
  }
}
