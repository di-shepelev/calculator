class Calculate {
    static int vert(int numberA, String b, int numberC) {
        if (b.equals("/")) {
            return numberA / numberC;
        }
        if (b.equals("*")) {
            return numberA * numberC;
        }
        if (b.equals("+")) {
            return numberA + numberC;
        }
        if (b.equals("-")) {
            return numberA - numberC;
        }
        return 0;
    }
    static int convert(String stringB) throws Exception {
        int a;
        switch (stringB.toUpperCase()) {
            case "I" :
                return a = 1;

            case "II" :
                return a = 2;

            case "III" :
                return a = 3;

            case "IV" :
                return a = 4;

            case "V" :
                return a = 5;

            case "VI" :
                return a = 6;

            case "VII" :
                return a = 7;

            case "VIII" :
                return a = 8;

            case "IX" :
                return a = 9;

            case "X" :
                return a = 10;

            default :
                throw new Exception("Римские числа не могут быть больше X");
        }
    }
    static String convertRimThree(int a) {
        String b = null;
        if (a <= 10){
            b = convertRimOne(a);
        } else if (a == 100) {
            b = "C";
        } else {
            b = convertRimTwo(a);
            b = b + convertRimFour(a);
        }
        return b;
    }
    static String convertRimOne(int a) {
        String b = null;
        if (a == 1) {
            b = "I";
        } else if (a == 2) {
            b = "II";
        } else if (a == 3) {
            b = "II";
        } else if (a == 4) {
            b = "IV";
        } else if (a == 5) {
            b = "V";
        } else if (a == 6) {
            b = "VI";
        } else if (a == 7) {
            b = "VII";
        } else if (a == 8) {
            b = "VIII";
        } else if (a == 9) {
            b = "IV";
        } else if (a == 10) {
            b = "X";
        }
        return b;
    }
    static String convertRimFour(int a) {
        String b = Integer.toString(a);
        String c = String.valueOf(b.charAt(1));
        if (c.equals("1")) {
            b = "I";
        } else if (c.equals("2")) {
            b = "II";
        } else if (c.equals("3")) {
            b = "II";
        } else if (c.equals("4")) {
            b = "IV";
        } else if (c.equals("5")) {
            b = "V";
        } else if (c.equals("6")) {
            b = "VI";
        } else if (c.equals("7")) {
            b = "VII";
        } else if (c.equals("8")) {
            b = "VIII";
        } else if (c.equals("9")) {
            b = "IV";
        } else if (c.equals("0")) {
            b = "";
        }
        return b;

    }
    static String convertRimTwo(int a) {
        String b = Integer.toString(a);
        String c = String.valueOf(b.charAt(0));
        if (c.equals("1")) {
            b = "X";
        } else if (c.equals("2")) {
            b = "XX";
        } else if (c.equals("3")) {
            b = "XXX";
        } else if (c.equals("4")) {
            b = "XL";
        } else if (c.equals("5")) {
            b = "L";
        } else if (c.equals("6")) {
            b = "LX";
        } else if (c.equals("7")) {
            b = "LXX";
        } else if (c.equals("8")) {
            b = "LXXX";
        } else if (c.equals("9")) {
            b = "XC";
        }
        return b;
    }
}
