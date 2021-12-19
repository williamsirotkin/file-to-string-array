javac -d bin -cp bin src/FileToStringArray.java
javac -d bin -cp bin tests/Tester.java

java -cp bin Tester $1
