# API Challenge

## Dependencies

This project uses Maven for builds.
You need Java 8 installed.

## Endpoints
/dogs/list/ - lists all the available dogs grouped by breed
/dogs/list/{breed} - list all dogs by breed
/dogs/{id} - details of a particular dog picture
/dogs/vote/up/{id}/{client} - votes up a picture
/dogs/vote/down/{id}/{client} - votes down a picture

## JSON Responses
This is the example structure of the JSON Response.

[{"id":1,"pictureUrl":"http://i.imgur.com/eE29vX4.png","votes":0,"breedName":"Labrador"}]

## Building

$ mvn package

## Running

$ java -jar target/api_interview-0.1.0.jar -jar --server.port=8181
