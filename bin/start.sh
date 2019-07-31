#!/bin/bash
JAVA_DEBUG_OPTS=" -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n "
JAVA_JMX_OPTS=" -Dcom.sun.management.jmxremote.port=8999 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false "
JAVA_OPTS=" -server -Xms4g -Xmx4g -Xss1024K -XX:MetaspaceSize=128M -XX:MaxMetaspaceSize=256M  -XX:MaxDirectMemorySize=256g -XX:SurvivorRatio=8 -XX:+UseG1GC -XX:+ExplicitGCInvokesConcurrentAndUnloadsClasses -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp/heapdump.hprof"
cd /xxx/yyy
$JAVA_HOME/bin/java $JAVA_DEBUG_OPTS $JAVA_JMX_OPTS $JAVA_OPTS -jar javase_template.jar
