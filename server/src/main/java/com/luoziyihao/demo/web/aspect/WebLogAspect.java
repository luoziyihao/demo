package com.luoziyihao.demo.web.aspect;

import com.google.gson.Gson;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Aspect
@Component
@Order(value = 99)
public class WebLogAspect {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.luoziyihao.demo.web.controller..*.*(..))" +
            "&& @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void webLog() {
    }

    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        String requestId = UUIDGenerator.uuid();
        logger.info("REQUEST_ID: {}, URL: {}, HTTP_METHOD: {}, IP: {}, PARAMETER:{}, ARGS: {}, CLASS_METHOD: {}",
                requestId,
                request.getRequestURL().toString(),
                request.getMethod(),
                request.getRemoteAddr(),
                new Gson().toJson(request.getParameterMap()),
                new Gson().toJson(joinPoint.getArgs()),
                joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()


        );

        Object ret = null;
        try {
            ret = joinPoint.proceed();
            return ret;
        } finally {
            logger.info("REQUEST_ID: {}, RET: {}",
                    requestId,
                    new Gson().toJson(ret)
            );
        }

    }


    /**
     * @author xiang.rao created on 2/6/18 4:22 PM
     * @version $Id$
     */
    public interface UUIDGenerator {


        static String uuid() {
            String s = UUID.randomUUID().toString();
            // 去掉 "-" 符号
            StringBuilder builder = new StringBuilder()
                    .append(s.substring(0, 8))
                    .append(s.substring(9, 13))
                    .append(s.substring(14, 18))
                    .append(s.substring(19, 23))
                    .append(s.substring(24));
            return builder.toString();
        }
    }
}