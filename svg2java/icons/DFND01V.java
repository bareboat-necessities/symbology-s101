

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class DFND01V {

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
        g.transform(new AffineTransform(3.7672567f, 0, 0, 3.7672567f, 11.45246f, 20.170898f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, -0.65);
        ((GeneralPath) shape).lineTo(-1.33, -1.0);
        ((GeneralPath) shape).lineTo(-1.33, -2.3);
        ((GeneralPath) shape).lineTo(1.33, -2.3);
        ((GeneralPath) shape).lineTo(1.33, -1.0);
        ((GeneralPath) shape).lineTo(2.05, -0.65);
        ((GeneralPath) shape).lineTo(2.05, 0.0);
        ((GeneralPath) shape).lineTo(-2.05, 0.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(RED);
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.97, 0.55);
        ((GeneralPath) shape).lineTo(-3.03, -0.96);
        ((GeneralPath) shape).lineTo(-2.02, -2.41);

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.14, 1.84);
        ((GeneralPath) shape).lineTo(0.04, 3.42);
        ((GeneralPath) shape).lineTo(-0.89, 2.09);

        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.12, -3.69);
        ((GeneralPath) shape).lineTo(0.04, -5.34);
        ((GeneralPath) shape).lineTo(1.18, -3.7);

        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.13, -2.35);
        ((GeneralPath) shape).lineTo(3.11, -0.96);
        ((GeneralPath) shape).lineTo(1.98, 0.65);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.96, -3.57);
        ((GeneralPath) shape).lineTo(0.04, -4.99);
        ((GeneralPath) shape).lineTo(1.02, -3.59);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.81, 0.44);
        ((GeneralPath) shape).lineTo(-2.79, -0.96);
        ((GeneralPath) shape).lineTo(-1.85, -2.29);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.97, -2.24);
        ((GeneralPath) shape).lineTo(2.86, -0.96);
        ((GeneralPath) shape).lineTo(1.82, 0.53);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.98, 1.73);
        ((GeneralPath) shape).lineTo(0.04, 3.07);
        ((GeneralPath) shape).lineTo(-0.73, 1.98);

        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.49, -1.94);
        ((GeneralPath) shape).lineTo(-0.49, -0.33);
        ((GeneralPath) shape).lineTo(-0.2, -0.33);
        ((GeneralPath) shape).lineTo(-0.2, -1.94);
        ((GeneralPath) shape).lineTo(-0.49, -1.94);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.2, -1.94);
        ((GeneralPath) shape).lineTo(0.1, -1.94);
        ((GeneralPath) shape).lineTo(0.17, -1.93);
        ((GeneralPath) shape).lineTo(0.22, -1.93);
        ((GeneralPath) shape).lineTo(0.27, -1.92);
        ((GeneralPath) shape).lineTo(0.31, -1.91);
        ((GeneralPath) shape).lineTo(0.35, -1.9);
        ((GeneralPath) shape).lineTo(0.39, -1.87);
        ((GeneralPath) shape).lineTo(0.44, -1.83);
        ((GeneralPath) shape).lineTo(0.5, -1.77);
        ((GeneralPath) shape).lineTo(0.54, -1.69);
        ((GeneralPath) shape).lineTo(0.57, -1.6);
        ((GeneralPath) shape).lineTo(0.59, -1.47);
        ((GeneralPath) shape).lineTo(0.59, -1.37);
        ((GeneralPath) shape).lineTo(0.58, -1.29);
        ((GeneralPath) shape).lineTo(0.55, -1.21);
        ((GeneralPath) shape).lineTo(0.52, -1.15);
        ((GeneralPath) shape).lineTo(0.48, -1.09);
        ((GeneralPath) shape).lineTo(0.42, -1.04);
        ((GeneralPath) shape).lineTo(0.36, -1.0);
        ((GeneralPath) shape).lineTo(0.28, -0.96);
        ((GeneralPath) shape).lineTo(0.2, -0.95);
        ((GeneralPath) shape).lineTo(0.13, -0.94);
        ((GeneralPath) shape).lineTo(0.07, -0.94);
        ((GeneralPath) shape).lineTo(-0.2, -0.94);
        ((GeneralPath) shape).lineTo(-0.2, -1.21);
        ((GeneralPath) shape).lineTo(-0.08, -1.21);
        ((GeneralPath) shape).lineTo(0.05, -1.21);
        ((GeneralPath) shape).lineTo(0.13, -1.22);
        ((GeneralPath) shape).lineTo(0.19, -1.24);
        ((GeneralPath) shape).lineTo(0.23, -1.27);
        ((GeneralPath) shape).lineTo(0.26, -1.32);
        ((GeneralPath) shape).lineTo(0.28, -1.36);
        ((GeneralPath) shape).lineTo(0.29, -1.41);
        ((GeneralPath) shape).lineTo(0.3, -1.46);
        ((GeneralPath) shape).lineTo(0.29, -1.51);
        ((GeneralPath) shape).lineTo(0.28, -1.54);
        ((GeneralPath) shape).lineTo(0.25, -1.58);
        ((GeneralPath) shape).lineTo(0.23, -1.61);
        ((GeneralPath) shape).lineTo(0.2, -1.63);
        ((GeneralPath) shape).lineTo(0.17, -1.65);
        ((GeneralPath) shape).lineTo(0.14, -1.66);
        ((GeneralPath) shape).lineTo(0.09, -1.66);
        ((GeneralPath) shape).lineTo(0.01, -1.67);
        ((GeneralPath) shape).lineTo(-0.2, -1.67);
        ((GeneralPath) shape).lineTo(-0.2, -1.94);
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
        return 25;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 35;
    }
}

