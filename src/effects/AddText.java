package effects;

import java.awt.*;
import java.util.Scanner;

public class AddText extends RootImage {
    @Override
    public void applyEffect() {

        Scanner scanner = new Scanner(System.in);

        String text = "";
        int posX = 0;
        int posY = 0;
        float size = 100;

        int r = 0, g = 0, b = 0;

        System.out.print("Enter text: ");
        text = scanner.nextLine();
        System.out.print("Enter text size: ");
        size = scanner.nextFloat();
        System.out.print("Enter position [X Y]: ");
        posX = scanner.nextInt();
        posY = scanner.nextInt();

        System.out.print("Enter text color [R G B]: ");
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();

        Graphics graphics = image.getGraphics();
        graphics.setFont(graphics.getFont().deriveFont(size));

        graphics.setColor(new Color(r, g, b));
        graphics.drawString(text, posX, posY);
        graphics.dispose();

    }
}
