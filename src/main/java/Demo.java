import characters.Character;

public class Demo {
    private static GameManager gameManager = new GameManager();

    public static void main(String args[]) {
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

        System.out.println("Knight: HP=" + knight.getStats().getHp() + ", Power=" + knight.getStats().getPower());
        System.out.println("Elf: HP=" + elf.getStats().getHp() + ", Power=" + elf.getStats().getPower());
        System.out.println("Hobbit: HP=" + hobbit.getStats().getHp() + ", Power=" + hobbit.getStats().getPower());
        System.out.println("King: HP=" + king.getStats().getHp() + ", Power=" + king.getStats().getPower());

        System.out.println("\n" + "=".repeat(50));

        System.out.println("\nCreating random characters using reflections:");
        System.out.println("Available character types: " + CharacterFactory.getAvailableCharacterTypes());

        Character randomChar1 = CharacterFactory.createRandomCharacter();
        Character randomChar2 = CharacterFactory.createRandomCharacter();

        System.out.println("Random Character 1: " + randomChar1.getClass().getSimpleName() +
                " (HP=" + randomChar1.getStats().getHp() + ", Power=" + randomChar1.getStats().getPower() + ")");
        System.out.println("Random Character 2: " + randomChar2.getClass().getSimpleName() +
                " (HP=" + randomChar2.getStats().getHp() + ", Power=" + randomChar2.getStats().getPower() + ")");

        System.out.println("\n" + "=".repeat(50));

        System.out.println("\nStarting a fight between two random characters:\n");
        gameManager.fight(randomChar1, randomChar2);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Demo completed!");
    }
}
