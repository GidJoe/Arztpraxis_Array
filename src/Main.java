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
        boolean megaSchleife = true;
        wartezimmer[0] = "Mando";


        while (megaSchleife) {
            flush.flush();
            System.out.println("");
            System.out.println(" Praxissoftware Charlie v 1.0 rev 35.bc22");
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║ 1   Anmeldung                                     ║");
            System.out.println("║ 2   Patient suchen                                ║");
            System.out.println("║ 3   Liste der Anmeldungen                         ║");
            System.out.println("║ 4   Liste vom Wartezimmer                         ║");
            System.out.println("║ 5   nächsten Patienten aufrufen                   ║");
            System.out.println("║ 6   Programm beenden                              ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            System.out.println(Arrays.toString(wartezimmer).replace("null", " frei "));
            int menu = myscan.nextInt();

            // Menü Auswahl 1

            if (menu == 1) {
                flush.flush();
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║       Neuen Patienten anmelden        ║");
                System.out.println("╚═══════════════════════════════════════╝");

                for (int i = 0; i < wartezimmer.length; i++) {
                    if (wartezimmer[i] == null) {
                        System.out.println("Bitte Nachname eingeben");
                        wartezimmer[i] = myscan.next();
                        System.out.println("(1) weiter? (2) zurück zum Hauptmenü");
                        auswahl = myscan.nextInt();
                        if (auswahl == 2) {
                            break;
                        }
                    }
                }
            }

            // Menü Auswahl 2
            if (menu == 2) {
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║        Patient suchen                 ║");
                System.out.println("╚═══════════════════════════════════════╝");
                patient = myscan.next();
                System.out.println(patient);


                for (int p = 0; p < wartezimmer.length; p++) {
                    if (Objects.equals(patient, wartezimmer[p])) {
                        System.out.println(patient + " ist bereits angemeldet ");
                    }

                }
                System.out.println("..Programm kehrt zurück zum Hauptmenü..");
                TimeUnit.SECONDS.sleep(3);

            }

            int anzahlPatienten = 0;

            // Menü Auswahl 3
            if (menu == 3) {
                for (String s : wartezimmer) {
                    if (s != null) {
                        anzahlPatienten++;
                    }
                }
                if (anzahlPatienten >= 1) {
                    System.out.println(anzahlPatienten + " Patient/en  ist/sind angemeldet");
                    System.out.println("═══════════════════════════════════════");
                    // System.out.println("..Programm kehrt zurück zum Hauptmenü..");
                    TimeUnit.SECONDS.sleep(3);
                } else if (anzahlPatienten == 0) {
                    System.out.println("        z.Z keine Anmeldungen");
                    System.out.println("╚═══════════════════════════════════════╝");
                    // System.out.println("..Programm kehrt zurück zum Menü");
                    TimeUnit.SECONDS.sleep(2);
                }
                System.out.println("(1) Hauptmenü");
                myscan.next();

            }

            // Menü Auswahl 2
            if (menu == 4) {
                for (int i = 0; i < wartezimmer.length; i++) {
                    System.out.println((i + 1) + ".: " + wartezimmer[i]);

                }
                System.out.println("");
                System.out.println("(1) Hauptmenü");
                myscan.next();
            }

            // Menü Auswahl 9
            if (menu == 9) {
                System.out.println("Programm wird beendet....");
                TimeUnit.SECONDS.sleep(2);
                megaSchleife = false;

            }

            // Menü Auswahl 7
            if (menu == 5) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(wartezimmer[0] + " wurde aufgerufen");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(wartezimmer[0] + " wurde aufgerufen");
                TimeUnit.SECONDS.sleep(1);
                for (int i = 0; i < wartezimmer.length - 1; i++) {
                    wartezimmer[i] = wartezimmer[i + 1];

                }
                System.out.println("(1) Hauptmenü");
                myscan.next();
            }


        }
    }
}
