package Bunzio.SpringFramework.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */

@Component
@PropertySource("classpath:castle.properties")
public class Castle {

    @Value("${castle.name}")
    private String castleName;

    @Autowired
    Knight knight;

    public Castle() {

    }

    Castle(Knight knight, String castlename){
        this.knight = knight;
        this.castleName = castlename;

    }

    @PostConstruct
    public void build() {
        System.out.println("Wybudowano zamek o nazwie: " + castleName);
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("Zaraz wyburzymy zamek o nazwie: " + castleName);
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek o nazwie " + this.castleName + " Zamieszkały przez: " + knight;
    }
}
