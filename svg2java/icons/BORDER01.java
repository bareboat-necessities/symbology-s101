

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BORDER01 {

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
        g.transform(new AffineTransform(3.7574253f, 0, 0, 3.7574253f, 6.4251976f, 8.314961f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.7, 2.2);
        ((GeneralPath) shape).lineTo(1.7, 0.29);
        ((GeneralPath) shape).lineTo(1.6, 0.29);
        ((GeneralPath) shape).lineTo(1.6, 0.74);
        ((GeneralPath) shape).lineTo(-1.17, -2.2);
        ((GeneralPath) shape).lineTo(-1.7, -1.61);
        ((GeneralPath) shape).lineTo(1.6, 1.9);
        ((GeneralPath) shape).lineTo(1.6, 2.2);
        ((GeneralPath) shape).lineTo(1.7, 2.2);
        ((GeneralPath) shape).closePath();

        g.setPaint(RED);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.17, -2.03);
        ((GeneralPath) shape).lineTo(-0.68, -1.5);
        ((GeneralPath) shape).lineTo(-1.07, -1.07);
        ((GeneralPath) shape).lineTo(-1.56, -1.59);
        ((GeneralPath) shape).lineTo(-1.17, -2.03);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.19, -0.98);
        ((GeneralPath) shape).lineTo(0.31, -0.45);
        ((GeneralPath) shape).lineTo(-0.08, -0.02);
        ((GeneralPath) shape).lineTo(-0.58, -0.55);
        ((GeneralPath) shape).lineTo(-0.19, -0.98);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.8, 0.07);
        ((GeneralPath) shape).lineTo(1.29, 0.6);
        ((GeneralPath) shape).lineTo(0.9, 1.03);
        ((GeneralPath) shape).lineTo(0.41, 0.5);
        ((GeneralPath) shape).lineTo(0.8, 0.07);
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
        return 18;
    }
}

