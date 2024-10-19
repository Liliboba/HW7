public class HW7 {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(150, 75),
                new Warrior(200, 50),
                new Medic(100, 25, 25)
        };
        for (Hero hero : heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic) hero).increaseExperience();
            }
        }
    }
}