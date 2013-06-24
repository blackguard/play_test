java -Xmx1024M -Xss2M -XX:+CMSClassUnloadingEnabled -jar `dirname $0`/sbt-launch-0.12.3.jar "$@"
