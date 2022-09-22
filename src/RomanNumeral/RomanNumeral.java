public class RomanNumeral {
    public static void main(String[] args) {
        String roman = "III";
        System.out.println("The value of " + roman + " is " + romanToInt(roman));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int value = 0;

        for (char c : chars) {
            System.out.println("sum" + value);
            value += Integer.valueOf(getValue(c));
        }

        return value;
    }

    public static int getValue(char c) {
        int value = 0;

        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }

        return value;
    }
}
