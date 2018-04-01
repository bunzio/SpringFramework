package Bunzio.SpringFramework;

import Bunzio.SpringFramework.domain.Castle;
import Bunzio.SpringFramework.domain.Knight;
import Bunzio.SpringFramework.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

        Quest saveThePrincess = new Quest("Uratuj Ksiezniczke");
        Knight lancelot = new Knight("Lancelot", 30, saveThePrincess);

        Quest killTheDragon = new Quest("Zabij Smoka");
        Knight percival = new Knight("Percival", 24);
        percival.setQuest(killTheDragon);

        System.out.println(lancelot);
        System.out.println(percival);
    }


}
