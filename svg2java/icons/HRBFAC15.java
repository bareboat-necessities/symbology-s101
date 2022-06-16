

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class HRBFAC15 {

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
        g.transform(new AffineTransform(3.7574253f, 0, 0, 3.7574253f, 6.4251976f, 6.4251976f));

        // _0

        // _0_0

        // _0_0_0
        shape = new Ellipse2D.Double(-1.7000000476837158, -1.7000000476837158, 3.4000000953674316, 3.4000000953674316);
        g.setPaint(new Color(0xDADADA));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.08f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.13, -0.76);
        ((GeneralPath) shape).lineTo(-0.96, 0.73);
        ((GeneralPath) shape).lineTo(-0.74, 0.73);
        ((GeneralPath) shape).lineTo(-0.52, 0.06);
        ((GeneralPath) shape).lineTo(-0.3, 0.73);
        ((GeneralPath) shape).lineTo(-0.06, 0.73);
        ((GeneralPath) shape).lineTo(0.08, -0.76);
        ((GeneralPath) shape).lineTo(-0.11, -0.76);
        ((GeneralPath) shape).lineTo(-0.22, 0.42);
        ((GeneralPath) shape).lineTo(-0.45, -0.26);
        ((GeneralPath) shape).lineTo(-0.6, -0.26);
        ((GeneralPath) shape).lineTo(-0.81, 0.38);
        ((GeneralPath) shape).lineTo(-0.92, -0.77);
        ((GeneralPath) shape).lineTo(-1.13, -0.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.51, -0.6);
        ((GeneralPath) shape).lineTo(0.51, -0.76);
        ((GeneralPath) shape).lineTo(0.3, -0.76);
        ((GeneralPath) shape).lineTo(0.3, 0.73);
        ((GeneralPath) shape).lineTo(0.5, 0.73);
        ((GeneralPath) shape).lineTo(0.5, 0.2);
        ((GeneralPath) shape).lineTo(0.68, 0.2);
        ((GeneralPath) shape).lineTo(0.8, 0.19);
        ((GeneralPath) shape).lineTo(0.9, 0.17);
        ((GeneralPath) shape).lineTo(0.99, 0.14);
        ((GeneralPath) shape).lineTo(1.05, 0.11);
        ((GeneralPath) shape).lineTo(1.14, 0.05);
        ((GeneralPath) shape).lineTo(1.18, -0.01);
        ((GeneralPath) shape).lineTo(1.25, -0.11);
        ((GeneralPath) shape).lineTo(1.27, -0.2);
        ((GeneralPath) shape).lineTo(1.29, -0.3);
        ((GeneralPath) shape).lineTo(1.28, -0.42);
        ((GeneralPath) shape).lineTo(1.25, -0.5);
        ((GeneralPath) shape).lineTo(1.22, -0.55);
        ((GeneralPath) shape).lineTo(1.17, -0.61);
        ((GeneralPath) shape).lineTo(1.11, -0.66);
        ((GeneralPath) shape).lineTo(1.06, -0.7);
        ((GeneralPath) shape).lineTo(0.98, -0.73);
        ((GeneralPath) shape).lineTo(0.9, -0.75);
        ((GeneralPath) shape).lineTo(0.83, -0.76);
        ((GeneralPath) shape).lineTo(0.76, -0.76);
        ((GeneralPath) shape).lineTo(0.51, -0.76);
        ((GeneralPath) shape).lineTo(0.51, -0.6);
        ((GeneralPath) shape).lineTo(0.69, -0.6);
        ((GeneralPath) shape).lineTo(0.79, -0.59);
        ((GeneralPath) shape).lineTo(0.85, -0.58);
        ((GeneralPath) shape).lineTo(0.93, -0.55);
        ((GeneralPath) shape).lineTo(1.0, -0.5);
        ((GeneralPath) shape).lineTo(1.03, -0.45);
        ((GeneralPath) shape).lineTo(1.07, -0.38);
        ((GeneralPath) shape).lineTo(1.07, -0.34);
        ((GeneralPath) shape).lineTo(1.07, -0.27);
        ((GeneralPath) shape).lineTo(1.06, -0.2);
        ((GeneralPath) shape).lineTo(1.05, -0.15);
        ((GeneralPath) shape).lineTo(1.02, -0.1);
        ((GeneralPath) shape).lineTo(0.97, -0.06);
        ((GeneralPath) shape).lineTo(0.93, -0.02);
        ((GeneralPath) shape).lineTo(0.88, 0.0);
        ((GeneralPath) shape).lineTo(0.79, 0.02);
        ((GeneralPath) shape).lineTo(0.68, 0.02);
        ((GeneralPath) shape).lineTo(0.51, 0.02);
        ((GeneralPath) shape).lineTo(0.51, -0.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

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
        return 14;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 14;
    }
}

