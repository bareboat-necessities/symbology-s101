

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BUNSTA04 {

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
        shape = new Ellipse2D.Double(-3.5, -3.5, 7, 7);
        g.setPaint(new Color(0xDADADA));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.56, -0.95);
        ((GeneralPath) shape).lineTo(-1.3, -0.95);
        ((GeneralPath) shape).lineTo(-1.3, -0.36);
        ((GeneralPath) shape).lineTo(-2.56, -0.36);
        ((GeneralPath) shape).lineTo(-2.56, -0.95);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.56, 0.36);
        ((GeneralPath) shape).lineTo(-1.3, 0.36);
        ((GeneralPath) shape).lineTo(-1.3, 0.95);
        ((GeneralPath) shape).lineTo(-2.56, 0.95);
        ((GeneralPath) shape).lineTo(-2.56, 0.36);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.17, -1.44);
        ((GeneralPath) shape).lineTo(-0.07, -1.44);
        ((GeneralPath) shape).lineTo(-0.07, 1.47);
        ((GeneralPath) shape).lineTo(-1.17, 1.47);
        ((GeneralPath) shape).lineTo(-1.17, -1.44);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.7, -0.38);
        ((GeneralPath) shape).lineTo(2.78, -0.38);
        ((GeneralPath) shape).lineTo(2.78, 0.44);
        ((GeneralPath) shape).lineTo(1.7, 0.44);
        ((GeneralPath) shape).lineTo(1.7, -0.38);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.08, -1.19);
        ((GeneralPath) shape).lineTo(0.08, 1.18);
        ((GeneralPath) shape).lineTo(0.44, 1.13);
        ((GeneralPath) shape).lineTo(0.76, 1.09);
        ((GeneralPath) shape).lineTo(1.36, 1.1);
        ((GeneralPath) shape).lineTo(1.46, 1.05);
        ((GeneralPath) shape).lineTo(1.54, 0.92);
        ((GeneralPath) shape).lineTo(1.54, -0.89);
        ((GeneralPath) shape).lineTo(1.51, -0.97);
        ((GeneralPath) shape).lineTo(1.45, -1.04);
        ((GeneralPath) shape).lineTo(1.37, -1.08);
        ((GeneralPath) shape).lineTo(0.69, -1.09);
        ((GeneralPath) shape).lineTo(0.39, -1.14);
        ((GeneralPath) shape).lineTo(0.08, -1.19);
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

