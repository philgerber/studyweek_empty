package ch.sbb.studyweek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class StudyweekApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyweekApplication.class, args);
	}

}
