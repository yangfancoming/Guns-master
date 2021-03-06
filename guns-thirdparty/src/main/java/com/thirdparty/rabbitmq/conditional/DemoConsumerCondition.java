package com.thirdparty.rabbitmq.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author syl
 * @description demo mq开启条件
 */
public class DemoConsumerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String key = conditionContext.getEnvironment().getProperty("mq.demo.key");
        return "true".equals(key);
    }
}
