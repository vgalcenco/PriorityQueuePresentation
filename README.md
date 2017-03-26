### JUG Priority Queue Presentation

https://www.meetup.com/Chisinau-Java-User-Group/events/237338842/

The repository contains the sample code and the banchmarks.

#### Running the benchmarks

mvn cleant install

java -XX:+UnlockDiagnosticVMOptions '-XX:CompileCommand=print,*.getRoman' -jar target/benchmarks.jar -wi 5 -i 5 -f 1 

#### C1/C2 assembly code 

https://gist.github.com/vgalcenco/50343e68269d68d07b8cc563015facde

