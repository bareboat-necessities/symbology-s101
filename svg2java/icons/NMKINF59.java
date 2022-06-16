

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF59 {

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
        ((GeneralPath) shape).moveTo(1.96, 0.62);
        ((GeneralPath) shape).lineTo(1.97, 0.63);
        ((GeneralPath) shape).lineTo(2.0, 0.66);
        ((GeneralPath) shape).lineTo(2.03, 0.69);
        ((GeneralPath) shape).lineTo(2.05, 0.72);
        ((GeneralPath) shape).lineTo(2.08, 0.75);
        ((GeneralPath) shape).lineTo(2.1, 0.77);
        ((GeneralPath) shape).lineTo(2.13, 0.8);
        ((GeneralPath) shape).lineTo(2.16, 0.83);
        ((GeneralPath) shape).lineTo(2.19, 0.86);
        ((GeneralPath) shape).lineTo(2.23, 0.87);
        ((GeneralPath) shape).lineTo(2.26, 0.87);
        ((GeneralPath) shape).lineTo(2.3, 0.85);
        ((GeneralPath) shape).lineTo(2.33, 0.83);
        ((GeneralPath) shape).lineTo(2.36, 0.8);
        ((GeneralPath) shape).lineTo(2.39, 0.77);
        ((GeneralPath) shape).lineTo(2.42, 0.74);
        ((GeneralPath) shape).lineTo(2.44, 0.71);
        ((GeneralPath) shape).lineTo(2.46, 0.68);
        ((GeneralPath) shape).lineTo(2.48, 0.65);
        ((GeneralPath) shape).lineTo(2.51, 0.62);
        ((GeneralPath) shape).lineTo(2.54, 0.59);
        ((GeneralPath) shape).lineTo(2.57, 0.56);
        ((GeneralPath) shape).lineTo(2.6, 0.54);
        ((GeneralPath) shape).lineTo(2.63, 0.52);
        ((GeneralPath) shape).lineTo(2.67, 0.51);
        ((GeneralPath) shape).lineTo(2.7, 0.5);
        ((GeneralPath) shape).lineTo(2.74, 0.49);
        ((GeneralPath) shape).lineTo(2.78, 0.51);
        ((GeneralPath) shape).lineTo(2.82, 0.53);
        ((GeneralPath) shape).lineTo(2.84, 0.56);
        ((GeneralPath) shape).lineTo(2.87, 0.59);
        ((GeneralPath) shape).lineTo(2.9, 0.62);
        ((GeneralPath) shape).lineTo(2.92, 0.65);
        ((GeneralPath) shape).lineTo(2.94, 0.67);
        ((GeneralPath) shape).lineTo(2.97, 0.7);
        ((GeneralPath) shape).lineTo(3.0, 0.73);
        ((GeneralPath) shape).lineTo(3.03, 0.76);
        ((GeneralPath) shape).lineTo(3.05, 0.78);
        ((GeneralPath) shape).lineTo(3.08, 0.8);
        ((GeneralPath) shape).lineTo(3.12, 0.83);
        ((GeneralPath) shape).lineTo(3.15, 0.85);
        ((GeneralPath) shape).lineTo(3.19, 0.86);
        ((GeneralPath) shape).lineTo(3.23, 0.86);
        ((GeneralPath) shape).lineTo(3.27, 0.84);
        ((GeneralPath) shape).lineTo(3.3, 0.83);
        ((GeneralPath) shape).lineTo(3.34, 0.81);
        ((GeneralPath) shape).lineTo(3.5, 0.74);
        ((GeneralPath) shape).lineTo(3.5, 0.54);
        ((GeneralPath) shape).lineTo(3.34, 0.61);
        ((GeneralPath) shape).lineTo(3.3, 0.63);
        ((GeneralPath) shape).lineTo(3.27, 0.65);
        ((GeneralPath) shape).lineTo(3.23, 0.66);
        ((GeneralPath) shape).lineTo(3.19, 0.66);
        ((GeneralPath) shape).lineTo(3.15, 0.65);
        ((GeneralPath) shape).lineTo(3.12, 0.63);
        ((GeneralPath) shape).lineTo(3.08, 0.61);
        ((GeneralPath) shape).lineTo(3.05, 0.58);
        ((GeneralPath) shape).lineTo(3.03, 0.56);
        ((GeneralPath) shape).lineTo(3.0, 0.53);
        ((GeneralPath) shape).lineTo(2.97, 0.51);
        ((GeneralPath) shape).lineTo(2.94, 0.48);
        ((GeneralPath) shape).lineTo(2.92, 0.45);
        ((GeneralPath) shape).lineTo(2.9, 0.42);
        ((GeneralPath) shape).lineTo(2.87, 0.39);
        ((GeneralPath) shape).lineTo(2.84, 0.36);
        ((GeneralPath) shape).lineTo(2.82, 0.33);
        ((GeneralPath) shape).lineTo(2.78, 0.31);
        ((GeneralPath) shape).lineTo(2.74, 0.3);
        ((GeneralPath) shape).lineTo(2.7, 0.3);
        ((GeneralPath) shape).lineTo(2.67, 0.31);
        ((GeneralPath) shape).lineTo(2.63, 0.33);
        ((GeneralPath) shape).lineTo(2.6, 0.35);
        ((GeneralPath) shape).lineTo(2.57, 0.37);
        ((GeneralPath) shape).lineTo(2.54, 0.4);
        ((GeneralPath) shape).lineTo(2.51, 0.42);
        ((GeneralPath) shape).lineTo(2.48, 0.45);
        ((GeneralPath) shape).lineTo(2.46, 0.48);
        ((GeneralPath) shape).lineTo(2.44, 0.51);
        ((GeneralPath) shape).lineTo(2.42, 0.54);
        ((GeneralPath) shape).lineTo(2.39, 0.57);
        ((GeneralPath) shape).lineTo(2.36, 0.6);
        ((GeneralPath) shape).lineTo(2.33, 0.63);
        ((GeneralPath) shape).lineTo(2.3, 0.65);
        ((GeneralPath) shape).lineTo(2.26, 0.67);
        ((GeneralPath) shape).lineTo(2.23, 0.67);
        ((GeneralPath) shape).lineTo(2.19, 0.66);
        ((GeneralPath) shape).lineTo(2.16, 0.64);
        ((GeneralPath) shape).lineTo(2.13, 0.61);
        ((GeneralPath) shape).lineTo(2.1, 0.58);
        ((GeneralPath) shape).lineTo(2.08, 0.55);
        ((GeneralPath) shape).lineTo(2.05, 0.52);
        ((GeneralPath) shape).lineTo(2.03, 0.5);
        ((GeneralPath) shape).lineTo(1.96, 0.62);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.68, 1.07);
        ((GeneralPath) shape).lineTo(1.0, 1.07);
        ((GeneralPath) shape).lineTo(1.36, 1.07);
        ((GeneralPath) shape).lineTo(1.71, 1.07);
        ((GeneralPath) shape).lineTo(1.96, 0.62);
        ((GeneralPath) shape).lineTo(2.03, 0.5);
        ((GeneralPath) shape).lineTo(2.28, 0.05);
        ((GeneralPath) shape).lineTo(1.35, 0.05);
        ((GeneralPath) shape).lineTo(1.35, -0.21);
        ((GeneralPath) shape).lineTo(1.0, -0.21);
        ((GeneralPath) shape).lineTo(1.0, 0.05);
        ((GeneralPath) shape).lineTo(-0.38, 0.06);
        ((GeneralPath) shape).lineTo(-0.38, -0.84);
        ((GeneralPath) shape).lineTo(-1.36, -0.84);
        ((GeneralPath) shape).lineTo(-1.36, 0.05);
        ((GeneralPath) shape).lineTo(-2.04, 0.05);
        ((GeneralPath) shape).lineTo(-1.85, 0.6);
        ((GeneralPath) shape).lineTo(-1.79, 0.76);
        ((GeneralPath) shape).lineTo(-1.68, 1.07);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.0, 1.07);
        ((GeneralPath) shape).lineTo(1.0, 2.24);
        ((GeneralPath) shape).lineTo(-3.5, 2.24);
        ((GeneralPath) shape).lineTo(-3.5, 2.52);
        ((GeneralPath) shape).lineTo(1.0, 2.52);
        ((GeneralPath) shape).lineTo(1.0, 2.69);
        ((GeneralPath) shape).lineTo(1.19, 2.95);
        ((GeneralPath) shape).lineTo(1.36, 2.72);
        ((GeneralPath) shape).lineTo(1.36, 2.52);
        ((GeneralPath) shape).lineTo(3.5, 2.52);
        ((GeneralPath) shape).lineTo(3.5, 2.24);
        ((GeneralPath) shape).lineTo(1.36, 2.24);
        ((GeneralPath) shape).lineTo(1.36, 1.07);
        ((GeneralPath) shape).lineTo(1.0, 1.07);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.85, 0.6);
        ((GeneralPath) shape).lineTo(-1.89, 0.61);
        ((GeneralPath) shape).lineTo(-1.93, 0.63);
        ((GeneralPath) shape).lineTo(-1.96, 0.65);
        ((GeneralPath) shape).lineTo(-2.0, 0.66);
        ((GeneralPath) shape).lineTo(-2.03, 0.66);
        ((GeneralPath) shape).lineTo(-2.07, 0.65);
        ((GeneralPath) shape).lineTo(-2.11, 0.63);
        ((GeneralPath) shape).lineTo(-2.14, 0.61);
        ((GeneralPath) shape).lineTo(-2.17, 0.58);
        ((GeneralPath) shape).lineTo(-2.2, 0.56);
        ((GeneralPath) shape).lineTo(-2.23, 0.53);
        ((GeneralPath) shape).lineTo(-2.26, 0.51);
        ((GeneralPath) shape).lineTo(-2.28, 0.48);
        ((GeneralPath) shape).lineTo(-2.31, 0.45);
        ((GeneralPath) shape).lineTo(-2.33, 0.42);
        ((GeneralPath) shape).lineTo(-2.36, 0.39);
        ((GeneralPath) shape).lineTo(-2.38, 0.36);
        ((GeneralPath) shape).lineTo(-2.41, 0.33);
        ((GeneralPath) shape).lineTo(-2.44, 0.31);
        ((GeneralPath) shape).lineTo(-2.48, 0.3);
        ((GeneralPath) shape).lineTo(-2.52, 0.3);
        ((GeneralPath) shape).lineTo(-2.56, 0.31);
        ((GeneralPath) shape).lineTo(-2.59, 0.33);
        ((GeneralPath) shape).lineTo(-2.63, 0.35);
        ((GeneralPath) shape).lineTo(-2.66, 0.37);
        ((GeneralPath) shape).lineTo(-2.69, 0.4);
        ((GeneralPath) shape).lineTo(-2.72, 0.42);
        ((GeneralPath) shape).lineTo(-2.74, 0.45);
        ((GeneralPath) shape).lineTo(-2.77, 0.48);
        ((GeneralPath) shape).lineTo(-2.79, 0.51);
        ((GeneralPath) shape).lineTo(-2.81, 0.54);
        ((GeneralPath) shape).lineTo(-2.84, 0.57);
        ((GeneralPath) shape).lineTo(-2.87, 0.6);
        ((GeneralPath) shape).lineTo(-2.9, 0.63);
        ((GeneralPath) shape).lineTo(-2.93, 0.65);
        ((GeneralPath) shape).lineTo(-2.96, 0.67);
        ((GeneralPath) shape).lineTo(-3.0, 0.67);
        ((GeneralPath) shape).lineTo(-3.04, 0.66);
        ((GeneralPath) shape).lineTo(-3.07, 0.64);
        ((GeneralPath) shape).lineTo(-3.1, 0.61);
        ((GeneralPath) shape).lineTo(-3.12, 0.58);
        ((GeneralPath) shape).lineTo(-3.15, 0.55);
        ((GeneralPath) shape).lineTo(-3.18, 0.52);
        ((GeneralPath) shape).lineTo(-3.2, 0.49);
        ((GeneralPath) shape).lineTo(-3.23, 0.46);
        ((GeneralPath) shape).lineTo(-3.25, 0.44);
        ((GeneralPath) shape).lineTo(-3.28, 0.41);
        ((GeneralPath) shape).lineTo(-3.31, 0.38);
        ((GeneralPath) shape).lineTo(-3.5, 0.17);
        ((GeneralPath) shape).lineTo(-3.5, 0.36);
        ((GeneralPath) shape).lineTo(-3.33, 0.54);
        ((GeneralPath) shape).lineTo(-3.31, 0.57);
        ((GeneralPath) shape).lineTo(-3.28, 0.6);
        ((GeneralPath) shape).lineTo(-3.25, 0.62);
        ((GeneralPath) shape).lineTo(-3.23, 0.65);
        ((GeneralPath) shape).lineTo(-3.2, 0.68);
        ((GeneralPath) shape).lineTo(-3.18, 0.71);
        ((GeneralPath) shape).lineTo(-3.15, 0.74);
        ((GeneralPath) shape).lineTo(-3.12, 0.77);
        ((GeneralPath) shape).lineTo(-3.1, 0.8);
        ((GeneralPath) shape).lineTo(-3.07, 0.82);
        ((GeneralPath) shape).lineTo(-3.04, 0.85);
        ((GeneralPath) shape).lineTo(-3.0, 0.86);
        ((GeneralPath) shape).lineTo(-2.96, 0.86);
        ((GeneralPath) shape).lineTo(-2.93, 0.84);
        ((GeneralPath) shape).lineTo(-2.9, 0.82);
        ((GeneralPath) shape).lineTo(-2.87, 0.79);
        ((GeneralPath) shape).lineTo(-2.84, 0.76);
        ((GeneralPath) shape).lineTo(-2.81, 0.73);
        ((GeneralPath) shape).lineTo(-2.79, 0.7);
        ((GeneralPath) shape).lineTo(-2.77, 0.67);
        ((GeneralPath) shape).lineTo(-2.74, 0.64);
        ((GeneralPath) shape).lineTo(-2.72, 0.61);
        ((GeneralPath) shape).lineTo(-2.69, 0.58);
        ((GeneralPath) shape).lineTo(-2.66, 0.56);
        ((GeneralPath) shape).lineTo(-2.63, 0.53);
        ((GeneralPath) shape).lineTo(-2.59, 0.52);
        ((GeneralPath) shape).lineTo(-2.56, 0.5);
        ((GeneralPath) shape).lineTo(-2.52, 0.49);
        ((GeneralPath) shape).lineTo(-2.48, 0.49);
        ((GeneralPath) shape).lineTo(-2.44, 0.5);
        ((GeneralPath) shape).lineTo(-2.41, 0.52);
        ((GeneralPath) shape).lineTo(-2.38, 0.55);
        ((GeneralPath) shape).lineTo(-2.36, 0.58);
        ((GeneralPath) shape).lineTo(-2.33, 0.61);
        ((GeneralPath) shape).lineTo(-2.31, 0.64);
        ((GeneralPath) shape).lineTo(-2.28, 0.67);
        ((GeneralPath) shape).lineTo(-2.26, 0.7);
        ((GeneralPath) shape).lineTo(-2.23, 0.72);
        ((GeneralPath) shape).lineTo(-2.2, 0.75);
        ((GeneralPath) shape).lineTo(-2.17, 0.77);
        ((GeneralPath) shape).lineTo(-2.14, 0.8);
        ((GeneralPath) shape).lineTo(-2.11, 0.82);
        ((GeneralPath) shape).lineTo(-2.07, 0.84);
        ((GeneralPath) shape).lineTo(-2.03, 0.85);
        ((GeneralPath) shape).lineTo(-2.0, 0.85);
        ((GeneralPath) shape).lineTo(-1.96, 0.83);
        ((GeneralPath) shape).lineTo(-1.93, 0.82);
        ((GeneralPath) shape).lineTo(-1.89, 0.8);
        ((GeneralPath) shape).lineTo(-1.79, 0.76);
        ((GeneralPath) shape).lineTo(-1.85, 0.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, -3.5);
        ((GeneralPath) shape).lineTo(3.5, 3.5);
        ((GeneralPath) shape).lineTo(-3.5, 3.5);

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

