package taufiq.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import taufiq.spring.core.configuration.BarConfiguration;
import taufiq.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
