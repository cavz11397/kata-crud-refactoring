import React, { useContext, useRef, useState } from 'react';
import Store from '../Store';

const HOST_API = "http://localhost:8080/api";

export const Form = () => {
    const formRef = useRef(null);
    const { dispatch, state: { lista } } = useContext(Store);
    const item = lista;
    const [state, setState] = useState(lista);

    const onAdd = (event) => {
        event.preventDefault();

        const request = {
            name: state.name,
            id: null,
        };


        fetch(HOST_API + "/listTodos", {
            method: "POST",
            body: JSON.stringify(request),
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(response => response.json())
            .then((lista) => {
                dispatch({ type: "add-item", item: lista });
                setState({ name: "" });
                formRef.current.reset();
            });
    }

    return (
        <>
            <form ref={formRef}>
                <input
                    type="text"
                    name="name"
                    placeholder="Lista de TO-DO"
                    defaultValue={lista.name}
                    onChange={(event) => {
                        setState({ ...state, name: event.target.value })
                    }}  ></input>
                <button onClick={onAdd}>Nueva lista</button>
            </form>
        </>
    );
}