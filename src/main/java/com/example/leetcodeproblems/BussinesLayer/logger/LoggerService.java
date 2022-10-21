package com.example.leetcodeproblems.BussinesLayer.logger;

import com.example.leetcodeproblems.PresentationLayer.Controller.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements iLoggerService {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Override
    public void info(String text) {
        logger.info(text);
    }

    @Override
    public void error(String text) {
        logger.error(text);
    }

    @Override
    public void warn(String text) {
        logger.warn(text);
    }

    public void requestProcessedSuccessfully() {
        logger.info("Request was successfully processed\n");
    }

    public void showInfoAboutRequest(Object obj) {
        logger.info("New request. " + obj);
    }

}