package springboot.externalized.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by pangkunkun on 2017/9/5.
 */
@ConfigurationProperties(prefix="my")
@Component
public class Config {

    private String name;

    private Integer age;

    private Integer randomnumber;

    private String secret;

    private Integer number;

    private Long bignumber;

    private String uuid;

    public Integer getRandomnumber() {
        return randomnumber;
    }

    public void setRandomnumber(Integer randomnumber) {
        this.randomnumber = randomnumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;

    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
