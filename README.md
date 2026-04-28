# 🤖 WhatsApp Chatbot Backend (Spring Boot)

A simple and scalable chatbot backend built using Java and Spring Boot.
This project simulates a WhatsApp chatbot by exposing a REST API that receives messages and returns intelligent responses.

---

## 🚀 Features

* 📩 REST API endpoint (`/webhook`) to receive messages
* 💬 Rule-based chatbot with dynamic responses
* 🧠 Keyword-based understanding (Java, Spring, time, date, etc.)
* 📜 Logging using SLF4J (console + optional file logging)
* 🏗️ Clean layered architecture (Controller → Service)
* ⚡ Lightweight (no external API dependency)

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Maven
* SLF4J (Logging)
* Postman (for testing)

---

## 📁 Project Structure

```
src/
 ├── controller/      # REST Controller
 ├── service/         # Business logic
 ├── model/           # Request model
 └── IntelliChatApplication.java
```

---

## ▶️ How to Run the Project

1. Clone the repository:

```
git clone https://github.com/your-username/whatsapp-chatbot-backend.git
```

2. Open in Eclipse / IntelliJ

3. Run the main class:

```
IntelliChatApplication.java
```

4. Server will start on:

```
http://localhost:8080
```

---

## 🧪 API Testing (Postman)

### 📤 Request

**POST** `/webhook`

```
http://localhost:8080/webhook
```

**Body (JSON):**

```
{
  "message": "hi"
}
```

---

### 📥 Sample Responses

| Input | Output                            |
| ----- | --------------------------------- |
| hi    | Hello 👋 How can I help you?      |
| java  | Java is a programming language... |
| time  | Current time                      |
| date  | Today's date                      |
| bye   | Goodbye 👋                        |

---

## 📜 Logging

* Incoming messages are logged
* Bot responses are logged
* Helps in debugging and monitoring

---

## 💡 Future Enhancements

* 🗄️ Database integration (store chat history)
* 📱 Real WhatsApp integration
* 🤖 AI-based chatbot (OpenAI / Gemini)
* 🌐 Frontend UI

---

## 👨‍💻 Author

**Your Name**

* GitHub: https://github.com/Altafulla4

---

## 🏆 Project Highlights

* Demonstrates backend development using Spring Boot
* Implements REST APIs and service-layer architecture
* Shows understanding of logging and clean coding practices

---

⭐ If you like this project, give it a star!
