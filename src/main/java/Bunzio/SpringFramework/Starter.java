package Bunzio.SpringFramework;

import Bunzio.SpringFramework.domain.Knight;
import Bunzio.SpringFramework.domain.Quest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Quest saveThePrincess = new Quest("Uratuj Ksiezniczke");
        Knight lancelot = new Knight("Lancelot", 30, saveThePrincess);

        Quest killTheDragon = new Quest("Zabij Smoka");
        Knight percival = new Knight("Percival", 24);
        System.out.println(percival);
        percival.setQuest(killTheDragon);

        System.out.println(lancelot);
        System.out.println(percival);
    }


}
