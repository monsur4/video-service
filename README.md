# video-service
A video streaming backend service

## Introduction
This service acts as a backend service providing a rest api backend for a front-end service. It exposes a video streaming api.

## Pre-cobfiguration
- Install Java 21 (or 17 and update java.version in the pom file to reflect this change)
- Install maven

## Configuration
- Clone the repository
  
      git clone https://github.com/monsur4/video-service.git
- Open your terminal and run ```mvn clean install``` in the root directory of the project
- Start the application with the following command
  
      java -jar target/video-service-0.0.1-SNAPSHOT.jar
