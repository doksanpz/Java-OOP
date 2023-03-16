package foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyersByName = new HashMap<>();

        int numPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numPeople; i++) {
            String[] personParameters = scanner.nextLine().split("\\s+");

            switch (personParameters.length) {
                case 3:
                    Rebel rebel = new Rebel(personParameters[0], Integer.parseInt(personParameters[1]), personParameters[2]);
                    buyersByName.put(rebel.getName(), rebel);
                    break;
                case 4:
                    Citizen citizen = new Citizen(personParameters[0],Integer.parseInt(personParameters[1]), personParameters[2], personParameters[3]);
                    buyersByName.put(citizen.getName(), citizen);
                    break;
            }
        }

        String name = scanner.nextLine();

        while (!name.equals("End")) {
            if (buyersByName.containsKey(name)) {
                buyersByName.get(name).buyFood();
            }
            name = scanner.nextLine();
        }

        int sum = buyersByName.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sum);
    }
}
