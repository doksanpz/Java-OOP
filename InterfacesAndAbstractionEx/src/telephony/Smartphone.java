package telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;
    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public String call() {
        StringBuilder resultBuilder = new StringBuilder();

        for (String number : numbers) {
            if (number.matches("\\d+")) {
                resultBuilder.append("Calling... " + number);
            } else {
                resultBuilder.append("Invalid number!" );
            }
            resultBuilder.append(System.lineSeparator());
        }

        return resultBuilder.toString();
    }

    public String browse() {
        StringBuilder resultBuilder = new StringBuilder();

        for (String url : urls) {
            if (url.matches("\\d+")) {
                resultBuilder.append("Invalid URL!");
            } else {
                resultBuilder.append(String.format("Browsing: %s!", url));
            }
            resultBuilder.append(System.lineSeparator());
        }

        return resultBuilder.toString();
    }
}
