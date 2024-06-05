# Clinic Management System

## Overview
This application offers a platform for managing clinic operations through various microservices. 
It includes functionalities for handling patient information and payments, providing a streamlined approach to hospital management.

## Technologies Used
- **Spring Boot**: Framework for creating stand-alone, production-grade Spring-based applications.
- **Spring Cloud**: Provides tools for building and deploying cloud-native applications.
- **Spring Cloud OpenFeign**: For inter-service communication.
- **Spring Cloud Netflix Eureka**: For service registration and discovery.
- **Spring Cloud Gateway**: For API Gateway and routing.
- **H2 Database**: In-memory database for development and testing.
- **MapStruct**: For mapping between DTOs and entities.
- **Lombok**: To reduce boilerplate code for model objects.

## Features

### Doctor Service
- **Create Patient**: Add new patient information.
- **Retrieve Patient**: Fetch patient details by ID.
- **Update Patient**: Modify existing patient details.
- **Delete Patient**: Remove a patient by ID.
- **Get All Patients**: Get a comprehensive list of all patients.

### Payment Service
- **Create Payment**: Record a new payment.
- **Retrieve Payment**: Fetch payment details by transaction ID.
- **Get Payments by Patient ID**: View all payments for a specific patient.

### Patient Service
- **Create Patient**: Add new patient information.
- **Retrieve Patient**: Fetch patient details by ID.
- **Update Patient**: Modify existing patient details.
- **Delete Patient**: Remove a patient by ID.
- **Get Patient Payments**: View all payments for a specific patient.

## Setup
1. Clone the repository.
2. Set up Maven:
   ```bash
   mvn clean install
3. Set up Docker and run Docker Compose:
   ```bash
   docker-compose up -d

## Usage
Use the provided endpoints to manage patients and payments through a RESTful API.

