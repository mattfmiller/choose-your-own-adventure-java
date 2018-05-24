package models;

public class Adventure {
    public String heroName;
    public Integer heroTime;

    public Adventure(String heroName) {
        this.heroName = heroName;
        this.heroTime = 10;
    }

    public String getHeroName() {
        return heroName;
    }

    public Integer getHeroTime() {
        return 0;
    }
}
