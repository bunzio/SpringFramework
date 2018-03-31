package Bunzio.SpringFramework.domain;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class Quest {
    private String description;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;

    }

}
