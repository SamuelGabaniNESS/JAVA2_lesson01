package com.ness;
import ij.IJ;
import ij.ImagePlus;
import ij.io.FileSaver;
import ij.process.ImageProcessor;
import org.apache.commons.lang3.StringUtils;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(StringUtils.isEmpty(""));
//        System.out.println(StringUtils.isEmpty("string"));

        //Najdi maven kniznicu na otvorenie obrazkov, pridaj text a uloz obrazok
        ImagePlus image = IJ.openImage(
                "src/main/resources/ness.png");
        System.out.println(image);
        Font font = new Font("Arial", Font.BOLD, 18);
        ImageProcessor ip = image.getProcessor();
        ip.setColor(Color.BLACK);
        ip.setFont(font);
        ip.drawString("Text pridany kniznicou", 0, 20);
        FileSaver fs = new FileSaver(image);
        fs.saveAsPng("ness2.png");




    }
}
