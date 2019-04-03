import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Starship> fleet = new ArrayList<>();
        ArrayList<Starship> defense=new ArrayList<>();
        ArrayList<Starship> offense =new ArrayList<>();

        String[] names = new String[]{"Righteous Purpose", "Inner Knowledge", "Faithful Ardor", "Furious Redemption", "Furious Retribution", "Glorious Interdiction", "Holy Respite", "Particular Justice", "Profound Solitude", "Retribution", "Rigorous Prayer", "Sacred Concecration", "Tranquil Composure", "Valiant Prudence", "Blessed Veneration", "Second Homogeneous Clarity", "Third Glorious Consequence", "Prophet of Truth's fleet", "Second Solemn Accord", "High Charity"};

        for (int i = 0; i < 20; i++) {
            if (i < 5) {
                fleet.add(new Escort(names[i]));
                defense.add(new Escort(names[i]));

            } else if (i >= 5 && i < 10) {
                fleet.add(new Frigate(names[i]));

            } else if (i <= 10 && i < 15) {
                fleet.add(new Cruiser(names[i]));


            } else if (i >= 15 && i < 20) {
                fleet.add(new Battleship(names[i]));
                offense.add(new Battleship(names[i]));
            }
        }

        System.out.println("Overall available fleet:");
        for (Starship i : fleet) {
            i.showStats();
        }
        System.out.println("Defense Battalion:");
        for (Starship z : defense){
            z.showStats();

            }
            System.out.println("Offense Battalion:");
        for (Starship t : offense){
            t.showStats();
        }


        }
    }

