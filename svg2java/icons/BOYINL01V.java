

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYINL01V {

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
        g.transform(new AffineTransform(3.7672567f, 0, 0, 3.7672567f, 11.640823f, 19.530464f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, -0.65);
        ((GeneralPath) shape).lineTo(-1.33, -1.0);
        ((GeneralPath) shape).lineTo(-1.33, -2.3);
        ((GeneralPath) shape).lineTo(1.33, -2.3);
        ((GeneralPath) shape).lineTo(1.33, -1.0);
        ((GeneralPath) shape).lineTo(2.05, -0.65);
        ((GeneralPath) shape).lineTo(2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, 0.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(RED);
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.02, 0.72);
        ((GeneralPath) shape).lineTo(-3.08, -0.79);
        ((GeneralPath) shape).lineTo(-2.06, -2.24);

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.1, 2.01);
        ((GeneralPath) shape).lineTo(-0.01, 3.59);
        ((GeneralPath) shape).lineTo(-1.06, 2.09);

        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.16, -3.52);
        ((GeneralPath) shape).lineTo(-0.01, -5.17);
        ((GeneralPath) shape).lineTo(1.14, -3.53);

        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.09, -2.18);
        ((GeneralPath) shape).lineTo(3.06, -0.79);
        ((GeneralPath) shape).lineTo(1.94, 0.81);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.0, -3.4);
        ((GeneralPath) shape).lineTo(-0.01, -4.82);
        ((GeneralPath) shape).lineTo(0.97, -3.42);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.86, 0.61);
        ((GeneralPath) shape).lineTo(-2.83, -0.79);
        ((GeneralPath) shape).lineTo(-1.9, -2.12);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.92, -2.07);
        ((GeneralPath) shape).lineTo(2.82, -0.79);
        ((GeneralPath) shape).lineTo(1.78, 0.7);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.94, 1.9);
        ((GeneralPath) shape).lineTo(-0.01, 3.24);
        ((GeneralPath) shape).lineTo(-0.89, 1.98);

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

