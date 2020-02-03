import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JavaImageIOTest
{

    public JavaImageIOTest()
    {
            // the line that reads the image file
            BufferedImage image = null;
            File file = null;

            // read image
            try
            {
                file = new File("/Users/michaelriegler/Downloads/image1.jpeg");
                image = ImageIO.read(file);
            }
            catch(IOException e)
            {
                System.out.println(e);
            }


            // after loading the image we can work with the image here ...

        //To get image width and height you can do the following
            int width = image.getWidth();
            int height = image.getHeight();

            //print the width and height of the image. An image is basically and array of width times height times colorspace (Red, green, blue)
            System.out.println("Image width is: "+width + " " + "\nImage height is: " + height);

            /* get pixel value (the arguments in the getRGB method
         denotes the  cordinates of the image from which the
         pixel values need to be extracted) */
            int pixelvalue = image.getRGB(0,0);


                    /*Image manipulation can be very resource consuming. To do it more efficient we can use the bitshift operation.
                    The components of pixel occupy 8 bits. To get the bits we have to first right shift
           the 32 bits of the pixels by bit position(such as 24
           in case of alpha) and then bitwise ADD it with 0xFF.
           0xFF is the hexadecimal representation of the decimal
           value 255.  */


        // get alpha
        int alphaexamplepixel = (pixelvalue>>24) & 0xff;

        // get red
        int redexamplepixel = (pixelvalue>>16) & 0xff;

        // get green
        int greenexamplepixel = (pixelvalue>>8) & 0xff;

        // get blue
        int blueexamplepixel = pixelvalue & 0xff;


        System.out.println("\nPixel value is: "+pixelvalue);
        System.out.println("From this pixel value the alpha value is: "+alphaexamplepixel);
        System.out.println("From this pixel value the red value is: "+redexamplepixel);
        System.out.println("From this pixel value the green value is: "+greenexamplepixel);
        System.out.println("From this pixel value the blue value is: "+blueexamplepixel);

        /*
        To change values in pixels and replace them you just reverse the shift operation and use teh set RGB method
                    // replace RGB value with new value
                    pixel = (alpha<<24) | (newredvalue<<16) | (newgreenvalue<<8) | newbluevalue;
                    image.setRGB(x, y, pixelvalue);
         */

            /*
            In this challenge we will be converting a coloured image to greyscale image.
            Note(Think intuitively): In a greyscale image the Alpha component of the
            image will be same as the original image, but the RGB wil be changed i.e,
            all three RGB components will be having a same value for each pixels.

            Steps:
            Get the RGB value of the pixel.
            Find the average of RGB i.e., Avg = (R+G+B)/3
            Replace the R, G and B value of the pixel with average (Avg) calculated in step 2.
            Repeat Step 1 to Step 3 for each pixels of the image */

            //Iterating trough the image
            for (int y = 0; y < height; y++)
            {
                for (int x = 0; x < width; x++)
                {
                    // Here (x,y)denotes the coordinate of image
                    // for modifying the pixel value. You basically iterate trough the pixels of the image
                    // one by one and do something with them.
                    int pixel = image.getRGB(x,y);

                    int alpha = (pixel>>24)&0xff; //alpha channel does not need to be changed in this example!
                    int red = (pixel>>16)&0xff;
                    int green = (pixel>>8)&0xff;
                    int blue = pixel&0xff;

                    //ADD YOUR CODE HERE
                    // calculate average
                    int average = (red+green+blue)/3;

                    // replace RGB value with average
                    pixel = (alpha<<24) | (average<<16) | (average<<8) | average;

                    // If you do this you will get a complete white image since you set all colors to full
                    //pixel = (alpha<<24) | (255<<16) | (255<<8) | 255;

                    // If you do this you will get a complete black image since you set all colors to full
                    //pixel = (alpha<<24) | (0<<16) | (0<<8) | 0;

                    image.setRGB(x, y, pixel);
                }
            }

            // write image to hard disk
            try
            {
                file = new File("out.jpeg");
                ImageIO.write(image, "jpeg", file);
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
    }

    //main method
    public static void main(String[] args)
    {
        new JavaImageIOTest();
    }
}