

public class VacRegister {
        private static int sinovacQuota = 2;
        private static int modernaQuota = 1;

        public static void main(String[] args) {
                java.util.Scanner scanner = new java.util.Scanner(System.in);

                while (true) {
                        System.out.println("\n=== Welcome to COVID-19 Vaccine Registration System ===\r\n" + //
                                        "Please choose your vaccine:");
                        System.out.println("[S]inovac\r\n" + "[M]oderna");

                        String choice = scanner.nextLine().toLowerCase();

                        if (choice.equals("x")) {
                                break;
                        } else if (choice.equals("s")) {
                                if (sinovacQuota > 0) {
                                        registerVaccine("Sinovac", scanner);
                                        sinovacQuota--;
                                } else {
                                        System.out.println("Sorry! We ran out Sinovac. :( ");
                                }
                        } else if (choice.equals("m")) {
                                if (modernaQuota > 0) {
                                        registerVaccine("Moderna", scanner);
                                        modernaQuota--;
                                } else {
                                        System.out.println("Sorry! We ran out Moderna. :( ");
                                }
                        }
                }
                scanner.close();
        }

        private static void registerVaccine(String type, java.util.Scanner scanner) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your phone number: ");
                String phone = scanner.nextLine();

                System.out.println("\nCongratulations! " + name + ". We have booked you with " + type
                                + ". Once we have the date, we will call you at " + phone + ".");
        }
}

