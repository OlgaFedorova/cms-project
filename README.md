CMS project by book "Claudio Eduardo de Oliveira. Spring 5.0 By Example"

Docker commands:
docker run -d --name mongodb --net cms-application -p 27017:27017 mongo:3.4.10
docker run -d --name postgres --net cms-application -p 5432:5432 -e POSTGRES_PASSWORD=cms@springfive postgres:9.6.6-alpine
docker run -d --link mongodb:mongo --net cms-application -p 8081:8081 mongo-express
