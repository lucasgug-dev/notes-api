import { useEffect, useState } from "react";

interface Note {
    id: number;
    title: string;
    content: string;
}

function App() {
    const [notes, setNotes] = useState<Note[]>([]);

    useEffect(() => {
        fetch("http://localhost:8080/api/notes")
            .then((res) => res.json())
            .then((data) => setNotes(data))
            .catch((err) => console.error("Fetch error:", err));
    }, []);

    return (
        <>
            <h1>Notes UI</h1>
            <ul>
                {notes.map((note) => (
                    <li key={note.id}>
                        <strong>{note.title}</strong>: {note.content}
                    </li>
                ))}
            </ul>
        </>
    );
}

export default App;
