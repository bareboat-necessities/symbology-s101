

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKAD008 {

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
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.27, -2.0);
        ((GeneralPath) shape).lineTo(0.26, -2.0);
        ((GeneralPath) shape).lineTo(0.27, 1.99);
        ((GeneralPath) shape).lineTo(-0.27, 1.99);
        ((GeneralPath) shape).lineTo(-0.27, -2.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.26, -1.14);
        ((GeneralPath) shape).lineTo(1.04, -1.14);
        ((GeneralPath) shape).lineTo(1.04, -0.69);
        ((GeneralPath) shape).lineTo(0.26, -0.7);
        ((GeneralPath) shape).lineTo(0.26, -1.14);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.27, -0.7);
        ((GeneralPath) shape).lineTo(-1.06, -0.69);
        ((GeneralPath) shape).lineTo(-1.06, -1.14);
        ((GeneralPath) shape).lineTo(-0.27, -1.14);
        ((GeneralPath) shape).lineTo(-0.27, -0.7);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.04, -2.03);
        ((GeneralPath) shape).lineTo(0.08, -2.04);
        ((GeneralPath) shape).lineTo(0.13, -2.06);
        ((GeneralPath) shape).lineTo(0.17, -2.09);
        ((GeneralPath) shape).lineTo(0.2, -2.12);
        ((GeneralPath) shape).lineTo(0.23, -2.16);
        ((GeneralPath) shape).lineTo(0.25, -2.2);
        ((GeneralPath) shape).lineTo(0.26, -2.24);
        ((GeneralPath) shape).lineTo(0.27, -2.29);
        ((GeneralPath) shape).lineTo(0.26, -2.34);
        ((GeneralPath) shape).lineTo(0.25, -2.38);
        ((GeneralPath) shape).lineTo(0.23, -2.42);
        ((GeneralPath) shape).lineTo(0.21, -2.46);
        ((GeneralPath) shape).lineTo(0.18, -2.5);
        ((GeneralPath) shape).lineTo(0.14, -2.53);
        ((GeneralPath) shape).lineTo(0.1, -2.55);
        ((GeneralPath) shape).lineTo(0.06, -2.56);
        ((GeneralPath) shape).lineTo(0.01, -2.57);
        ((GeneralPath) shape).lineTo(-0.04, -2.57);
        ((GeneralPath) shape).lineTo(-0.08, -2.56);
        ((GeneralPath) shape).lineTo(-0.12, -2.54);
        ((GeneralPath) shape).lineTo(-0.16, -2.52);
        ((GeneralPath) shape).lineTo(-0.2, -2.48);
        ((GeneralPath) shape).lineTo(-0.23, -2.45);
        ((GeneralPath) shape).lineTo(-0.25, -2.41);
        ((GeneralPath) shape).lineTo(-0.27, -2.36);
        ((GeneralPath) shape).lineTo(-0.27, -2.32);
        ((GeneralPath) shape).lineTo(-0.27, -2.27);
        ((GeneralPath) shape).lineTo(-0.26, -2.23);
        ((GeneralPath) shape).lineTo(-0.25, -2.18);
        ((GeneralPath) shape).lineTo(-0.22, -2.14);
        ((GeneralPath) shape).lineTo(-0.19, -2.11);
        ((GeneralPath) shape).lineTo(-0.16, -2.08);
        ((GeneralPath) shape).lineTo(-0.12, -2.05);
        ((GeneralPath) shape).lineTo(-0.07, -2.04);
        ((GeneralPath) shape).lineTo(-0.04, -2.03);
        ((GeneralPath) shape).lineTo(0.04, -2.03);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(-3.07, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.07);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(3.07, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.07);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.47, 0.75);
        ((GeneralPath) shape).lineTo(-2.82, 0.91);
        ((GeneralPath) shape).lineTo(-2.58, -0.09);
        ((GeneralPath) shape).lineTo(-1.7, 0.41);
        ((GeneralPath) shape).lineTo(-2.06, 0.57);
        ((GeneralPath) shape).lineTo(-2.01, 0.69);
        ((GeneralPath) shape).lineTo(-1.96, 0.81);
        ((GeneralPath) shape).lineTo(-1.9, 0.92);
        ((GeneralPath) shape).lineTo(-1.83, 1.03);
        ((GeneralPath) shape).lineTo(-1.76, 1.14);
        ((GeneralPath) shape).lineTo(-1.68, 1.24);
        ((GeneralPath) shape).lineTo(-1.59, 1.34);
        ((GeneralPath) shape).lineTo(-1.5, 1.43);
        ((GeneralPath) shape).lineTo(-1.4, 1.52);
        ((GeneralPath) shape).lineTo(-1.3, 1.6);
        ((GeneralPath) shape).lineTo(-1.19, 1.67);
        ((GeneralPath) shape).lineTo(-1.08, 1.74);
        ((GeneralPath) shape).lineTo(-0.97, 1.8);
        ((GeneralPath) shape).lineTo(-0.85, 1.85);
        ((GeneralPath) shape).lineTo(-0.73, 1.89);
        ((GeneralPath) shape).lineTo(-0.6, 1.93);
        ((GeneralPath) shape).lineTo(-0.48, 1.96);
        ((GeneralPath) shape).lineTo(-0.35, 1.98);
        ((GeneralPath) shape).lineTo(-0.27, 1.99);
        ((GeneralPath) shape).lineTo(0.27, 1.99);
        ((GeneralPath) shape).lineTo(0.4, 1.97);
        ((GeneralPath) shape).lineTo(0.52, 1.94);
        ((GeneralPath) shape).lineTo(0.65, 1.91);
        ((GeneralPath) shape).lineTo(0.77, 1.87);
        ((GeneralPath) shape).lineTo(0.89, 1.82);
        ((GeneralPath) shape).lineTo(1.01, 1.76);
        ((GeneralPath) shape).lineTo(1.13, 1.69);
        ((GeneralPath) shape).lineTo(1.24, 1.62);
        ((GeneralPath) shape).lineTo(1.34, 1.54);
        ((GeneralPath) shape).lineTo(1.44, 1.46);
        ((GeneralPath) shape).lineTo(1.54, 1.37);
        ((GeneralPath) shape).lineTo(1.62, 1.27);
        ((GeneralPath) shape).lineTo(1.71, 1.17);
        ((GeneralPath) shape).lineTo(1.78, 1.07);
        ((GeneralPath) shape).lineTo(1.85, 0.96);
        ((GeneralPath) shape).lineTo(1.92, 0.84);
        ((GeneralPath) shape).lineTo(1.97, 0.72);
        ((GeneralPath) shape).lineTo(2.02, 0.6);
        ((GeneralPath) shape).lineTo(2.05, 0.53);
        ((GeneralPath) shape).lineTo(1.7, 0.39);
        ((GeneralPath) shape).lineTo(2.55, -0.09);
        ((GeneralPath) shape).lineTo(2.83, 0.85);
        ((GeneralPath) shape).lineTo(2.45, 0.7);
        ((GeneralPath) shape).lineTo(2.41, 0.83);
        ((GeneralPath) shape).lineTo(2.35, 0.96);
        ((GeneralPath) shape).lineTo(2.29, 1.08);
        ((GeneralPath) shape).lineTo(2.23, 1.2);
        ((GeneralPath) shape).lineTo(2.15, 1.32);
        ((GeneralPath) shape).lineTo(2.07, 1.43);
        ((GeneralPath) shape).lineTo(1.98, 1.54);
        ((GeneralPath) shape).lineTo(1.89, 1.65);
        ((GeneralPath) shape).lineTo(1.79, 1.74);
        ((GeneralPath) shape).lineTo(1.69, 1.83);
        ((GeneralPath) shape).lineTo(1.58, 1.92);
        ((GeneralPath) shape).lineTo(1.46, 2.0);
        ((GeneralPath) shape).lineTo(1.34, 2.07);
        ((GeneralPath) shape).lineTo(1.22, 2.14);
        ((GeneralPath) shape).lineTo(1.09, 2.19);
        ((GeneralPath) shape).lineTo(0.96, 2.24);
        ((GeneralPath) shape).lineTo(0.83, 2.29);
        ((GeneralPath) shape).lineTo(0.83, 2.29);
        ((GeneralPath) shape).lineTo(0.0, 2.78);
        ((GeneralPath) shape).lineTo(-0.83, 2.29);
        ((GeneralPath) shape).lineTo(-0.96, 2.25);
        ((GeneralPath) shape).lineTo(-1.09, 2.2);
        ((GeneralPath) shape).lineTo(-1.22, 2.15);
        ((GeneralPath) shape).lineTo(-1.34, 2.09);
        ((GeneralPath) shape).lineTo(-1.46, 2.03);
        ((GeneralPath) shape).lineTo(-1.57, 1.95);
        ((GeneralPath) shape).lineTo(-1.68, 1.87);
        ((GeneralPath) shape).lineTo(-1.79, 1.79);
        ((GeneralPath) shape).lineTo(-1.89, 1.69);
        ((GeneralPath) shape).lineTo(-1.98, 1.6);
        ((GeneralPath) shape).lineTo(-2.07, 1.49);
        ((GeneralPath) shape).lineTo(-2.15, 1.38);
        ((GeneralPath) shape).lineTo(-2.23, 1.27);
        ((GeneralPath) shape).lineTo(-2.3, 1.15);
        ((GeneralPath) shape).lineTo(-2.36, 1.03);
        ((GeneralPath) shape).lineTo(-2.41, 0.91);
        ((GeneralPath) shape).lineTo(-2.46, 0.78);
        ((GeneralPath) shape).lineTo(-2.47, 0.75);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

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

