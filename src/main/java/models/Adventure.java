package models;

public class Adventure {
    private String heroName;
    private Integer heroTime;

    public Adventure(String heroName) {
        this.heroName = heroName;
        this.heroTime = 10;
    }

    public String getHeroName() {
        return heroName;
    }

    public Integer getHeroTime() {
        return 10;
    }

    public Integer setHeroTime(Integer timechoiceTakes) {
        return heroTime - 0;
    }
}
