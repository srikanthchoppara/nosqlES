package my.learning.exercise.hsearch;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("my.learning.exercise.hsearch")
public class NosqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(NosqlApplication.class, args);
	}
	
	@Bean
	RestHighLevelClient elasticsearchClient() {
		final ClientConfiguration configuration = ClientConfiguration.localhost();
		RestHighLevelClient client = RestClients.create(configuration).rest();
		return client;
	}

	@Bean
	ElasticsearchRestTemplate elasticsearchTemplate() {
		return new ElasticsearchRestTemplate(elasticsearchClient());
	}
	
}
