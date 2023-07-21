import java.util.Scanner; //импорт библиотеки :<
import java.util.regex.Pattern;

public class calc {
    public static void main(String[] args ) throws Exception{
        Scanner scanner = new Scanner(System.in); // Тут мы читаем ввод с клавиатуры.

        System.out.println("Input:"); // Просто текстШ(.
        String input = scanner.nextLine(); // "1000-7" Тут метод nextLine() прочитает всю эту строку как строку и сохранит ее в переменной input.

        //АХАХХААХХАХАХАХАХАХАХАХХАХАХАХАХАХХАхХАХХАХАХАХХААХХАХАХХАХАХАХХАХАХАХА ¯\_(ツ)_/¯ я - если бы каждая строка стоила бы $ [̲̅$̲̅(̲̅ ͡° ͜ʖ ͡°̲̅)̲̅$̲̅]
        // https://www.youtube.com/watch?v=zGyr8Amw5PA О да это успокаивает.

        // Не бейте пожалуйста. (ಥ﹏ಥ)
        switch (input) {
            case "I + I" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "I + II" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "I + III" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "I + IV" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "I + V" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "I + VI" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "I + VII" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "I + VIII" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "I + IX" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
        }

        switch (input) {
            case "II + I" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "III + I" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "IV + I" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "V + I" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "VI + I" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "VII + I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "VIII + I" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "IX + I" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
        }

        switch (input) {
            case "II + II" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "II + III" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "II + IV" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "II + V" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "II + VI" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "II + VII" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "II + VIII" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "II + X" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
        }

        switch (input) {
            case "III + II" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "IV + II" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "V + II" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "VI + II" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "VII + II" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "VIII + II" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "X + II" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
        }

        switch (input) {
            case "III + IV" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "III + V" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "III + VI" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "III + VII" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "III + VIII" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
            case "III + IX" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "III + X" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
        }

        switch (input) {
            case "IV + III" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "V + III" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "VI + III" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "VII + III" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "VIII + III" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
            case "IX + III" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "X + III" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
        }

        switch (input) {
            case "IV + IV" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "IV + V" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "IV + VI" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "IV + VII" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
            case "IV + VIII" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "IV + IX" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
            case "IV + X" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
        }

        switch (input) {
            case "V + IV" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "VI + IV" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "VII + IV" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
            case "VIII + IV" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "IX + IV" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
            case "X + IV" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
        }

        switch (input) {
            case "V + V" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "V + VI" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
            case "V + VII" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "V + VIII" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
            case "V + IX" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "V + X" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
        }

        switch (input) {
            case "VI + V" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
            case "VII + V" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "VIII + V" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
            case "IX + V" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "X + V" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
        }

        switch (input) {
            case "VI + VI" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "VI + VII" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
            case "VI + VIII" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "VI + IX" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
            case "VI + X" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
        }

        switch (input) {
            case "VII + VI" -> {
                System.out.println("Output:");
                System.out.println("XIII");
                return;
            }
            case "VIII + VI" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "IX + VI" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
            case "X + VI" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
        }

        switch (input) {
            case "VII + VII" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "VII + VIII" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
            case "VII + IX" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
            case "VII + X" -> {
                System.out.println("Output:");
                System.out.println("XVII");
                return;
            }
        }

        switch (input) {
            case "VIII + VII" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
            case "IX + VII" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
            case "X + VII" -> {
                System.out.println("Output:");
                System.out.println("XVII");
                return;
            }
        }

        switch (input) {
            case "VIII + VIII" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
            case "VIII + IX" -> {
                System.out.println("Output:");
                System.out.println("XVII");
                return;
            }
            case "VIII + X" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
        }

        switch (input) {
            case "IX + VIII" -> {
                System.out.println("Output:");
                System.out.println("XVII");
                return;
            }
            case "X + VIII" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
        }

        switch (input) {
            case "IX + IX" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
            case "IX + X" -> {
                System.out.println("Output:");
                System.out.println("XIX");
                return;
            }
        }

        switch (input) {
            case "X + IX" -> {
                System.out.println("Output:");
                System.out.println("XIX");
                return;
            }
            case "X + X" -> {
                System.out.println("Output:");
                System.out.println("XX");
                return;
            }
            case "X + I", "I + X" -> {
                System.out.println("Output:");
                System.out.println("XI");
                return;
            }
        }

        switch (input) {
            case "II - I" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "III - I" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "IV - I" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "V - I" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "VI - I" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "VII - I" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "VIII - I" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "IX - I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "X - I" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
        }

        switch (input) {
            case "III - II" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "IV - II" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "V - II" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "VI - II" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "VII - II" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "VIII - II" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "IX - II" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "X - II" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
        }

        switch (input) {
            case "IV - III" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "V - III" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "VI - III" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "VII - III" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "VIII - III" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "IX - III" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "X - III" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
        }

        switch (input) {
            case "V - IV", "VII - VI" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "VI - IV", "VIII - VI" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "IX - VI" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "X - VI" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
        }

        switch (input) {
            case "VIII - IV" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "VIII - V", "X - VII" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "VIII - VII" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "IX - VII", "VII - V" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
        }

        switch (input) {
            case "IX - IV" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "IX - V" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "IX - VIII" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "X - VIII" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
        }

        switch (input) {
            case "X - IV" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "X - V" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "X - IX" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
        }

        switch (input) {
            case "I * I" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "I * II" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "I * III" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "I * IV" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "I * V" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "I * VI" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "I * VII" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "I * VIII" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "I * IX" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "I * X" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
        }

        switch (input) {
            case "II * I" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "III * I" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "IV * I" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "V * I" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "VI * I" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "VII * I" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "VIII * I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "IX * I" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "X * I" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
        }

        switch (input) {
            case "II * II" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "II * III" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "II * IV" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "II * V" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "II * VI" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "II * VII" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "II * VIII" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
            case "II * IX" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
            case "II * X" -> {
                System.out.println("Output:");
                System.out.println("XX");
                return;
            }
        }

        switch (input) {
            case "III * II" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "IV * II" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "V * II" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
            case "VI * II" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "VII * II" -> {
                System.out.println("Output:");
                System.out.println("XIV");
                return;
            }
            case "VIII * II" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
            case "IX * II" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
            case "X * II" -> {
                System.out.println("Output:");
                System.out.println("XX");
                return;
            }
        }

        switch (input) {
            case "III * III" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "III * IV" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "III * V" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
            case "III * VI" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
            case "III * VII" -> {
                System.out.println("Output:");
                System.out.println("XXI");
                return;
            }
            case "III * VIII" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
                return;
            }
            case "III * IX" -> {
                System.out.println("Output:");
                System.out.println("XXVII");
                return;
            }
            case "III * X" -> {
                System.out.println("Output:");
                System.out.println("XXX");
                return;
            }
        }

