import React, { useContext, useEffect } from 'react';
import Store from '../Store';

const HOST_API = "http://localhost:8080/api";

export const List = () => {
    const { dispatch, state: { lista } } = useContext(Store);
    const currentList = lista.listElements;

    useEffect(() => {
        fetch(HOST_API + "/listTodos")
            .then(response => response.json())
            .then((list) => {
                dispatch({ type: "update-list", list })
            })
    }, [dispatch]);

    const onDelete = (id) => {
        fetch(HOST_API + "/" + id + "/listTodo", {
            method: "DELETE"
        }).then((list) => {
            dispatch({ type: "delete-item", id })
        })
    };

    return (
        <div>
            <table >
                <tbody>
                    {currentList.map((todo) => {
                        return (
                            <tr key={todo.id} >
                                <td>{todo.name}</td>
                                <td><button onClick={() => onDelete(todo.id)}>Eliminar</button></td>
                            </tr>
                        )
                    })}
                </tbody>
            </table>
        </div>
    );
}