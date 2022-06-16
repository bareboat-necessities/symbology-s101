

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class WTLVGG {

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
        g.transform(new AffineTransform(3.722262f, 0, 0, 3.722262f, 2.456693f, 16.710094f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.65, 0.5);
        ((GeneralPath) shape).lineTo(-0.65, 0.5);
        ((GeneralPath) shape).lineTo(-0.65, -4.45);
        ((GeneralPath) shape).lineTo(0.65, -4.45);
        ((GeneralPath) shape).lineTo(0.65, 0.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.65, -3.07);
        ((GeneralPath) shape).lineTo(-0.01, -3.07);
        ((GeneralPath) shape).lineTo(-0.01, -4.45);
        ((GeneralPath) shape).lineTo(-0.65, -4.45);
        ((GeneralPath) shape).lineTo(-0.65, -3.07);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.64, -1.85);
        ((GeneralPath) shape).lineTo(-0.01, -1.85);
        ((GeneralPath) shape).lineTo(-0.01, -3.07);
        ((GeneralPath) shape).lineTo(0.64, -3.07);
        ((GeneralPath) shape).lineTo(0.64, -1.85);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.01, -0.66);
        ((GeneralPath) shape).lineTo(-0.65, -0.66);
        ((GeneralPath) shape).lineTo(-0.65, -1.85);
        ((GeneralPath) shape).lineTo(-0.01, -1.85);
        ((GeneralPath) shape).lineTo(-0.01, -0.66);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new Ellipse2D.Double(-0.6499999761581421, -0.6499999761581421, 1.2999999523162842, 1.2999999523162842);
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
        return 6;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 20;
    }
}

