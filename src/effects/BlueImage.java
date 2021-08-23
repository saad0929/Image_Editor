package effects;

public class BlueImage extends RootImage {

    @Override
    public void applyEffect() {

        int width = image.getWidth();
        int height = image.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = image.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int b = p & 0xff;

                p = (a << 24) | (0 << 16) | (0 << 8) | b;

                image.setRGB(x, y, p);
            }
        }
    }

}
