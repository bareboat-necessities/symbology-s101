

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKPRH11 {

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
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.51, 1.82);
        ((GeneralPath) shape).lineTo(2.51, -2.52);
        ((GeneralPath) shape).lineTo(-1.78, -2.52);
        ((GeneralPath) shape).lineTo(2.51, 1.82);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.54, -1.81);
        ((GeneralPath) shape).lineTo(-2.54, 2.54);
        ((GeneralPath) shape).lineTo(1.82, 2.54);
        ((GeneralPath) shape).lineTo(-2.54, -1.81);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.54, -1.05);
        ((GeneralPath) shape).lineTo(-2.04, -0.79);
        ((GeneralPath) shape).lineTo(-1.71, -0.64);
        ((GeneralPath) shape).lineTo(-1.42, -0.72);
        ((GeneralPath) shape).lineTo(-1.06, -0.94);
        ((GeneralPath) shape).lineTo(-0.72, -1.16);
        ((GeneralPath) shape).lineTo(-0.42, -1.29);
        ((GeneralPath) shape).lineTo(-0.08, -1.35);
        ((GeneralPath) shape).lineTo(0.4, -1.32);
        ((GeneralPath) shape).lineTo(0.8, -1.15);
        ((GeneralPath) shape).lineTo(1.22, -0.87);
        ((GeneralPath) shape).lineTo(1.57, -0.66);
        ((GeneralPath) shape).lineTo(1.86, -0.67);
        ((GeneralPath) shape).lineTo(2.24, -0.84);
        ((GeneralPath) shape).lineTo(2.51, -1.02);
        ((GeneralPath) shape).lineTo(2.51, -0.36);
        ((GeneralPath) shape).lineTo(2.51, -0.36);
        ((GeneralPath) shape).lineTo(2.21, -0.16);
        ((GeneralPath) shape).lineTo(1.78, -0.05);
        ((GeneralPath) shape).lineTo(1.44, -0.08);
        ((GeneralPath) shape).lineTo(0.96, -0.39);
        ((GeneralPath) shape).lineTo(0.58, -0.63);
        ((GeneralPath) shape).lineTo(0.25, -0.76);
        ((GeneralPath) shape).lineTo(-0.13, -0.76);
        ((GeneralPath) shape).lineTo(-0.47, -0.66);
        ((GeneralPath) shape).lineTo(-0.78, -0.46);
        ((GeneralPath) shape).lineTo(-1.36, -0.13);
        ((GeneralPath) shape).lineTo(-1.73, -0.08);
        ((GeneralPath) shape).lineTo(-2.26, -0.27);
        ((GeneralPath) shape).lineTo(-2.54, -0.42);
        ((GeneralPath) shape).lineTo(-2.54, -1.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.54, 0.42);
        ((GeneralPath) shape).lineTo(-2.04, 0.68);
        ((GeneralPath) shape).lineTo(-1.74, 0.77);
        ((GeneralPath) shape).lineTo(-1.41, 0.72);
        ((GeneralPath) shape).lineTo(-1.06, 0.53);
        ((GeneralPath) shape).lineTo(-0.68, 0.28);
        ((GeneralPath) shape).lineTo(-0.45, 0.16);
        ((GeneralPath) shape).lineTo(-0.16, 0.09);
        ((GeneralPath) shape).lineTo(0.29, 0.09);
        ((GeneralPath) shape).lineTo(0.7, 0.28);
        ((GeneralPath) shape).lineTo(1.2, 0.68);
        ((GeneralPath) shape).lineTo(1.53, 0.78);
        ((GeneralPath) shape).lineTo(1.88, 0.79);
        ((GeneralPath) shape).lineTo(2.24, 0.63);
        ((GeneralPath) shape).lineTo(2.51, 0.47);
        ((GeneralPath) shape).lineTo(2.51, 1.12);
        ((GeneralPath) shape).lineTo(2.02, 1.35);
        ((GeneralPath) shape).lineTo(1.47, 1.36);
        ((GeneralPath) shape).lineTo(0.89, 1.15);
        ((GeneralPath) shape).lineTo(0.51, 0.85);
        ((GeneralPath) shape).lineTo(0.25, 0.71);
        ((GeneralPath) shape).lineTo(-0.13, 0.71);
        ((GeneralPath) shape).lineTo(-0.44, 0.8);
        ((GeneralPath) shape).lineTo(-0.74, 1.0);
        ((GeneralPath) shape).lineTo(-1.29, 1.29);
        ((GeneralPath) shape).lineTo(-1.81, 1.35);
        ((GeneralPath) shape).lineTo(-2.26, 1.2);
        ((GeneralPath) shape).lineTo(-2.54, 1.05);
        ((GeneralPath) shape).lineTo(-2.54, 0.42);
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

