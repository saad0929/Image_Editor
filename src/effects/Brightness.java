package effects;

import java.awt.*;
import java.util.Scanner;

public class Brightness extends RootImage {

    @Override
    public void applyEffect() {

        System.out.print("Enter Brightness Amount (-255 to 255) : ");
        Scanner scanner = new Scanner(System.in);
        double factor = scanner.nextDouble();

        double width = image.getWidth();
        double height = image.getHeight();

        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {

                Color c = new Color(image.getRGB(x, y));

                int r = (int) (c.getRed() + factor);
                int b = (int) (c.getBlue() + factor);
                int g = (int) (c.getGreen() + factor);
                if (r >= 256) {
                    r = 255;
                } else if (r < 0) {
                    r = 0;
                }

                if (g >= 256) {
                    g = 255;
                } else if (g < 0) {
                    g = 0;
                }

                if (b >= 256) {
                    b = 255;
                } else if (b < 0) {
                    b = 0;
                }
                image.setRGB(x, y, new Color(r, g, b).getRGB());
            }
    }
}
