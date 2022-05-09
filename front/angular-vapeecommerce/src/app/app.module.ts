import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ProdutoListComponent } from './components/produto/produto-list/produto-list.component';
import { ProdutoSaveComponent } from './components/produto/produto-save/produto-save.component';
import { CategoriaListComponent } from './components/categoria/categoria-list/categoria-list.component';
import { CategoriaSaveComponent } from './components/categoria/categoria-save/categoria-save.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ProdutoListComponent,
    ProdutoSaveComponent,
    CategoriaListComponent,
    CategoriaSaveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
