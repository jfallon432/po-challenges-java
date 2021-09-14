public class OctalConverter {

    public String convert(double decimal){
        StringBuilder octalString = new StringBuilder("0");
        long number = (long) (decimal * Math.pow(8,12));

        while(number > 0){
            octalString.insert(1, number % 8);
            number /= 8;
        }

        octalString.insert(octalString.length() - 12, ".");

        return octalString.toString();

    }

    public String convert(int decimal){
        StringBuilder octalString = new StringBuilder("0");
        while(decimal > 0){
            octalString.insert(1, decimal % 8);
            decimal /= 8;
        }

        return octalString.toString();
    }

}
