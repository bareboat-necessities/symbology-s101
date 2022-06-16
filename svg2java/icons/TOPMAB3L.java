

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class TOPMAB3L {

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
        g.transform(new AffineTransform(3.7544978f, 0, 0, 3.7544978f, 5.6692915f, 20.34187f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, -5.4);
        ((GeneralPath) shape).lineTo(1.5, -3.9);
        ((GeneralPath) shape).lineTo(0.0, -2.4);
        ((GeneralPath) shape).lineTo(-1.5, -3.9);
        ((GeneralPath) shape).lineTo(0.0, -5.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.41, -4.99);
        ((GeneralPath) shape).lineTo(0.41, -4.99);
        ((GeneralPath) shape).lineTo(0.65, -4.75);
        ((GeneralPath) shape).lineTo(-0.65, -4.75);
        ((GeneralPath) shape).lineTo(-0.41, -4.99);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.9, -4.5);
        ((GeneralPath) shape).lineTo(1.13, -4.27);
        ((GeneralPath) shape).lineTo(-1.13, -4.27);
        ((GeneralPath) shape).lineTo(-0.9, -4.5);
        ((GeneralPath) shape).lineTo(0.9, -4.5);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.38, -4.02);
        ((GeneralPath) shape).lineTo(1.5, -3.9);
        ((GeneralPath) shape).lineTo(1.38, -3.78);
        ((GeneralPath) shape).lineTo(-1.38, -3.78);
        ((GeneralPath) shape).lineTo(-1.5, -3.9);
        ((GeneralPath) shape).lineTo(-1.38, -4.02);
        ((GeneralPath) shape).lineTo(1.38, -4.02);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.14, -3.54);
        ((GeneralPath) shape).lineTo(0.9, -3.3);
        ((GeneralPath) shape).lineTo(-0.9, -3.3);
        ((GeneralPath) shape).lineTo(-1.14, -3.54);
        ((GeneralPath) shape).lineTo(1.14, -3.54);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.65, -3.05);
        ((GeneralPath) shape).lineTo(0.42, -2.81);
        ((GeneralPath) shape).lineTo(-0.41, -2.81);
        ((GeneralPath) shape).lineTo(-0.65, -3.05);
        ((GeneralPath) shape).lineTo(0.65, -3.05);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, -5.4);
        ((GeneralPath) shape).lineTo(1.5, -3.9);
        ((GeneralPath) shape).lineTo(0.0, -2.4);
        ((GeneralPath) shape).lineTo(-1.5, -3.9);
        ((GeneralPath) shape).lineTo(0.0, -5.4);

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
        return 12;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 12;
    }
}

