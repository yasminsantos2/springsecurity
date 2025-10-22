import { Component } from '@angular/core';
import { CabecalhoComponent } from '../cabecalho/cabecalho.component';

@Component({
  selector: 'app-criar-conta',
  standalone: true,
  imports: [CabecalhoComponent],
  templateUrl: './criar-conta.component.html',
  styleUrls: ['./criar-conta.component.css']
})
export class CriarContaComponent {}
