import { Observable } from 'rxjs';
import { Produto } from './../models/produto';
import { environment } from './../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProdutoServiceService {
  constructor(private http: HttpClient) {}

  getAll(): Observable<Produto[]> {
    return this.http.get<Produto[]>(`${environment.urlApi}/produto`);
  }

  getById(id: number): Observable<Produto> {
    return this.http.get<Produto>(`${environment.urlApi}/produto/${id}`);
  }

  save(produto: Produto): Observable<Produto> {
    return this.http.post<Produto>(
      `${environment.urlApi}/produto/save`,
      produto
    );
  }

  update(produto: Produto): Observable<Produto> {
    return this.http.put<Produto>(
      `${environment.urlApi}/produto/update`,
      produto
    );
  }

  delete(id?: number): Observable<Produto> {
    return this.http.delete<Produto>(`${environment.urlApi}/produto/${id}`);
  }
}
