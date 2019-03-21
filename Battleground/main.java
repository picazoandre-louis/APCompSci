
import  java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> Players = new ArrayList<PlayerCharacter>();


        Fighter playerA = new Fighter("Jem");
        playerA.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");


        Mage playerB = new Mage("Penhallow");
        playerB.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");


        Paladin playerC = new Paladin("Zachariah");
        playerC.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");


        Priest playerD = new Priest("Jessamine");
        playerD.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Players.add(new Fighter ("Jem"));
        Players.add(new Paladin("Zachariah"));
        Players.add(new Priest("Jessamine"));
        Players.add(new Mage("Penhallow"));


    }
}
