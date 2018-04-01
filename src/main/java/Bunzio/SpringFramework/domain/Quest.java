package Bunzio.SpringFramework.domain;

import org.springframework.stereotype.Component;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
@Component
public class Quest {
    private String description;

    public Quest(){
        this.description = "Uratuj Ksiezniczke";
    }

    @Override
    public String toString() {
        return description;

    }

}
