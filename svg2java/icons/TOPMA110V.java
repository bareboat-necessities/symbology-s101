

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class TOPMA110V {

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
        g.transform(new AffineTransform(3.7672567f, 0, 0, 3.7672567f, 11.60315f, 30.493181f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.07, -3.7);
        ((GeneralPath) shape).lineTo(0.0, -8.08);
        ((GeneralPath) shape).lineTo(3.07, -3.7);
        ((GeneralPath) shape).lineTo(0.0, 0.68);
        ((GeneralPath) shape).lineTo(-3.07, -3.7);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.28f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.83, -3.7);
        ((GeneralPath) shape).lineTo(0.0, -7.73);
        ((GeneralPath) shape).lineTo(2.83, -3.7);
        ((GeneralPath) shape).lineTo(0.0, 0.33);
        ((GeneralPath) shape).lineTo(-2.83, -3.7);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.15, -4.8);
        ((GeneralPath) shape).lineTo(1.15, -4.8);
        ((GeneralPath) shape).lineTo(1.15, -2.5);
        ((GeneralPath) shape).lineTo(-1.15, -2.5);
        ((GeneralPath) shape).lineTo(-1.15, -4.8);
        ((GeneralPath) shape).closePath();

        g.setPaint(YELLOW);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.31, -4.8);
        ((GeneralPath) shape).lineTo(0.31, -4.8);
        ((GeneralPath) shape).lineTo(0.31, -2.5);
        ((GeneralPath) shape).lineTo(-0.31, -2.5);
        ((GeneralPath) shape).lineTo(-0.31, -4.8);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.15, -4.8);
        ((GeneralPath) shape).lineTo(1.15, -4.8);
        ((GeneralPath) shape).lineTo(1.15, -2.5);
        ((GeneralPath) shape).lineTo(-1.15, -2.5);
        ((GeneralPath) shape).lineTo(-1.15, -4.8);

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

