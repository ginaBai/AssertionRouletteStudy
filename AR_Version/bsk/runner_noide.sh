#!/bin/bash

mvn clean

echo $#;
if [ $# == 1 ]; then
    mvn test -Dtest=$1
    #echo $1;
else
    mvn test
fi

DATE=$(date);

DATE=$(echo $DATE | sed -e 's/ /_/g');

mkdir ../results/$DATE

cp -r . ../results/$DATE
