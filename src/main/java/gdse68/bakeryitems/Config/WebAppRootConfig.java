package gdse68.bakeryitems.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "gdse68.bakeryitems")
@EnableWebMvc
public class WebAppRootConfig {
}
