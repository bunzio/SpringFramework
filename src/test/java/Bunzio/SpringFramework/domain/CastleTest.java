package Bunzio.SpringFramework.domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Bunzio on 02.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class CastleTest {

    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "Killing Zone");
        String except = "Znajduje się tu zamek o nazwie Killing Zone Zamieszkały przez: Rycerz o imieniu: Lancelot " +
                "(29" +
                " lat). Zadanie: Uratuj Ksiezniczke";

        assertEquals(except, castle.toString());

    }
}
