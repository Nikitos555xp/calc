import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static int calc(String arab) throws Exception {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "I + I" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "I + II" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "I + III" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "I + IV" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "I + V" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "I + VI" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "I + VII" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "I + VIII" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "I + IX" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
        }

        switch (input) {
            case "II + I" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "III + I" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "IV + I" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "V + I" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "VI + I" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "VII + I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "VIII + I" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "IX + I" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
        }

        switch (input) {
            case "II + II" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "II + III" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "II + IV" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "II + V" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "II + VI" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "II + VII" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "II + VIII" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "II + X" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
        }

        switch (input) {
            case "III + II" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "IV + II" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "V + II" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "VI + II" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "VII + II" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "VIII + II" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "X + II" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
        }

        switch (input) {
            case "III + IV" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "III + V" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "III + VI" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "III + VII" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "III + VIII" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
            case "III + IX" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "III + X" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
        }

        switch (input) {
            case "IV + III" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "V + III" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "VI + III" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "VII + III" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "VIII + III" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
            case "IX + III" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "X + III" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
        }

        switch (input) {
            case "IV + IV" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "IV + V" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "IV + VI" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "IV + VII" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
            case "IV + VIII" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "IV + IX" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
            case "IV + X" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
        }

        switch (input) {
            case "V + IV" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "VI + IV" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "VII + IV" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
            case "VIII + IV" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "IX + IV" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
            case "X + IV" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
        }

        switch (input) {
            case "V + V" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "V + VI" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
            case "V + VII" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "V + VIII" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
            case "V + IX" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "V + X" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
        }

        switch (input) {
            case "VI + V" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
            case "VII + V" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "VIII + V" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
            case "IX + V" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "X + V" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
        }

        switch (input) {
            case "VI + VI" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "VI + VII" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
            case "VI + VIII" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "VI + IX" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
            case "VI + X" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
        }

        switch (input) {
            case "VII + VI" -> {
                System.out.println("Output:");
                System.out.println("XIII");
            }
            case "VIII + VI" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "IX + VI" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
            case "X + VI" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
        }

        switch (input) {
            case "VII + VII" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "VII + VIII" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
            case "VII + IX" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
            case "VII + X" -> {
                System.out.println("Output:");
                System.out.println("XVII");
            }
        }

        switch (input) {
            case "VIII + VII" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
            case "IX + VII" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
            case "X + VII" -> {
                System.out.println("Output:");
                System.out.println("XVII");
            }
        }

        switch (input) {
            case "VIII + VIII" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
            case "VIII + IX" -> {
                System.out.println("Output:");
                System.out.println("XVII");
            }
            case "VIII + X" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
        }

        switch (input) {
            case "IX + VIII" -> {
                System.out.println("Output:");
                System.out.println("XVII");
            }
            case "X + VIII" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
        }

        switch (input) {
            case "IX + IX" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
            case "IX + X" -> {
                System.out.println("Output:");
                System.out.println("XIX");
            }
        }

        switch (input) {
            case "X + IX" -> {
                System.out.println("Output:");
                System.out.println("XIX");
            }
            case "X + X" -> {
                System.out.println("Output:");
                System.out.println("XX");
            }
            case "X + I", "I + X" -> {
                System.out.println("Output:");
                System.out.println("XI");
            }
        }

        switch (input) {
            case "II - I" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "III - I" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "IV - I" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "V - I" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "VI - I" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "VII - I" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "VIII - I" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "IX - I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "X - I" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
        }

        switch (input) {
            case "III - II" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "IV - II" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "V - II" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "VI - II" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "VII - II" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "VIII - II" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "IX - II" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "X - II" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
        }

        switch (input) {
            case "IV - III" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "V - III" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "VI - III" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "VII - III" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "VIII - III" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "IX - III" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "X - III" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
        }

        switch (input) {
            case "V - IV", "VII - VI" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "VI - IV", "VIII - VI" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "IX - VI" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "X - VI" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
        }

        switch (input) {
            case "VIII - IV" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "VIII - V", "X - VII" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "VIII - VII" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "IX - VII", "VII - V" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
        }

        switch (input) {
            case "IX - IV" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "IX - V" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "IX - VIII" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "X - VIII" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
        }

        switch (input) {
            case "X - IV" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "X - V" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "X - IX" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
        }

        switch (input) {
            case "I * I" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "I * II" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "I * III" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "I * IV" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "I * V" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "I * VI" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "I * VII" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "I * VIII" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "I * IX" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "I * X" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
        }

        switch (input) {
            case "II * I" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "III * I" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "IV * I" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "V * I" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "VI * I" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "VII * I" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "VIII * I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "IX * I" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "X * I" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
        }

        switch (input) {
            case "II * II" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "II * III" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "II * IV" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "II * V" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "II * VI" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "II * VII" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "II * VIII" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
            case "II * IX" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
            case "II * X" -> {
                System.out.println("Output:");
                System.out.println("XX");
            }
        }

        switch (input) {
            case "III * II" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "IV * II" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "V * II" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
            case "VI * II" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "VII * II" -> {
                System.out.println("Output:");
                System.out.println("XIV");
            }
            case "VIII * II" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
            case "IX * II" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
            case "X * II" -> {
                System.out.println("Output:");
                System.out.println("XX");
            }
        }

        switch (input) {
            case "III * III" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "III * IV" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "III * V" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
            case "III * VI" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
            case "III * VII" -> {
                System.out.println("Output:");
                System.out.println("XXI");
            }
            case "III * VIII" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
            }
            case "III * IX" -> {
                System.out.println("Output:");
                System.out.println("XXVII");
            }
            case "III * X" -> {
                System.out.println("Output:");
                System.out.println("XXX");
            }
        }

        switch (input) {
            case "IV * III" -> {
                System.out.println("Output:");
                System.out.println("XII");
            }
            case "V * III" -> {
                System.out.println("Output:");
                System.out.println("XV");
            }
            case "VI * III" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
            }
            case "VII * III" -> {
                System.out.println("Output:");
                System.out.println("XXI");
            }
            case "VIII * III" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
            }
            case "IX * III" -> {
                System.out.println("Output:");
                System.out.println("XXVII");
            }
            case "X * III" -> {
                System.out.println("Output:");
                System.out.println("XXX");
            }
        }

        switch (input) {
            case "IV * IV" -> {
                System.out.println("Output:");
                System.out.println("XVI");
            }
            case "IV * V" -> {
                System.out.println("Output:");
                System.out.println("XX");
            }
            case "IV * VI" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
            }
            case "IV * VII" -> {
                System.out.println("Output:");
                System.out.println("XXVIII");
            }
            case "IV * VIII" -> {
                System.out.println("Output:");
                System.out.println("XXXII");
            }
            case "IV * IX" -> {
                System.out.println("Output:");
                System.out.println("XXXVI");
            }
            case "IV * X" -> {
                System.out.println("Output:");
                System.out.println("XL");
            }
        }

        switch (input) {
            case "V * IV" -> {
                System.out.println("Output:");
                System.out.println("XX");
            }
            case "V * V" -> {
                System.out.println("Output:");
                System.out.println("XXV");
            }
            case "V * VI" -> {
                System.out.println("Output:");
                System.out.println("XXX");
            }
            case "V * VII" -> {
                System.out.println("Output:");
                System.out.println("XXXV");
            }
            case "V * VIII" -> {
                System.out.println("Output:");
                System.out.println("XL");
            }
            case "V * IX" -> {
                System.out.println("Output:");
                System.out.println("XLV");
            }
            case "V * X" -> {
                System.out.println("Output:");
                System.out.println("L");
            }
        }

        switch (input) {
            case "VI * V" -> {
                System.out.println("Output:");
                System.out.println("XXX");
            }
            case "VII * V" -> {
                System.out.println("Output:");
                System.out.println("XXXV");
            }
            case "VIII * V" -> {
                System.out.println("Output:");
                System.out.println("XL");
            }
            case "IX * V" -> {
                System.out.println("Output:");
                System.out.println("XLV");
            }
            case "X * V" -> {
                System.out.println("Output:");
                System.out.println("L");
            }
        }

        switch (input) {
            case "VI * IV" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
            }
            case "VII * IV" -> {
                System.out.println("Output:");
                System.out.println("XXVIII");
            }
            case "VIII * IV" -> {
                System.out.println("Output:");
                System.out.println("XXXII");
            }
            case "IX * IV" -> {
                System.out.println("Output:");
                System.out.println("XXXVI");
            }
            case "X * IV" -> {
                System.out.println("Output:");
                System.out.println("XL");
            }
        }

        switch (input) {
            case "VI * VI" -> {
                System.out.println("Output:");
                System.out.println("XXXVI");
            }
            case "VI * VII" -> {
                System.out.println("Output:");
                System.out.println("XLII");
            }
            case "VI * VIII" -> {
                System.out.println("Output:");
                System.out.println("XLVIII");
            }
            case "VI * IX" -> {
                System.out.println("Output:");
                System.out.println("LIV");
            }
            case "VI * X" -> {
                System.out.println("Output:");
                System.out.println("LX");
            }
        }

        switch (input) {
            case "VII * VI" -> {
                System.out.println("Output:");
                System.out.println("XLII");
            }
            case "VIII * VI" -> {
                System.out.println("Output:");
                System.out.println("XLVIII");
            }
            case "IX * VI" -> {
                System.out.println("Output:");
                System.out.println("LIV");
            }
            case "X * VI" -> {
                System.out.println("Output:");
                System.out.println("LX");
            }
        }

        switch (input) {
            case "VII * VII" -> {
                System.out.println("Output:");
                System.out.println("XLIX");
            }
            case "VII * VIII" -> {
                System.out.println("Output:");
                System.out.println("LVI");
            }
            case "VII * IX" -> {
                System.out.println("Output:");
                System.out.println("LXIII");
            }
            case "VII * X" -> {
                System.out.println("Output:");
                System.out.println("LXX");
            }
        }

        switch (input) {
            case "VIII * VII" -> {
                System.out.println("Output:");
                System.out.println("LVI");
            }
            case "IX * VII" -> {
                System.out.println("Output:");
                System.out.println("LXIII");
            }
            case "X * VII" -> {
                System.out.println("Output:");
                System.out.println("LXX");
            }
        }

        switch (input) {
            case "VIII * VIII" -> {
                System.out.println("Output:");
                System.out.println("LXIV");
            }
            case "VIII * IX" -> {
                System.out.println("Output:");
                System.out.println("LXXII");
            }
            case "VIII * X" -> {
                System.out.println("Output:");
                System.out.println("LXXX");
            }
        }

        switch (input) {
            case "IX * VIII" -> {
                System.out.println("Output:");
                System.out.println("LXXII");
            }
            case "X * VIII" -> {
                System.out.println("Output:");
                System.out.println("LXXX");
            }
        }

        switch (input) {
            case "IX * IX" -> {
                System.out.println("Output:");
                System.out.println("LXXXI");
            }
            case "IX * X" -> {
                System.out.println("Output:");
                System.out.println("XC");
            }
        }

        switch (input) {
            case "X * X" -> {
                System.out.println("Output:");
                System.out.println("C");
            }
            case "X * IX" -> {
                System.out.println("Output:");
                System.out.println("XC");
            }
        }

        switch (input) {
            case "I / I" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "II / I" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "III / I" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "IV / I" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "V / I" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
            case "VI / I" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "VII / I" -> {
                System.out.println("Output:");
                System.out.println("VII");
            }
            case "VIII / I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
            }
            case "IX / I" -> {
                System.out.println("Output:");
                System.out.println("IX");
            }
            case "X / I" -> {
                System.out.println("Output:");
                System.out.println("X");
            }
        }

        switch (input) {
            case "II / II", "III / II" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "IV / II", "V / II" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "VI / II", "VII / II" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
            case "VIII / II", "IX / II" -> {
                System.out.println("Output:");
                System.out.println("IV");
            }
            case "X / II" -> {
                System.out.println("Output:");
                System.out.println("V");
            }
        }

        switch (input) {
            case "III / III", "IV / III", "V / III" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "VI / III", "VII / III", "VIII / III" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
            case "IX / III", "X / III" -> {
                System.out.println("Output:");
                System.out.println("III");
            }
        }

        switch (input) {
            case "IV / IV", "V / IV", "VII / IV" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "VI / IV" -> {
                System.out.println("Output:");
                System.out.println("VI");
            }
            case "VIII / IV", "IX / IV", "X / IV" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
        }

        switch (input) {
            case "V / V", "VI / V", "VII / V", "VIII / V", "IX / V" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
            case "X / V" -> {
                System.out.println("Output:");
                System.out.println("II");
            }
        }

        switch (input) {
            case "VI / VI", "VII / VI", "IX / VI", "VIII / VI", "X / VI" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
        }

        switch (input) {
            case "VII / VII", "VIII / VII", "IX / VII", "X / VII" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
        }

        switch (input) {
            case "VIII / VIII", "IX / VIII", "X / VIII" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
        }

        switch (input) {
            case "IX / IX", "X / IX" -> {
                System.out.println("Output:");
                System.out.println("I");
            }
        }

        if (input.equals("X / X")) {
            System.out.println("Output:");
            System.out.println("I");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I - I", "I - II", "I - III", "I - IV", "I - V", "I - VI", "I - VII", "I - VIII", "I - IX", "I - X", "II - II", "II - III", "II - IV", "II - V", "II - VI", "II - VII", "II - VIII", "II - IX", "II - X", "III - III", "III - IV", "III - V", "III - VI", "III - VII", "III - VIII", "III - IX", "III - X", "IV - IV", "IV - V", "IV - VI", "IV - VII", "IV - VIII", "IV - IX", "IV - X", "V - V", "V - VI", "V - VII", "V - VIII", "V - IX", "V - X", "VI - VI", "VI - VII", "VI - VIII", "VI - IX", "VI - X", "VII - VII", "VII - VIII", "VII - IX", "VII - X", "VIII - VIII", "VIII - IX", "VIII - X", "IX - IX", "IX - X", "X - X"->
                    throw new Exception("в римской системе нет отрицательных чисел");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I / I", "I / II", "I / III", "I / IV", "I / V", "I / VI", "I / VII", "I / VIII", "I / IX", "I / X", "II / II", "II / III", "II / IV", "II / V", "II / VI", "II / VII", "II / VIII", "II / IX", "II / X", "III / III", "III / IV", "III / V", "III / VI", "III / VII", "III / VIII", "III / IX", "III / X", "IV / IV", "IV / V", "IV / VI", "IV / VII", "IV / VIII", "IV / IX", "IV / X", "V / V", "V / VI", "V / VII", "V / VIII", "V / IX", "V / X", "VI / VI", "VI / VII", "VI / VIII", "VI / IX", "VI / X", "VII / VII", "VII / VIII", "VII / IX", "VII / X", "VIII / VIII", "VIII / IX", "VIII / X", "IX / IX", "IX / X", "X / X" ->
                    throw new Exception("в римской системе нет вещественных чисел");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I - 1", "1 - I", "I - 2", "2 - I", "I - 3","3 - I", "I - 4", "4 - I","I - 5", "5 - I", "I - 6", "6 - I", "I - 7","7 - I", "I - 8","8 - I", "I - 9","9 - I", "I - 10","10 - I", "II - 1", "1 - II", "II - 2","2 - II", "II - 3",  "3 - II","II - 4","4 - II", "II - 5","5 - II", "II - 6","6 - II", "II - 7","7 - II", "II - 8", "8 - II", "II - 9","9 - II", "II - 10", "10 - II", "III - 1","1 - III", "III - 2","2 - III","III - 3","3 - III", "III - 4","4 - III", "III - 5","5 - III", "III - 6","6 - III", "III - 7", "7 - III", "III - 8","8 - III", "III - 9","9 - III", "III - 10","10 - III","IV - 1","1 - IV", "IV - 2", "2 - IV", "IV - 3", "3 - IV","IV - 4", "4 - IV","IV - 5","5 - IV", "IV - 6","6 - IV", "IV - 7","7 - IV", "IV - 8","8 - IV", "IV - 9","9 - IV", "IV - 10","10 - IV", "V - 1", "1 - V", "V - 2","2 - V", "V - 3","3 - V", "V - 4","4 - V", "V - 5", "5 - V", "V - 6","6 - V", "V - 7","7 - V", "V - 8","8 - V", "V - 9", "9 - V", "V - 10","10 - V", "VI - 1", "1 - VI","VI - 2","2 - VI", "VI - 3","3 - VI", "VI - 4","4 - VI","VI - 5","5 - VI", "VI - 6","6 - VI", "VI - 7",  "7 - VI", "VI - 8","8 - VI", "VI - 9", "9 - VI", "VI - 10", "10 - VI", "VII - 1",  "1 - VII",  "VII - 2", "2 - VII",  "VII - 3","3 - VII", "VII - 4","4 - VII", "VII - 5","5 - VII", "VII - 6","6 - VII","VII - 7","7 - VII", "VII - 8","8 - VII",  "VII - 9","9 - VII", "VII - 10","10 - VII", "VIII - 1","1 - VIII","VIII - 2","2 - VIII","VIII - 3","3 - VIII","VIII - 4","4 - VIII","VIII - 5","5 - VIII", "VIII - 6","6 - VIII","VIII - 7","7 - VIII","VIII - 8","8 - VIII","VIII - 9","9 - VIII", "VIII - 10","10 - VIII","IX - 1","1 - IX","IX - 2","2 - IX","IX - 3","3 - IX","IX - 4","4 - IX","IX - 5","5 - IX","IX - 6","6 - IX","IX - 7","7 - IX","IX - 8","8 - IX","IX - 9","9 - IX","IX - 10","10 - IX","X - 1","1 - X","X - 2","2 - X","X - 3","3 - X","X - 4","4 - X", "X - 5","5 - X","X - 6","6 - X", "X - 7","7 - X","X - 8","8 - X","X - 9","9 - X","X - 10","10 - X" ->
                    throw new Exception("используются одновременно разные системы счисления");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I + 1", "1 + I", "I + 2", "2 + I", "I + 3", "3 + I", "I + 4", "4 + I", "I + 5", "5 + I", "I + 6", "6 + I", "I + 7", "7 + I", "I + 8", "8 + I", "I + 9", "9 + I", "I + 10", "10 + I", "II + 1", "1 + II", "II + 2", "2 + II", "II + 3", "3 + II", "II + 4", "4 + II", "II + 5", "5 + II", "II + 6", "6 + II", "II + 7", "7 + II", "II + 8", "8 + II", "II + 9", "9 + II", "II + 10", "10 + II", "III + 1", "1 + III", "III + 2", "2 + III", "III + 3", "3 + III", "III + 4", "4 + III", "III + 5", "5 + III", "III + 6", "6 + III", "III + 7", "7 + III", "III + 8", "8 + III", "III + 9", "9 + III", "III + 10", "10 + III", "IV + 1", "1 + IV", "IV + 2", "2 + IV", "IV + 3", "3 + IV", "IV + 4","4 + IV", "IV + 5", "5 + IV", "IV + 6", "6 + IV", "IV + 7","7 + IV", "IV + 8", "8 + IV", "IV + 9", "9 + IV", "IV + 10", "10 + IV", "V + 1", "1 + V", "V + 2", "2 + V", "V + 3", "3 + V", "V + 4", "4 + V", "V + 5", "5 + V", "V + 6", "6 + V", "V + 7", "7 + V", "V + 8", "8 + V", "V + 9", "9 + V", "V + 10", "10 + V", "VI + 1", "1 + VI", "VI + 2", "2 + VI", "VI + 3","3 + VI", "VI + 4", "4 + VI", "VI + 5", "5 + VI", "VI + 6", "6 + VI", "VI + 7", "7 + VI", "VI + 8", "8 + VI", "VI + 9", "9 + VI", "VI + 10", "10 + VI", "VII + 1", "1 + VII", "VII + 2", "2 + VII", "VII + 3", "3 + VII", "VII + 4", "4 + VII", "VII + 5", "5 + VII", "VII + 6", "6 + VII", "VII + 7", "7 + VII", "VII + 8", "8 + VII", "VII + 9", "9 + VII", "VII + 10", "10 + VII", "VIII + 1", "1 + VIII", "VIII + 2", "2 + VIII", "VIII + 3", "3 + VIII", "VIII + 4", "4 + VIII", "VIII + 5", "5 + VIII", "VIII + 6", "6 + VIII", "VIII + 7", "7 + VIII", "VIII + 8", "8 + VIII", "VIII + 9", "9 + VIII", "VIII + 10", "10 + VIII", "IX + 1", "1 + IX","IX + 2", "2 + IX", "IX + 3", "3 + IX", "IX + 4","4 + IX", "IX + 5", "5 + IX", "IX + 6", "6 + IX", "IX + 7", "7 + IX", "IX + 8", "8 + IX", "IX + 9", "9 + IX", "IX + 10", "10 + IX", "X + 1", "1 + X", "X + 2", "2 + X", "X + 3", "3 + X", "X + 4", "4 + X", "X + 5", "5 + X","X + 6", "6 + X", "X + 7","7 + X", "X + 8", "8 + X", "X + 9","9 + X", "X + 10","10 + X" ->
                    throw new Exception("используются одновременно разные системы счисления");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I * 1", "1 * I", "I * 2", "2 * I", "I * 3", "3 * I", "I * 4", "4 * I", "I * 5", "5 * I", "I * 6", "6 * I", "I * 7", "7 * I", "I * 8", "8 * I", "I * 9", "9 * I", "I * 10", "10 * I", "II * 1", "1 * II", "II * 2", "2 * II", "II * 3", "3 * II", "II * 4", "4 * II", "II * 5", "5 * II", "II * 6", "6 * II", "II * 7", "7 * II", "II * 8", "8 * II", "II * 9", "9 * II", "II * 10", "10 * II", "III * 1", "1 * III", "III * 2", "2 * III", "III * 3", "3 * III", "III * 4", "4 * III", "III * 5", "5 * III", "III * 6", "6 * III", "III * 7", "7 * III", "III * 8", "8 * III", "III * 9", "9 * III", "III * 10", "10 * III", "IV * 1", "1 * IV", "IV * 2", "2 * IV", "IV * 3", "3 * IV", "IV * 4", "4 * IV", "IV * 5", "5 * IV", "IV * 6", "6 * IV", "IV * 7", "7 * IV", "IV * 8", "8 * IV", "IV * 9", "9 * IV", "IV * 10", "10 * IV", "V * 1", "1 * V", "V * 2", "2 * V", "V * 3", "3 * V", "V * 4", "4 * V", "V * 5", "5 * V", "V * 6", "6 * V", "V * 7", "7 * V", "V * 8", "8 * V", "V * 9", "9 * V", "V * 10", "10 * V", "VI * 1", "1 * VI", "VI * 2", "2 * VI", "VI * 3", "3 * VI", "VI * 4", "4 * VI", "VI * 5", "5 * VI", "VI * 6", "6 * VI", "VI * 7", "7 * VI", "VI * 8", "8 * VI", "VI * 9", "9 * VI", "VI * 10", "10 * VI", "VII * 1", "1 * VII", "VII * 2", "2 * VII", "VII * 3", "3 * VII", "VII * 4", "4 * VII", "VII * 5", "5 * VII", "VII * 6", "6 * VII", "VII * 7", "7 * VII", "VII * 8", "8 * VII", "VII * 9", "9 * VII", "VII * 10", "10 * VII", "VIII * 1", "1 * VIII", "VIII * 2", "2 * VIII", "VIII * 3", "3 * VIII", "VIII * 4", "4 * VIII", "VIII * 5", "5 * VIII", "VIII * 6", "6 * VIII", "VIII * 7", "7 * VIII", "VIII * 8", "8 * VIII", "VIII * 9", "9 * VIII", "VIII * 10", "10 * VIII", "IX * 1", "1 * IX", "IX * 2", "2 * IX", "IX * 3", "3 * IX", "IX * 4", "4 * IX", "IX * 5", "5 * IX", "IX * 6", "6 * IX", "IX * 7", "7 * IX", "IX * 8", "8 * IX", "IX * 9", "9 * IX", "IX * 10", "10 * IX", "X * 1", "1 * X", "X * 2", "2 * X", "X * 3", "3 * X", "X * 4", "4 * X", "X * 5", "5 * X", "X * 6", "6 * X", "X * 7", "7 * X", "X * 8", "8 * X", "X * 9", "9 * X", "X * 10" ->
                    throw new Exception("используются одновременно разные системы счисления");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I / 1", "1 / I", "I / 2", "2 / I", "I / 3", "3 / I", "I / 4", "4 / I", "I / 5", "5 / I", "I / 6", "6 / I", "I / 7", "7 / I", "I / 8", "8 / I", "I / 9", "9 / I", "I / 10", "10 / I", "II / 1", "1 / II", "II / 2", "2 / II", "II / 3", "3 / II", "II / 4", "4 / II", "II / 5", "5 / II", "II / 6", "6 / II", "II / 7", "7 / II", "II / 8", "8 / II", "II / 9", "9 / II", "II / 10", "10 / II", "III / 1", "1 / III", "III / 2", "2 / III", "III / 3", "3 / III", "III / 4", "4 / III", "III / 5", "5 / III", "III / 6", "6 / III", "III / 7", "7 / III", "III / 8", "8 / III", "III / 9", "9 / III", "III / 10", "10 / III", "IV / 1", "1 / IV", "IV / 2", "2 / IV", "IV / 3", "3 / IV", "IV / 4", "4 / IV", "IV / 5", "5 / IV", "IV / 6", "6 / IV", "IV / 7", "7 / IV", "IV / 8", "8 / IV", "IV / 9", "9 / IV", "IV / 10", "10 / IV", "V / 1", "1 / V", "V / 2", "2 / V", "V / 3", "3 / V", "V / 4", "4 / V", "V / 5", "5 / V", "V / 6", "6 / V", "V / 7", "7 / V", "V / 8", "8 / V", "V / 9", "9 / V", "V / 10", "10 / V", "VI / 1", "1 / VI", "VI / 2", "2 / VI", "VI / 3", "3 / VI", "VI / 4", "4 / VI", "VI / 5", "5 / VI", "VI / 6", "6 / VI", "VI / 7", "7 / VI", "VI / 8", "8 / VI", "VI / 9", "9 / VI", "VI / 10", "10 / VI", "VII / 1", "1 / VII", "VII / 2", "2 / VII", "VII / 3", "3 / VII", "VII / 4", "4 / VII", "VII / 5", "5 / VII", "VII / 6", "6 / VII", "VII / 7", "7 / VII", "VII / 8", "8 / VII", "VII / 9", "9 / VII", "VII / 10", "10 / VII", "VIII / 1", "1 / VIII", "VIII / 2", "2 / VIII", "VIII / 3", "3 / VIII", "VIII / 4", "4 / VIII", "VIII / 5", "5 / VIII", "VIII / 6", "6 / VIII", "VIII / 7", "7 / VIII", "VIII / 8", "8 / VIII", "VIII / 9", "9 / VIII", "VIII / 10", "10 / VIII", "IX / 1", "1 / IX", "IX / 2", "2 / IX", "IX / 3", "3 / IX", "IX / 4", "4 / IX", "IX / 5", "5 / IX", "IX / 6", "6 / IX", "IX / 7", "7 / IX", "IX / 8", "8 / IX", "IX / 9", "9 / IX", "IX / 10", "10 / IX", "X / 1", "1 / X", "X / 2", "2 / X", "X / 3", "3 / X", "X / 4", "4 / X", "X / 5", "5 / X", "X / 6", "6 / X", "X / 7", "7 / X", "X / 8", "8 / X", "X / 9", "9 / X", "X / 10" ->
                    throw new Exception("используются одновременно разные системы счисления");
        }

        // Не бейте пожалуйста.
        switch (input) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" ->
                    throw new Exception("строка не является математической операцией");
        }

        // "\\d+": Это реdгулярное выражение, которое соответствует одному или более цифр.
        // "\\s*": Это регулярное выражение, которое соответствует нулю или более пробельным символам (пробелам или табуляции).
        // "\\+": Это регулярное выражение, которое соответствует символу "+". Обратный слеш \\ используется перед символом "+", так как "+" является специальным символом в регулярных выражениях и требует экранирования.
        // Если строка input не соответствует формату "ЧИСЛО + ЧИСЛО" или "РИМЧИСЛО + РИМЧИСЛО", то завершаем работу программы.
        if (input.matches("([1-9]\\d{0,6})|10{1,7}")) { //  Это выражение проверяет, соответствует ли строка input одной из следующих подстрок: "1", "2", "3", "4", "5", "6", "7", "8", "9" так до 10 000 000 000.
            throw new Exception("строка не является математической операцией");
        }

        String[] num = input.split(" "); // Входную строку разбиваем на массив [] исп.метод split => ("1000" "-" "7").
        int num1 = Integer.parseInt(num[0]); // Преобразуем первый элемент массива в целое число с помощью метода parseInt.
        String operation = num[1]; // Тут храним знак операции.
        int num2 = Integer.parseInt(num[2]); // Тут храним 2-ой знак операции.

        if (num.length != 3) { // Проверяем, что количество элементов массива равно 3
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        int result; //Контейнер.

        switch (operation) { // Operation - где происходит магия.
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0)
                    throw new Exception("На 0 делить нельзя!");
                else {
                    result = num1 / num2;
                }
            }
            default -> throw new Exception("Вы ввели неправильно!");
        }
        return result;
    }
    
    public static void main(String[] args) throws Exception {
        String result = String.valueOf(calc("")); //Без этого не работает :?
        System.out.println("Output:");
        System.out.println(result);
    }
}
