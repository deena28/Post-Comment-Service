# Post-Comment Service

## Overview
The Post-Comments Service is a basic web application built with Spring Boot. It allows users to create text-based posts and enables other users to comment on these posts. Each post can have multiple comments. This service includes the following core functionalities:
- Creating posts
- Adding comments to posts
- Retrieving posts and comments

## Features
- **Create Posts:** Users can create text-based posts.
- **Comment on Posts:** Users can comment on any post.
- **Retrieve Posts and Comments:** Users can retrieve a list of all posts and comments for a specific post.

## Technologies Used
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL** (or H2 Database for in-memory testing)
- **Maven**

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- MySQL (optional, for persistent storage)

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/deena28/Post-Comment-Service.git
    cd Post-Comment-Service
    ```

2. **Configure the database:**

   If you are using MySQL, update the `src/main/resources/application.properties` file with your database credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/post_comment_service
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Build the project:**
    ```bash
    mvn clean install
    ```

4. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

### Create a Post
- **URL:** `POST /api/posts`
- **Body:**
    ```json
    {
        "title": "My First Post",
        "content": "This is the content of my first post."
    }
    ```
- **Response:**
    ```json
    {
        "id": 1,
        "title": "My First Post",
        "content": "This is the content of my first post.",
        "comments": []
    }
    ```

### Get All Posts
- **URL:** `GET /api/posts`
- **Response:**
    ```json
    [
        {
            "id": 1,
            "title": "My First Post",
            "content": "This is the content of my first post.",
            "comments": []
        }
    ]
    ```

### Get a Post by ID
- **URL:** `GET /api/posts/{id}`
- **Response:**
    ```json
    {
        "id": 1,
        "title": "My First Post",
        "content": "This is the content of my first post.",
        "comments": []
    }
    ```

### Add a Comment to a Post
- **URL:** `POST /api/posts/{postId}/comments`
- **Body:**
    ```json
    {
        "content": "This is a comment."
    }
    ```
- **Response:**
    ```json
    {
        "id": 1,
        "content": "This is a comment.",
        "post": {
            "id": 1,
            "title": "My First Post",
            "content": "This is the content of my first post."
        }
    }
    ```

### Get All Comments for a Post
- **URL:** `GET /api/posts/{postId}/comments`
- **Response:**
    ```json
    [
        {
            "id": 1,
            "content": "This is a comment.",
            "post": {
                "id": 1,
                "title": "My First Post",
                "content": "This is the content of my first post."
            }
        }
    ]
    ```



