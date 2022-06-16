

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKRCD05 {

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
        g.transform(new AffineTransform(3.7687597f, 0, 0, 3.7687597f, 19.27559f, 13.228347f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.1, -3.5);
        ((GeneralPath) shape).lineTo(5.1, -3.5);
        ((GeneralPath) shape).lineTo(5.1, 3.5);
        ((GeneralPath) shape).lineTo(-5.1, 3.5);
        ((GeneralPath) shape).lineTo(-5.1, -3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.8, 0.66);
        ((GeneralPath) shape).lineTo(3.87, 0.65);
        ((GeneralPath) shape).lineTo(3.94, 0.62);
        ((GeneralPath) shape).lineTo(4.01, 0.59);
        ((GeneralPath) shape).lineTo(4.08, 0.55);
        ((GeneralPath) shape).lineTo(4.14, 0.51);
        ((GeneralPath) shape).lineTo(4.19, 0.45);
        ((GeneralPath) shape).lineTo(4.24, 0.4);
        ((GeneralPath) shape).lineTo(4.29, 0.33);
        ((GeneralPath) shape).lineTo(4.32, 0.27);
        ((GeneralPath) shape).lineTo(4.35, 0.2);
        ((GeneralPath) shape).lineTo(4.37, 0.13);
        ((GeneralPath) shape).lineTo(4.39, 0.05);
        ((GeneralPath) shape).lineTo(4.39, -0.02);
        ((GeneralPath) shape).lineTo(4.39, -0.1);
        ((GeneralPath) shape).lineTo(4.38, -0.17);
        ((GeneralPath) shape).lineTo(4.36, -0.25);
        ((GeneralPath) shape).lineTo(4.34, -0.32);
        ((GeneralPath) shape).lineTo(4.3, -0.39);
        ((GeneralPath) shape).lineTo(4.26, -0.45);
        ((GeneralPath) shape).lineTo(4.22, -0.51);
        ((GeneralPath) shape).lineTo(4.16, -0.56);
        ((GeneralPath) shape).lineTo(4.11, -0.61);
        ((GeneralPath) shape).lineTo(4.04, -0.65);
        ((GeneralPath) shape).lineTo(3.98, -0.69);
        ((GeneralPath) shape).lineTo(3.91, -0.72);
        ((GeneralPath) shape).lineTo(3.83, -0.74);
        ((GeneralPath) shape).lineTo(3.82, -0.74);
        ((GeneralPath) shape).lineTo(-1.12, -0.74);
        ((GeneralPath) shape).lineTo(-0.49, -2.12);
        ((GeneralPath) shape).lineTo(-0.6, -2.31);
        ((GeneralPath) shape).lineTo(-0.86, -2.37);
        ((GeneralPath) shape).lineTo(-4.71, -0.01);
        ((GeneralPath) shape).lineTo(-0.84, 2.34);
        ((GeneralPath) shape).lineTo(-0.56, 2.3);
        ((GeneralPath) shape).lineTo(-0.5, 2.04);
        ((GeneralPath) shape).lineTo(-1.05, 0.66);
        ((GeneralPath) shape).lineTo(3.8, 0.66);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
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
        return 27;
    }
}

