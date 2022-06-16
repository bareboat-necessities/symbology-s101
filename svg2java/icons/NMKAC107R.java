

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKAC107R {

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
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-2.9, 3.5);
        ((GeneralPath) shape).lineTo(-2.9, -3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(2.9, 3.5);
        ((GeneralPath) shape).lineTo(2.9, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.34, -0.92);
        ((GeneralPath) shape).lineTo(0.94, -0.92);
        ((GeneralPath) shape).lineTo(1.64, -2.17);
        ((GeneralPath) shape).lineTo(2.34, -0.92);
        ((GeneralPath) shape).lineTo(1.94, -0.92);
        ((GeneralPath) shape).lineTo(1.94, -0.69);
        ((GeneralPath) shape).lineTo(1.86, -0.48);
        ((GeneralPath) shape).lineTo(1.78, -0.3);
        ((GeneralPath) shape).lineTo(1.63, -0.12);
        ((GeneralPath) shape).lineTo(1.43, 0.06);
        ((GeneralPath) shape).lineTo(1.12, 0.24);
        ((GeneralPath) shape).lineTo(0.81, 0.37);
        ((GeneralPath) shape).lineTo(0.5, 0.43);
        ((GeneralPath) shape).lineTo(0.1, 0.49);
        ((GeneralPath) shape).lineTo(-0.19, 0.51);
        ((GeneralPath) shape).lineTo(-0.43, 0.54);
        ((GeneralPath) shape).lineTo(-0.58, 0.57);
        ((GeneralPath) shape).lineTo(-0.75, 0.68);
        ((GeneralPath) shape).lineTo(-0.95, 0.91);
        ((GeneralPath) shape).lineTo(-1.14, 1.22);
        ((GeneralPath) shape).lineTo(-1.26, 1.51);
        ((GeneralPath) shape).lineTo(-1.3, 1.86);
        ((GeneralPath) shape).lineTo(-1.3, 2.35);
        ((GeneralPath) shape).lineTo(-1.9, 2.35);
        ((GeneralPath) shape).lineTo(-1.9, 2.0);
        ((GeneralPath) shape).lineTo(-1.9, 1.65);
        ((GeneralPath) shape).lineTo(-1.85, 1.4);
        ((GeneralPath) shape).lineTo(-1.76, 1.16);
        ((GeneralPath) shape).lineTo(-1.62, 0.85);
        ((GeneralPath) shape).lineTo(-1.48, 0.62);
        ((GeneralPath) shape).lineTo(-1.34, 0.46);
        ((GeneralPath) shape).lineTo(-1.17, 0.3);
        ((GeneralPath) shape).lineTo(-0.97, 0.16);
        ((GeneralPath) shape).lineTo(-0.76, 0.08);
        ((GeneralPath) shape).lineTo(-0.44, 0.02);
        ((GeneralPath) shape).lineTo(0.02, -0.02);
        ((GeneralPath) shape).lineTo(0.44, -0.06);
        ((GeneralPath) shape).lineTo(0.72, -0.15);
        ((GeneralPath) shape).lineTo(0.97, -0.27);
        ((GeneralPath) shape).lineTo(1.14, -0.39);
        ((GeneralPath) shape).lineTo(1.27, -0.52);
        ((GeneralPath) shape).lineTo(1.34, -0.71);
        ((GeneralPath) shape).lineTo(1.34, -0.92);
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

