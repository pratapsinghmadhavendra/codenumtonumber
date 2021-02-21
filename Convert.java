public class Convert {
    private String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String convert(int n) {
        if (n < 0) {
            return "Negative" + convert(-n);  //- - = +
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            String str = "";
            if (n % 10 != 0)
                str = " ";

            str = units[n % 10];

            return tens[n / 10] +" "+str;
        }

        if (n < 1000) {
            var str = "";
            if (n % 100 != 0)
                str = " ";
            str = convert(n % 100);
            return units[n / 100] + " hundred " +str;
        }

        if (n < 100000) {
            String str = " ";
            if (n % 1000 != 0)
                str = "";
            str = convert(n % 1000);
            return convert(n / 1000) + " thousand " + str;
        }

        if (n > 99999) {

            return "out of Range";

        }

        return " ";}
}

