package ru.erdyneev.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.erdyneev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
