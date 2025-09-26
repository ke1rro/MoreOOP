package characters;


import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Knight implements Character{
    private int hp;
    @Setter
    private int power;
    private Random StatsGenerator = new Random();

    /**
     * Construct the Knight with default HP and Power from 2 to 12.
     */
    public Knight(){
        this.hp = 2 + StatsGenerator.nextInt(10);
        this.power = 2 + StatsGenerator.nextInt(10);
    }

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
        int damage = StatsGenerator.nextInt(hp + 1);

        other.setHp(other.getHp() - damage);
        System.out.println("Knight hits -" + damage + " HP. Enemy now has " + other.getHp() + " HP.");
    }

}
