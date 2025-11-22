const API_BASE_URL = "http://localhost:8080/api/notes";

export async function getNotes() {
    const res = await fetch(API_BASE_URL);
    return res.json();
}

export async function createNote(note) {
    const res = await fetch(API_BASE_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(note)
    });
    return res.json();
}

export async function deleteNote(id) {
    await fetch(`${API_BASE_URL}/${id}`, { method: "DELETE" });
}

export async function updateNote(id, note) {
    const res = await fetch(`${API_BASE_URL}/${id}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(note)
    });
    return res.json();
}
