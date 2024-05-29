---------------------------------------------------

HOTEL RESERVATION SYSTEM

---------------------------------------------------

This is the final project for microservices training batch by Rohan Joshi ( 2040156 )

Softwares/Tools used - JDK, STS, Spring Boot, Maven, Lombok, kafka, docker

H2 is used for db
Dockerfile is present at root of each project

To run in local -
Run mvn clean install
Run docker build --build-arg JAR_FILE=target/*.jar -t <servicename> .

---------------------------------------------------
Service Information - 7 microservices created
---------------------------------------------------

Gateway - apigateway service 
Service Discovery - discovery service ( eureka )
Notification ( Messaging ) - message broker service ( kafka )

customer service - CRUD operations related to customers
hotelmgmt service - CRUD operations related to hotels
payment service - for payment operations
reservation service - for reservation operations

---------------------------------------------------
API Information
---------------------------------------------------

--- http://localhost:8003/customers/register

To register a new customer

{
    "id":1,
    "name":"Rohan",
    "email":"rohanj@gmail.com",
    "password":"P@ssw0rd"
}

--- http://localhost:8003/customers/

To get all customers

--- http://localhost:8003/customers/{id}

To get customer with id

--- http://localhost:8003/customers/makereservation

To make reservation 

{
    "customerId": 1,
    "hotelId": 1,
    "bookingAmount": 999.9,
    "startDate": "07-05-2024",
    "endDate": "12-05-2024"
}
---------------------------------------------------

--- http://localhost:8005/hotels/addHotel

To register a new Hotel

{
    "id": 1,
    "name": "Grand Hotel",
    "description": "A Really Grand Hotel",
    "status": "AVAILABLE"
}

--- http://localhost:8005/hotels/

To get all hotels

----------------------------------------------------

--- http://localhost:8011/payments

for making payments 

{
    "id": 1,
    "customerId": 1,
    "amount": 999.9
}

--- http://localhost:8011/payments/{id}

to get payment details

----------------------------------------------------

--- http://localhost:8006/reservations/{id}

to get reservation details



