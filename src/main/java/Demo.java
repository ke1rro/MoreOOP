import characters.Character;

public class Demo {
    public static void main(String args[]){
        System.out.println("Welcome to the Character Fight Game!\n");

        System.out.println("Creating characters using specific factories:");
        KnightFactory knightFactory = new KnightFactory();
        ElfFactory elfFactory = new ElfFactory();
        HobbitFactory hobbitFactory = new HobbitFactory();
        KingFactory kingFactory = new KingFactory();

        Character knight = knightFactory.createCharacter();
        Character elf = elfFactory.createCharacter();
        Character hobbit = hobbitFactory.createCharacter();
        Character king = kingFactory.createCharacter();

        System.out.println("Knight: HP=" + knight.getHp() + ", Power=" + knight.getPower());
        System.out.println("Elf: HP=" + elf.getHp() + ", Power=" + elf.getPower());
        System.out.println("Hobbit: HP=" + hobbit.getHp() + ", Power=" + hobbit.getPower());
        System.out.println("King: HP=" + king.getHp() + ", Power=" + king.getPower());

        System.out.println("\n" + "=".repeat(50));

        System.out.println("\nCreating random characters using reflections:");

        Character randomChar1 = CharacterFactory.createRandomCharacter();
        Character randomChar2 = CharacterFactory.createRandomCharacter();

        System.out.println("Random Character 1: " + randomChar1.getClass().getSimpleName() +
                          " (HP=" + randomChar1.getHp() + ", Power=" + randomChar1.getPower() + ")");
        System.out.println("Random Character 2: " + randomChar2.getClass().getSimpleName() +
                          " (HP=" + randomChar2.getHp() + ", Power=" + randomChar2.getPower() + ")");

        System.out.println("\n" + "=".repeat(50));

        System.out.println("\nStarting a fight between two random characters:\n");

        GameManager gameManager = new GameManager();
        gameManager.fight(randomChar1, randomChar2);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Demo completed!");
    }
}
