package com.play;

public class FightObject {
    private int life;
    private int atk;
    private int spd;

    public FightObject(int life, int atk, int spd) {
        this.life = life;
        this.atk = atk;
        this.spd = spd;
    }

    public int getAtk() {
        return atk;
    }

    public int getLife() {
        return life;
    }

    public int getSpd() {
        return spd;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }
}
