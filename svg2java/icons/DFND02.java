

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class DFND02 {

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
        g.transform(new AffineTransform(3.751839f, 0, 0, 3.751839f, 6.992126f, 10.205002f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.85, 0.0);
        ((GeneralPath) shape).lineTo(1.85, 0.0);
        ((GeneralPath) shape).lineTo(1.85, -0.6);
        ((GeneralPath) shape).lineTo(1.34, -0.59);
        ((GeneralPath) shape).lineTo(0.0, -2.71);
        ((GeneralPath) shape).lineTo(-1.34, -0.57);
        ((GeneralPath) shape).lineTo(-1.85, -0.57);
        ((GeneralPath) shape).lineTo(-1.85, 0.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.43, -1.69);
        ((GeneralPath) shape).lineTo(-0.43, -0.2);
        ((GeneralPath) shape).lineTo(-0.16, -0.2);
        ((GeneralPath) shape).lineTo(-0.16, -1.69);
        ((GeneralPath) shape).lineTo(-0.43, -1.69);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.16, -1.69);
        ((GeneralPath) shape).lineTo(0.12, -1.69);
        ((GeneralPath) shape).lineTo(0.18, -1.69);
        ((GeneralPath) shape).lineTo(0.23, -1.68);
        ((GeneralPath) shape).lineTo(0.28, -1.68);
        ((GeneralPath) shape).lineTo(0.31, -1.67);
        ((GeneralPath) shape).lineTo(0.35, -1.66);
        ((GeneralPath) shape).lineTo(0.39, -1.63);
        ((GeneralPath) shape).lineTo(0.44, -1.59);
        ((GeneralPath) shape).lineTo(0.49, -1.54);
        ((GeneralPath) shape).lineTo(0.53, -1.46);
        ((GeneralPath) shape).lineTo(0.56, -1.38);
        ((GeneralPath) shape).lineTo(0.57, -1.26);
        ((GeneralPath) shape).lineTo(0.57, -1.16);
        ((GeneralPath) shape).lineTo(0.56, -1.09);
        ((GeneralPath) shape).lineTo(0.53, -1.01);
        ((GeneralPath) shape).lineTo(0.51, -0.96);
        ((GeneralPath) shape).lineTo(0.47, -0.91);
        ((GeneralPath) shape).lineTo(0.42, -0.85);
        ((GeneralPath) shape).lineTo(0.36, -0.82);
        ((GeneralPath) shape).lineTo(0.29, -0.79);
        ((GeneralPath) shape).lineTo(0.21, -0.77);
        ((GeneralPath) shape).lineTo(0.15, -0.77);
        ((GeneralPath) shape).lineTo(0.09, -0.76);
        ((GeneralPath) shape).lineTo(-0.16, -0.76);
        ((GeneralPath) shape).lineTo(-0.16, -1.02);
        ((GeneralPath) shape).lineTo(-0.04, -1.02);
        ((GeneralPath) shape).lineTo(0.07, -1.02);
        ((GeneralPath) shape).lineTo(0.15, -1.03);
        ((GeneralPath) shape).lineTo(0.2, -1.05);
        ((GeneralPath) shape).lineTo(0.23, -1.07);
        ((GeneralPath) shape).lineTo(0.27, -1.11);
        ((GeneralPath) shape).lineTo(0.29, -1.15);
        ((GeneralPath) shape).lineTo(0.3, -1.2);
        ((GeneralPath) shape).lineTo(0.3, -1.24);
        ((GeneralPath) shape).lineTo(0.29, -1.29);
        ((GeneralPath) shape).lineTo(0.28, -1.33);
        ((GeneralPath) shape).lineTo(0.26, -1.36);
        ((GeneralPath) shape).lineTo(0.24, -1.38);
        ((GeneralPath) shape).lineTo(0.21, -1.41);
        ((GeneralPath) shape).lineTo(0.18, -1.42);
        ((GeneralPath) shape).lineTo(0.16, -1.43);
        ((GeneralPath) shape).lineTo(0.11, -1.44);
        ((GeneralPath) shape).lineTo(0.03, -1.44);
        ((GeneralPath) shape).lineTo(-0.16, -1.44);
        ((GeneralPath) shape).lineTo(-0.16, -1.69);
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
        return 15;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 11;
    }
}

