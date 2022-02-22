FROM maven:3.6.3-openjdk-8
COPY . /dist
RUN cd /dist
WORKDIR /dist/
CMD sleep 150 && mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=65da9114f5f17e274abe3a7a1af0b79dd81159ab -Dsonar.projectKey=JavaProjectDemo
