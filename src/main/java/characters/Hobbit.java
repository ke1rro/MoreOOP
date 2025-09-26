package characters;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Hobbit implements Character{
    private int hp = 3;
    @Setter
    private int power = 0;

    private void toCry(){
        System.out.println("Hobbit can not hit someone he is just crying...");
    }

    @Override
    public void setHp(int hp){
        this.hp = (hp < 0) ? 0 : hp;
    }

    @Override
    public void kick(Character other){
        toCry();
    }

    @Override
    public boolean isAlive(){
        return hp > 0;
    }

}
