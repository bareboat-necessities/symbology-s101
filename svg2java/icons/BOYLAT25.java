

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYLAT25 {

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
        g.transform(new AffineTransform(3.7628043f, 0, 0, 3.7628043f, 8.503938f, 8.503938f));

        // _0

        // _0_0

        // _0_0_0
        shape = new Ellipse2D.Double(-2.25, -2.25, 4.5, 4.5);
        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.25, 0.0);
        ((GeneralPath) shape).lineTo(2.25, 0.0);
        ((GeneralPath) shape).lineTo(2.25, -0.13);
        ((GeneralPath) shape).lineTo(2.23, -0.27);
        ((GeneralPath) shape).lineTo(2.21, -0.4);
        ((GeneralPath) shape).lineTo(2.19, -0.53);
        ((GeneralPath) shape).lineTo(2.15, -0.66);
        ((GeneralPath) shape).lineTo(2.11, -0.79);
        ((GeneralPath) shape).lineTo(2.06, -0.91);
        ((GeneralPath) shape).lineTo(2.0, -1.03);
        ((GeneralPath) shape).lineTo(1.98, -1.06);
        ((GeneralPath) shape).lineTo(-1.98, -1.06);
        ((GeneralPath) shape).lineTo(-2.04, -0.94);
        ((GeneralPath) shape).lineTo(-2.1, -0.82);
        ((GeneralPath) shape).lineTo(-2.14, -0.69);
        ((GeneralPath) shape).lineTo(-2.18, -0.56);
        ((GeneralPath) shape).lineTo(-2.21, -0.43);
        ((GeneralPath) shape).lineTo(-2.23, -0.3);
        ((GeneralPath) shape).lineTo(-2.24, -0.16);
        ((GeneralPath) shape).lineTo(-2.25, -0.03);
        ((GeneralPath) shape).lineTo(-2.25, 0.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x52E93A));
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.98, 1.06);
        ((GeneralPath) shape).lineTo(-1.92, 1.18);
        ((GeneralPath) shape).lineTo(-1.84, 1.29);
        ((GeneralPath) shape).lineTo(-1.76, 1.4);
        ((GeneralPath) shape).lineTo(-1.68, 1.5);
        ((GeneralPath) shape).lineTo(-1.58, 1.6);
        ((GeneralPath) shape).lineTo(-1.49, 1.69);
        ((GeneralPath) shape).lineTo(-1.38, 1.77);
        ((GeneralPath) shape).lineTo(-1.28, 1.85);
        ((GeneralPath) shape).lineTo(-1.16, 1.93);
        ((GeneralPath) shape).lineTo(-1.05, 1.99);
        ((GeneralPath) shape).lineTo(-0.93, 2.05);
        ((GeneralPath) shape).lineTo(-0.8, 2.1);
        ((GeneralPath) shape).lineTo(-0.67, 2.15);
        ((GeneralPath) shape).lineTo(-0.55, 2.18);
        ((GeneralPath) shape).lineTo(-0.41, 2.21);
        ((GeneralPath) shape).lineTo(-0.28, 2.23);
        ((GeneralPath) shape).lineTo(-0.15, 2.25);
        ((GeneralPath) shape).lineTo(-0.01, 2.25);
        ((GeneralPath) shape).lineTo(0.12, 2.25);
        ((GeneralPath) shape).lineTo(0.25, 2.24);
        ((GeneralPath) shape).lineTo(0.39, 2.22);
        ((GeneralPath) shape).lineTo(0.52, 2.19);
        ((GeneralPath) shape).lineTo(0.65, 2.15);
        ((GeneralPath) shape).lineTo(0.77, 2.11);
        ((GeneralPath) shape).lineTo(0.9, 2.06);
        ((GeneralPath) shape).lineTo(1.02, 2.01);
        ((GeneralPath) shape).lineTo(1.14, 1.94);
        ((GeneralPath) shape).lineTo(1.25, 1.87);
        ((GeneralPath) shape).lineTo(1.36, 1.79);
        ((GeneralPath) shape).lineTo(1.47, 1.71);
        ((GeneralPath) shape).lineTo(1.56, 1.62);
        ((GeneralPath) shape).lineTo(1.66, 1.52);
        ((GeneralPath) shape).lineTo(1.75, 1.42);
        ((GeneralPath) shape).lineTo(1.83, 1.31);
        ((GeneralPath) shape).lineTo(1.9, 1.2);
        ((GeneralPath) shape).lineTo(1.97, 1.09);
        ((GeneralPath) shape).lineTo(1.98, 1.06);
        ((GeneralPath) shape).lineTo(-1.98, 1.06);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new Ellipse2D.Double(-2.25, -2.25, 4.5, 4.5);
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
        return 18;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 18;
    }
}

