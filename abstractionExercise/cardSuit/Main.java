package abstractionExercise.cardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuits[] values = CardSuits.values();
        System.out.println("Card Suits:");
        for (CardSuits value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value);
        }
    }
}
