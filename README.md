# Notes API + Notes UI

A simple Notes Application consisting of:
- A Spring Boot backend (REST API)
- A React frontend (Vite)

This project is currently in early development and serves as a learning and exploration platform for:
clean backend architecture, REST API design, frontend integration and full-stack development.

---

## Project Structure
notes-api/

├─ src/main/java/... # Backend (Spring Boot)

├─ src/main/resources/

├─ pom.xml

notes-ui/

├─ src/ # React frontend

├─ package.json

Backend: `Spring Boot + H2 DB`  
Frontend: `React + Vite`

---

## Backend (Spring Boot)

### Start Backend
1. Open IntelliJ
2. Run the Spring Boot application: NotesApiApplication.java
### API Base URL
http://localhost:8080/api/notes

### Available Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /api/notes | Get all notes |
| GET    | /api/notes/{id} | Get one note |
| POST   | /api/notes | Create note |
| PUT    | /api/notes/{id} | Update note |
| DELETE | /api/notes/{id} | Delete note |
| GET    | /api/notes/search?title=TITLE | Search by title |

### Database
The backend uses an in-memory H2 database.

H2 Console: http://localhost:8080/h2-console

JDBC: jdbc:h2:mem:notesdb

---

## Frontend (React + Vite)

### Start Frontend
Go into the frontend folder: 
Install dependencies: npm install
Start development server: npm run dev
Frontend URL: http://localhost:5173


---

## Technologies Used

### Backend
- Java 21
- Spring Boot 4
- Spring Web & JPA
- H2 Database
- Maven

### Frontend
- React
- Vite
- TypeScript (optional)

---

## Current Status

This project is in an early stage: 

✔ CRUD API implemented  
✔ Frontend running  
✔ Backend communication tested  
✔ Swagger/OpenAPI enabled  

---

## Next Planned Improvements

- Improve UI for creating and editing notes
- Form validation
- Better error handling
- DTOs (if needed later)

---

## Why this project exists

This is a learning and portfolio project that is actively being developed.
It demonstrates:
- Full-stack architecture
- REST API development
- Frontend to backend communication
- Use of industry tools & conventions

---

## Author
Developed by Lucas Gugerbauer




