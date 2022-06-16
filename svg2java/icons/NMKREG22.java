

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKREG22 {

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
        g.transform(new AffineTransform(3.7707589f, 0, 0, 3.7707589f, 19.27559f, 31.221882f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.1, -8.27);
        ((GeneralPath) shape).lineTo(5.1, -8.27);
        ((GeneralPath) shape).lineTo(5.1, -1.27);
        ((GeneralPath) shape).lineTo(-5.1, -1.27);
        ((GeneralPath) shape).lineTo(-5.1, -8.27);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-4.29, -7.26);
        ((GeneralPath) shape).lineTo(4.29, -7.26);
        ((GeneralPath) shape).lineTo(4.29, -2.27);
        ((GeneralPath) shape).lineTo(-4.29, -2.27);
        ((GeneralPath) shape).lineTo(-4.29, -7.26);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.08f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.17, -4.34);
        ((GeneralPath) shape).lineTo(-3.5, -4.34);
        ((GeneralPath) shape).lineTo(-3.5, -4.98);
        ((GeneralPath) shape).lineTo(2.17, -4.98);
        ((GeneralPath) shape).lineTo(2.12, -5.18);
        ((GeneralPath) shape).lineTo(2.06, -5.41);
        ((GeneralPath) shape).lineTo(2.02, -5.57);
        ((GeneralPath) shape).lineTo(2.2, -5.71);
        ((GeneralPath) shape).lineTo(3.64, -4.66);
        ((GeneralPath) shape).lineTo(2.18, -3.61);
        ((GeneralPath) shape).lineTo(1.99, -3.77);
        ((GeneralPath) shape).lineTo(2.08, -4.04);
        ((GeneralPath) shape).lineTo(2.17, -4.34);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, -1.27);
        ((GeneralPath) shape).lineTo(0.0, -0.33);

        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.61, 0.0);
        ((GeneralPath) shape).lineTo(-0.33, 0.0);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.33, 0.0);
        ((GeneralPath) shape).lineTo(0.61, 0.0);

        g.draw(shape);

        // _0_0_6
        shape = new Ellipse2D.Double(-0.33000001311302185, -0.33000001311302185, 0.6600000262260437, 0.6600000262260437);
        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(BLACK);
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

