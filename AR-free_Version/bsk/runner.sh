#!/bin/bash

mvn clean

echo $#;
if [ $# == 1 ]; then
    mvn test -Dmaven.surefire.debug -Dtest=$1
    #echo $1;
else
    mvn test -Dmaven.surefire.debug
fi

DATE=$(date);

DATE=$(echo $DATE | sed -e 's/ /_/g');


mkdir ../results/$DATE

cp -r . ../results/$DATE
