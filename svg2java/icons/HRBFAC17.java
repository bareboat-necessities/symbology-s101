

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class HRBFAC17 {

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
        ((GeneralPath) shape).moveTo(-0.62, -0.95);
        ((GeneralPath) shape).lineTo(-0.24, -0.61);
        ((GeneralPath) shape).lineTo(-0.17, -0.41);
        ((GeneralPath) shape).lineTo(-0.23, -0.25);
        ((GeneralPath) shape).lineTo(-0.45, -0.15);
        ((GeneralPath) shape).lineTo(-0.64, -0.25);
        ((GeneralPath) shape).lineTo(-1.01, -0.58);
        ((GeneralPath) shape).lineTo(-1.03, -0.28);
        ((GeneralPath) shape).lineTo(-0.86, -0.03);
        ((GeneralPath) shape).lineTo(-0.64, 0.12);
        ((GeneralPath) shape).lineTo(-0.39, 0.13);
        ((GeneralPath) shape).lineTo(-0.19, 0.08);
        ((GeneralPath) shape).lineTo(0.89, 1.0);
        ((GeneralPath) shape).lineTo(1.1, 0.76);
        ((GeneralPath) shape).lineTo(0.07, -0.18);
        ((GeneralPath) shape).lineTo(0.11, -0.42);
        ((GeneralPath) shape).lineTo(0.08, -0.62);
        ((GeneralPath) shape).lineTo(-0.02, -0.76);
        ((GeneralPath) shape).lineTo(-0.2, -0.92);
        ((GeneralPath) shape).lineTo(-0.35, -0.98);
        ((GeneralPath) shape).lineTo(-0.62, -0.95);
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

