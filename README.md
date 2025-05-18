School Management Web App (Ongoing Project)
---
This is an ongoing Java EE web application designed to manage users and teachers within a school system.
The project leverages Servlets, JSPs, DAO architecture, DTOs,
and Service layers to ensure a clean separation of concerns, extensibility, and scalability.

How the App Works (High-Level Flow)
---
User navigates to the login page and logs in.

If authenticated, user is redirected to the dashboard.

From dashboard:
--

User can register a new teacher.

User can view a filtered list of teachers.

User can register a new user account.

All sensitive operations are protected via session validation.

User can log out securely, invalidating the session.

