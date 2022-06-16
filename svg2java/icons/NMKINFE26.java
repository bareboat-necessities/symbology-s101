

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINFE26 {

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
        ((GeneralPath) shape).moveTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(3.5, 2.85);
        ((GeneralPath) shape).lineTo(2.36, 1.68);
        ((GeneralPath) shape).lineTo(2.8, 1.68);
        ((GeneralPath) shape).lineTo(2.8, 1.28);
        ((GeneralPath) shape).lineTo(2.5, 1.28);
        ((GeneralPath) shape).lineTo(2.04, 1.06);
        ((GeneralPath) shape).lineTo(1.72, 1.06);
        ((GeneralPath) shape).lineTo(1.47, 0.8);
        ((GeneralPath) shape).lineTo(1.8, 0.68);
        ((GeneralPath) shape).lineTo(1.96, 0.68);
        ((GeneralPath) shape).lineTo(2.47, 0.92);
        ((GeneralPath) shape).lineTo(2.77, 0.92);
        ((GeneralPath) shape).lineTo(2.77, 0.54);
        ((GeneralPath) shape).lineTo(2.69, 0.54);
        ((GeneralPath) shape).lineTo(2.07, 0.27);
        ((GeneralPath) shape).lineTo(1.8, 0.27);
        ((GeneralPath) shape).lineTo(1.16, 0.46);
        ((GeneralPath) shape).lineTo(0.61, -0.04);
        ((GeneralPath) shape).lineTo(1.6, -1.03);
        ((GeneralPath) shape).lineTo(2.5, -0.16);
        ((GeneralPath) shape).lineTo(2.72, -0.16);
        ((GeneralPath) shape).lineTo(2.85, -0.3);
        ((GeneralPath) shape).lineTo(2.85, -0.54);
        ((GeneralPath) shape).lineTo(2.82, -0.62);
        ((GeneralPath) shape).lineTo(1.77, -1.63);
        ((GeneralPath) shape).lineTo(1.42, -1.63);
        ((GeneralPath) shape).lineTo(0.22, -0.43);
        ((GeneralPath) shape).lineTo(0.04, -0.62);
        ((GeneralPath) shape).lineTo(0.23, -0.7);
        ((GeneralPath) shape).lineTo(0.42, -0.92);
        ((GeneralPath) shape).lineTo(0.48, -1.06);
        ((GeneralPath) shape).lineTo(0.47, -1.3);
        ((GeneralPath) shape).lineTo(0.36, -1.57);
        ((GeneralPath) shape).lineTo(0.26, -1.71);
        ((GeneralPath) shape).lineTo(0.15, -1.79);
        ((GeneralPath) shape).lineTo(0.07, -1.84);
        ((GeneralPath) shape).lineTo(-0.34, -1.85);
        ((GeneralPath) shape).lineTo(-0.53, -1.71);
        ((GeneralPath) shape).lineTo(-0.69, -1.55);
        ((GeneralPath) shape).lineTo(-0.76, -1.41);
        ((GeneralPath) shape).lineTo(-2.88, -3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(-3.5, -2.87);
        ((GeneralPath) shape).lineTo(-1.12, -0.51);
        ((GeneralPath) shape).lineTo(-2.47, -0.54);
        ((GeneralPath) shape).lineTo(-2.66, -0.35);
        ((GeneralPath) shape).lineTo(-2.72, -0.3);
        ((GeneralPath) shape).lineTo(-2.72, -0.16);
        ((GeneralPath) shape).lineTo(-2.53, 0.06);
        ((GeneralPath) shape).lineTo(-2.23, -0.03);
        ((GeneralPath) shape).lineTo(-1.88, -0.03);
        ((GeneralPath) shape).lineTo(-1.61, 0.06);
        ((GeneralPath) shape).lineTo(-0.55, 0.05);
        ((GeneralPath) shape).lineTo(-0.23, 0.41);
        ((GeneralPath) shape).lineTo(-0.8, 0.54);
        ((GeneralPath) shape).lineTo(-1.07, 0.54);
        ((GeneralPath) shape).lineTo(-1.77, 0.27);
        ((GeneralPath) shape).lineTo(-2.2, 0.27);
        ((GeneralPath) shape).lineTo(-2.8, 0.46);
        ((GeneralPath) shape).lineTo(-2.8, 0.9);
        ((GeneralPath) shape).lineTo(-2.09, 0.68);
        ((GeneralPath) shape).lineTo(-1.88, 0.68);
        ((GeneralPath) shape).lineTo(-1.15, 0.95);
        ((GeneralPath) shape).lineTo(-0.69, 0.95);
        ((GeneralPath) shape).lineTo(-0.12, 0.76);
        ((GeneralPath) shape).lineTo(0.15, 0.76);
        ((GeneralPath) shape).lineTo(0.69, 1.33);
        ((GeneralPath) shape).lineTo(0.53, 1.33);
        ((GeneralPath) shape).lineTo(0.12, 1.14);
        ((GeneralPath) shape).lineTo(-0.18, 1.14);
        ((GeneralPath) shape).lineTo(-0.69, 1.3);
        ((GeneralPath) shape).lineTo(-1.2, 1.3);
        ((GeneralPath) shape).lineTo(-1.93, 1.03);
        ((GeneralPath) shape).lineTo(-2.15, 1.03);
        ((GeneralPath) shape).lineTo(-2.8, 1.28);
        ((GeneralPath) shape).lineTo(-2.8, 1.66);
        ((GeneralPath) shape).lineTo(-2.58, 1.66);
        ((GeneralPath) shape).lineTo(-2.09, 1.44);
        ((GeneralPath) shape).lineTo(-1.99, 1.44);
        ((GeneralPath) shape).lineTo(-1.2, 1.71);
        ((GeneralPath) shape).lineTo(-0.69, 1.71);
        ((GeneralPath) shape).lineTo(-0.12, 1.52);
        ((GeneralPath) shape).lineTo(0.04, 1.52);
        ((GeneralPath) shape).lineTo(0.53, 1.71);
        ((GeneralPath) shape).lineTo(0.96, 1.71);
        ((GeneralPath) shape).lineTo(1.07, 1.68);
        ((GeneralPath) shape).lineTo(2.87, 3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);

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

