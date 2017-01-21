# burp-suite-http-proxy-history-viewer

JavaFX application for viewing Burp Suite HTTP proxy history files.

The history file can be exported from Burp Suite by opening *Proxy > HTTP
History*, selecting relevant records, right-clicking and choosing *Save items*.

Example history file is included in
[example/burp-http-history.xml](example/burp-http-history.xml).

## Usage

The application is currently work in progress, please check back soon for
instructions.

## Building and running

    mvn clean jfx:jar
    java -jar target/jfx/app/burp-suite-http-proxy-history-viewer-1.0-SNAPSHOT-jfx.jar
