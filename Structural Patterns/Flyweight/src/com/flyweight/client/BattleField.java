package com.flyweight.client;

import com.flyweight.model.Bullet;
import com.flyweight.model.BulletFactory;
import com.flyweight.model.MovingBullet;

public class BattleField {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            MovingBullet b = new MovingBullet(Math.random(), Math.random(), BulletFactory.getBullet("9mm"));
            System.out.println(b);
        }
    }
}
