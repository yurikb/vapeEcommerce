import { Categoria } from './categoria';
import { Usuario } from './usuario';

export class Produto {
  idProduto?: number;
  marcaProduto?: string;
  modeloProduto?: string;
  descricaoProduto?: string;
  fotoProduto?: string;
  corProduto?: string;
  avaliacaoProduto?: string;
  disponivelProduto?: boolean;
  categoriaProduto: Categoria = new Categoria();

  constructor(obj: Partial<Produto>) {
    Object.assign(this, obj);
  }
}
