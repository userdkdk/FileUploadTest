# 1단계: Gradle로 빌드하는 단계
FROM gradle:8.10-jdk17-alpine AS builder
WORKDIR /app

# backend 디렉토리의 모든 파일 복사
COPY . .

# ✅ gradlew 아님! 이미지 안에 있는 gradle CLI 사용
RUN ./gradlew clean bootJar --no-daemon

# 2단계: 실행 전용 JRE 이미지
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# 빌드된 jar 복사 (build/libs 안에 하나 있다고 가정)
COPY --from=builder /app/build/libs/*.jar app.jar

ENV SPRING_PROFILES_ACTIVE=prod
ENV JAVA_OPTS=""

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]