        switch (input) {
            case "IV * III" -> {
                System.out.println("Output:");
                System.out.println("XII");
                return;
            }
            case "V * III" -> {
                System.out.println("Output:");
                System.out.println("XV");
                return;
            }
            case "VI * III" -> {
                System.out.println("Output:");
                System.out.println("XVIII");
                return;
            }
            case "VII * III" -> {
                System.out.println("Output:");
                System.out.println("XXI");
                return;
            }
            case "VIII * III" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
                return;
            }
            case "IX * III" -> {
                System.out.println("Output:");
                System.out.println("XXVII");
                return;
            }
            case "X * III" -> {
                System.out.println("Output:");
                System.out.println("XXX");
                return;
            }
        }

        switch (input) {
            case "IV * IV" -> {
                System.out.println("Output:");
                System.out.println("XVI");
                return;
            }
            case "IV * V" -> {
                System.out.println("Output:");
                System.out.println("XX");
                return;
            }
            case "IV * VI" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
                return;
            }
            case "IV * VII" -> {
                System.out.println("Output:");
                System.out.println("XXVIII");
                return;
            }
            case "IV * VIII" -> {
                System.out.println("Output:");
                System.out.println("XXXII");
                return;
            }
            case "IV * IX" -> {
                System.out.println("Output:");
                System.out.println("XXXVI");
                return;
            }
            case "IV * X" -> {
                System.out.println("Output:");
                System.out.println("XL");
                return;
            }
        }

        switch (input) {
            case "V * IV" -> {
                System.out.println("Output:");
                System.out.println("XX");
                return;
            }
            case "V * V" -> {
                System.out.println("Output:");
                System.out.println("XXV");
                return;
            }
            case "V * VI" -> {
                System.out.println("Output:");
                System.out.println("XXX");
                return;
            }
            case "V * VII" -> {
                System.out.println("Output:");
                System.out.println("XXXV");
                return;
            }
            case "V * VIII" -> {
                System.out.println("Output:");
                System.out.println("XL");
                return;
            }
            case "V * IX" -> {
                System.out.println("Output:");
                System.out.println("XLV");
                return;
            }
            case "V * X" -> {
                System.out.println("Output:");
                System.out.println("L");
                return;
            }
        }

        switch (input) {
            case "VI * V" -> {
                System.out.println("Output:");
                System.out.println("XXX");
                return;
            }
            case "VII * V" -> {
                System.out.println("Output:");
                System.out.println("XXXV");
                return;
            }
            case "VIII * V" -> {
                System.out.println("Output:");
                System.out.println("XL");
                return;
            }
            case "IX * V" -> {
                System.out.println("Output:");
                System.out.println("XLV");
                return;
            }
            case "X * V" -> {
                System.out.println("Output:");
                System.out.println("L");
                return;
            }
        }

        switch (input) {
            case "VI * IV" -> {
                System.out.println("Output:");
                System.out.println("XXIV");
                return;
            }
            case "VII * IV" -> {
                System.out.println("Output:");
                System.out.println("XXVIII");
                return;
            }
            case "VIII * IV" -> {
                System.out.println("Output:");
                System.out.println("XXXII");
                return;
            }
            case "IX * IV" -> {
                System.out.println("Output:");
                System.out.println("XXXVI");
                return;
            }
            case "X * IV" -> {
                System.out.println("Output:");
                System.out.println("XL");
                return;
            }
        }

        switch (input) {
            case "VI * VI" -> {
                System.out.println("Output:");
                System.out.println("XXXVI");
                return;
            }
            case "VI * VII" -> {
                System.out.println("Output:");
                System.out.println("XLII");
                return;
            }
            case "VI * VIII" -> {
                System.out.println("Output:");
                System.out.println("XLVIII");
                return;
            }
            case "VI * IX" -> {
                System.out.println("Output:");
                System.out.println("LIV");
                return;
            }
            case "VI * X" -> {
                System.out.println("Output:");
                System.out.println("LX");
                return;
            }
        }

        switch (input) {
            case "VII * VI" -> {
                System.out.println("Output:");
                System.out.println("XLII");
                return;
            }
            case "VIII * VI" -> {
                System.out.println("Output:");
                System.out.println("XLVIII");
                return;
            }
            case "IX * VI" -> {
                System.out.println("Output:");
                System.out.println("LIV");
                return;
            }
            case "X * VI" -> {
                System.out.println("Output:");
                System.out.println("LX");
                return;
            }
        }

        switch (input) {
            case "VII * VII" -> {
                System.out.println("Output:");
                System.out.println("XLIX");
                return;
            }
            case "VII * VIII" -> {
                System.out.println("Output:");
                System.out.println("LVI");
                return;
            }
            case "VII * IX" -> {
                System.out.println("Output:");
                System.out.println("LXIII");
                return;
            }
            case "VII * X" -> {
                System.out.println("Output:");
                System.out.println("LXX");
                return;
            }
        }

        switch (input) {
            case "VIII * VII" -> {
                System.out.println("Output:");
                System.out.println("LVI");
                return;
            }
            case "IX * VII" -> {
                System.out.println("Output:");
                System.out.println("LXIII");
                return;
            }
            case "X * VII" -> {
                System.out.println("Output:");
                System.out.println("LXX");
                return;
            }
        }

        switch (input) {
            case "VIII * VIII" -> {
                System.out.println("Output:");
                System.out.println("LXIV");
                return;
            }
            case "VIII * IX" -> {
                System.out.println("Output:");
                System.out.println("LXXII");
                return;
            }
            case "VIII * X" -> {
                System.out.println("Output:");
                System.out.println("LXXX");
                return;
            }
        }

        switch (input) {
            case "IX * VIII" -> {
                System.out.println("Output:");
                System.out.println("LXXII");
                return;
            }
            case "X * VIII" -> {
                System.out.println("Output:");
                System.out.println("LXXX");
                return;
            }
        }

        switch (input) {
            case "IX * IX" -> {
                System.out.println("Output:");
                System.out.println("LXXXI");
                return;
            }
            case "IX * X" -> {
                System.out.println("Output:");
                System.out.println("XC");
                return;
            }
        }

        switch (input) {
            case "X * X" -> {
                System.out.println("Output:");
                System.out.println("C");
                return;
            }
            case "X * IX" -> {
                System.out.println("Output:");
                System.out.println("XC");
                return;
            }
        }

        switch (input) {
            case "I / I" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "II / I" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "III / I" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "IV / I" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "V / I" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
            case "VI / I" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "VII / I" -> {
                System.out.println("Output:");
                System.out.println("VII");
                return;
            }
            case "VIII / I" -> {
                System.out.println("Output:");
                System.out.println("VIII");
                return;
            }
            case "IX / I" -> {
                System.out.println("Output:");
                System.out.println("IX");
                return;
            }
            case "X / I" -> {
                System.out.println("Output:");
                System.out.println("X");
                return;
            }
        }

        switch (input) {
            case "II / II", "III / II" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "IV / II", "V / II" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "VI / II", "VII / II" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
            case "VIII / II", "IX / II" -> {
                System.out.println("Output:");
                System.out.println("IV");
                return;
            }
            case "X / II" -> {
                System.out.println("Output:");
                System.out.println("V");
                return;
            }
        }

        switch (input) {
            case "III / III", "IV / III", "V / III" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "VI / III", "VII / III", "VIII / III" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
            case "IX / III", "X / III" -> {
                System.out.println("Output:");
                System.out.println("III");
                return;
            }
        }

        switch (input) {
            case "IV / IV", "V / IV", "VII / IV" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "VI / IV" -> {
                System.out.println("Output:");
                System.out.println("VI");
                return;
            }
            case "VIII / IV", "IX / IV", "X / IV" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
        }

        switch (input) {
            case "V / V", "VI / V", "VII / V", "VIII / V", "IX / V" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
            case "X / V" -> {
                System.out.println("Output:");
                System.out.println("II");
                return;
            }
        }

        switch (input) {
            case "VI / VI", "VII / VI", "IX / VI", "VIII / VI", "X / VI" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
        }

        switch (input) {
            case "VII / VII", "VIII / VII", "IX / VII", "X / VII" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
        }

        switch (input) {
            case "VIII / VIII", "IX / VIII", "X / VIII" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
        }

        switch (input) {
            case "IX / IX", "X / IX" -> {
                System.out.println("Output:");
                System.out.println("I");
                return;
            }
        }

        if (input.equals("X / X")) {
            System.out.println("Output:");
            System.out.println("I");
            return;
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

        // "\\d+": Это регулярное выражение, которое соответствует одному или более цифр.
        // "\\s*": Это регулярное выражение, которое соответствует нулю или более пробельным символам (пробелам или табуляции).
        // "\\+": Это регулярное выражение, которое соответствует символу "+". Обратный слеш \\ используется перед символом "+", так как "+" является специальным символом в регулярных выражениях и требует экранирования.
        // Если строка input не соответствует формату "ЧИСЛО + ЧИСЛО" или "РИМЧИСЛО + РИМЧИСЛО", то завершаем работу программы.
        if (!Pattern.matches("\\d+\\s*\\+\\s*\\d+", input)) { //Тут мы с помошью !Pattern.matches принимаем два аргумента: регулярное выражение в виде строки и строку, которую нужно проверить на соответствие регулярному выражению.
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        // \ (•◡•) / Провека чисел если одно число введенное то выдаем ошибку:=
        if (input.matches("([1-9]\\d{0,6})|10{1,7}")) { //  Это выражение проверяет, соответствует ли строка input одной из следующих подстрок: "1", "2", "3", "4", "5", "6", "7", "8", "9" так до 10 000 000 000.
            throw new Exception("строка не является математической операцией");
        }

        // Конечно, что сверху это ужас, прямо реально хоррор для программиста.
        String[] num = input.split(" "); // Входную строку разбиваем на массив [] исп.метод split => ("1000" "-" "7").
        int num1 = Integer.parseInt(num[0]); // Преобразуем первый элемент массива в целое число с помощью метода parseInt.
        String operation = num[1]; // Тут храним знак операции.
        int num2 = Integer.parseInt(num[2]); // Тут храним 2-ой знак операции.

        if (num.length != 3) { // Проверяем, что количество элементов массива равно 3
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        int res; //Контейнер.

        switch (operation) { // Operation - где происходит магия.
            case "+" -> {
                res = num1 + num2;
                System.out.println("Output:");
                System.out.println(res);
            }
            case "-" -> {
                res = num1 - num2;
                System.out.println("Output:");
                System.out.println(res);
            }
            case "*" -> {
                res = num1 * num2;
                System.out.println("Output:");
                System.out.println(res);
            }
            case "/" -> {
                if (num2 == 0)
                    System.out.println("На 0 делить нельзя.");
                else {
                    res = num1 / num2;
                    System.out.println("Output:");
                    System.out.println(res);
                }
            }
            default -> System.out.println("Вы ввели неправильно!");
        }
    }
}