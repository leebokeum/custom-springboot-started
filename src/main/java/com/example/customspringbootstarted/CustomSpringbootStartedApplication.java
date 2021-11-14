package com.example.customspringbootstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomSpringbootStartedApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomSpringbootStartedApplication.class, args);
    }
/**
 * 이제 프로젝트를 실행 해보면 오류가 발생한다.
 * (springboot 버전에 따라 다를 수 있는 것 같다. 하지만 실행 되더라도 원하는 값인 cat, 2 가 나오지 않고 dog, 1 이 나오게 된다.)
 * 해당 bean이 이미 정의되어 있어서 중복 오류가 발생하는데 이를 해결 하기 위해선 @Conditional annotaion을 사용해야 한다.
 * starter 프로젝트로 돌아가서 Animal Bean 구현에 @ConditionalOnMissingBean annotation을 추가한다.
    @Bean
    public Animal animal() {
        Animal animal = new Animal();
        animal.setName("cat");
        animal.setAge(2);
        return animal;
    }
**/
}
