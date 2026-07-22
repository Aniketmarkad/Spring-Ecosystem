package com.aniket;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.aniket")
@PropertySource("classpath:MyApp.properties")
public class MyAppConfig {

}
