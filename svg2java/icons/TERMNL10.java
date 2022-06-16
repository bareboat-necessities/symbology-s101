

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class TERMNL10 {

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
        g.transform(new AffineTransform(3.7650468f, 0, 0, 3.7650468f, 9.826772f, 9.826772f));

        // _0

        // _0_0

        // _0_0_0
        shape = new Ellipse2D.Double(-2.5999999046325684, -2.5999999046325684, 5.199999809265137, 5.199999809265137);
        g.setPaint(new Color(0xDADADA));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.08f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.02, 0.01);
        ((GeneralPath) shape).lineTo(-1.87, -0.19);
        ((GeneralPath) shape).lineTo(-1.63, -0.4);
        ((GeneralPath) shape).lineTo(-1.15, -0.63);
        ((GeneralPath) shape).lineTo(-0.71, -0.78);
        ((GeneralPath) shape).lineTo(-0.45, -0.87);
        ((GeneralPath) shape).lineTo(-0.1, -1.19);
        ((GeneralPath) shape).lineTo(0.25, -1.29);
        ((GeneralPath) shape).lineTo(0.25, -0.92);
        ((GeneralPath) shape).lineTo(0.61, -0.78);
        ((GeneralPath) shape).lineTo(0.88, -0.68);
        ((GeneralPath) shape).lineTo(1.16, -0.45);
        ((GeneralPath) shape).lineTo(1.45, -0.21);
        ((GeneralPath) shape).lineTo(1.72, -0.66);
        ((GeneralPath) shape).lineTo(1.91, -0.8);
        ((GeneralPath) shape).lineTo(1.96, 0.71);
        ((GeneralPath) shape).lineTo(1.62, 0.35);
        ((GeneralPath) shape).lineTo(1.44, 0.17);
        ((GeneralPath) shape).lineTo(1.34, 0.27);
        ((GeneralPath) shape).lineTo(1.16, 0.44);
        ((GeneralPath) shape).lineTo(0.99, 0.61);
        ((GeneralPath) shape).lineTo(0.72, 0.72);
        ((GeneralPath) shape).lineTo(0.49, 0.79);
        ((GeneralPath) shape).lineTo(0.67, 1.14);
        ((GeneralPath) shape).lineTo(0.24, 1.15);
        ((GeneralPath) shape).lineTo(-0.09, 1.05);
        ((GeneralPath) shape).lineTo(-0.28, 0.93);
        ((GeneralPath) shape).lineTo(-0.37, 0.86);
        ((GeneralPath) shape).lineTo(-0.89, 0.76);
        ((GeneralPath) shape).lineTo(-1.31, 0.59);
        ((GeneralPath) shape).lineTo(-1.62, 0.46);
        ((GeneralPath) shape).lineTo(-1.81, 0.3);
        ((GeneralPath) shape).lineTo(-2.02, 0.01);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new Ellipse2D.Double(-1.3299999237060547, -0.4000000059604645, 0.36000001430511475, 0.36000001430511475);
        g.setPaint(new Color(0xDADADA));
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
        return 20;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 20;
    }
}

