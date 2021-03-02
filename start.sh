#!/bin/bash
cd config
./gradlew clean build

cd ..
cd product-service
./gradlew clean build

cd ..
cd promotion-service
./gradlew clean build

cd ..
cd event-service
./gradlew clean build

cd ..
cd storefront-service
./gradlew clean build

cd ..
cd api-gateway
./gradlew clean build

cd ..
docker-compose up