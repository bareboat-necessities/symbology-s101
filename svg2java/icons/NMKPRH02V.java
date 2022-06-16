

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKPRH02V {

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
        g.transform(new AffineTransform(3.7672567f, 0, 0, 3.7672567f, 11.527805f, 16.66735f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.85, 1.25);
        ((GeneralPath) shape).lineTo(1.85, 1.25);
        ((GeneralPath) shape).lineTo(1.85, 0.42);
        ((GeneralPath) shape).lineTo(-1.85, 0.42);
        ((GeneralPath) shape).lineTo(-1.85, 1.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.85, 0.42);
        ((GeneralPath) shape).lineTo(1.85, 0.42);
        ((GeneralPath) shape).lineTo(1.85, -0.42);
        ((GeneralPath) shape).lineTo(-1.85, -0.42);
        ((GeneralPath) shape).lineTo(-1.85, 0.42);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.85, -0.42);
        ((GeneralPath) shape).lineTo(1.85, -0.42);
        ((GeneralPath) shape).lineTo(1.85, -1.25);
        ((GeneralPath) shape).lineTo(-1.85, -1.25);
        ((GeneralPath) shape).lineTo(-1.85, -0.42);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.99, 1.48);
        ((GeneralPath) shape).lineTo(-3.05, -0.03);
        ((GeneralPath) shape).lineTo(-2.04, -1.48);

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.12, 2.77);
        ((GeneralPath) shape).lineTo(0.02, 4.35);
        ((GeneralPath) shape).lineTo(-1.03, 2.85);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.14, -2.76);
        ((GeneralPath) shape).lineTo(0.02, -4.41);
        ((GeneralPath) shape).lineTo(1.16, -2.77);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.11, -1.42);
        ((GeneralPath) shape).lineTo(3.09, -0.03);
        ((GeneralPath) shape).lineTo(1.96, 1.58);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.98, -2.64);
        ((GeneralPath) shape).lineTo(0.02, -4.06);
        ((GeneralPath) shape).lineTo(1.0, -2.66);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.83, 1.37);
        ((GeneralPath) shape).lineTo(-2.81, -0.03);
        ((GeneralPath) shape).lineTo(-1.87, -1.36);

        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.95, -1.31);
        ((GeneralPath) shape).lineTo(2.84, -0.03);
        ((GeneralPath) shape).lineTo(1.8, 1.46);

        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.96, 2.66);
        ((GeneralPath) shape).lineTo(0.02, 4.0);
        ((GeneralPath) shape).lineTo(-0.87, 2.74);

        g.draw(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.85, 1.25);
        ((GeneralPath) shape).lineTo(-1.85, -1.25);
        ((GeneralPath) shape).lineTo(1.85, -1.25);
        ((GeneralPath) shape).lineTo(1.85, 1.25);
        ((GeneralPath) shape).lineTo(-1.85, 1.25);

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
        return 25;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 35;
    }
}

