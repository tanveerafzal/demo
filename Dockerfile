FROM java:8  
COPY . /var/www/java  
WORKDIR /var/www/java  
RUN javac Java8Streams.java  
CMD ["java", "Java8Streams"]  
