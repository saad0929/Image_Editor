package effects;


public class Sepia extends RootImage {

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

                double tr = 0.393 * r + 0.769 * g + 0.189 * b;
                double tg = 0.349 * r + 0.686 * g + 0.168 * b;
                double tb = 0.272 * r + 0.534 * g + 0.131 * b;

                if (tr > 255) {
                    r = 255;
                } else {
                    r = (int) tr;
                }
                if (tg > 255) {
                    g = 255;
                } else {
                    g = (int) tg;
                }
                if (tb > 255) {
                    b = 255;
                } else {
                    b = (int) tb;
                }

                pixel = (alpha << 24) | (r << 16) | (g << 8) | b;
                image.setRGB(x, y, pixel);
            }
        }
    }
}
