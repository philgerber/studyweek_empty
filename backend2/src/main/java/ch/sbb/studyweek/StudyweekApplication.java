package ch.sbb.studyweek;

import ch.sbb.studyweek.repo.ShopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = {ShopRepository.class})
@SpringBootApplication
public class StudyweekApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyweekApplication.class, args);
	}

}
