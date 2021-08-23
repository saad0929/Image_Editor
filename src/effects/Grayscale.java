package effects;

public class Grayscale extends RootImage {

    public void applyEffect() {

        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();

        for (int y = 0; y < imageHeight; y++) {
            for (int x = 0; x < imageWidth; x++) {

                int pixel = image.getRGB(x, y);
                int alpha = (pixel >> 24) & 0xff;

                int r = (pixel >> 16) & 0xff;
                int g = (pixel >> 8) & 0xff;
                int b = pixel & 0xff;

                int average = (r + g + b) / 3;

                pixel = (alpha << 24) | (average << 16) | (average << 8) | average;
                image.setRGB(x, y, pixel);

            }
        }
    }

}
