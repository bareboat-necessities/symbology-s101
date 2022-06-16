

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class NMKINF41 {

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
        shape = new Ellipse2D.Double(-0.5799999833106995, -0.5799999833106995, 1.159999966621399, 1.159999966621399);
        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.55, 0.14);
        ((GeneralPath) shape).lineTo(-0.8, 0.25);
        ((GeneralPath) shape).lineTo(-1.05, 0.36);
        ((GeneralPath) shape).lineTo(-1.1, 0.39);
        ((GeneralPath) shape).lineTo(-1.14, 0.41);
        ((GeneralPath) shape).lineTo(-1.17, 0.43);
        ((GeneralPath) shape).lineTo(-1.23, 0.48);
        ((GeneralPath) shape).lineTo(-1.26, 0.52);
        ((GeneralPath) shape).lineTo(-1.32, 0.58);
        ((GeneralPath) shape).lineTo(-1.37, 0.65);
        ((GeneralPath) shape).lineTo(-1.42, 0.71);
        ((GeneralPath) shape).lineTo(-1.46, 0.76);
        ((GeneralPath) shape).lineTo(-1.49, 0.81);
        ((GeneralPath) shape).lineTo(-1.54, 0.89);
        ((GeneralPath) shape).lineTo(-1.57, 0.96);
        ((GeneralPath) shape).lineTo(-1.59, 1.0);
        ((GeneralPath) shape).lineTo(-1.61, 1.08);
        ((GeneralPath) shape).lineTo(-1.63, 1.15);
        ((GeneralPath) shape).lineTo(-1.64, 1.19);
        ((GeneralPath) shape).lineTo(-1.65, 1.23);
        ((GeneralPath) shape).lineTo(-1.65, 1.31);
        ((GeneralPath) shape).lineTo(-1.65, 1.37);
        ((GeneralPath) shape).lineTo(-1.65, 1.43);
        ((GeneralPath) shape).lineTo(-1.64, 1.48);
        ((GeneralPath) shape).lineTo(-1.63, 1.53);
        ((GeneralPath) shape).lineTo(-1.62, 1.61);
        ((GeneralPath) shape).lineTo(-1.6, 1.66);
        ((GeneralPath) shape).lineTo(-1.56, 1.75);
        ((GeneralPath) shape).lineTo(-1.52, 1.83);
        ((GeneralPath) shape).lineTo(-1.49, 1.88);
        ((GeneralPath) shape).lineTo(-1.47, 1.93);
        ((GeneralPath) shape).lineTo(-1.42, 2.0);
        ((GeneralPath) shape).lineTo(-1.37, 2.06);
        ((GeneralPath) shape).lineTo(-1.31, 2.13);
        ((GeneralPath) shape).lineTo(-1.23, 2.21);
        ((GeneralPath) shape).lineTo(-1.17, 2.27);
        ((GeneralPath) shape).lineTo(-1.12, 2.32);
        ((GeneralPath) shape).lineTo(-1.08, 2.34);
        ((GeneralPath) shape).lineTo(-1.02, 2.38);
        ((GeneralPath) shape).lineTo(-0.99, 2.4);
        ((GeneralPath) shape).lineTo(-0.95, 2.41);
        ((GeneralPath) shape).lineTo(-0.91, 2.42);
        ((GeneralPath) shape).lineTo(-0.88, 2.43);
        ((GeneralPath) shape).lineTo(-0.85, 2.43);
        ((GeneralPath) shape).lineTo(-0.82, 2.42);
        ((GeneralPath) shape).lineTo(-0.76, 2.41);
        ((GeneralPath) shape).lineTo(-0.73, 2.4);
        ((GeneralPath) shape).lineTo(-0.67, 2.37);
        ((GeneralPath) shape).lineTo(-0.61, 2.34);
        ((GeneralPath) shape).lineTo(-0.54, 2.29);
        ((GeneralPath) shape).lineTo(-0.49, 2.26);
        ((GeneralPath) shape).lineTo(-0.46, 2.22);
        ((GeneralPath) shape).lineTo(-0.44, 2.2);
        ((GeneralPath) shape).lineTo(-0.41, 2.16);
        ((GeneralPath) shape).lineTo(-0.4, 2.13);
        ((GeneralPath) shape).lineTo(-0.38, 2.11);
        ((GeneralPath) shape).lineTo(-0.37, 2.06);
        ((GeneralPath) shape).lineTo(-0.36, 2.01);
        ((GeneralPath) shape).lineTo(-0.35, 1.97);
        ((GeneralPath) shape).lineTo(-0.35, 1.9);
        ((GeneralPath) shape).lineTo(-0.35, 1.85);
        ((GeneralPath) shape).lineTo(-0.36, 1.77);
        ((GeneralPath) shape).lineTo(-0.37, 1.69);
        ((GeneralPath) shape).lineTo(-0.39, 1.63);
        ((GeneralPath) shape).lineTo(-0.4, 1.59);
        ((GeneralPath) shape).lineTo(-0.48, 1.41);
        ((GeneralPath) shape).lineTo(-0.49, 1.37);
        ((GeneralPath) shape).lineTo(-0.51, 1.31);
        ((GeneralPath) shape).lineTo(-0.52, 1.27);
        ((GeneralPath) shape).lineTo(-0.52, 1.24);
        ((GeneralPath) shape).lineTo(-0.53, 1.17);
        ((GeneralPath) shape).lineTo(-0.54, 1.11);
        ((GeneralPath) shape).lineTo(-0.54, 1.05);
        ((GeneralPath) shape).lineTo(-0.53, 1.01);
        ((GeneralPath) shape).lineTo(-0.53, 0.96);
        ((GeneralPath) shape).lineTo(-0.52, 0.93);
        ((GeneralPath) shape).lineTo(-0.51, 0.86);
        ((GeneralPath) shape).lineTo(-0.5, 0.82);
        ((GeneralPath) shape).lineTo(-0.48, 0.79);
        ((GeneralPath) shape).lineTo(-0.46, 0.74);
        ((GeneralPath) shape).lineTo(-0.44, 0.72);
        ((GeneralPath) shape).lineTo(-0.42, 0.7);
        ((GeneralPath) shape).lineTo(-0.34, 0.61);
        ((GeneralPath) shape).lineTo(-0.25, 0.51);
        ((GeneralPath) shape).lineTo(-0.31, 0.48);
        ((GeneralPath) shape).lineTo(-0.36, 0.44);
        ((GeneralPath) shape).lineTo(-0.41, 0.4);
        ((GeneralPath) shape).lineTo(-0.45, 0.34);
        ((GeneralPath) shape).lineTo(-0.49, 0.29);
        ((GeneralPath) shape).lineTo(-0.52, 0.23);
        ((GeneralPath) shape).lineTo(-0.55, 0.16);
        ((GeneralPath) shape).lineTo(-0.55, 0.14);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.34, 0.43);
        ((GeneralPath) shape).lineTo(0.52, 0.58);
        ((GeneralPath) shape).lineTo(0.71, 0.72);
        ((GeneralPath) shape).lineTo(0.76, 0.76);
        ((GeneralPath) shape).lineTo(0.8, 0.78);
        ((GeneralPath) shape).lineTo(0.84, 0.8);
        ((GeneralPath) shape).lineTo(0.88, 0.81);
        ((GeneralPath) shape).lineTo(0.95, 0.84);
        ((GeneralPath) shape).lineTo(1.0, 0.85);
        ((GeneralPath) shape).lineTo(1.08, 0.86);
        ((GeneralPath) shape).lineTo(1.16, 0.87);
        ((GeneralPath) shape).lineTo(1.22, 0.88);
        ((GeneralPath) shape).lineTo(1.28, 0.87);
        ((GeneralPath) shape).lineTo(1.33, 0.87);
        ((GeneralPath) shape).lineTo(1.37, 0.86);
        ((GeneralPath) shape).lineTo(1.45, 0.85);
        ((GeneralPath) shape).lineTo(1.51, 0.83);
        ((GeneralPath) shape).lineTo(1.59, 0.8);
        ((GeneralPath) shape).lineTo(1.68, 0.76);
        ((GeneralPath) shape).lineTo(1.75, 0.72);
        ((GeneralPath) shape).lineTo(1.81, 0.69);
        ((GeneralPath) shape).lineTo(1.86, 0.66);
        ((GeneralPath) shape).lineTo(1.94, 0.6);
        ((GeneralPath) shape).lineTo(1.99, 0.56);
        ((GeneralPath) shape).lineTo(2.04, 0.52);
        ((GeneralPath) shape).lineTo(2.1, 0.46);
        ((GeneralPath) shape).lineTo(2.16, 0.39);
        ((GeneralPath) shape).lineTo(2.19, 0.34);
        ((GeneralPath) shape).lineTo(2.23, 0.3);
        ((GeneralPath) shape).lineTo(2.27, 0.23);
        ((GeneralPath) shape).lineTo(2.3, 0.17);
        ((GeneralPath) shape).lineTo(2.34, 0.08);
        ((GeneralPath) shape).lineTo(2.38, -0.01);
        ((GeneralPath) shape).lineTo(2.39, -0.05);
        ((GeneralPath) shape).lineTo(2.4, -0.09);
        ((GeneralPath) shape).lineTo(2.41, -0.15);
        ((GeneralPath) shape).lineTo(2.41, -0.2);
        ((GeneralPath) shape).lineTo(2.41, -0.28);
        ((GeneralPath) shape).lineTo(2.4, -0.35);
        ((GeneralPath) shape).lineTo(2.39, -0.39);
        ((GeneralPath) shape).lineTo(2.38, -0.43);
        ((GeneralPath) shape).lineTo(2.36, -0.49);
        ((GeneralPath) shape).lineTo(2.34, -0.54);
        ((GeneralPath) shape).lineTo(2.32, -0.57);
        ((GeneralPath) shape).lineTo(2.3, -0.6);
        ((GeneralPath) shape).lineTo(2.27, -0.63);
        ((GeneralPath) shape).lineTo(2.24, -0.67);
        ((GeneralPath) shape).lineTo(2.19, -0.7);
        ((GeneralPath) shape).lineTo(2.15, -0.73);
        ((GeneralPath) shape).lineTo(2.12, -0.75);
        ((GeneralPath) shape).lineTo(2.09, -0.76);
        ((GeneralPath) shape).lineTo(2.06, -0.77);
        ((GeneralPath) shape).lineTo(2.01, -0.78);
        ((GeneralPath) shape).lineTo(1.97, -0.78);
        ((GeneralPath) shape).lineTo(1.94, -0.78);
        ((GeneralPath) shape).lineTo(1.9, -0.78);
        ((GeneralPath) shape).lineTo(1.87, -0.77);
        ((GeneralPath) shape).lineTo(1.81, -0.75);
        ((GeneralPath) shape).lineTo(1.76, -0.72);
        ((GeneralPath) shape).lineTo(1.72, -0.7);
        ((GeneralPath) shape).lineTo(1.65, -0.66);
        ((GeneralPath) shape).lineTo(1.6, -0.62);
        ((GeneralPath) shape).lineTo(1.52, -0.56);
        ((GeneralPath) shape).lineTo(1.45, -0.5);
        ((GeneralPath) shape).lineTo(1.43, -0.48);
        ((GeneralPath) shape).lineTo(1.41, -0.46);
        ((GeneralPath) shape).lineTo(1.38, -0.42);
        ((GeneralPath) shape).lineTo(1.34, -0.34);
        ((GeneralPath) shape).lineTo(1.31, -0.28);
        ((GeneralPath) shape).lineTo(1.29, -0.24);
        ((GeneralPath) shape).lineTo(1.27, -0.21);
        ((GeneralPath) shape).lineTo(1.25, -0.19);
        ((GeneralPath) shape).lineTo(1.24, -0.18);
        ((GeneralPath) shape).lineTo(1.21, -0.17);
        ((GeneralPath) shape).lineTo(1.19, -0.16);
        ((GeneralPath) shape).lineTo(0.88, -0.08);
        ((GeneralPath) shape).lineTo(0.57, 0.0);
        ((GeneralPath) shape).lineTo(0.56, 0.07);
        ((GeneralPath) shape).lineTo(0.55, 0.13);
        ((GeneralPath) shape).lineTo(0.52, 0.2);
        ((GeneralPath) shape).lineTo(0.49, 0.26);
        ((GeneralPath) shape).lineTo(0.46, 0.31);
        ((GeneralPath) shape).lineTo(0.41, 0.36);
        ((GeneralPath) shape).lineTo(0.36, 0.41);
        ((GeneralPath) shape).lineTo(0.34, 0.43);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.11, -0.56);
        ((GeneralPath) shape).lineTo(0.13, -0.77);
        ((GeneralPath) shape).lineTo(0.15, -0.98);
        ((GeneralPath) shape).lineTo(0.15, -1.03);
        ((GeneralPath) shape).lineTo(0.14, -1.08);
        ((GeneralPath) shape).lineTo(0.14, -1.12);
        ((GeneralPath) shape).lineTo(0.12, -1.19);
        ((GeneralPath) shape).lineTo(0.11, -1.24);
        ((GeneralPath) shape).lineTo(0.08, -1.32);
        ((GeneralPath) shape).lineTo(0.05, -1.4);
        ((GeneralPath) shape).lineTo(0.02, -1.46);
        ((GeneralPath) shape).lineTo(-0.01, -1.52);
        ((GeneralPath) shape).lineTo(-0.03, -1.56);
        ((GeneralPath) shape).lineTo(-0.08, -1.64);
        ((GeneralPath) shape).lineTo(-0.12, -1.69);
        ((GeneralPath) shape).lineTo(-0.15, -1.73);
        ((GeneralPath) shape).lineTo(-0.2, -1.78);
        ((GeneralPath) shape).lineTo(-0.23, -1.81);
        ((GeneralPath) shape).lineTo(-0.26, -1.84);
        ((GeneralPath) shape).lineTo(-0.3, -1.87);
        ((GeneralPath) shape).lineTo(-0.37, -1.92);
        ((GeneralPath) shape).lineTo(-0.43, -1.95);
        ((GeneralPath) shape).lineTo(-0.49, -1.98);
        ((GeneralPath) shape).lineTo(-0.53, -2.0);
        ((GeneralPath) shape).lineTo(-0.62, -2.03);
        ((GeneralPath) shape).lineTo(-0.68, -2.05);
        ((GeneralPath) shape).lineTo(-0.78, -2.07);
        ((GeneralPath) shape).lineTo(-0.88, -2.09);
        ((GeneralPath) shape).lineTo(-0.94, -2.1);
        ((GeneralPath) shape).lineTo(-0.99, -2.1);
        ((GeneralPath) shape).lineTo(-1.08, -2.1);
        ((GeneralPath) shape).lineTo(-1.15, -2.09);
        ((GeneralPath) shape).lineTo(-1.2, -2.08);
        ((GeneralPath) shape).lineTo(-1.28, -2.07);
        ((GeneralPath) shape).lineTo(-1.35, -2.05);
        ((GeneralPath) shape).lineTo(-1.44, -2.02);
        ((GeneralPath) shape).lineTo(-1.5, -2.0);
        ((GeneralPath) shape).lineTo(-1.55, -1.98);
        ((GeneralPath) shape).lineTo(-1.58, -1.96);
        ((GeneralPath) shape).lineTo(-1.63, -1.92);
        ((GeneralPath) shape).lineTo(-1.65, -1.9);
        ((GeneralPath) shape).lineTo(-1.67, -1.88);
        ((GeneralPath) shape).lineTo(-1.7, -1.85);
        ((GeneralPath) shape).lineTo(-1.73, -1.82);
        ((GeneralPath) shape).lineTo(-1.74, -1.79);
        ((GeneralPath) shape).lineTo(-1.77, -1.74);
        ((GeneralPath) shape).lineTo(-1.78, -1.71);
        ((GeneralPath) shape).lineTo(-1.8, -1.65);
        ((GeneralPath) shape).lineTo(-1.81, -1.6);
        ((GeneralPath) shape).lineTo(-1.82, -1.56);
        ((GeneralPath) shape).lineTo(-1.82, -1.52);
        ((GeneralPath) shape).lineTo(-1.82, -1.48);
        ((GeneralPath) shape).lineTo(-1.82, -1.45);
        ((GeneralPath) shape).lineTo(-1.81, -1.39);
        ((GeneralPath) shape).lineTo(-1.8, -1.35);
        ((GeneralPath) shape).lineTo(-1.78, -1.32);
        ((GeneralPath) shape).lineTo(-1.76, -1.28);
        ((GeneralPath) shape).lineTo(-1.74, -1.26);
        ((GeneralPath) shape).lineTo(-1.72, -1.24);
        ((GeneralPath) shape).lineTo(-1.7, -1.22);
        ((GeneralPath) shape).lineTo(-1.65, -1.18);
        ((GeneralPath) shape).lineTo(-1.61, -1.15);
        ((GeneralPath) shape).lineTo(-1.58, -1.13);
        ((GeneralPath) shape).lineTo(-1.52, -1.1);
        ((GeneralPath) shape).lineTo(-1.47, -1.08);
        ((GeneralPath) shape).lineTo(-1.39, -1.05);
        ((GeneralPath) shape).lineTo(-1.31, -1.03);
        ((GeneralPath) shape).lineTo(-1.27, -1.02);
        ((GeneralPath) shape).lineTo(-1.18, -1.0);
        ((GeneralPath) shape).lineTo(-1.05, -0.98);
        ((GeneralPath) shape).lineTo(-0.99, -0.97);
        ((GeneralPath) shape).lineTo(-0.95, -0.96);
        ((GeneralPath) shape).lineTo(-0.92, -0.95);
        ((GeneralPath) shape).lineTo(-0.87, -0.92);
        ((GeneralPath) shape).lineTo(-0.79, -0.88);
        ((GeneralPath) shape).lineTo(-0.72, -0.84);
        ((GeneralPath) shape).lineTo(-0.68, -0.8);
        ((GeneralPath) shape).lineTo(-0.65, -0.78);
        ((GeneralPath) shape).lineTo(-0.6, -0.74);
        ((GeneralPath) shape).lineTo(-0.56, -0.69);
        ((GeneralPath) shape).lineTo(-0.46, -0.56);
        ((GeneralPath) shape).lineTo(-0.36, -0.44);
        ((GeneralPath) shape).lineTo(-0.36, -0.43);
        ((GeneralPath) shape).lineTo(-0.31, -0.47);
        ((GeneralPath) shape).lineTo(-0.25, -0.51);
        ((GeneralPath) shape).lineTo(-0.19, -0.53);
        ((GeneralPath) shape).lineTo(-0.12, -0.55);
        ((GeneralPath) shape).lineTo(-0.05, -0.56);
        ((GeneralPath) shape).lineTo(0.01, -0.56);
        ((GeneralPath) shape).lineTo(0.08, -0.56);
        ((GeneralPath) shape).lineTo(0.11, -0.55);
        ((GeneralPath) shape).lineTo(0.1, -0.53);
        ((GeneralPath) shape).lineTo(0.11, -0.56);
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

