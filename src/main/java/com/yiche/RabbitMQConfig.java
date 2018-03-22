package com.yiche;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消费者的配置类
 */
@Configuration
public class RabbitMQConfig {

        @Autowired
        private ConnectionFactory connectionFactory;

        // 管理
        @Bean
        public RabbitAdmin rabbitAdmin() {
            return new RabbitAdmin(connectionFactory);
        }

        // 声明队列
        @Bean
        public Queue loginQueue() {
            // 默认就是自动声明的
            return new Queue("Recommend.UserFollow", true);
        }


    //声明交互器
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("YiCheForum");
    }

    //绑定
    @Bean
    public Binding binding1() {
        return BindingBuilder.bind(loginQueue()).to(topicExchange()).with("forum.follow.user");
    }


    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }


}
