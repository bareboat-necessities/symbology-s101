

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF20 {

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
        ((GeneralPath) shape).moveTo(-1.33, 0.11);
        ((GeneralPath) shape).lineTo(2.51, 0.77);
        ((GeneralPath) shape).lineTo(2.51, 0.38);
        ((GeneralPath) shape).lineTo(-1.32, -0.25);
        ((GeneralPath) shape).lineTo(-1.33, 0.11);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.84, -0.39);
        ((GeneralPath) shape).lineTo(0.77, -0.15);
        ((GeneralPath) shape).lineTo(0.75, -0.42);
        ((GeneralPath) shape).lineTo(0.82, -0.63);
        ((GeneralPath) shape).lineTo(0.93, -0.72);
        ((GeneralPath) shape).lineTo(1.04, -0.79);
        ((GeneralPath) shape).lineTo(1.16, -0.84);
        ((GeneralPath) shape).lineTo(1.24, -0.9);
        ((GeneralPath) shape).lineTo(1.28, -1.05);
        ((GeneralPath) shape).lineTo(1.23, -1.15);
        ((GeneralPath) shape).lineTo(1.1, -1.37);
        ((GeneralPath) shape).lineTo(0.91, -1.51);
        ((GeneralPath) shape).lineTo(0.6, -1.66);
        ((GeneralPath) shape).lineTo(0.23, -1.74);
        ((GeneralPath) shape).lineTo(-0.18, -1.73);
        ((GeneralPath) shape).lineTo(-0.56, -1.71);
        ((GeneralPath) shape).lineTo(-0.8, -1.65);
        ((GeneralPath) shape).lineTo(-0.98, -1.58);
        ((GeneralPath) shape).lineTo(-1.17, -1.44);
        ((GeneralPath) shape).lineTo(-1.28, -1.3);
        ((GeneralPath) shape).lineTo(-1.29, -1.13);
        ((GeneralPath) shape).lineTo(-1.19, -1.01);
        ((GeneralPath) shape).lineTo(-1.05, -0.91);
        ((GeneralPath) shape).lineTo(-0.93, -0.82);
        ((GeneralPath) shape).lineTo(-0.89, -0.75);
        ((GeneralPath) shape).lineTo(-0.84, -0.62);
        ((GeneralPath) shape).lineTo(-0.84, -0.39);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.54, 2.54);
        ((GeneralPath) shape).lineTo(2.04, 2.55);
        ((GeneralPath) shape).lineTo(2.03, 1.97);
        ((GeneralPath) shape).lineTo(1.08, 1.98);
        ((GeneralPath) shape).lineTo(0.94, 1.73);
        ((GeneralPath) shape).lineTo(0.87, 1.41);
        ((GeneralPath) shape).lineTo(0.8, 0.93);
        ((GeneralPath) shape).lineTo(0.79, 0.66);
        ((GeneralPath) shape).lineTo(-0.83, 0.44);
        ((GeneralPath) shape).lineTo(-0.85, 1.08);
        ((GeneralPath) shape).lineTo(-0.9, 1.33);
        ((GeneralPath) shape).lineTo(-0.99, 1.6);
        ((GeneralPath) shape).lineTo(-1.06, 1.79);
        ((GeneralPath) shape).lineTo(-1.18, 1.96);
        ((GeneralPath) shape).lineTo(-2.56, 1.96);
        ((GeneralPath) shape).lineTo(-2.54, 2.54);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);

        g.setPaint(BLACK);
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

