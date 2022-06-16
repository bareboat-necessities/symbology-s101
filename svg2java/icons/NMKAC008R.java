

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKAC008R {

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
        ((GeneralPath) shape).lineTo(3.46, 2.94);

        g.setPaint(WHITE);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.33, -1.3);
        ((GeneralPath) shape).lineTo(-0.89, -1.3);
        ((GeneralPath) shape).lineTo(-0.89, -0.79);
        ((GeneralPath) shape).lineTo(-0.33, -0.79);
        ((GeneralPath) shape).lineTo(-0.33, 1.94);
        ((GeneralPath) shape).lineTo(-0.49, 1.94);
        ((GeneralPath) shape).lineTo(-1.34, 1.29);
        ((GeneralPath) shape).lineTo(-1.84, 0.76);
        ((GeneralPath) shape).lineTo(-1.46, 0.5);
        ((GeneralPath) shape).lineTo(-2.59, 0.02);
        ((GeneralPath) shape).lineTo(-2.59, 1.22);
        ((GeneralPath) shape).lineTo(-2.23, 0.99);
        ((GeneralPath) shape).lineTo(-1.33, 1.94);
        ((GeneralPath) shape).lineTo(-0.8, 2.37);
        ((GeneralPath) shape).lineTo(-0.49, 2.51);
        ((GeneralPath) shape).lineTo(-0.01, 2.99);
        ((GeneralPath) shape).lineTo(0.52, 2.51);
        ((GeneralPath) shape).lineTo(0.84, 2.37);
        ((GeneralPath) shape).lineTo(1.38, 1.97);
        ((GeneralPath) shape).lineTo(2.35, 0.93);
        ((GeneralPath) shape).lineTo(2.74, 1.22);
        ((GeneralPath) shape).lineTo(2.74, 0.02);
        ((GeneralPath) shape).lineTo(1.67, 0.42);
        ((GeneralPath) shape).lineTo(1.99, 0.67);
        ((GeneralPath) shape).lineTo(1.07, 1.57);
        ((GeneralPath) shape).lineTo(0.53, 1.94);
        ((GeneralPath) shape).lineTo(0.32, 1.94);
        ((GeneralPath) shape).lineTo(0.32, -0.76);
        ((GeneralPath) shape).lineTo(1.07, -0.76);
        ((GeneralPath) shape).lineTo(1.07, -1.3);
        ((GeneralPath) shape).lineTo(0.32, -1.3);
        ((GeneralPath) shape).lineTo(0.32, -2.06);
        ((GeneralPath) shape).lineTo(-0.33, -2.06);
        ((GeneralPath) shape).lineTo(-0.33, -1.3);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new Ellipse2D.Double(-0.3799999952316284, -2.820000171661377, 0.7599999904632568, 0.7599999904632568);
        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(-2.96, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 2.96);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(2.96, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -2.96);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
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

