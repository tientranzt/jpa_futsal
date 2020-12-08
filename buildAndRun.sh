#!/bin/sh
mvn clean package && docker build -t tournements-futsal/tournements-futsal .
docker rm -f tournements-futsal || true && docker run -d -p 8080:8080 -p 4848:4848 --name tournements-futsal tournements-futsal/tournements-futsal 
