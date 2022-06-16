

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKPRB02 {

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
        g.transform(new AffineTransform(3.7620301f, 0, 0, 3.7620301f, 9.824147f, 8.088366f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.6, 2.16);
        ((GeneralPath) shape).lineTo(1.52, 2.16);
        ((GeneralPath) shape).lineTo(1.52, 1.48);
        ((GeneralPath) shape).lineTo(0.99, 1.48);
        ((GeneralPath) shape).lineTo(0.7, 0.04);
        ((GeneralPath) shape).lineTo(-0.96, 0.04);
        ((GeneralPath) shape).lineTo(-2.13, 1.48);
        ((GeneralPath) shape).lineTo(-2.6, 1.48);
        ((GeneralPath) shape).lineTo(-2.6, 2.16);
        ((GeneralPath) shape).closePath();

        g.setPaint(YELLOW);
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.84, 0.04);
        ((GeneralPath) shape).lineTo(1.56, 0.04);
        ((GeneralPath) shape).lineTo(2.3, -2.14);
        ((GeneralPath) shape).lineTo(-1.09, -2.14);
        ((GeneralPath) shape).lineTo(-1.84, 0.04);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF3939));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.36, -1.36);
        ((GeneralPath) shape).lineTo(2.04, -1.36);
        ((GeneralPath) shape).lineTo(1.83, -0.74);
        ((GeneralPath) shape).lineTo(-1.57, -0.74);
        ((GeneralPath) shape).lineTo(-1.36, -1.36);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.09, -2.14);
        ((GeneralPath) shape).lineTo(2.3, -2.14);
        ((GeneralPath) shape).lineTo(1.56, 0.04);
        ((GeneralPath) shape).lineTo(-1.84, 0.04);
        ((GeneralPath) shape).lineTo(-1.09, -2.14);

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
        return 19;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 17;
    }
}

