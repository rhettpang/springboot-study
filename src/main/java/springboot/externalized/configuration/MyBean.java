package springboot.externalized.configuration;

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

    @Value("${foo.bar}")
    private String fooBar;

    @Override
    public void run(String... args){
        System.out.println("name:"+name);
        System.out.println("fooBar:"+fooBar);
    }
}
