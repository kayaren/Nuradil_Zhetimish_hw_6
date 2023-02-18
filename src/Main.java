import sun.font.DelegatingShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHealth(500);
        boss.setBossWeapon(WeaponType.M4A4);

        System.out.println(boss.getBossDamage());
        System.out.println(boss.getBossHealth());
        System.out.println(boss.getBossWeapon());




    }
}
