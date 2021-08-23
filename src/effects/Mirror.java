package effects;

public class Mirror extends RootImage {

    @Override
    public void applyEffect() {

        int width = image.getWidth();
        int height = image.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x <= width / 2; x++) {
                int p = image.getRGB(x, y);

                image.setRGB(x, y, image.getRGB(width - 1 - x, y));
                image.setRGB(width - 1 - x, y, p);
            }
        }
    }
}
