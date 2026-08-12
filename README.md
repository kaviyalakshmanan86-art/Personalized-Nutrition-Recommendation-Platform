# Personalized Nutrition Recommendation Platform

## Project Overview

The **Personalized Nutrition Recommendation Platform** is a full-stack web application that provides personalized diet and nutrition recommendations based on a user's health information, dietary preferences, and lifestyle.

The system allows users to register and log in securely, create their health profile, receive personalized nutrition recommendations, and track their diet plans.

The initial version uses a rule-based recommendation system. In future versions, AI/ML techniques will be integrated to provide more advanced and personalized nutrition recommendations.

---

## Problem Statement

People have different nutritional requirements based on their age, weight, height, activity level, health information, food preferences, and dietary restrictions. Generic diet plans may not be suitable for every individual.

This project aims to provide a personalized platform that uses user-specific information to generate suitable nutrition recommendations and store the recommendations for future tracking.

---

## Objectives

* Provide secure user registration and login.
* Store user health information.
* Store dietary preferences and restrictions.
* Generate personalized nutrition recommendations.
* Store recommendations in a database.
* Allow users to view and track their nutrition plans.
* Develop a scalable full-stack application.
* Integrate AI/ML-based recommendations in future versions.

---

## Main Features

### 1. User Authentication

* User Registration
* User Login
* JWT Authentication
* Secure access to user data

### 2. Health Profile

Users can enter:

* Age
* Gender
* Height
* Weight
* Activity Level
* Food Preference
* Dietary Restrictions

### 3. Nutrition Recommendation

The system generates personalized recommendations for:

* Breakfast
* Lunch
* Snacks
* Dinner
* Food items
* Approximate calorie information

### 4. Nutrition Plan Tracking

Users can view their saved nutrition recommendations and track their diet plans.

---

## Technology Stack

### Frontend

* React.js
* HTML
* CSS
* JavaScript

### Backend

* Java
* Spring Boot
* REST API

### Database

* MySQL

### Authentication

* JWT

### Development Tools

* Visual Studio Code
* Git
* GitHub

### Future AI/ML

* Python
* Machine Learning
* AI-based Recommendation System

---

## Project Structure

```text
Nutrition/
│
├── backend/
│   ├── pom.xml
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── nutrition/
│           │           └── backend/
│           │               ├── controller/
│           │               ├── dto/
│           │               ├── model/
│           │               ├── repository/
│           │               ├── security/
│           │               └── service/
│           │
│           └── resources/
│               └── application.properties
│
├── frontend/
│   ├── package.json
│   └── src/
│       ├── components/
│       ├── pages/
│       └── services/
│
├── docs/
│   ├── Problem_Statement.md
│   └── diagrams/
│
├── .gitignore
└── README.md
```

---

## System Workflow

```text
User
  ↓
Registration / Login
  ↓
Health Profile
  ↓
Dietary Preferences
  ↓
Backend
  ↓
Recommendation Engine
  ↓
Personalized Diet Plan
  ↓
Database
  ↓
Display Recommendation
```

---

## Database

The application will use MySQL to store:

### Users

* User ID
* Name
* Email
* Password
* Account information

### Health Profiles

* Age
* Gender
* Height
* Weight
* Activity Level
* Food Preference
* Dietary Restrictions

### Recommendations

* Recommendation ID
* User ID
* Meal Type
* Food Name
* Calories
* Recommendation Date

---

## Backend Setup

### Prerequisites

Install the following:

* JDK
* Maven
* MySQL
* Visual Studio Code

Check Java installation:

```bash
java -version
```

Check Maven installation:

```bash
mvn -version
```

---

## Database Setup

Create a MySQL database:

```sql
CREATE DATABASE nutrition_db;
```

Database configuration will be added in:

```text
backend/src/main/resources/application.properties
```

---

## Run the Backend

Open CMD inside the backend folder:

```bash
cd backend
```

Run:

```bash
mvn spring-boot:run
```

The backend will start on the configured Spring Boot port.

---

## Frontend Setup

Open another terminal and go to the frontend folder:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start the frontend:

```bash
npm run dev
```

The frontend will start on the development server.

---

## API Modules

### Authentication

```text
POST /api/auth/register
POST /api/auth/login
```

### Health Profile

```text
POST /api/health-profile
GET /api/health-profile
```

### Recommendations

```text
POST /api/recommendations
GET /api/recommendations
```

---

## Review 1 Target

The following features are targeted for the first project review:

* [ ] Problem Statement
* [ ] GitHub Repository
* [ ] README
* [ ] User Registration
* [ ] User Login
* [ ] JWT Authentication
* [ ] Database Connection
* [ ] Health Profile Module
* [ ] Nutrition Recommendation Module
* [ ] System Architecture Diagram
* [ ] ER Diagram
* [ ] Class/Module Diagram
* [ ] Minimum 6 GitHub Commits

---

## Future Enhancements

* AI/ML-based nutrition recommendation
* Personalized calorie calculation
* Nutrition tracking
* Meal history
* Progress monitoring
* AI nutrition chatbot
* Cloud deployment
* Mobile application
* Wearable device integration
* Advanced nutrition analytics

---

## Disclaimer

The recommendations provided by this application are intended for general informational and planning purposes. They are not a replacement for professional medical, nutritional, or dietary advice.

---

## Project Status

**Current Stage:** Review 1 Development

**Status:** In Development
