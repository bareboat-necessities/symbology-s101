

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKREG25 {

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
        ((GeneralPath) shape).moveTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.52, 2.52);
        ((GeneralPath) shape).lineTo(-2.52, 2.52);
        ((GeneralPath) shape).lineTo(-2.52, -2.52);
        ((GeneralPath) shape).lineTo(2.52, -2.52);
        ((GeneralPath) shape).lineTo(2.52, 2.52);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.2, -0.75);
        ((GeneralPath) shape).lineTo(-1.15, -0.75);
        ((GeneralPath) shape).lineTo(-1.15, -0.26);
        ((GeneralPath) shape).lineTo(-2.2, -0.26);
        ((GeneralPath) shape).lineTo(-2.2, -0.75);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.2, 0.34);
        ((GeneralPath) shape).lineTo(-1.15, 0.34);
        ((GeneralPath) shape).lineTo(-1.15, 0.83);
        ((GeneralPath) shape).lineTo(-2.2, 0.83);
        ((GeneralPath) shape).lineTo(-2.2, 0.34);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.05, -1.16);
        ((GeneralPath) shape).lineTo(-0.13, -1.16);
        ((GeneralPath) shape).lineTo(-0.13, 1.25);
        ((GeneralPath) shape).lineTo(-1.05, 1.25);
        ((GeneralPath) shape).lineTo(-1.05, -1.16);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.34, -0.28);
        ((GeneralPath) shape).lineTo(2.23, -0.28);
        ((GeneralPath) shape).lineTo(2.23, 0.4);
        ((GeneralPath) shape).lineTo(1.34, 0.4);
        ((GeneralPath) shape).lineTo(1.34, -0.28);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, -0.95);
        ((GeneralPath) shape).lineTo(0.0, 1.02);
        ((GeneralPath) shape).lineTo(0.29, 0.98);
        ((GeneralPath) shape).lineTo(0.56, 0.94);
        ((GeneralPath) shape).lineTo(1.06, 0.95);
        ((GeneralPath) shape).lineTo(1.14, 0.91);
        ((GeneralPath) shape).lineTo(1.21, 0.8);
        ((GeneralPath) shape).lineTo(1.21, -0.7);
        ((GeneralPath) shape).lineTo(1.18, -0.77);
        ((GeneralPath) shape).lineTo(1.13, -0.83);
        ((GeneralPath) shape).lineTo(1.07, -0.86);
        ((GeneralPath) shape).lineTo(0.5, -0.87);
        ((GeneralPath) shape).lineTo(0.25, -0.91);
        ((GeneralPath) shape).lineTo(0.0, -0.95);
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

