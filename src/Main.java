import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        // Hauptmenü
        Scanner myscan = new Scanner(System.in);
        int auswahl;
        String patient;
        String[] wartezimmer = new String[20];
        boolean anmeldung = false;
        boolean megaSchleife = true;
        wartezimmer[0] = "Hansibansi";


        while (megaSchleife) {
            System.out.println("######################");
            System.out.println(" Charlie ");
            System.out.println("######################");
            System.out.println(" (1) Patient anmelden");
            System.out.println(" (2) Überprüfen ob Patient angemeldet ist");
            System.out.println(" (3) Wieviele patienten sind z.Z angemeldet?");
            System.out.println(" (4) Liste der Patienten im Wartezimmer");
            System.out.println(" (7) Nächster Patient");
            System.out.println(" (9) Programm Beenden");
            System.out.println("######################");
            System.out.println(Arrays.toString(wartezimmer));
            int menu = myscan.nextInt();


            //


            if (menu == 1) {
                flush.flush();
                System.out.println("###### Neuen Patienten anmelden ####");

                for (int i = 0; i < wartezimmer.length; i++) {
                    if (wartezimmer[i] == null) {
                        System.out.println("Bitte Nachname eingeben");
                        wartezimmer[i] = myscan.next();
                        System.out.println("(1) noch ein Patient ... (2) zurück zum Hauptmenü");
                        auswahl = myscan.nextInt();
                        if (auswahl == 2) {
                            break;
                        }
                    }
                }
            }

            if (menu == 2) {
                System.out.println("Bite geben Sie den Namen des Patienten ein");
                patient = myscan.next();
                System.out.println(patient);


                for (int p = 0; p < wartezimmer.length; p++) {
                    if (Objects.equals(patient, wartezimmer[p])) {
                        System.out.println(patient + " ist bereits angemeldet ");
                    }

                }
                System.out.println("..Programm kehrt zurück zum Menü");
                TimeUnit.SECONDS.sleep(3);

            }

            int anzahlPatienten = 0;

            if (menu == 3) {
                for (String s : wartezimmer) {
                    if (s != null) {
                        anzahlPatienten++;
                    }


                }
                if (anzahlPatienten >= 1) {
                    System.out.println(anzahlPatienten + " Patient/en  ist/sind angemeldet");
                    System.out.println("..Programm kehrt zurück zum Menü");
                    TimeUnit.SECONDS.sleep(3);
                } else {
                    System.out.println("z.Z keine Anmeldungen");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("..Programm kehrt zurück zum Menü");
                    TimeUnit.SECONDS.sleep(2);
                }

            }
            if (menu == 4) {
                for (int i = 0; i < wartezimmer.length; i++) {
                    System.out.println((i + 1) + ".: " + wartezimmer[i]);
                }
                System.out.println("");
                System.out.println("(1) Hauptmenü");
                myscan.next();
            }

            if (menu == 9) {
                System.out.println("Programm wird beendet....");
                TimeUnit.SECONDS.sleep(2);
                megaSchleife = false;

            }

            if (menu == 7) {
                System.out.println(wartezimmer[0] + " bitte ins Behandlungszimmer 1");
                System.out.println(wartezimmer[0] + " bitte ins Behandlungszimmer 1");
                System.out.println(wartezimmer[0] + " bitte ins Behandlungszimmer 1");

                for ( int i = 0; i < wartezimmer.length-1; i++) {
                    wartezimmer[i] = wartezimmer[i+1];
                }

            }


        }


    }
}
