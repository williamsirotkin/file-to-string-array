javac -d bin -cp bin src/FileToStringArray.java
javac -d bin -cp bin src/Tester.java

java -cp bin Tester $1
