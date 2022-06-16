

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYLAT26V {

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
        g.transform(new AffineTransform(3.7693813f, 0, 0, 3.7693813f, 12.665121f, 30.284214f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.74, 0.0);
        ((GeneralPath) shape).lineTo(0.74, 0.0);
        ((GeneralPath) shape).lineTo(1.26, -5.4);
        ((GeneralPath) shape).lineTo(-0.21, -5.4);
        ((GeneralPath) shape).lineTo(-0.74, 0.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.07, -0.89);
        ((GeneralPath) shape).lineTo(-3.35, -2.72);
        ((GeneralPath) shape).lineTo(-2.12, -4.47);

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.7, 0.67);
        ((GeneralPath) shape).lineTo(0.36, 2.58);
        ((GeneralPath) shape).lineTo(-0.91, 0.77);

        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.04, -6.02);
        ((GeneralPath) shape).lineTo(0.36, -8.02);
        ((GeneralPath) shape).lineTo(1.75, -6.04);

        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.9, -4.41);
        ((GeneralPath) shape).lineTo(4.08, -2.72);
        ((GeneralPath) shape).lineTo(2.72, -0.78);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.87, -5.91);
        ((GeneralPath) shape).lineTo(0.36, -7.67);
        ((GeneralPath) shape).lineTo(1.59, -5.93);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.91, -1.01);
        ((GeneralPath) shape).lineTo(-3.11, -2.72);
        ((GeneralPath) shape).lineTo(-1.96, -4.36);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.73, -4.29);
        ((GeneralPath) shape).lineTo(3.84, -2.72);
        ((GeneralPath) shape).lineTo(2.56, -0.9);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.54, 0.55);
        ((GeneralPath) shape).lineTo(0.36, 2.23);
        ((GeneralPath) shape).lineTo(-0.74, 0.65);

        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.21, -5.4);
        ((GeneralPath) shape).lineTo(1.26, -5.4);
        ((GeneralPath) shape).lineTo(1.13, -4.02);
        ((GeneralPath) shape).lineTo(-0.34, -4.02);
        ((GeneralPath) shape).lineTo(-0.21, -5.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(RED);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.48, -2.69);
        ((GeneralPath) shape).lineTo(0.99, -2.69);
        ((GeneralPath) shape).lineTo(0.86, -1.31);
        ((GeneralPath) shape).lineTo(-0.61, -1.31);
        ((GeneralPath) shape).lineTo(-0.48, -2.69);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.21, -5.4);
        ((GeneralPath) shape).lineTo(1.26, -5.4);
        ((GeneralPath) shape).lineTo(0.74, 0.0);
        ((GeneralPath) shape).lineTo(-0.74, 0.0);
        ((GeneralPath) shape).lineTo(-0.21, -5.4);
        ((GeneralPath) shape).closePath();

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
        return 30;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 42;
    }
}

