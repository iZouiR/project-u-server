package org.izouir.project_u_server.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.izouir.project_u_server.controller.advice.ControllerExceptionHandlingAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandlingAdvice.class);

    @Before("execution(* org.izouir.project_u_server.controller.advice.*.*(..))")
    public void beforeAllExceptionHandlingAdvices(final JoinPoint joinPoint) {
        final RuntimeException e = (RuntimeException) joinPoint.getArgs()[0];
        logger.error(e.getMessage());
    }
}
