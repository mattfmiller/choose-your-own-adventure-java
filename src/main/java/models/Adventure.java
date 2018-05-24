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

    public Integer setHeroTime(int timechoiceTakes) {
        return heroTime - timechoiceTakes;
    }

    public Boolean choice(String userReturn) {
        if(userReturn.equals("a")) {
            return true;
        } else if (userReturn.equals("b")) {
            return false;
        } else {
            return null;
        }
    }

    public Boolean checkLose() {
        if (heroTime > 0) {
            return true;
        } else {
            return false;
        }
    }
}
