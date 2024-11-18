import java.util.ArrayList;
import java.util.Arrays;

public class Heromanager 
{
    private ArrayList<Hero> heros = new ArrayList<>();

    public Heromanager() {
        heros = new ArrayList<>();

        heros.add(new Hero("Spider-Man", 82, "AVENGERS"));
        heros.add(new Hero("RedHood", 90, "JUSTICE_LEAGUE"));
        heros.add(new Hero("Proffessor X", 80, "X_MEN"));
        heros.add(new Hero("Greenlantern", 83, "JUSTICE_LEAGUE"));
    }

    public void addHero(String name, int powerLevel, String affiliation)
    {
        heros.add(new Hero(name, powerLevel, affiliation));
        System.out.println(name + " added to the list.");
        heros2DArray();
    }

    public void removeHero(String name)
    {
        for (int i = 0; i < heros.size(); i++)
        {
            if (heros.get(i).name.equals(name))
            {
                heros.remove(i);
                System.out.println("Hero: " + name + " removed");
                heros2DArray();
                return;
            }
        }
        System.out.println("Hero " + name + "not found.");
    }

    public void originalList()
    {
        if (heros.isEmpty())
        {
            System.out.println("This list is currently empty.");
            return;
        }

        System.out.println("Original List");
        for (Hero hero : heros)
        {
            System.out.println(hero.name + " - Power level: " + hero.powerLevel + " - Affiliation: " + hero.affiliation);
        }
    }

    public void bubbleSortByPower()
    {
        int n = heros.size();
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (heros.get(j).powerLevel > heros.get(j + 1).powerLevel)
                {
                    Hero temp = heros.get(j);
                    heros.set(j, heros.get(j + 1));
                    heros.set(j + 1, temp);
                }
            }
        }

        System.out.println("Heros sorted by Bubble sort: ");
        displayHeros();
    }

    public void insertionSort()
    {
        for (int i = 1; i < heros.size(); i++)
        {
            Hero key = heros.get(i);
            int j = i - 1;
            while (j >= 0 && heros.get(j).powerLevel > key.powerLevel)
            {
                heros.set(j + 1, heros.get(j));
                j = j - 1;
            }
            heros.set(j + 1, key);
        }

        System.out.println("Heros sorted by Insertion Sort: ");
        displayHeros();
    }

    public void heros2DArray()
    {
        if (heros.isEmpty())
        {
            System.out.println("No heros in the list currently");
            return;
        }


        String[][] heroArray = new String[heros.size()][3];
        for (int i = 0; i < heros.size(); i++)
        {
            Hero hero = heros.get(i);
            heroArray[i][0] = hero.name;
            heroArray[i][1] = String.valueOf(hero.powerLevel);
            heroArray[i][2] = hero.affiliation;
        }

        System.out.println("Current Hero List: ");

        System.out.println(Arrays.deepToString(heroArray));
    }

    private void displayHeros()
    {
        for (Hero hero : heros)
        {
            System.out.println(hero.name + " - Power level: " + hero.powerLevel + " - Affiliation: " + hero.affiliation);
        }
    }



}