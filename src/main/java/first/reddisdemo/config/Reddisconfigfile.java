package first.reddisdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.convert.RedisData;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class Reddisconfigfile
{
    @Bean
    public JedisConnectionFactory connectionFactory(){
        RedisStandaloneConfiguration standaloneConfiguration = new RedisStandaloneConfiguration();
        standaloneConfiguration.setHostName("127.0.0.1");
        standaloneConfiguration.setPort(6379);
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(standaloneConfiguration);

        return jedisConnectionFactory;

    }
    public RedisTemplate<String ,Object> redisTemplate(){


        RedisTemplate<String, Object> redistemplate = new RedisTemplate<>();
        redistemplate.setConnectionFactory(connectionFactory());
        redistemplate.setKeySerializer(new StringRedisSerializer());
        redistemplate.setHashKeySerializer(new StringRedisSerializer());
        redistemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
        redistemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redistemplate.setEnableTransactionSupport(true);
        redistemplate.afterPropertiesSet();
        return redistemplate;

    }
}

