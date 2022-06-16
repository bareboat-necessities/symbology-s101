

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKPRH04 {

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
        g.transform(new AffineTransform(3.7687597f, 0, 0, 3.7687597f, 13.228347f, 19.27559f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, 5.1);
        ((GeneralPath) shape).lineTo(-3.5, -5.1);
        ((GeneralPath) shape).lineTo(3.5, -5.1);
        ((GeneralPath) shape).lineTo(3.5, 5.1);
        ((GeneralPath) shape).lineTo(-3.5, 5.1);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.5, -3.15);
        ((GeneralPath) shape).lineTo(-2.5, 4.1);
        ((GeneralPath) shape).lineTo(1.92, 4.1);
        ((GeneralPath) shape).lineTo(-2.5, -3.15);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.5, 3.17);
        ((GeneralPath) shape).lineTo(2.5, -4.1);
        ((GeneralPath) shape).lineTo(-1.91, -4.1);
        ((GeneralPath) shape).lineTo(2.5, 3.17);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.08, -3.51);
        ((GeneralPath) shape).lineTo(2.27, -1.62);
        ((GeneralPath) shape).lineTo(2.12, -1.52);
        ((GeneralPath) shape).lineTo(1.37, -1.88);
        ((GeneralPath) shape).lineTo(1.37, -0.07);
        ((GeneralPath) shape).lineTo(0.82, -0.07);
        ((GeneralPath) shape).lineTo(0.82, -1.84);
        ((GeneralPath) shape).lineTo(0.07, -1.52);
        ((GeneralPath) shape).lineTo(-0.08, -1.66);
        ((GeneralPath) shape).lineTo(1.08, -3.51);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.06, 0.4);
        ((GeneralPath) shape).lineTo(0.12, 2.29);
        ((GeneralPath) shape).lineTo(-0.03, 2.39);
        ((GeneralPath) shape).lineTo(-0.78, 2.03);
        ((GeneralPath) shape).lineTo(-0.78, 3.84);
        ((GeneralPath) shape).lineTo(-1.33, 3.84);
        ((GeneralPath) shape).lineTo(-1.33, 2.07);
        ((GeneralPath) shape).lineTo(-2.08, 2.39);
        ((GeneralPath) shape).lineTo(-2.23, 2.25);
        ((GeneralPath) shape).lineTo(-1.06, 0.4);
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
        return 39;
    }
}

