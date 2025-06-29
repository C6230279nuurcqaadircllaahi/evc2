
import java.util.Scanner;

public class EVCCHECKING {
    public static void main(String[] args) {
        int pin = 9899; // PIN-ka isticmaalaha
        int balance = 100; // Lacagta isticmaale ee EVC
        int bankbalance = 1080; // Lacagta ku jirta bankiga
        int bankpin = 2525; // PIN-ka bangiga
        String keednumber = ""; // Lambar lagu kaydiyo
        String fariin = "[-EVCPlus] waxaad udirtay numberka "; // Qayb fariinta
        String fariinlacag = " lacag dhan "; // Qayb kale oo fariin ah

        System.out.println("Welcome to EVC Plus Macmiil!#");
        System.out.println("");

        // Akhri input-ka ugu horeeya: *770*code#
        Scanner firstinput = new Scanner(System.in);
        String checkinput = firstinput.nextLine();

        // Haddii uu ku bilaabmo *770 oo ku dhammaado #
        if (checkinput.startsWith("*770") && checkinput.endsWith("#")) {
            System.out.println("[-EVC-PlUS]  \n fadlan gali Pin-kaaga!");

            // Akhri PIN-ka uu isticmaalaha gelinayo
            Scanner evcpin = new Scanner(System.in);
            int pinevc = evcpin.nextInt();

            // Haddii uu PIN-ku sax yahay
            if (pinevc == pin) {
                System.out.println("EVC-PLUS");
                System.out.println("1. Balance Query");
                System.out.println("2. E-voucher");
                System.out.println("3. Bill Payment");
                System.out.println("4. Send Money");
                System.out.println("5. Mini statement");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Manage Account");
                System.out.println("8. Bill Payment");
                System.out.println("");

                // Akhri ikhtiyaarka uu doorto isticmaale
                Scanner inputop = new Scanner(System.in);
                int inputnum = inputop.nextInt();

                // Dooro ficilka ku habboon
                switch (inputnum) {
                    case 1:
                        System.out.println("[-EVC-Plus] haraagagu waa " + balance + "$");
                        break;
                    case 2:
                        System.out.println("[-EVCPlus] adeeggaas lama heli karo wakhtigan.");
                        break;
                    // Waxa la sii wadi karaa kiisaska kale...
                    default:
                        System.out.println("Fadlan dooro tiro sax ah.");
                }

            } else {
                // Haddii PIN-ka khaldan yahay
                System.out.println("[-EVCPLUS] PIN-ka aad gelisay waa khalad!");
            }

        } else {
            // Haddii code-ku aanu ahayn *770*#
            System.out.println("[-EVCPLUS] Code-ka aad gelisay waa khalad!");
        }
    }
}
