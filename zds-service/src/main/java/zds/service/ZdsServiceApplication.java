package zds.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZdsServiceApplication {

    private static Logger _log = LoggerFactory.getLogger(ZdsServiceApplication.class);

    public static void main(String[] args) {
        _log.info(">>>>> ZdsServiceApplication 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        _log.info(">>>>> ZdsServiceApplication 启动完成 <<<<<");

        synchronized (ZdsServiceApplication.class) {
            while (true) {
                try {
                    ZdsServiceApplication.class.wait();
                } catch (InterruptedException e) {
                    _log.error("== synchronized error:",e);
                }
            }
        }
    }
}
