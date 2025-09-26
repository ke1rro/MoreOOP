package characters;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Elf implements Character{
    private int hp = 10;
    @Setter
    private int power = 10;

    @Override
    public void setHp(int hp){
        this.hp = (hp < 0) ? 0 : hp;
    }

    @Override
    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public void kick(Character other){
        if (power > other.getPower()){
            other.setHp(0);
            System.out.println("Elf kills the enemy!");
        }
        else{
            other.setPower(other.getPower() - power);
            System.out.println("Elf hit -" + getPower() + " and decreased the enemy power to " + other.getPower());
        }
    }
}
