

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class TOPMA117 {

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
        g.transform(new AffineTransform(3.73558f, 0, 0, 3.73558f, 3.2125988f, 19.614431f));

        // _0

        // _0_0

        // _0_0_0
        shape = new Ellipse2D.Double(-0.8500000238418579, -5.21999979019165, 1.7000000476837158, 1.7000000476837158);
        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.85, -4.37);
        ((GeneralPath) shape).lineTo(-0.85, -4.37);
        ((GeneralPath) shape).lineTo(-0.85, -4.29);
        ((GeneralPath) shape).lineTo(-0.83, -4.21);
        ((GeneralPath) shape).lineTo(-0.81, -4.13);
        ((GeneralPath) shape).lineTo(-0.79, -4.05);
        ((GeneralPath) shape).lineTo(-0.75, -3.98);
        ((GeneralPath) shape).lineTo(-0.71, -3.91);
        ((GeneralPath) shape).lineTo(-0.66, -3.84);
        ((GeneralPath) shape).lineTo(-0.61, -3.78);
        ((GeneralPath) shape).lineTo(-0.55, -3.72);
        ((GeneralPath) shape).lineTo(-0.48, -3.67);
        ((GeneralPath) shape).lineTo(-0.41, -3.63);
        ((GeneralPath) shape).lineTo(-0.34, -3.59);
        ((GeneralPath) shape).lineTo(-0.26, -3.57);
        ((GeneralPath) shape).lineTo(-0.18, -3.54);
        ((GeneralPath) shape).lineTo(-0.1, -3.53);
        ((GeneralPath) shape).lineTo(-0.02, -3.52);
        ((GeneralPath) shape).lineTo(0.07, -3.53);
        ((GeneralPath) shape).lineTo(0.15, -3.54);
        ((GeneralPath) shape).lineTo(0.23, -3.56);
        ((GeneralPath) shape).lineTo(0.31, -3.58);
        ((GeneralPath) shape).lineTo(0.38, -3.62);
        ((GeneralPath) shape).lineTo(0.45, -3.66);
        ((GeneralPath) shape).lineTo(0.52, -3.7);
        ((GeneralPath) shape).lineTo(0.58, -3.76);
        ((GeneralPath) shape).lineTo(0.64, -3.82);
        ((GeneralPath) shape).lineTo(0.69, -3.88);
        ((GeneralPath) shape).lineTo(0.74, -3.95);
        ((GeneralPath) shape).lineTo(0.77, -4.02);
        ((GeneralPath) shape).lineTo(0.8, -4.1);
        ((GeneralPath) shape).lineTo(0.83, -4.18);
        ((GeneralPath) shape).lineTo(0.84, -4.26);
        ((GeneralPath) shape).lineTo(0.85, -4.34);
        ((GeneralPath) shape).lineTo(0.85, -4.37);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x52E93A));
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new Ellipse2D.Double(-0.8500000238418579, -5.21999979019165, 1.7000000476837158, 1.7000000476837158);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, -3.52);
        ((GeneralPath) shape).lineTo(0.0, -3.29);

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
        return 7;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 8;
    }
}

