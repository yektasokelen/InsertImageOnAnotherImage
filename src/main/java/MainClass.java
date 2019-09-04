import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Image Url");

        String firstUrl = sc.nextLine();

        System.out.println("Enter The Second Png Image Url");

        String secondUrl = sc.nextLine();

        System.out.println("Enter X Coordinate");

        int x = sc.nextInt();

        System.out.println("Enter Y Coordinate");

        int y = sc.nextInt();

        BufferedImage getImage1 = ImageIO.read(new File(firstUrl));

        BufferedImage getImage2 = ImageIO.read(new File(secondUrl));

        Graphics graphics =  getImage1.getGraphics();

        graphics.drawImage(getImage2,x,y,null);

        ImageIO.write(getImage1,"png",new File(firstUrl));


    }

}
