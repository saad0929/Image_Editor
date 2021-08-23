package effects;

public class Negative extends RootImage {

    @Override
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

                r = 255 - r;
                g = 255 - g;
                b = 255 - b;

                pixel = (alpha << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(x, y, pixel);

            }
        }
    }

}
