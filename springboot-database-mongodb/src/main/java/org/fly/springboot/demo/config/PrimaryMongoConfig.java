package org.fly.springboot.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by overfly on 2017/11/1.
 */
@Configuration
@EnableMongoRepositories(basePackages = "org.fly.springboot.demo.mapper.primary",
        mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE)

public class PrimaryMongoConfig {
    protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";

}
