import { CategoriaListComponent } from './components/categoria/categoria-list/categoria-list.component';
import { ProdutoListComponent } from './components/produto/produto-list/produto-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'produtos', component: ProdutoListComponent },
  { path: 'categorias', component: CategoriaListComponent },
  { path: '', redirectTo: 'produtos', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
