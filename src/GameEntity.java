public class GameEntity {

    private int  bossDamage;
    private int bossHealth;
    private WeaponType bossWeapon;

    private int heroDamage;
    private int heroHealth;
    private WeaponType heroWeapon;

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public WeaponType getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(WeaponType bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public WeaponType getHeroWeapon() {
        return heroWeapon;
    }

    public void setHeroWeapon(WeaponType heroWeapon) {
        this.heroWeapon = heroWeapon;
    }
}
