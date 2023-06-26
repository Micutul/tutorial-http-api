POST http://127.0.0.1:8080/customer
Content-Type: application/json
{
    "id": "100",
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@company.com"
}

POST http://127.0.0.1:8080/customer
{
    "id": "200",
    "firstName": "John",
    "lastName": "Smith",
    "email": "john.smith@company.com"
}

POST http://127.0.0.1:8080/customer
{
    "id": "300",
    "firstName": "Mary",
    "lastName": "Smith",
    "email": "mary.smith@company.com"
}

###
GET http://127.0.0.1:8080/customer
Accept: application/json
###
GET http://127.0.0.1:8080/customer/200
Accept: application/json
###
GET http://127.0.0.1:8080/customer/500
Accept: application/json
###
DELETE http://127.0.0.1:8080/customer/100
###
DELETE http://127.0.0.1:8080/customer/100