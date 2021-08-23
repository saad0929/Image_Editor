package effects;

public class Solarize extends RootImage {

    @Override
    public void applyEffect() {

        int width = image.getWidth();
        int height = image.getHeight();

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){

                int p = image.getRGB(x,y);
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;

                if(r <= 127) r = 255-r;
                if(g <= 127) g = 255-g;
                if(b <= 127) b = 255-b;

                p = (a<<24) | (r<<16) | (g<<8) | b;
                image.setRGB(x, y, p);
            }
        }
    }
}
