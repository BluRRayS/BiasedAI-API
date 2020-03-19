package BiasedAI.Config;

import BiasedAI.Context.PersonMemoryContext;
import BiasedAI.Managers.PersonManager;
import BiasedAI.Repository.PersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ApplicationConfiguration extends WebMvcConfigurationSupport {

    @Bean
    public PersonManager personManager() {
        return new PersonManager(new PersonRepository(new PersonMemoryContext()));
    }
}
