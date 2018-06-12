package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @link https://dzone.com/articles/spring-boot-applicationrunner-and-commandlinerunne
 *
 */
@Component
public class AppStartupRunner implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Your application started with option names : {}", args.getOptionNames());

        for (int i = 0; i < 3; i++) {
            new Thread(new RunnableClass()).start();
        }
    }
}