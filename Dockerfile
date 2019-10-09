FROM openjdk:8

COPY . /

RUN javac *.java

CMD ["java", "Nostrum"]
