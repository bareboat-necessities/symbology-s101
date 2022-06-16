

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF06 {

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
        g.transform(new AffineTransform(3.7687597f, 0, 0, 3.7687597f, 13.228347f, 13.228347f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.62, -2.21);
        ((GeneralPath) shape).lineTo(-0.7, -2.21);
        ((GeneralPath) shape).lineTo(-0.7, 2.2);
        ((GeneralPath) shape).lineTo(-1.62, 2.2);
        ((GeneralPath) shape).lineTo(-1.62, -2.21);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.7, -2.21);
        ((GeneralPath) shape).lineTo(0.46, -2.21);
        ((GeneralPath) shape).lineTo(0.67, -2.2);
        ((GeneralPath) shape).lineTo(0.89, -2.17);
        ((GeneralPath) shape).lineTo(1.11, -2.13);
        ((GeneralPath) shape).lineTo(1.23, -2.1);
        ((GeneralPath) shape).lineTo(1.41, -2.04);
        ((GeneralPath) shape).lineTo(1.58, -1.94);
        ((GeneralPath) shape).lineTo(1.74, -1.81);
        ((GeneralPath) shape).lineTo(1.9, -1.65);
        ((GeneralPath) shape).lineTo(2.02, -1.46);
        ((GeneralPath) shape).lineTo(2.09, -1.31);
        ((GeneralPath) shape).lineTo(2.15, -1.15);
        ((GeneralPath) shape).lineTo(2.16, -0.88);
        ((GeneralPath) shape).lineTo(2.14, -0.68);
        ((GeneralPath) shape).lineTo(2.09, -0.45);
        ((GeneralPath) shape).lineTo(2.0, -0.23);
        ((GeneralPath) shape).lineTo(1.89, -0.09);
        ((GeneralPath) shape).lineTo(1.79, 0.01);
        ((GeneralPath) shape).lineTo(1.67, 0.11);
        ((GeneralPath) shape).lineTo(1.48, 0.24);
        ((GeneralPath) shape).lineTo(1.36, 0.3);
        ((GeneralPath) shape).lineTo(1.14, 0.38);
        ((GeneralPath) shape).lineTo(1.03, 0.42);
        ((GeneralPath) shape).lineTo(0.89, 0.44);
        ((GeneralPath) shape).lineTo(0.71, 0.45);
        ((GeneralPath) shape).lineTo(0.55, 0.46);
        ((GeneralPath) shape).lineTo(-0.7, 0.46);
        ((GeneralPath) shape).lineTo(-0.7, -0.22);
        ((GeneralPath) shape).lineTo(0.51, -0.23);
        ((GeneralPath) shape).lineTo(0.7, -0.26);
        ((GeneralPath) shape).lineTo(0.84, -0.32);
        ((GeneralPath) shape).lineTo(0.95, -0.37);
        ((GeneralPath) shape).lineTo(1.05, -0.45);
        ((GeneralPath) shape).lineTo(1.16, -0.59);
        ((GeneralPath) shape).lineTo(1.2, -0.76);
        ((GeneralPath) shape).lineTo(1.21, -0.93);
        ((GeneralPath) shape).lineTo(1.19, -1.05);
        ((GeneralPath) shape).lineTo(1.16, -1.13);
        ((GeneralPath) shape).lineTo(1.12, -1.21);
        ((GeneralPath) shape).lineTo(1.04, -1.31);
        ((GeneralPath) shape).lineTo(0.96, -1.39);
        ((GeneralPath) shape).lineTo(0.84, -1.45);
        ((GeneralPath) shape).lineTo(0.69, -1.51);
        ((GeneralPath) shape).lineTo(0.53, -1.53);
        ((GeneralPath) shape).lineTo(0.31, -1.55);
        ((GeneralPath) shape).lineTo(-0.7, -1.55);
        ((GeneralPath) shape).lineTo(-0.7, -2.21);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
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
        return 27;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 27;
    }
}

