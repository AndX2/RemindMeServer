package ru.yandex.android.andrew.remindmeserver.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by Andrew on 06.02.2016.
 */
@Configuration
@EnableJpaRepositories("ru.yandex.android.andrew.remindmeserver.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("ru.yandex.android.andrew.remindmeserver")
public class DatabaseConfig {
    @Resource
    private Environment env;
}
