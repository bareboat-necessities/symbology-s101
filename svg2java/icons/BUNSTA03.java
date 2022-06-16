

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BUNSTA03 {

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
        g.transform(new AffineTransform(3.7553f, 0, 0, 3.7553f, 7.0296793f, 5.895821f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.86, 1.54);
        ((GeneralPath) shape).lineTo(0.54, 1.54);
        ((GeneralPath) shape).lineTo(1.84, 0.26);
        ((GeneralPath) shape).lineTo(1.84, -1.56);
        ((GeneralPath) shape).lineTo(-0.26, -1.56);
        ((GeneralPath) shape).lineTo(-1.86, -0.27);
        ((GeneralPath) shape).lineTo(-1.86, 1.54);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDADADA));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.54, 1.54);
        ((GeneralPath) shape).lineTo(0.54, -0.27);

        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.54, -0.27);
        ((GeneralPath) shape).lineTo(-1.86, -0.27);

        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.66, 1.54);
        ((GeneralPath) shape).lineTo(-0.66, -0.27);

        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.54, 0.62);
        ((GeneralPath) shape).lineTo(1.84, -0.65);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.84, -1.56);
        ((GeneralPath) shape).lineTo(0.54, -0.27);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.67, -0.27);
        ((GeneralPath) shape).lineTo(0.78, -1.56);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.26, -1.56);
        ((GeneralPath) shape).lineTo(-1.86, -0.27);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.26, -1.56);
        ((GeneralPath) shape).lineTo(1.84, -1.56);

        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.84, -1.56);
        ((GeneralPath) shape).lineTo(1.84, 0.26);

        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.84, 0.26);
        ((GeneralPath) shape).lineTo(0.54, 1.54);

        g.draw(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.54, 1.54);
        ((GeneralPath) shape).lineTo(-1.86, 1.54);

        g.draw(shape);

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.86, 1.54);
        ((GeneralPath) shape).lineTo(-1.86, -0.27);

        g.draw(shape);

        // _0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.86, 0.62);
        ((GeneralPath) shape).lineTo(0.54, 0.62);

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
        return 13;
    }
}

