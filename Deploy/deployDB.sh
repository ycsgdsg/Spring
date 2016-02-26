#!/bin/bash

function main() {
    deployDir=$(dirname $0)
    db_server_ip=$1
    while read database
    do
        echo "creating database ${database} if it does not exist"
        mysql -u root -p#Bugsfor$ -h $db_server_ip -e "create database if not exists ${database}"
        if [[ $? != "0" ]]; then
            echo  "database ${database} create failed"
            exit 1
        fi
        echo "database ${database} created"
    done < ${deployDir}/DB.txt
}

main $@