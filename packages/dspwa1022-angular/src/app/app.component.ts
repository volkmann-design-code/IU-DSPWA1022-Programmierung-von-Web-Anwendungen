import { Component } from '@angular/core';
import { Task } from './todos/model/task';
import { TodoListComponent } from "./todos/components/todo-list/todo-list.component";
import { LogListComponent } from "./logs/components/log-list/log-list.component";
import { LogService } from './logs/services/log.service';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
  imports: [TodoListComponent, LogListComponent]
})
export class AppComponent {

  constructor(logs: LogService) {
    logs.addEntry('App started!');
  }

  tasks: Task[] = [
    { title: 'Create Angular App', done: true },
    { title: 'Use Components', done: true },
    { title: 'Use Services', done: false },
    { title: 'Use Signals', done: false },
  ];
}
