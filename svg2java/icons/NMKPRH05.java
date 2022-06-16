

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKPRH05 {

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
        ((GeneralPath) shape).moveTo(1.4, -3.78);
        ((GeneralPath) shape).lineTo(0.5, -2.42);
        ((GeneralPath) shape).lineTo(0.61, -2.35);
        ((GeneralPath) shape).lineTo(1.18, -2.58);
        ((GeneralPath) shape).lineTo(1.19, -1.56);
        ((GeneralPath) shape).lineTo(0.51, -0.56);
        ((GeneralPath) shape).lineTo(0.61, -0.49);
        ((GeneralPath) shape).lineTo(1.19, -0.7);
        ((GeneralPath) shape).lineTo(1.2, 0.58);
        ((GeneralPath) shape).lineTo(1.64, 0.58);
        ((GeneralPath) shape).lineTo(1.63, -0.71);
        ((GeneralPath) shape).lineTo(2.23, -0.45);
        ((GeneralPath) shape).lineTo(2.34, -0.55);
        ((GeneralPath) shape).lineTo(1.63, -1.57);
        ((GeneralPath) shape).lineTo(1.63, -2.58);
        ((GeneralPath) shape).lineTo(2.23, -2.32);
        ((GeneralPath) shape).lineTo(2.31, -2.44);
        ((GeneralPath) shape).lineTo(1.4, -3.78);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.24, -0.44);
        ((GeneralPath) shape).lineTo(-2.14, 0.91);
        ((GeneralPath) shape).lineTo(-2.03, 0.99);
        ((GeneralPath) shape).lineTo(-1.46, 0.76);
        ((GeneralPath) shape).lineTo(-1.45, 1.78);
        ((GeneralPath) shape).lineTo(-2.13, 2.77);
        ((GeneralPath) shape).lineTo(-2.02, 2.84);
        ((GeneralPath) shape).lineTo(-1.45, 2.63);
        ((GeneralPath) shape).lineTo(-1.44, 3.92);
        ((GeneralPath) shape).lineTo(-1.0, 3.91);
        ((GeneralPath) shape).lineTo(-1.01, 2.63);
        ((GeneralPath) shape).lineTo(-0.4, 2.88);
        ((GeneralPath) shape).lineTo(-0.3, 2.79);
        ((GeneralPath) shape).lineTo(-1.01, 1.77);
        ((GeneralPath) shape).lineTo(-1.0, 0.76);
        ((GeneralPath) shape).lineTo(-0.41, 1.01);
        ((GeneralPath) shape).lineTo(-0.32, 0.89);
        ((GeneralPath) shape).lineTo(-1.24, -0.44);
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

