import React from 'react';
import { CheckCircle } from '@phosphor-icons/react'
const TodoList = () => {
  const todos = [
    { id: 1, task: 'Fazer compras', completed: false },
    { id: 2, task: 'Estudar React', completed: false },
    { id: 3, task: 'Ler um livro', completed: false },
    { id: 4, task: 'Fazer compras', completed: false },
    { id: 5, task: 'Estudar React', completed: false },
    { id: 6, task: 'Ler um livro', completed: false },
    { id: 7, task: 'Fazer compras', completed: false },
    { id: 8, task: 'Estudar React', completed: false },
    { id: 9, task: 'Ler um livro', completed: false },
  ];

  return (
    <div>
      <h1>Afazeres Diários</h1>
      <div className="todo-list">
        {todos.map(todo => (
          <div key={todo.id} className="todo-card" style={{ display: 'flex', alignItems: 'center', margin: '10px', padding: '10px', border: '1px solid #ccc' }}>
            <span style={{ textDecoration: todo.completed ? 'line-through' : 'none', flex: 1 }}>{todo.task}</span>
             <CheckCircle
             style={{ cursor: 'pointer', color: 'gray' }}
             />
          </div>
        ))}
      </div>
    </div>
  );
};

export default TodoList;