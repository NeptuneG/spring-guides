package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Executor asycExecutor() {
        ThreadPoolTaskExecutor execurtor = new ThreadPoolTaskExecutor();
        execurtor.setCorePoolSize(2);
        execurtor.setMaxPoolSize(2);
        execurtor.setQueueCapacity(500);
        execurtor.setThreadNamePrefix("GitHubLookup-");
        execurtor.initialize();
        return execurtor;
    }
}