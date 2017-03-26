### JUG Priority Queue Presentation - 09/03/2017

The repository contains the sample code and the banchmarks.

#### Running the benchmarks

mvn cleant install

java -XX:+UnlockDiagnosticVMOptions '-XX:CompileCommand=print,*.getRoman' -jar target/benchmarks.jar -wi 5 -i 5 -f 1 

