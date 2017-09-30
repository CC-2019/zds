package zds.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ZdsConsumerApplication {

    private static Logger _log = LoggerFactory.getLogger(ZdsConsumerApplication.class);

    public static void main(String[] args) {
        _log.info(">>>>> zds-consumer 正在加载 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        _log.info(">>>>> zds-consumer 加载完成 <<<<<");

        SpringApplication.run(ZdsConsumerApplication.class, args);
    }

}