public class Hero {
    
    String name;
    int powerLevel;
    String affiliation;

    
    public Hero(String name, int powerLevel, String affiliation) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }
    public String toString() {
        return name + " (Power: " + powerLevel + ", Affiliation: " + affiliation + ")";
    }
}