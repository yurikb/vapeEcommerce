import { Produto } from "./produto";
import { Usuario } from "./usuario";

export class CarrinhoCompra {
    idCarrinho?: number;
	precoCarrinho?: number;
	parcelavelCarrinho?: boolean;
	produtoCarrinho: Produto = new Produto({});
	usuarioCarrinho: Usuario = new Usuario();
}
