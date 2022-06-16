

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYCAREB {

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
        g.transform(new AffineTransform(3.7611804f, 0, 0, 3.7611804f, 7.7480316f, 22.961456f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.35, -2.0);
        ((GeneralPath) shape).lineTo(0.21, -3.0);
        ((GeneralPath) shape).lineTo(1.28, -3.0);
        ((GeneralPath) shape).lineTo(1.19, -2.0);
        ((GeneralPath) shape).lineTo(-0.35, -2.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.89, -1.04);
        ((GeneralPath) shape).lineTo(-0.35, -2.0);
        ((GeneralPath) shape).lineTo(1.19, -2.0);
        ((GeneralPath) shape).lineTo(1.1, -1.04);
        ((GeneralPath) shape).lineTo(1.1, -1.04);
        ((GeneralPath) shape).lineTo(-0.89, -1.04);
        ((GeneralPath) shape).closePath();

        g.setPaint(YELLOW);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.89, -1.04);
        ((GeneralPath) shape).lineTo(1.1, -1.04);
        ((GeneralPath) shape).lineTo(2.05, -0.65);
        ((GeneralPath) shape).lineTo(2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, -0.65);
        ((GeneralPath) shape).lineTo(-0.89, -1.04);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, -0.65);
        ((GeneralPath) shape).lineTo(-0.89, -1.04);
        ((GeneralPath) shape).lineTo(0.21, -3.0);
        ((GeneralPath) shape).lineTo(1.28, -3.0);
        ((GeneralPath) shape).lineTo(1.1, -1.04);
        ((GeneralPath) shape).lineTo(2.05, -0.65);
        ((GeneralPath) shape).lineTo(2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, 0.0);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.39, -4.7);
        ((GeneralPath) shape).lineTo(1.89, -4.7);
        ((GeneralPath) shape).lineTo(0.9, -3.7);
        ((GeneralPath) shape).lineTo(0.39, -4.7);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.04, -5.1);
        ((GeneralPath) shape).lineTo(0.54, -5.1);
        ((GeneralPath) shape).lineTo(1.53, -6.09);
        ((GeneralPath) shape).lineTo(2.04, -5.1);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.35, -2.0);
        ((GeneralPath) shape).lineTo(1.19, -2.0);

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
        return 16;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 24;
    }
}

