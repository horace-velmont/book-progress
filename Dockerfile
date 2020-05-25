FROM gradle:6.0.1-jdk11

COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY src src

ENTRYPOINT ["gradle", "bootRun","-Dspring.profiles.active=core,deploy"]
