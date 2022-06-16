

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKAC109R {

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

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.7, -1.62);
        ((GeneralPath) shape).lineTo(-0.7, 2.41);
        ((GeneralPath) shape).lineTo(-1.49, 2.41);
        ((GeneralPath) shape).lineTo(-1.49, -2.4);
        ((GeneralPath) shape).lineTo(0.33, -2.4);
        ((GeneralPath) shape).lineTo(0.42, -2.39);
        ((GeneralPath) shape).lineTo(0.53, -2.37);
        ((GeneralPath) shape).lineTo(0.63, -2.34);
        ((GeneralPath) shape).lineTo(0.73, -2.3);
        ((GeneralPath) shape).lineTo(0.83, -2.25);
        ((GeneralPath) shape).lineTo(0.94, -2.18);
        ((GeneralPath) shape).lineTo(1.03, -2.11);
        ((GeneralPath) shape).lineTo(1.11, -2.03);
        ((GeneralPath) shape).lineTo(1.2, -1.93);
        ((GeneralPath) shape).lineTo(1.26, -1.84);
        ((GeneralPath) shape).lineTo(1.32, -1.72);
        ((GeneralPath) shape).lineTo(1.37, -1.61);
        ((GeneralPath) shape).lineTo(1.41, -1.49);
        ((GeneralPath) shape).lineTo(1.45, -1.35);
        ((GeneralPath) shape).lineTo(1.47, -1.23);
        ((GeneralPath) shape).lineTo(1.48, -1.12);
        ((GeneralPath) shape).lineTo(1.49, -0.97);
        ((GeneralPath) shape).lineTo(1.48, -0.86);
        ((GeneralPath) shape).lineTo(1.44, -0.71);
        ((GeneralPath) shape).lineTo(1.4, -0.6);
        ((GeneralPath) shape).lineTo(1.29, -0.39);
        ((GeneralPath) shape).lineTo(1.14, -0.19);
        ((GeneralPath) shape).lineTo(1.06, -0.1);
        ((GeneralPath) shape).lineTo(0.97, -0.01);
        ((GeneralPath) shape).lineTo(0.79, 0.15);
        ((GeneralPath) shape).lineTo(0.67, 0.21);
        ((GeneralPath) shape).lineTo(0.54, 0.3);
        ((GeneralPath) shape).lineTo(2.01, 2.41);
        ((GeneralPath) shape).lineTo(1.05, 2.41);
        ((GeneralPath) shape).lineTo(-0.27, 0.52);
        ((GeneralPath) shape).lineTo(-0.7, 0.53);
        ((GeneralPath) shape).lineTo(-0.7, -0.26);
        ((GeneralPath) shape).lineTo(0.1, -0.25);
        ((GeneralPath) shape).lineTo(0.27, -0.35);
        ((GeneralPath) shape).lineTo(0.38, -0.45);
        ((GeneralPath) shape).lineTo(0.52, -0.59);
        ((GeneralPath) shape).lineTo(0.58, -0.68);
        ((GeneralPath) shape).lineTo(0.66, -0.83);
        ((GeneralPath) shape).lineTo(0.66, -1.1);
        ((GeneralPath) shape).lineTo(0.6, -1.26);
        ((GeneralPath) shape).lineTo(0.49, -1.39);
        ((GeneralPath) shape).lineTo(0.32, -1.54);
        ((GeneralPath) shape).lineTo(0.13, -1.62);
        ((GeneralPath) shape).lineTo(-0.7, -1.62);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
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

