public class Warrior extends Hero{
    public Warrior(int health, int damage){
        super(health, damage, "CRITICAL DAMAGE");
    }
    public void applySuperAbility(){
        System.out.println("Warrior применил супер способность " + getSuperAbilityType());
    }
}
