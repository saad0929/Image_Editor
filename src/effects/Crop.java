package effects;

import java.util.Scanner;

public class Crop extends RootImage {

    @Override
    public void applyEffect() {

        System.out.print("Enter Crop Amount (0.1 to 0.9) : ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        int height = image.getHeight();
        int width = image.getWidth();

        int targetWidth = (int) (width * amount);
        int targetHeight = (int) (height * amount);

        int xc = (width - targetWidth) / 2;
        int yc = (height - targetHeight) / 2;

        image = image.getSubimage(
                xc,
                yc,
                targetWidth,
                targetHeight
        );

    }
}
