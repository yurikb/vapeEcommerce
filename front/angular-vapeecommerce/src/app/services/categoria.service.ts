import { Categoria } from './../models/categoria';
import { Observable } from 'rxjs';
import { environment } from './../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class CategoriaService {
  constructor(private http: HttpClient) {}

  getAll(): Observable<Categoria[]> {
    return this.http.get<Categoria[]>(`${environment.urlApi}/categoria`);
  }

  getById(id: number): Observable<Categoria> {
    return this.http.get<Categoria>(`${environment.urlApi}/categoria/${id}`);
  }

  save(categoria: Categoria): Observable<Categoria> {
    return this.http.post<Categoria>(
      `${environment.urlApi}/categoria/save`,
      categoria
    );
  }

  update(categoria: Categoria): Observable<Categoria> {
    return this.http.put<Categoria>(
      `${environment.urlApi}/categoria/update`,
      categoria
    );
  }

  delete(id?: number): Observable<Categoria> {
    return this.http.delete<Categoria>(`${environment.urlApi}/categoria/${id}`);
  }
}
