#!/bin/bash

curl -s -XPUT -d"{
  "Name": \"storefront\",
  \"ID\": \"storefront\",
  \"Tags\": [ \"storefront\" ],
  \"Address\": \"localhost\",
  \"Port\": 8083,
  \"Check\": {
    \"Name\": \"storefront\",
    \"ID\": \"storefront\",
    \"Interval\": \"10s\",
    \"TCP\": \"localhost:8083\",
    \"Timeout\": \"1s\",
    \"Status\": \"passing\"
  }
}" localhost:8500/v1/agent/service/register

