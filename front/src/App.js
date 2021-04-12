import React from 'react';
import { StoreProvider } from './components/Store';
import { Form } from './components/FormList';
import { List } from './components/ListTodo';

function App() {
  return (
    <StoreProvider>
      <h3>To-Do List</h3>
      <Form />
      <List />
    </StoreProvider>
  )
}

export default App;