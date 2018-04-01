package Bunzio.SpringFramework.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
@Component
public class Knight {
    private String name = "Lancelot";
    private int age = 29;
//    private Quest quest;


//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }
    public Knight(){

    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;

    }

//    public void setQuest(Quest quest) {
//        this.quest = quest;
//    }

    @Override
    public String toString() {
        return "Rycerz o imieniu: " + name + " (" + age + " lat)";
    }


}
