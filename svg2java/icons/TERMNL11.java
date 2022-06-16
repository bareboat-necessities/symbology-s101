

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class TERMNL11 {

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
        ((GeneralPath) shape).moveTo(-1.88, 0.38);
        ((GeneralPath) shape).lineTo(1.84, 0.38);
        ((GeneralPath) shape).lineTo(1.84, -0.18);
        ((GeneralPath) shape).lineTo(1.62, -0.4);
        ((GeneralPath) shape).lineTo(-1.53, -0.39);
        ((GeneralPath) shape).lineTo(-1.89, -0.09);
        ((GeneralPath) shape).lineTo(-1.88, 0.38);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new Ellipse2D.Double(-1.4399999380111694, 0.009999990463256836, 0.800000011920929, 0.800000011920929);
        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new Ellipse2D.Double(0.7100000381469727, 0.02000001072883606, 0.7799999713897705, 0.7799999713897705);
        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.81, -0.39);
        ((GeneralPath) shape).lineTo(-0.21, -1.06);

        g.setStroke(new BasicStroke(0.08f, 0, 0, 4));
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.21, -1.06);
        ((GeneralPath) shape).lineTo(0.86, -1.06);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.86, -1.06);
        ((GeneralPath) shape).lineTo(1.18, -0.74);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.18, -0.74);
        ((GeneralPath) shape).lineTo(1.18, -0.4);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.53, -1.07);
        ((GeneralPath) shape).lineTo(0.53, -0.4);

        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.1, -1.06);
        ((GeneralPath) shape).lineTo(-0.1, -0.4);

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

