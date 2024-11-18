public class SuperheroRoster {
 
    public static void main(String[] args) {
        

        String[] heroNames = {"Spider-Man", "Flash", "Batman"};
        String[] abilities = {"Web-slinging", "Super speed and strength", "Stealth, combat, money and intelligence"};
        int[] powerLevels = {85, 90, 80};
 
        
        for (int i = 0; i < heroNames.length; i++)
        {
            System.out.println("Hero: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power levels: " + powerLevels[i]);
        }
 

        String targetHero = "Flash";
        searchHero(heroNames, abilities, powerLevels, targetHero);
 

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average power level: " + averagePower);

        Superhero[] superheros = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++)
        {
            superheros[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            superheros[i].displayHero();
        }
 
    }
 
    
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        

        boolean found = false;
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(target))
            {
                System.out.println("Found Hero: " + names[i] + ", Ability: " + abilities[i] + ", Power levels: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Hero not found: " + target);
        }

    }
 
    
    public static double calculateAveragePower(int[] powerLevels) {
        

        int sum = 0;
        for (int power : powerLevels)
        {
            sum += power;
        }

        return (double) sum / powerLevels.length; // Placeholder return value
    }
}


class Superhero {
   


    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel)
    {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }
 
    
    public void displayHero() {
        
        System.out.println("Hero: " + name + ", Ability: " + ability + ", Power levels: " + powerLevel);
    }
}