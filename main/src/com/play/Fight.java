package com.play;


// 还是得放个私有变量算剩下的圈 static不行

public class Fight {
    public static FightObject runFight(FightObject a,FightObject b) {
        if(a.getLife() > 0 && b.getLife() > 0) {
            startAction();
        } else {
            if(a.getLife() > 0) return a;
            if(b.getLife() > 0) return b;
        }
    }

    public static void startAction(){

    }

    public static void atkAction(FightObject atkObj, FightObject beAtkObj) {
        beAtkObj.setLife(beAtkObj.getLife() - atkObj.getAtk());
    }
}
