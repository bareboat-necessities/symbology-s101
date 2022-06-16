

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKPRH07 {

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

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.51, 1.82);
        ((GeneralPath) shape).lineTo(2.51, -2.52);
        ((GeneralPath) shape).lineTo(-1.78, -2.52);
        ((GeneralPath) shape).lineTo(2.51, 1.82);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.5, -1.84);
        ((GeneralPath) shape).lineTo(-2.5, 2.54);
        ((GeneralPath) shape).lineTo(1.88, 2.55);
        ((GeneralPath) shape).lineTo(-2.5, -1.84);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.27, 1.65);
        ((GeneralPath) shape).lineTo(-1.27, -1.65);
        ((GeneralPath) shape).lineTo(0.46, -1.65);
        ((GeneralPath) shape).lineTo(0.65, -1.63);
        ((GeneralPath) shape).lineTo(0.87, -1.6);
        ((GeneralPath) shape).lineTo(1.05, -1.55);
        ((GeneralPath) shape).lineTo(1.22, -1.48);
        ((GeneralPath) shape).lineTo(1.35, -1.39);
        ((GeneralPath) shape).lineTo(1.48, -1.26);
        ((GeneralPath) shape).lineTo(1.61, -1.11);
        ((GeneralPath) shape).lineTo(1.69, -0.94);
        ((GeneralPath) shape).lineTo(1.72, -0.78);
        ((GeneralPath) shape).lineTo(1.72, -0.63);
        ((GeneralPath) shape).lineTo(1.7, -0.46);
        ((GeneralPath) shape).lineTo(1.67, -0.34);
        ((GeneralPath) shape).lineTo(1.6, -0.19);
        ((GeneralPath) shape).lineTo(1.54, -0.11);
        ((GeneralPath) shape).lineTo(1.45, -0.01);
        ((GeneralPath) shape).lineTo(1.35, 0.07);
        ((GeneralPath) shape).lineTo(1.22, 0.15);
        ((GeneralPath) shape).lineTo(1.08, 0.22);
        ((GeneralPath) shape).lineTo(0.97, 0.28);
        ((GeneralPath) shape).lineTo(0.78, 0.31);
        ((GeneralPath) shape).lineTo(0.6, 0.34);
        ((GeneralPath) shape).lineTo(-0.57, 0.35);
        ((GeneralPath) shape).lineTo(-0.57, -0.18);
        ((GeneralPath) shape).lineTo(0.44, -0.17);
        ((GeneralPath) shape).lineTo(0.65, -0.23);
        ((GeneralPath) shape).lineTo(0.79, -0.3);
        ((GeneralPath) shape).lineTo(0.9, -0.41);
        ((GeneralPath) shape).lineTo(0.95, -0.53);
        ((GeneralPath) shape).lineTo(0.97, -0.62);
        ((GeneralPath) shape).lineTo(0.97, -0.72);
        ((GeneralPath) shape).lineTo(0.92, -0.86);
        ((GeneralPath) shape).lineTo(0.86, -0.96);
        ((GeneralPath) shape).lineTo(0.76, -1.05);
        ((GeneralPath) shape).lineTo(0.66, -1.1);
        ((GeneralPath) shape).lineTo(0.53, -1.14);
        ((GeneralPath) shape).lineTo(0.35, -1.16);
        ((GeneralPath) shape).lineTo(-0.57, -1.14);
        ((GeneralPath) shape).lineTo(-0.57, 1.65);
        ((GeneralPath) shape).lineTo(-1.27, 1.65);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
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

