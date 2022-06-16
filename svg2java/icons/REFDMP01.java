

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class REFDMP01 {

    /**
     * Paints the transcoded SVG image on the specified graphics context. You
     * can install a custom transformation on the graphics context to scale the
     * image.
     * 
     * @param g Graphics context.
     */
    public static void paint(Graphics2D g) {
        Shape shape = null;
        
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();
        

        // 
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(3.7567596f, 0, 0, 3.7567596f, 6.236221f, 7.9745755f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.65, -1.53);
        ((GeneralPath) shape).lineTo(-1.65, 1.66);
        ((GeneralPath) shape).lineTo(-1.25, 2.1);
        ((GeneralPath) shape).lineTo(1.21, 2.1);
        ((GeneralPath) shape).lineTo(1.65, 1.63);
        ((GeneralPath) shape).lineTo(1.65, -1.49);
        ((GeneralPath) shape).lineTo(-1.65, -1.53);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDADADA));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.65, -1.49);
        ((GeneralPath) shape).lineTo(1.65, -1.53);
        ((GeneralPath) shape).lineTo(1.64, -1.57);
        ((GeneralPath) shape).lineTo(1.62, -1.61);
        ((GeneralPath) shape).lineTo(1.59, -1.66);
        ((GeneralPath) shape).lineTo(1.56, -1.69);
        ((GeneralPath) shape).lineTo(1.51, -1.73);
        ((GeneralPath) shape).lineTo(1.46, -1.77);
        ((GeneralPath) shape).lineTo(1.41, -1.81);
        ((GeneralPath) shape).lineTo(1.34, -1.84);
        ((GeneralPath) shape).lineTo(1.27, -1.88);
        ((GeneralPath) shape).lineTo(1.2, -1.91);
        ((GeneralPath) shape).lineTo(1.11, -1.94);
        ((GeneralPath) shape).lineTo(1.03, -1.97);
        ((GeneralPath) shape).lineTo(0.93, -1.99);
        ((GeneralPath) shape).lineTo(0.84, -2.01);
        ((GeneralPath) shape).lineTo(0.74, -2.04);
        ((GeneralPath) shape).lineTo(0.63, -2.05);
        ((GeneralPath) shape).lineTo(0.52, -2.07);
        ((GeneralPath) shape).lineTo(0.41, -2.08);
        ((GeneralPath) shape).lineTo(0.3, -2.09);
        ((GeneralPath) shape).lineTo(0.19, -2.1);
        ((GeneralPath) shape).lineTo(0.07, -2.1);
        ((GeneralPath) shape).lineTo(-0.04, -2.11);
        ((GeneralPath) shape).lineTo(-0.16, -2.1);
        ((GeneralPath) shape).lineTo(-0.27, -2.1);
        ((GeneralPath) shape).lineTo(-0.38, -2.09);
        ((GeneralPath) shape).lineTo(-0.49, -2.08);
        ((GeneralPath) shape).lineTo(-0.6, -2.07);
        ((GeneralPath) shape).lineTo(-0.71, -2.06);
        ((GeneralPath) shape).lineTo(-0.81, -2.04);
        ((GeneralPath) shape).lineTo(-0.91, -2.02);
        ((GeneralPath) shape).lineTo(-1.0, -1.99);
        ((GeneralPath) shape).lineTo(-1.09, -1.97);
        ((GeneralPath) shape).lineTo(-1.17, -1.94);
        ((GeneralPath) shape).lineTo(-1.25, -1.91);
        ((GeneralPath) shape).lineTo(-1.32, -1.88);
        ((GeneralPath) shape).lineTo(-1.39, -1.85);
        ((GeneralPath) shape).lineTo(-1.45, -1.81);
        ((GeneralPath) shape).lineTo(-1.5, -1.78);
        ((GeneralPath) shape).lineTo(-1.54, -1.74);
        ((GeneralPath) shape).lineTo(-1.58, -1.7);
        ((GeneralPath) shape).lineTo(-1.61, -1.66);
        ((GeneralPath) shape).lineTo(-1.63, -1.62);
        ((GeneralPath) shape).lineTo(-1.64, -1.58);
        ((GeneralPath) shape).lineTo(-1.65, -1.54);
        ((GeneralPath) shape).lineTo(-1.65, -1.5);
        ((GeneralPath) shape).lineTo(-1.64, -1.45);
        ((GeneralPath) shape).lineTo(-1.62, -1.41);
        ((GeneralPath) shape).lineTo(-1.59, -1.37);
        ((GeneralPath) shape).lineTo(-1.56, -1.33);
        ((GeneralPath) shape).lineTo(-1.51, -1.29);
        ((GeneralPath) shape).lineTo(-1.47, -1.26);
        ((GeneralPath) shape).lineTo(-1.41, -1.22);
        ((GeneralPath) shape).lineTo(-1.35, -1.18);
        ((GeneralPath) shape).lineTo(-1.28, -1.15);
        ((GeneralPath) shape).lineTo(-1.2, -1.12);
        ((GeneralPath) shape).lineTo(-1.12, -1.09);
        ((GeneralPath) shape).lineTo(-1.03, -1.06);
        ((GeneralPath) shape).lineTo(-0.94, -1.03);
        ((GeneralPath) shape).lineTo(-0.85, -1.01);
        ((GeneralPath) shape).lineTo(-0.74, -0.99);
        ((GeneralPath) shape).lineTo(-0.64, -0.97);
        ((GeneralPath) shape).lineTo(-0.53, -0.96);
        ((GeneralPath) shape).lineTo(-0.42, -0.94);
        ((GeneralPath) shape).lineTo(-0.31, -0.93);
        ((GeneralPath) shape).lineTo(-0.2, -0.92);
        ((GeneralPath) shape).lineTo(-0.08, -0.92);
        ((GeneralPath) shape).lineTo(0.03, -0.92);
        ((GeneralPath) shape).lineTo(0.15, -0.92);
        ((GeneralPath) shape).lineTo(0.26, -0.92);
        ((GeneralPath) shape).lineTo(0.37, -0.93);
        ((GeneralPath) shape).lineTo(0.48, -0.94);
        ((GeneralPath) shape).lineTo(0.59, -0.95);
        ((GeneralPath) shape).lineTo(0.7, -0.97);
        ((GeneralPath) shape).lineTo(0.8, -0.98);
        ((GeneralPath) shape).lineTo(0.9, -1.0);
        ((GeneralPath) shape).lineTo(0.99, -1.03);
        ((GeneralPath) shape).lineTo(1.08, -1.05);
        ((GeneralPath) shape).lineTo(1.17, -1.08);
        ((GeneralPath) shape).lineTo(1.25, -1.11);
        ((GeneralPath) shape).lineTo(1.32, -1.14);
        ((GeneralPath) shape).lineTo(1.38, -1.17);
        ((GeneralPath) shape).lineTo(1.44, -1.21);
        ((GeneralPath) shape).lineTo(1.5, -1.24);
        ((GeneralPath) shape).lineTo(1.54, -1.28);
        ((GeneralPath) shape).lineTo(1.58, -1.32);
        ((GeneralPath) shape).lineTo(1.61, -1.36);
        ((GeneralPath) shape).lineTo(1.63, -1.4);
        ((GeneralPath) shape).lineTo(1.64, -1.44);
        ((GeneralPath) shape).lineTo(1.65, -1.48);
        ((GeneralPath) shape).lineTo(1.65, -1.49);

        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.43, -0.02);
        ((GeneralPath) shape).lineTo(-1.26, 1.45);
        ((GeneralPath) shape).lineTo(-0.88, 0.97);
        ((GeneralPath) shape).lineTo(-0.48, 1.46);
        ((GeneralPath) shape).lineTo(-0.27, 1.68);
        ((GeneralPath) shape).lineTo(-0.04, 1.87);
        ((GeneralPath) shape).lineTo(0.3, 1.87);
        ((GeneralPath) shape).lineTo(0.56, 1.69);
        ((GeneralPath) shape).lineTo(0.81, 1.39);
        ((GeneralPath) shape).lineTo(0.68, 1.3);
        ((GeneralPath) shape).lineTo(0.47, 1.52);
        ((GeneralPath) shape).lineTo(0.25, 1.65);
        ((GeneralPath) shape).lineTo(0.0, 1.68);
        ((GeneralPath) shape).lineTo(-0.24, 1.47);
        ((GeneralPath) shape).lineTo(-0.75, 0.86);
        ((GeneralPath) shape).lineTo(-0.12, 0.57);
        ((GeneralPath) shape).lineTo(-1.43, -0.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00D400));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.34, 1.29);
        ((GeneralPath) shape).lineTo(1.28, -0.31);
        ((GeneralPath) shape).lineTo(0.84, 0.22);
        ((GeneralPath) shape).lineTo(0.46, -0.22);
        ((GeneralPath) shape).lineTo(0.18, -0.49);
        ((GeneralPath) shape).lineTo(-0.03, -0.64);
        ((GeneralPath) shape).lineTo(-0.27, -0.68);
        ((GeneralPath) shape).lineTo(-0.48, -0.61);
        ((GeneralPath) shape).lineTo(-0.61, -0.49);
        ((GeneralPath) shape).lineTo(-0.79, -0.33);
        ((GeneralPath) shape).lineTo(-0.65, -0.21);
        ((GeneralPath) shape).lineTo(-0.47, -0.39);
        ((GeneralPath) shape).lineTo(-0.33, -0.49);
        ((GeneralPath) shape).lineTo(-0.2, -0.51);
        ((GeneralPath) shape).lineTo(-0.03, -0.44);
        ((GeneralPath) shape).lineTo(0.17, -0.29);
        ((GeneralPath) shape).lineTo(0.42, 0.0);
        ((GeneralPath) shape).lineTo(0.69, 0.32);
        ((GeneralPath) shape).lineTo(0.11, 0.55);
        ((GeneralPath) shape).lineTo(1.34, 1.29);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.65, -1.53);
        ((GeneralPath) shape).lineTo(-1.65, 1.66);
        ((GeneralPath) shape).lineTo(-1.25, 2.1);
        ((GeneralPath) shape).lineTo(1.21, 2.1);
        ((GeneralPath) shape).lineTo(1.65, 1.63);
        ((GeneralPath) shape).lineTo(1.65, -1.49);

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0

    }

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 0;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * 
     * @return The width of the bounding box of the original SVG image.
     */
    public static int getOrigWidth() {
        return 13;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 17;
    }
}

