package inheritance.stackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();

        System.out.println(stackOfStrings.isEmpty());

        stackOfStrings.push("Dimitar");
        stackOfStrings.push("Stefanov");
        stackOfStrings.push("Kaukov");
        stackOfStrings.push("Doksan");

        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.size());
        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.isEmpty());
    }
}
