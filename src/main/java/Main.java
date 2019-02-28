
import java.util.Scanner;

public class Main {
    private boolean exit;
    Scanner kb = new Scanner(System.in);
    private Suvestinė suvestinė;


    public static void main(String[] args) {
        Main menu = new Main();
        menu.runMenu();

    }

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    public void printHeader() {

        System.out.println("-----------------------");
        System.out.println("    Welcome to our     ");
        System.out.println("   menu application   ");
        System.out.println("------------------------");
    }

    public void printMenu() {

        System.out.println("Please make a selection:");
        System.out.println("1)Kategorijos");
        System.out.println("2)Įrašas");
        System.out.println("3)Suvestinė");
        System.out.println("4)Įvesti išlaidas");
        System.out.println("5)Įvesti pajamas");
        System.out.println("6)Redeguoti išlaidas");
        System.out.println("7)Rdeguoti pajamas");
        System.out.println("8)Ištrinti išlaidas");
        System.out.println("9}Ištrinti pajamas");
        System.out.println("0)Exit");
    }

    private int getInput() {

        int choice = -1;
        while (choice < 0 || choice > 5) {
            try {
                choice = Integer.parseInt(kb.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection.Please try again");
            }
        }
        return choice;

    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Thank you for using our application");
                break;
            case 1:
                pickCategory();
            case 2:
                System.out.println("Įrašas");
                break;
            case 3:
                System.out.println("Suvestinė");
                break;
            case 4:
                įvestiišlaidas();
            case 5:
                įvestipajamas();
            case 6:
                redeguotišlaidas();
            case 7:
                redeguotipajamas();
            case 8:
                ištrintiišlaidas();
            case 9:
                ištrintipajamas();
            default:
                System.out.println("An unknown error has occured");
        }
    }

    private void pickCategory() {
        System.out.println("Pick category:");
        System.out.println("0) Islaidos");
        System.out.println("1) Pajamos");
        int num = getInput();
        switch (num) {
            case 0:
                System.out.println("Išlaidos");
                pickIšlaidųKategorija();
                break;
            case 1:
                System.out.println("Pajamos");
                pickPajamųKategoriją();
                break;
            default:
                System.out.println("Invalid selection.Please try again");

        }
    }

    private void pickIšlaidųKategorija() {
        System.out.println("Pick comes category");
        System.out.println("0)Drabužiai");
        System.out.println("1)Maistas ir gėrimai");
        System.out.println("2)Namams");
        System.out.println("3)Pramogos");
        System.out.println("4)Sąskaitos ir mokesčiai");
        System.out.println("5)Sveikata ir grožis");
        System.out.println("6)Transportas");
        int num = getInput();
        switch (num) {
            case 0:
                System.out.println("Drabužiai");
                break;
            case 1:
                System.out.println("Maistas ir gėrimai");
                break;
            case 2:
                System.out.println("Namams");
                break;
            case 3:
                System.out.println("Pramogos");
                break;
            case 4:
                System.out.println("Sąskaitos ir mokesčiai");
                break;
            case 5:
                System.out.println("Sveikata ir grožis");
                break;
            case 6:
                System.out.println("Transportas");
                break;
            default:
                System.out.println("Invalid selection.Please try again");

        }
    }

    private void pickPajamųKategoriją() {
        System.out.println("Pick Incomes category");
        System.out.println("0)Atlyginimas");
        System.out.println("1)Kita");
        System.out.println("2)Pardavimas");
        int num = getInput();
        switch (num) {
            case 0:
                System.out.println("Atlyginimas");
                break;
            case 1:
                System.out.println("Kita");
                break;
            case 2:
                System.out.println("Pardavimas");
                break;
            default:
                System.out.println("Invalid selection.Please try again");
        }
    }

    private void įvestiišlaidas() {
        System.out.println("Iveskite išlaidas:");
        int išlaidos = kb.nextInt();
        suvestinė.setMėnesioIšlaidos(suvestinė.getMėnesioIšlaidos() + išlaidos);
    }


    private void įvestipajamas() {
        System.out.println("Įveskite pajamas");
        int pajamos = kb.nextInt();
        suvestinė.setMėnesioIšlaidos(suvestinė.getMėnesioPajamos() + pajamos);

    }

    private void redeguotišlaidas() {
        System.out.println("Pasirinkite išlaidų kategoriją,kurią norite redaguoti: ");
        int num = getInput();
        switch (num) {
            case 0:
                System.out.println("Drabužiai");
                break;
            case 1:
                System.out.println("Maistas ir gėrimai");
                break;
            case 2:
                System.out.println("Namams");
                break;
            case 3:
                System.out.println("Pramogos");
                break;
            case 4:
                System.out.println("Sąskaitos ir mokesčiai");
                break;
            case 5:
                System.out.println("Sveikata ir grožis");
                break;
            case 6:
                System.out.println("Transportas");
                break;
            default:
                System.out.println("Invalid selection.Please try again");

        }
    }

    private void redeguotipajamas() {
        System.out.println("Pasirinkite pajamų kategorją,kurią norite redeguoti:");
        System.out.println("0)Atlyginimas");
        System.out.println("1)Kita");
        System.out.println("2)Pardavimas");
        int num = getInput();
        switch (num) {
            case 0:
                System.out.println("Atlyginimas");
                break;
            case 1:
                System.out.println("Kita");
                break;
            case 2:
                System.out.println("Pardavimas");
                break;
            default:
                System.out.println("Invalid selection.Please try again");
        }
    }

    private void ištrintiišlaidas() {
        System.out.println("Pasirinkite išlaidų kategoriją:");

    }

    private void ištrintipajamas() {
        System.out.println("Pasirinkite pajamų kategoriją:");

    }
}


