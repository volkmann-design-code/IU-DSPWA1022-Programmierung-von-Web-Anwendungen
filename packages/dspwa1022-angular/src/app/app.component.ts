import { Component } from '@angular/core';
import { Task } from './todos/model/task';
import { TodoListComponent } from "./todos/components/todo-list/todo-list.component";

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
  imports: [TodoListComponent]
})
export class AppComponent {

  tasks: Task[] = [
    { title: 'Create Angular App', done: true },
    { title: 'Use Components', done: true },
    { title: 'Use Services', done: false },
    { title: 'Use Signals', done: false },
  ];
}
