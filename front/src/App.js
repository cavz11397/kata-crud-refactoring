import React from 'react';
import { StoreProvider } from './components/Store';
import { Form as FormTodo } from './components/todo/FormTodo';
import { Form as FormList } from './components/list/FormList';
import { List } from './components/todo/ListTodo';

function App() {
  return (
    <StoreProvider>
      <h3>To-Do List</h3>
      <FormList />
      <FormTodo/>
      <List />
    </StoreProvider>
  )
}

export default App;