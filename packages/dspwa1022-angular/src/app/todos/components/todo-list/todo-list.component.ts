import { Component, computed, model } from '@angular/core';
import { Task } from '../../model/task';
import { TodoListItemComponent } from "../todo-list-item/todo-list-item.component";

@Component({
  selector: 'app-todo-list',
  standalone: true,
  imports: [TodoListItemComponent],
  templateUrl: './todo-list.component.html',
  styleUrl: './todo-list.component.scss'
})
export class TodoListComponent {

  tasks = model.required<Task[]>();
  completedTaskCount = computed(() => this.tasks().filter(task => task.done).length);

  announceTaskCompletion(task: Task) {
    this.tasks.update(tasks => tasks.map(t => t === task ? { ...t, done: true } : t));
    console.log(`Task "${task.title}" completed!`);
  }

}
