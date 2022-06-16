

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKRCD08 {

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
        g.transform(new AffineTransform(3.7707891f, 0, 0, 3.7707891f, 19.27559f, 31.259842f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.1, -1.28);
        ((GeneralPath) shape).lineTo(-5.1, -8.28);
        ((GeneralPath) shape).lineTo(5.1, -8.28);
        ((GeneralPath) shape).lineTo(5.1, -1.28);
        ((GeneralPath) shape).lineTo(-5.1, -1.28);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new Ellipse2D.Double(-0.3499999940395355, -0.3499999940395355, 0.699999988079071, 0.699999988079071);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, -0.35);
        ((GeneralPath) shape).lineTo(0.0, -1.28);

        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.59, 0.0);
        ((GeneralPath) shape).lineTo(-0.35, 0.0);

        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.35, 0.0);
        ((GeneralPath) shape).lineTo(0.59, 0.0);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.1, -1.28);
        ((GeneralPath) shape).lineTo(-5.1, -8.28);
        ((GeneralPath) shape).lineTo(5.1, -8.28);
        ((GeneralPath) shape).lineTo(5.1, -1.28);
        ((GeneralPath) shape).lineTo(-5.1, -1.28);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.61, -4.23);
        ((GeneralPath) shape).lineTo(-3.9, -4.23);
        ((GeneralPath) shape).lineTo(-3.9, -5.2);
        ((GeneralPath) shape).lineTo(1.61, -5.2);
        ((GeneralPath) shape).lineTo(1.33, -5.98);
        ((GeneralPath) shape).lineTo(1.66, -6.21);
        ((GeneralPath) shape).lineTo(3.77, -4.71);
        ((GeneralPath) shape).lineTo(1.61, -3.19);
        ((GeneralPath) shape).lineTo(1.31, -3.46);
        ((GeneralPath) shape).lineTo(1.61, -4.23);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
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
        return 39;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 33;
    }
}

