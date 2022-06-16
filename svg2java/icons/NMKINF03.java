

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF03 {

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
        ((GeneralPath) shape).moveTo(5.1, 3.5);
        ((GeneralPath) shape).lineTo(-5.1, 3.5);
        ((GeneralPath) shape).lineTo(-5.1, -3.5);
        ((GeneralPath) shape).lineTo(5.1, -3.5);
        ((GeneralPath) shape).lineTo(5.1, 3.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-4.42, 2.12);
        ((GeneralPath) shape).lineTo(4.51, 2.12);
        ((GeneralPath) shape).lineTo(4.51, -1.94);
        ((GeneralPath) shape).lineTo(3.72, -1.94);
        ((GeneralPath) shape).lineTo(3.72, -0.88);
        ((GeneralPath) shape).lineTo(-3.65, -0.88);
        ((GeneralPath) shape).lineTo(-3.65, -1.94);
        ((GeneralPath) shape).lineTo(-4.42, -1.94);
        ((GeneralPath) shape).lineTo(-4.42, 2.12);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.08f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.65, 1.68);
        ((GeneralPath) shape).lineTo(-2.81, 1.68);
        ((GeneralPath) shape).lineTo(-2.81, -0.44);
        ((GeneralPath) shape).lineTo(-3.65, -0.44);
        ((GeneralPath) shape).lineTo(-3.65, 1.68);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(WHITE);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.01, 1.68);
        ((GeneralPath) shape).lineTo(-1.17, 1.68);
        ((GeneralPath) shape).lineTo(-1.17, -0.44);
        ((GeneralPath) shape).lineTo(-2.01, -0.44);
        ((GeneralPath) shape).lineTo(-2.01, 1.68);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(WHITE);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.37, 1.68);
        ((GeneralPath) shape).lineTo(0.47, 1.68);
        ((GeneralPath) shape).lineTo(0.47, -0.44);
        ((GeneralPath) shape).lineTo(-0.37, -0.44);
        ((GeneralPath) shape).lineTo(-0.37, 1.68);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(WHITE);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.26, 1.68);
        ((GeneralPath) shape).lineTo(2.09, 1.68);
        ((GeneralPath) shape).lineTo(2.09, -0.44);
        ((GeneralPath) shape).lineTo(1.26, -0.44);
        ((GeneralPath) shape).lineTo(1.26, 1.68);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(WHITE);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.9, 1.68);
        ((GeneralPath) shape).lineTo(3.74, 1.68);
        ((GeneralPath) shape).lineTo(3.74, -0.44);
        ((GeneralPath) shape).lineTo(2.9, -0.44);
        ((GeneralPath) shape).lineTo(2.9, 1.68);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00A9FF));
        g.fill(shape);
        g.setPaint(WHITE);
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

