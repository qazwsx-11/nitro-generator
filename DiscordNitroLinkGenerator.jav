import java.util.Random;
import java.util.Scanner;

public class DiscordNitroLinkGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many Discord Nitro links do you want to generate? ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            String link = generator(random);
            System.out.println(link);
        }

        scanner.close();
    }

    private static String generator(Random random) {
        StringBuilder link = new StringBuilder("https://discord.gift/");
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 16; i++) {
            int index = random.nextInt(chars.length());
            link.append(chars.charAt(index));
        }

        return link.toString();
    }
}
