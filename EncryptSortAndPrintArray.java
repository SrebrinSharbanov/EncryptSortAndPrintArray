package Fundamentals.MoreExc03;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringCount = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[stringCount];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        int symbol;
        int encryption = 0;
        int[] encrypt = new int[strings.length];
        for (int i = 0; i < encrypt.length; i++) {
            for (int j = i; j <= i ; j++) {
                char[] charArray = strings[j].toCharArray();
                for (int k = 0; k < charArray.length; k++) {
                    char y = charArray[k];
                    if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                            || y == 'O' || y == 'U') {
                        symbol = y;
                        encryption = encryption + (symbol * strings.length);
                    } else {
                        symbol = y;
                        encryption = encryption + (symbol / strings.length);
                    }
                }

                encrypt[i] = encryption;
                encryption = 0;
            }

        }

        Arrays.sort(encrypt);

        for (int i = 0; i < encrypt.length; i++) {
            System.out.println(encrypt[i]);
        }

    }
}
