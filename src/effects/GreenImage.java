package effects;

public class GreenImage extends RootImage {


    @Override
    public void applyEffect() {

        int width = image.getWidth();
        int height = image.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = image.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int g = (p >> 8) & 0xff;

                p = (a << 24) | (0 << 16) | (g << 8) | 0;

                image.setRGB(x, y, p);
            }
        }
    }
}
