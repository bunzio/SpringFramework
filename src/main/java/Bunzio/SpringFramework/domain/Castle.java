package Bunzio.SpringFramework.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
@Component
public class Castle {
    private String castleName = "East Watch";

    public Castle() {

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
    public String toString(){
        return "Znajduje się tu zamek o nazwie " + this.castleName;
    }
}
