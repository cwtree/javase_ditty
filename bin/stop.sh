#!/bin/bash

javase_template_pids=`ps -ef | grep "javase_template.jar" | grep -v grep | awk '{print $2}'`
for javase_template_pid in $javase_template_pids
do
    echo stop javase_template java process: $javase_template_pid
    kill -9 $javase_template_pid
done

nr_javase_template_pids=`ps -ef | grep "javase_template.jar" | grep -v grep | wc -l`
while [ $nr_javase_template_pids -gt 0 ]
do
    nr_javase_template_pids=`ps -ef | grep "javase_template.jar" | grep -v grep | wc -l`
done
echo now, javase_template process is not run!
