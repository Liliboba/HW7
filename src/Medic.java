public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, int healPoints){
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    public void applySuperAbility(){
        System.out.println("Madic применил супер способность " + getSuperAbilityType());
    }

    public void increaseExperience(){
        healPoints += healPoints * 0.1;
        System.out.println("У медика увеличивалось количество единиц лечения на 10%, новые healPoints: " + healPoints);
    }

    public int getHealPoints() {
        return healPoints;
    }
}
