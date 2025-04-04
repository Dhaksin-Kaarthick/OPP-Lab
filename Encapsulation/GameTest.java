class GameCharacter {
    private String name;
    private int level;
    private int strength;
    private int intelligence;

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = Math.max(level, 1);
    }

    public void setStrength(int strength) {
        this.strength = Math.max(strength, 1);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = Math.max(intelligence, 1);
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return (strength * 2 + intelligence * 3) * level;
    }
}

public class GameTest {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter();
        hero.setName("Ketta Paiyyan");
        hero.setLevel(10);
        hero.setStrength(20);
        hero.setIntelligence(15);

        System.out.println("Hero: " + hero.getName());
        System.out.println("Power Level: " + hero.getPowerLevel());
    }
}

