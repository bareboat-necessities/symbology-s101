

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class TERMNL04 {

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
        ((GeneralPath) shape).moveTo(-0.01, -2.6);
        ((GeneralPath) shape).lineTo(-0.01, -0.87);

        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.01, -0.87);
        ((GeneralPath) shape).lineTo(-2.03, -0.04);
        ((GeneralPath) shape).lineTo(-0.89, 1.08);
        ((GeneralPath) shape).lineTo(-0.01, -0.87);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.01, -0.87);
        ((GeneralPath) shape).lineTo(1.97, -0.03);
        ((GeneralPath) shape).lineTo(0.87, 1.08);
        ((GeneralPath) shape).lineTo(-0.01, -0.87);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.03, -0.04);
        ((GeneralPath) shape).lineTo(-0.01, -2.11);

        g.setStroke(new BasicStroke(0.08f, 0, 0, 4));
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.97, -0.03);
        ((GeneralPath) shape).lineTo(-0.01, -2.11);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.12, 2.09);
        ((GeneralPath) shape).lineTo(1.03, 2.09);
        ((GeneralPath) shape).lineTo(0.96, 1.81);
        ((GeneralPath) shape).lineTo(0.67, 1.81);
        ((GeneralPath) shape).lineTo(0.19, 0.92);
        ((GeneralPath) shape).lineTo(-0.24, 0.92);
        ((GeneralPath) shape).lineTo(-0.66, 1.81);
        ((GeneralPath) shape).lineTo(-1.06, 1.81);
        ((GeneralPath) shape).lineTo(-1.12, 2.09);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x848484));
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

