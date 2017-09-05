package springboot.externalized.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by pangkunkun on 2017/9/5.
 */
@Component
public class MyBean implements CommandLineRunner{
    @Value("${name}")
    private String name;

    @Value("${random.value}")
    private String mySecret;

    @Value("${my.number}")
    private Integer myNumber;

    @Value("${my.bignumber}")
    private long myBignumber;

    @Value("${my.uuid}")
    private String myUuid;

    @Value("${my.number.less.than.ten}")
    private String myNumberLessThanTen;

    @Value("${my.number.in.range}")
    private String myNumberInRange;

    @Autowired
    private Config config;

    @Override
    public void run(String... args){
        System.out.println("name:"+name);
        System.out.println("mySecret:"+mySecret);
        System.out.println("myNumber:"+myNumber);
        System.out.println("myBignumber:"+myBignumber);
        System.out.println("myUuid:"+myUuid);
        System.out.println("myNumberLessThanTen:"+myNumberLessThanTen);
        System.out.println("myNumberInRange:"+myNumberInRange);

        System.out.println("config.name:"+config.getName());
        System.out.println("config.age:"+config.getAge());
        System.out.println("config.secret:"+config.getSecret());
        System.out.println("config.number:"+config.getNumber());
        System.out.println("config.bignumber:"+config.getBignumber());
        System.out.println("config.uuid:"+config.getUuid());

    }
}
