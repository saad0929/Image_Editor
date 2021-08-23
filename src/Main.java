import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import effects.*;

public class Main {

    public static int showMainMenu() {

        int choice;

        System.out.println("Select effect to apply");
        System.out.println("01. Brightness");
        System.out.println("02. Crop");
        System.out.println("03. Red");
        System.out.println("04. Green");
        System.out.println("05. Blue");
        System.out.println("06. Yellow");
        System.out.println("07. Grayscale");
        System.out.println("08. Negative");
        System.out.println("09. Sepia");
        System.out.println("10. Solarize");
        System.out.println("11. Threshold");
        System.out.println("12. Mirror");
        System.out.println("13. Add Text");
        System.out.println("14. Exit");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        return choice;
    }

    public static void applyAndExportImage(RootImage rootImage, File imagePath) throws IOException {

        System.out.println("Applying Effects...");

        rootImage.importImage(imagePath);
        rootImage.applyEffect();
        rootImage.save();
    }


    public static void main(String[] args) throws IOException {
        File imagePath = new File("src/resources/input.jpg");

        System.out.println("\n\nImage Imported from " + imagePath.getAbsolutePath() + "\n");

        int choice = 0;

        do {
            choice = Main.showMainMenu();

            switch (choice) {
                case 1:
                    Main.applyAndExportImage(new Brightness(), imagePath);
                    break;
                case 2:
                    Main.applyAndExportImage(new Crop(), imagePath);
                    break;
                case 3:
                    Main.applyAndExportImage(new RedImage(), imagePath);
                    break;
                case 4:
                    Main.applyAndExportImage(new GreenImage(), imagePath);
                    break;
                case 5:
                    Main.applyAndExportImage(new BlueImage(), imagePath);
                    break;
                case 6:
                    Main.applyAndExportImage(new YellowImage(), imagePath);
                    break;
                case 7:
                    Main.applyAndExportImage(new Grayscale(), imagePath);
                    break;
                case 8:
                    Main.applyAndExportImage(new Negative(), imagePath);
                    break;
                case 9:
                    Main.applyAndExportImage(new Sepia(), imagePath);
                    break;
                case 10:
                    Main.applyAndExportImage(new Solarize(), imagePath);
                    break;
                case 11:
                    Main.applyAndExportImage(new Threshold(), imagePath);
                    break;
                case 12:
                    Main.applyAndExportImage(new Mirror(), imagePath);
                    break;
                case 13:
                    Main.applyAndExportImage(new AddText(), imagePath);
                    break;
                case 14:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        } while (choice != 14);
    }

}
