package effects;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class RootImage {

    BufferedImage image;
    private File inputFile;

    public void importImage(File inputFile) throws IOException {
        this.inputFile = inputFile;
        image = ImageIO.read(inputFile);
    }

    public abstract void applyEffect();

    public void save() throws IOException {
        if (image != null) {
            File exportedImagePath = new File("src/resources/output/Output.jpg");
            ImageIO.write(image, "jpg", exportedImagePath);

            System.out.println("Image saved to " + exportedImagePath.getAbsolutePath() + "\n");
        } else
            System.out.println("Can't Save image!");
    }
}
