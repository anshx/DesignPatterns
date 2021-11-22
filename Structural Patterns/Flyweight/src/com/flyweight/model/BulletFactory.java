package com.flyweight.model;

public class BulletFactory {

    public static Bullet getBullet(String type) {
        if(type.equals("9mm")) {
            return new Bullet("Red", "9", "9");
        }
        return new Bullet("white", "3", "3");
    }

}
