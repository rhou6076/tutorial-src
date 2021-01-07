public class FooCorporation {
    public static void main(String[] args) {
        totalPay(7.50, 35);

    }

    public static void totalPay(double basePay, int hoursWorked) {
        if (hoursWorked > 60) {
            System.out.println("Error: hours more than 60 hours");
            return;
        }

        int baseHours = hoursWorked;
        int extraHours = 0;
        if (hoursWorked > 40) {
            extraHours = baseHours % 40;
            baseHours = 40;
        }

        System.out.println("Total pay is $" + (baseHours * basePay + 1.5 * basePay * extraHours));

    }
}
