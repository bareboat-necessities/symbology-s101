

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF21 {

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
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.7, -2.78);
        ((GeneralPath) shape).lineTo(2.43, -1.33);
        ((GeneralPath) shape).lineTo(2.43, 2.2);
        ((GeneralPath) shape).lineTo(2.18, 2.2);
        ((GeneralPath) shape).lineTo(2.18, 0.23);
        ((GeneralPath) shape).lineTo(0.84, -1.74);
        ((GeneralPath) shape).lineTo(-0.42, -2.37);
        ((GeneralPath) shape).lineTo(-0.42, 0.14);
        ((GeneralPath) shape).lineTo(-0.57, 0.14);
        ((GeneralPath) shape).lineTo(-0.57, -2.43);
        ((GeneralPath) shape).lineTo(-0.82, -2.55);
        ((GeneralPath) shape).lineTo(-0.7, -2.78);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.54, 0.16);
        ((GeneralPath) shape).lineTo(0.53, 0.16);
        ((GeneralPath) shape).lineTo(0.9, 0.91);
        ((GeneralPath) shape).lineTo(1.07, 0.99);
        ((GeneralPath) shape).lineTo(1.08, 1.52);
        ((GeneralPath) shape).lineTo(0.96, 1.78);
        ((GeneralPath) shape).lineTo(0.76, 1.87);
        ((GeneralPath) shape).lineTo(0.76, 2.26);
        ((GeneralPath) shape).lineTo(0.41, 2.26);
        ((GeneralPath) shape).lineTo(0.41, 1.91);
        ((GeneralPath) shape).lineTo(-1.41, 1.91);
        ((GeneralPath) shape).lineTo(-1.42, 2.26);
        ((GeneralPath) shape).lineTo(-1.78, 2.26);
        ((GeneralPath) shape).lineTo(-1.78, 1.91);
        ((GeneralPath) shape).lineTo(-1.97, 1.79);
        ((GeneralPath) shape).lineTo(-2.08, 1.47);
        ((GeneralPath) shape).lineTo(-2.06, 0.98);
        ((GeneralPath) shape).lineTo(-1.89, 0.9);
        ((GeneralPath) shape).lineTo(-1.54, 0.16);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_4
        shape = new Ellipse2D.Double(-1.7599999904632568, 1.119999885559082, 0.3799999952316284, 0.3799999952316284);
        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new Ellipse2D.Double(0.3799999952316284, 1.1299999952316284, 0.4000000059604645, 0.4000000059604645);
        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.5, 0.85);
        ((GeneralPath) shape).lineTo(0.52, 0.85);
        ((GeneralPath) shape).lineTo(0.31, 0.47);
        ((GeneralPath) shape).lineTo(-1.31, 0.48);
        ((GeneralPath) shape).lineTo(-1.5, 0.85);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.24, -1.58);
        ((GeneralPath) shape).lineTo(2.17, -0.21);
        ((GeneralPath) shape).lineTo(2.18, -1.13);
        ((GeneralPath) shape).lineTo(1.24, -1.58);
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

