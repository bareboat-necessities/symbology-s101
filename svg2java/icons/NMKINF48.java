

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF48 {

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
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.61, 1.67);
        ((GeneralPath) shape).lineTo(2.43, 1.79);
        ((GeneralPath) shape).lineTo(2.28, 1.84);
        ((GeneralPath) shape).lineTo(2.14, 1.84);
        ((GeneralPath) shape).lineTo(2.01, 1.8);
        ((GeneralPath) shape).lineTo(1.79, 1.7);
        ((GeneralPath) shape).lineTo(1.39, 1.5);
        ((GeneralPath) shape).lineTo(1.11, 1.39);
        ((GeneralPath) shape).lineTo(1.01, 1.38);
        ((GeneralPath) shape).lineTo(0.86, 1.42);
        ((GeneralPath) shape).lineTo(0.72, 1.48);
        ((GeneralPath) shape).lineTo(0.5, 1.59);
        ((GeneralPath) shape).lineTo(0.43, 1.59);
        ((GeneralPath) shape).lineTo(0.33, 1.52);
        ((GeneralPath) shape).lineTo(0.19, 1.43);
        ((GeneralPath) shape).lineTo(0.01, 1.33);
        ((GeneralPath) shape).lineTo(-0.23, 1.24);
        ((GeneralPath) shape).lineTo(-0.36, 1.22);
        ((GeneralPath) shape).lineTo(-0.47, 1.22);
        ((GeneralPath) shape).lineTo(-0.64, 1.28);
        ((GeneralPath) shape).lineTo(-1.15, 1.56);
        ((GeneralPath) shape).lineTo(-1.8, 1.93);
        ((GeneralPath) shape).lineTo(-2.16, 2.16);
        ((GeneralPath) shape).lineTo(-2.32, 2.22);
        ((GeneralPath) shape).lineTo(-2.44, 2.24);
        ((GeneralPath) shape).lineTo(-2.58, 2.21);
        ((GeneralPath) shape).lineTo(-2.73, 2.15);
        ((GeneralPath) shape).lineTo(-2.91, 1.99);
        ((GeneralPath) shape).lineTo(-2.91, 2.23);
        ((GeneralPath) shape).lineTo(-2.73, 2.39);
        ((GeneralPath) shape).lineTo(-2.59, 2.46);
        ((GeneralPath) shape).lineTo(-2.44, 2.49);
        ((GeneralPath) shape).lineTo(-2.32, 2.47);
        ((GeneralPath) shape).lineTo(-2.16, 2.4);
        ((GeneralPath) shape).lineTo(-1.8, 2.17);
        ((GeneralPath) shape).lineTo(-1.15, 1.8);
        ((GeneralPath) shape).lineTo(-0.64, 1.52);
        ((GeneralPath) shape).lineTo(-0.48, 1.47);
        ((GeneralPath) shape).lineTo(-0.36, 1.46);
        ((GeneralPath) shape).lineTo(-0.23, 1.48);
        ((GeneralPath) shape).lineTo(0.01, 1.57);
        ((GeneralPath) shape).lineTo(0.19, 1.67);
        ((GeneralPath) shape).lineTo(0.32, 1.77);
        ((GeneralPath) shape).lineTo(0.43, 1.83);
        ((GeneralPath) shape).lineTo(0.5, 1.83);
        ((GeneralPath) shape).lineTo(0.72, 1.72);
        ((GeneralPath) shape).lineTo(0.86, 1.67);
        ((GeneralPath) shape).lineTo(1.01, 1.62);
        ((GeneralPath) shape).lineTo(1.11, 1.63);
        ((GeneralPath) shape).lineTo(1.39, 1.75);
        ((GeneralPath) shape).lineTo(1.79, 1.94);
        ((GeneralPath) shape).lineTo(2.01, 2.05);
        ((GeneralPath) shape).lineTo(2.14, 2.08);
        ((GeneralPath) shape).lineTo(2.28, 2.09);
        ((GeneralPath) shape).lineTo(2.43, 2.03);
        ((GeneralPath) shape).lineTo(2.61, 1.91);
        ((GeneralPath) shape).lineTo(2.61, 1.67);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.88, 1.45);
        ((GeneralPath) shape).lineTo(-2.82, 1.55);
        ((GeneralPath) shape).lineTo(-2.64, 1.71);
        ((GeneralPath) shape).lineTo(-2.57, 1.75);
        ((GeneralPath) shape).lineTo(-2.33, 1.7);
        ((GeneralPath) shape).lineTo(-2.08, 1.61);
        ((GeneralPath) shape).lineTo(-1.64, 1.38);
        ((GeneralPath) shape).lineTo(-1.17, 1.12);
        ((GeneralPath) shape).lineTo(-0.97, 1.0);
        ((GeneralPath) shape).lineTo(-0.72, 0.86);
        ((GeneralPath) shape).lineTo(-0.54, 0.82);
        ((GeneralPath) shape).lineTo(-0.37, 0.81);
        ((GeneralPath) shape).lineTo(-0.15, 0.82);
        ((GeneralPath) shape).lineTo(0.07, 0.88);
        ((GeneralPath) shape).lineTo(0.47, 1.08);
        ((GeneralPath) shape).lineTo(0.76, 1.0);
        ((GeneralPath) shape).lineTo(1.23, 0.84);
        ((GeneralPath) shape).lineTo(1.95, 0.54);
        ((GeneralPath) shape).lineTo(2.17, 0.34);
        ((GeneralPath) shape).lineTo(2.44, 0.07);
        ((GeneralPath) shape).lineTo(2.58, -0.14);
        ((GeneralPath) shape).lineTo(2.74, -0.43);
        ((GeneralPath) shape).lineTo(2.82, -0.69);
        ((GeneralPath) shape).lineTo(2.12, -0.22);
        ((GeneralPath) shape).lineTo(-2.89, 1.34);
        ((GeneralPath) shape).lineTo(-2.88, 1.45);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.93, 1.17);
        ((GeneralPath) shape).lineTo(2.04, -0.41);
        ((GeneralPath) shape).lineTo(2.77, -0.84);
        ((GeneralPath) shape).lineTo(0.22, -0.89);
        ((GeneralPath) shape).lineTo(-0.75, -1.9);
        ((GeneralPath) shape).lineTo(-2.0, -1.95);
        ((GeneralPath) shape).lineTo(-2.1, -1.68);
        ((GeneralPath) shape).lineTo(-2.13, -1.4);
        ((GeneralPath) shape).lineTo(-2.14, -1.18);
        ((GeneralPath) shape).lineTo(-2.16, -1.02);
        ((GeneralPath) shape).lineTo(-2.25, -0.68);
        ((GeneralPath) shape).lineTo(-2.22, -0.57);
        ((GeneralPath) shape).lineTo(-2.16, -0.48);
        ((GeneralPath) shape).lineTo(-1.39, -0.22);
        ((GeneralPath) shape).lineTo(-1.32, 0.02);
        ((GeneralPath) shape).lineTo(-2.59, 0.42);
        ((GeneralPath) shape).lineTo(-2.78, 0.53);
        ((GeneralPath) shape).lineTo(-2.88, 0.72);
        ((GeneralPath) shape).lineTo(-2.93, 0.89);
        ((GeneralPath) shape).lineTo(-2.93, 1.17);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.62, -1.29);
        ((GeneralPath) shape).lineTo(-1.67, -1.04);
        ((GeneralPath) shape).lineTo(-1.71, -0.81);
        ((GeneralPath) shape).lineTo(-1.04, -0.58);
        ((GeneralPath) shape).lineTo(-0.96, -0.28);
        ((GeneralPath) shape).lineTo(-0.92, -0.13);
        ((GeneralPath) shape).lineTo(0.12, -0.39);
        ((GeneralPath) shape).lineTo(-0.76, -1.43);
        ((GeneralPath) shape).lineTo(-0.93, -1.12);
        ((GeneralPath) shape).lineTo(-1.62, -1.29);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.56, -1.53);
        ((GeneralPath) shape).lineTo(-1.06, -1.39);
        ((GeneralPath) shape).lineTo(-0.95, -1.64);
        ((GeneralPath) shape).lineTo(-1.53, -1.7);
        ((GeneralPath) shape).lineTo(-1.56, -1.53);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_7
        shape = new Ellipse2D.Double(-2.109999895095825, -2.7100000381469727, 0.6000000238418579, 0.6000000238418579);
        g.setPaint(WHITE);
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

