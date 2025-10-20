import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CabecalhoComponent } from "./cabecalho/cabecalho.component";

@Component({
  selector: 'app-root',
  imports: [CabecalhoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'PROJETO-JWT';
}
