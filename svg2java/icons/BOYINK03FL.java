

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYINK03FL {

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
        g.transform(new AffineTransform(3.774441f, 0, 0, 3.774441f, 27.666653f, 44.42672f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.26, -0.95);
        ((GeneralPath) shape).lineTo(-1.95, -0.5);
        ((GeneralPath) shape).lineTo(-1.95, 0.0);
        ((GeneralPath) shape).lineTo(1.95, 0.0);
        ((GeneralPath) shape).lineTo(1.95, -0.5);
        ((GeneralPath) shape).lineTo(1.33, -0.95);
        ((GeneralPath) shape).lineTo(1.39, -1.04);
        ((GeneralPath) shape).lineTo(1.44, -1.14);
        ((GeneralPath) shape).lineTo(1.48, -1.25);
        ((GeneralPath) shape).lineTo(1.51, -1.35);
        ((GeneralPath) shape).lineTo(1.54, -1.46);
        ((GeneralPath) shape).lineTo(1.56, -1.57);
        ((GeneralPath) shape).lineTo(1.57, -1.68);
        ((GeneralPath) shape).lineTo(1.57, -1.79);
        ((GeneralPath) shape).lineTo(1.56, -1.9);
        ((GeneralPath) shape).lineTo(1.55, -2.01);
        ((GeneralPath) shape).lineTo(1.52, -2.12);
        ((GeneralPath) shape).lineTo(1.49, -2.22);
        ((GeneralPath) shape).lineTo(1.46, -2.33);
        ((GeneralPath) shape).lineTo(1.41, -2.43);
        ((GeneralPath) shape).lineTo(1.36, -2.53);
        ((GeneralPath) shape).lineTo(1.3, -2.62);
        ((GeneralPath) shape).lineTo(1.24, -2.71);
        ((GeneralPath) shape).lineTo(1.16, -2.79);
        ((GeneralPath) shape).lineTo(1.09, -2.87);
        ((GeneralPath) shape).lineTo(1.0, -2.94);
        ((GeneralPath) shape).lineTo(0.92, -3.01);
        ((GeneralPath) shape).lineTo(0.82, -3.07);
        ((GeneralPath) shape).lineTo(0.73, -3.12);
        ((GeneralPath) shape).lineTo(0.62, -3.17);
        ((GeneralPath) shape).lineTo(0.52, -3.21);
        ((GeneralPath) shape).lineTo(0.41, -3.24);
        ((GeneralPath) shape).lineTo(0.31, -3.26);
        ((GeneralPath) shape).lineTo(0.2, -3.28);
        ((GeneralPath) shape).lineTo(0.09, -3.29);
        ((GeneralPath) shape).lineTo(-0.02, -3.29);
        ((GeneralPath) shape).lineTo(-0.13, -3.28);
        ((GeneralPath) shape).lineTo(-0.24, -3.26);
        ((GeneralPath) shape).lineTo(-0.35, -3.24);
        ((GeneralPath) shape).lineTo(-0.46, -3.21);
        ((GeneralPath) shape).lineTo(-0.56, -3.17);
        ((GeneralPath) shape).lineTo(-0.66, -3.12);
        ((GeneralPath) shape).lineTo(-0.76, -3.06);
        ((GeneralPath) shape).lineTo(-0.85, -3.0);
        ((GeneralPath) shape).lineTo(-0.94, -2.94);
        ((GeneralPath) shape).lineTo(-1.02, -2.86);
        ((GeneralPath) shape).lineTo(-1.1, -2.78);
        ((GeneralPath) shape).lineTo(-1.17, -2.7);
        ((GeneralPath) shape).lineTo(-1.23, -2.61);
        ((GeneralPath) shape).lineTo(-1.29, -2.52);
        ((GeneralPath) shape).lineTo(-1.34, -2.42);
        ((GeneralPath) shape).lineTo(-1.39, -2.32);
        ((GeneralPath) shape).lineTo(-1.42, -2.21);
        ((GeneralPath) shape).lineTo(-1.45, -2.1);
        ((GeneralPath) shape).lineTo(-1.47, -2.0);
        ((GeneralPath) shape).lineTo(-1.49, -1.89);
        ((GeneralPath) shape).lineTo(-1.49, -1.78);
        ((GeneralPath) shape).lineTo(-1.49, -1.67);
        ((GeneralPath) shape).lineTo(-1.48, -1.56);
        ((GeneralPath) shape).lineTo(-1.46, -1.45);
        ((GeneralPath) shape).lineTo(-1.43, -1.34);
        ((GeneralPath) shape).lineTo(-1.4, -1.23);
        ((GeneralPath) shape).lineTo(-1.36, -1.13);
        ((GeneralPath) shape).lineTo(-1.31, -1.03);
        ((GeneralPath) shape).lineTo(-1.26, -0.95);
        ((GeneralPath) shape).closePath();

        g.setPaint(RED);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.92, -4.0);
        ((GeneralPath) shape).lineTo(0.0, -5.6);
        ((GeneralPath) shape).lineTo(0.93, -4.0);
        ((GeneralPath) shape).lineTo(-0.92, -4.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00D400));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.87, -1.84);
        ((GeneralPath) shape).lineTo(0.0, -7.37);
        ((GeneralPath) shape).lineTo(3.88, -1.84);
        ((GeneralPath) shape).lineTo(0.0, 3.69);
        ((GeneralPath) shape).lineTo(-3.87, -1.84);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.99, -9.12);
        ((GeneralPath) shape).lineTo(-6.06, -9.12);
        ((GeneralPath) shape).lineTo(-6.14, -9.13);
        ((GeneralPath) shape).lineTo(-6.21, -9.14);
        ((GeneralPath) shape).lineTo(-6.29, -9.16);
        ((GeneralPath) shape).lineTo(-6.36, -9.19);
        ((GeneralPath) shape).lineTo(-6.43, -9.22);
        ((GeneralPath) shape).lineTo(-6.49, -9.26);
        ((GeneralPath) shape).lineTo(-6.55, -9.31);
        ((GeneralPath) shape).lineTo(-6.59, -9.34);
        ((GeneralPath) shape).lineTo(-6.63, -9.37);
        ((GeneralPath) shape).lineTo(-6.66, -9.41);
        ((GeneralPath) shape).lineTo(-6.69, -9.45);
        ((GeneralPath) shape).lineTo(-6.72, -9.48);
        ((GeneralPath) shape).lineTo(-6.75, -9.53);
        ((GeneralPath) shape).lineTo(-6.77, -9.57);
        ((GeneralPath) shape).lineTo(-6.8, -9.61);
        ((GeneralPath) shape).lineTo(-6.83, -9.69);
        ((GeneralPath) shape).lineTo(-6.86, -9.77);
        ((GeneralPath) shape).lineTo(-6.88, -9.85);
        ((GeneralPath) shape).lineTo(-6.9, -9.94);
        ((GeneralPath) shape).lineTo(-6.91, -10.02);
        ((GeneralPath) shape).lineTo(-6.92, -10.11);
        ((GeneralPath) shape).lineTo(-6.93, -10.19);
        ((GeneralPath) shape).lineTo(-6.93, -10.28);
        ((GeneralPath) shape).lineTo(-6.93, -10.36);
        ((GeneralPath) shape).lineTo(-7.32, -10.37);
        ((GeneralPath) shape).lineTo(-7.32, -10.28);
        ((GeneralPath) shape).lineTo(-7.32, -10.18);
        ((GeneralPath) shape).lineTo(-7.32, -10.09);
        ((GeneralPath) shape).lineTo(-7.31, -10.0);
        ((GeneralPath) shape).lineTo(-7.3, -9.91);
        ((GeneralPath) shape).lineTo(-7.29, -9.84);
        ((GeneralPath) shape).lineTo(-7.27, -9.77);
        ((GeneralPath) shape).lineTo(-7.25, -9.7);
        ((GeneralPath) shape).lineTo(-7.23, -9.64);
        ((GeneralPath) shape).lineTo(-7.21, -9.57);
        ((GeneralPath) shape).lineTo(-7.18, -9.51);
        ((GeneralPath) shape).lineTo(-7.15, -9.44);
        ((GeneralPath) shape).lineTo(-7.12, -9.38);
        ((GeneralPath) shape).lineTo(-7.08, -9.33);
        ((GeneralPath) shape).lineTo(-7.04, -9.27);
        ((GeneralPath) shape).lineTo(-7.0, -9.22);
        ((GeneralPath) shape).lineTo(-6.95, -9.17);
        ((GeneralPath) shape).lineTo(-6.9, -9.12);
        ((GeneralPath) shape).lineTo(-6.85, -9.07);
        ((GeneralPath) shape).lineTo(-6.79, -9.03);
        ((GeneralPath) shape).lineTo(-6.74, -8.99);
        ((GeneralPath) shape).lineTo(-6.68, -8.95);
        ((GeneralPath) shape).lineTo(-6.62, -8.92);
        ((GeneralPath) shape).lineTo(-6.55, -8.89);
        ((GeneralPath) shape).lineTo(-6.49, -8.87);
        ((GeneralPath) shape).lineTo(-6.43, -8.85);
        ((GeneralPath) shape).lineTo(-6.37, -8.83);
        ((GeneralPath) shape).lineTo(-6.3, -8.82);
        ((GeneralPath) shape).lineTo(-6.24, -8.81);
        ((GeneralPath) shape).lineTo(-6.18, -8.8);
        ((GeneralPath) shape).lineTo(-6.11, -8.79);
        ((GeneralPath) shape).lineTo(-6.05, -8.79);
        ((GeneralPath) shape).lineTo(-5.99, -8.79);
        ((GeneralPath) shape).lineTo(-5.99, -9.12);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.99, -8.79);
        ((GeneralPath) shape).lineTo(-5.92, -8.79);
        ((GeneralPath) shape).lineTo(-5.85, -8.79);
        ((GeneralPath) shape).lineTo(-5.78, -8.8);
        ((GeneralPath) shape).lineTo(-5.71, -8.81);
        ((GeneralPath) shape).lineTo(-5.61, -8.83);
        ((GeneralPath) shape).lineTo(-5.52, -8.85);
        ((GeneralPath) shape).lineTo(-5.43, -8.88);
        ((GeneralPath) shape).lineTo(-5.35, -8.92);
        ((GeneralPath) shape).lineTo(-5.26, -8.97);
        ((GeneralPath) shape).lineTo(-5.18, -9.02);
        ((GeneralPath) shape).lineTo(-5.11, -9.08);
        ((GeneralPath) shape).lineTo(-5.04, -9.15);
        ((GeneralPath) shape).lineTo(-4.97, -9.23);
        ((GeneralPath) shape).lineTo(-4.91, -9.31);
        ((GeneralPath) shape).lineTo(-4.85, -9.4);
        ((GeneralPath) shape).lineTo(-4.8, -9.5);
        ((GeneralPath) shape).lineTo(-4.76, -9.6);
        ((GeneralPath) shape).lineTo(-4.72, -9.7);
        ((GeneralPath) shape).lineTo(-4.7, -9.8);
        ((GeneralPath) shape).lineTo(-4.68, -9.91);
        ((GeneralPath) shape).lineTo(-4.67, -10.0);
        ((GeneralPath) shape).lineTo(-4.66, -10.09);
        ((GeneralPath) shape).lineTo(-4.65, -10.18);
        ((GeneralPath) shape).lineTo(-5.05, -10.19);
        ((GeneralPath) shape).lineTo(-5.05, -10.11);
        ((GeneralPath) shape).lineTo(-5.06, -10.02);
        ((GeneralPath) shape).lineTo(-5.08, -9.94);
        ((GeneralPath) shape).lineTo(-5.09, -9.85);
        ((GeneralPath) shape).lineTo(-5.12, -9.77);
        ((GeneralPath) shape).lineTo(-5.15, -9.69);
        ((GeneralPath) shape).lineTo(-5.18, -9.61);
        ((GeneralPath) shape).lineTo(-5.2, -9.57);
        ((GeneralPath) shape).lineTo(-5.22, -9.53);
        ((GeneralPath) shape).lineTo(-5.25, -9.48);
        ((GeneralPath) shape).lineTo(-5.28, -9.44);
        ((GeneralPath) shape).lineTo(-5.31, -9.41);
        ((GeneralPath) shape).lineTo(-5.35, -9.37);
        ((GeneralPath) shape).lineTo(-5.38, -9.34);
        ((GeneralPath) shape).lineTo(-5.42, -9.31);
        ((GeneralPath) shape).lineTo(-5.46, -9.28);
        ((GeneralPath) shape).lineTo(-5.5, -9.25);
        ((GeneralPath) shape).lineTo(-5.54, -9.22);
        ((GeneralPath) shape).lineTo(-5.59, -9.2);
        ((GeneralPath) shape).lineTo(-5.63, -9.18);
        ((GeneralPath) shape).lineTo(-5.68, -9.17);
        ((GeneralPath) shape).lineTo(-5.73, -9.15);
        ((GeneralPath) shape).lineTo(-5.77, -9.14);
        ((GeneralPath) shape).lineTo(-5.83, -9.13);
        ((GeneralPath) shape).lineTo(-5.88, -9.12);
        ((GeneralPath) shape).lineTo(-5.93, -9.12);
        ((GeneralPath) shape).lineTo(-5.99, -9.12);
        ((GeneralPath) shape).lineTo(-5.99, -8.79);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.99, -11.43);
        ((GeneralPath) shape).lineTo(-5.91, -11.43);
        ((GeneralPath) shape).lineTo(-5.83, -11.42);
        ((GeneralPath) shape).lineTo(-5.76, -11.41);
        ((GeneralPath) shape).lineTo(-5.69, -11.39);
        ((GeneralPath) shape).lineTo(-5.61, -11.36);
        ((GeneralPath) shape).lineTo(-5.54, -11.33);
        ((GeneralPath) shape).lineTo(-5.48, -11.29);
        ((GeneralPath) shape).lineTo(-5.42, -11.24);
        ((GeneralPath) shape).lineTo(-5.38, -11.21);
        ((GeneralPath) shape).lineTo(-5.34, -11.18);
        ((GeneralPath) shape).lineTo(-5.31, -11.14);
        ((GeneralPath) shape).lineTo(-5.28, -11.11);
        ((GeneralPath) shape).lineTo(-5.25, -11.07);
        ((GeneralPath) shape).lineTo(-5.22, -11.03);
        ((GeneralPath) shape).lineTo(-5.2, -10.98);
        ((GeneralPath) shape).lineTo(-5.18, -10.94);
        ((GeneralPath) shape).lineTo(-5.15, -10.86);
        ((GeneralPath) shape).lineTo(-5.12, -10.78);
        ((GeneralPath) shape).lineTo(-5.09, -10.7);
        ((GeneralPath) shape).lineTo(-5.08, -10.62);
        ((GeneralPath) shape).lineTo(-5.06, -10.53);
        ((GeneralPath) shape).lineTo(-5.05, -10.45);
        ((GeneralPath) shape).lineTo(-5.05, -10.36);
        ((GeneralPath) shape).lineTo(-5.05, -10.28);
        ((GeneralPath) shape).lineTo(-5.05, -10.19);
        ((GeneralPath) shape).lineTo(-4.65, -10.18);
        ((GeneralPath) shape).lineTo(-4.65, -10.28);
        ((GeneralPath) shape).lineTo(-4.65, -10.37);
        ((GeneralPath) shape).lineTo(-4.66, -10.46);
        ((GeneralPath) shape).lineTo(-4.67, -10.55);
        ((GeneralPath) shape).lineTo(-4.68, -10.65);
        ((GeneralPath) shape).lineTo(-4.69, -10.72);
        ((GeneralPath) shape).lineTo(-4.7, -10.79);
        ((GeneralPath) shape).lineTo(-4.72, -10.86);
        ((GeneralPath) shape).lineTo(-4.74, -10.92);
        ((GeneralPath) shape).lineTo(-4.77, -10.99);
        ((GeneralPath) shape).lineTo(-4.8, -11.06);
        ((GeneralPath) shape).lineTo(-4.83, -11.12);
        ((GeneralPath) shape).lineTo(-4.87, -11.18);
        ((GeneralPath) shape).lineTo(-4.92, -11.27);
        ((GeneralPath) shape).lineTo(-4.99, -11.35);
        ((GeneralPath) shape).lineTo(-5.06, -11.42);
        ((GeneralPath) shape).lineTo(-5.13, -11.49);
        ((GeneralPath) shape).lineTo(-5.21, -11.55);
        ((GeneralPath) shape).lineTo(-5.3, -11.6);
        ((GeneralPath) shape).lineTo(-5.39, -11.65);
        ((GeneralPath) shape).lineTo(-5.48, -11.69);
        ((GeneralPath) shape).lineTo(-5.54, -11.71);
        ((GeneralPath) shape).lineTo(-5.61, -11.72);
        ((GeneralPath) shape).lineTo(-5.67, -11.74);
        ((GeneralPath) shape).lineTo(-5.73, -11.75);
        ((GeneralPath) shape).lineTo(-5.79, -11.76);
        ((GeneralPath) shape).lineTo(-5.86, -11.76);
        ((GeneralPath) shape).lineTo(-5.92, -11.76);
        ((GeneralPath) shape).lineTo(-5.99, -11.76);
        ((GeneralPath) shape).lineTo(-5.99, -11.43);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.99, -11.76);
        ((GeneralPath) shape).lineTo(-6.06, -11.76);
        ((GeneralPath) shape).lineTo(-6.13, -11.76);
        ((GeneralPath) shape).lineTo(-6.2, -11.76);
        ((GeneralPath) shape).lineTo(-6.27, -11.75);
        ((GeneralPath) shape).lineTo(-6.36, -11.73);
        ((GeneralPath) shape).lineTo(-6.45, -11.7);
        ((GeneralPath) shape).lineTo(-6.54, -11.67);
        ((GeneralPath) shape).lineTo(-6.63, -11.63);
        ((GeneralPath) shape).lineTo(-6.71, -11.58);
        ((GeneralPath) shape).lineTo(-6.79, -11.52);
        ((GeneralPath) shape).lineTo(-6.86, -11.47);
        ((GeneralPath) shape).lineTo(-6.93, -11.4);
        ((GeneralPath) shape).lineTo(-7.0, -11.32);
        ((GeneralPath) shape).lineTo(-7.07, -11.24);
        ((GeneralPath) shape).lineTo(-7.13, -11.15);
        ((GeneralPath) shape).lineTo(-7.18, -11.05);
        ((GeneralPath) shape).lineTo(-7.22, -10.95);
        ((GeneralPath) shape).lineTo(-7.25, -10.85);
        ((GeneralPath) shape).lineTo(-7.28, -10.75);
        ((GeneralPath) shape).lineTo(-7.3, -10.65);
        ((GeneralPath) shape).lineTo(-7.31, -10.55);
        ((GeneralPath) shape).lineTo(-7.32, -10.46);
        ((GeneralPath) shape).lineTo(-7.32, -10.37);
        ((GeneralPath) shape).lineTo(-6.93, -10.36);
        ((GeneralPath) shape).lineTo(-6.92, -10.45);
        ((GeneralPath) shape).lineTo(-6.91, -10.53);
        ((GeneralPath) shape).lineTo(-6.9, -10.62);
        ((GeneralPath) shape).lineTo(-6.88, -10.7);
        ((GeneralPath) shape).lineTo(-6.86, -10.78);
        ((GeneralPath) shape).lineTo(-6.83, -10.86);
        ((GeneralPath) shape).lineTo(-6.8, -10.94);
        ((GeneralPath) shape).lineTo(-6.77, -10.98);
        ((GeneralPath) shape).lineTo(-6.75, -11.03);
        ((GeneralPath) shape).lineTo(-6.72, -11.07);
        ((GeneralPath) shape).lineTo(-6.69, -11.11);
        ((GeneralPath) shape).lineTo(-6.66, -11.14);
        ((GeneralPath) shape).lineTo(-6.63, -11.18);
        ((GeneralPath) shape).lineTo(-6.59, -11.21);
        ((GeneralPath) shape).lineTo(-6.55, -11.25);
        ((GeneralPath) shape).lineTo(-6.52, -11.27);
        ((GeneralPath) shape).lineTo(-6.47, -11.3);
        ((GeneralPath) shape).lineTo(-6.43, -11.33);
        ((GeneralPath) shape).lineTo(-6.39, -11.35);
        ((GeneralPath) shape).lineTo(-6.34, -11.37);
        ((GeneralPath) shape).lineTo(-6.3, -11.39);
        ((GeneralPath) shape).lineTo(-6.25, -11.4);
        ((GeneralPath) shape).lineTo(-6.2, -11.41);
        ((GeneralPath) shape).lineTo(-6.15, -11.42);
        ((GeneralPath) shape).lineTo(-6.09, -11.43);
        ((GeneralPath) shape).lineTo(-6.04, -11.43);
        ((GeneralPath) shape).lineTo(-5.99, -11.43);
        ((GeneralPath) shape).lineTo(-5.99, -11.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.35, -11.71);
        ((GeneralPath) shape).lineTo(-3.42, -11.72);
        ((GeneralPath) shape).lineTo(-3.5, -11.73);
        ((GeneralPath) shape).lineTo(-3.58, -11.73);
        ((GeneralPath) shape).lineTo(-3.66, -11.73);
        ((GeneralPath) shape).lineTo(-3.71, -11.73);
        ((GeneralPath) shape).lineTo(-3.77, -11.72);
        ((GeneralPath) shape).lineTo(-3.83, -11.7);
        ((GeneralPath) shape).lineTo(-3.88, -11.68);
        ((GeneralPath) shape).lineTo(-3.92, -11.65);
        ((GeneralPath) shape).lineTo(-3.96, -11.62);
        ((GeneralPath) shape).lineTo(-3.99, -11.58);
        ((GeneralPath) shape).lineTo(-4.02, -11.54);
        ((GeneralPath) shape).lineTo(-4.04, -11.5);
        ((GeneralPath) shape).lineTo(-4.06, -11.46);
        ((GeneralPath) shape).lineTo(-4.07, -11.42);
        ((GeneralPath) shape).lineTo(-4.08, -11.38);
        ((GeneralPath) shape).lineTo(-4.09, -11.34);
        ((GeneralPath) shape).lineTo(-4.09, -11.3);
        ((GeneralPath) shape).lineTo(-4.09, -11.26);
        ((GeneralPath) shape).lineTo(-4.09, -11.22);
        ((GeneralPath) shape).lineTo(-4.09, -10.92);
        ((GeneralPath) shape).lineTo(-4.46, -10.92);
        ((GeneralPath) shape).lineTo(-4.46, -10.65);
        ((GeneralPath) shape).lineTo(-4.09, -10.65);
        ((GeneralPath) shape).lineTo(-4.09, -8.87);
        ((GeneralPath) shape).lineTo(-3.74, -8.87);
        ((GeneralPath) shape).lineTo(-3.74, -10.65);
        ((GeneralPath) shape).lineTo(-3.35, -10.65);
        ((GeneralPath) shape).lineTo(-3.35, -10.92);
        ((GeneralPath) shape).lineTo(-3.74, -10.92);
        ((GeneralPath) shape).lineTo(-3.74, -11.09);
        ((GeneralPath) shape).lineTo(-3.74, -11.14);
        ((GeneralPath) shape).lineTo(-3.74, -11.19);
        ((GeneralPath) shape).lineTo(-3.74, -11.23);
        ((GeneralPath) shape).lineTo(-3.73, -11.28);
        ((GeneralPath) shape).lineTo(-3.72, -11.3);
        ((GeneralPath) shape).lineTo(-3.7, -11.33);
        ((GeneralPath) shape).lineTo(-3.69, -11.35);
        ((GeneralPath) shape).lineTo(-3.67, -11.36);
        ((GeneralPath) shape).lineTo(-3.63, -11.39);
        ((GeneralPath) shape).lineTo(-3.58, -11.4);
        ((GeneralPath) shape).lineTo(-3.54, -11.41);
        ((GeneralPath) shape).lineTo(-3.49, -11.42);
        ((GeneralPath) shape).lineTo(-3.39, -11.41);
        ((GeneralPath) shape).lineTo(-3.35, -11.4);
        ((GeneralPath) shape).lineTo(-3.35, -11.71);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.26, -11.71);
        ((GeneralPath) shape).lineTo(-2.33, -11.72);
        ((GeneralPath) shape).lineTo(-2.41, -11.73);
        ((GeneralPath) shape).lineTo(-2.49, -11.73);
        ((GeneralPath) shape).lineTo(-2.57, -11.73);
        ((GeneralPath) shape).lineTo(-2.62, -11.73);
        ((GeneralPath) shape).lineTo(-2.68, -11.72);
        ((GeneralPath) shape).lineTo(-2.73, -11.7);
        ((GeneralPath) shape).lineTo(-2.79, -11.68);
        ((GeneralPath) shape).lineTo(-2.83, -11.65);
        ((GeneralPath) shape).lineTo(-2.87, -11.62);
        ((GeneralPath) shape).lineTo(-2.9, -11.58);
        ((GeneralPath) shape).lineTo(-2.93, -11.54);
        ((GeneralPath) shape).lineTo(-2.95, -11.5);
        ((GeneralPath) shape).lineTo(-2.96, -11.46);
        ((GeneralPath) shape).lineTo(-2.98, -11.42);
        ((GeneralPath) shape).lineTo(-2.99, -11.38);
        ((GeneralPath) shape).lineTo(-2.99, -11.34);
        ((GeneralPath) shape).lineTo(-3.0, -11.3);
        ((GeneralPath) shape).lineTo(-3.0, -11.26);
        ((GeneralPath) shape).lineTo(-3.0, -11.22);
        ((GeneralPath) shape).lineTo(-3.0, -10.92);
        ((GeneralPath) shape).lineTo(-3.37, -10.92);
        ((GeneralPath) shape).lineTo(-3.37, -10.65);
        ((GeneralPath) shape).lineTo(-3.0, -10.65);
        ((GeneralPath) shape).lineTo(-3.0, -8.87);
        ((GeneralPath) shape).lineTo(-2.65, -8.87);
        ((GeneralPath) shape).lineTo(-2.65, -10.65);
        ((GeneralPath) shape).lineTo(-2.26, -10.65);
        ((GeneralPath) shape).lineTo(-2.26, -10.92);
        ((GeneralPath) shape).lineTo(-2.65, -10.92);
        ((GeneralPath) shape).lineTo(-2.65, -11.09);
        ((GeneralPath) shape).lineTo(-2.65, -11.14);
        ((GeneralPath) shape).lineTo(-2.65, -11.19);
        ((GeneralPath) shape).lineTo(-2.65, -11.23);
        ((GeneralPath) shape).lineTo(-2.64, -11.28);
        ((GeneralPath) shape).lineTo(-2.63, -11.3);
        ((GeneralPath) shape).lineTo(-2.61, -11.33);
        ((GeneralPath) shape).lineTo(-2.59, -11.35);
        ((GeneralPath) shape).lineTo(-2.57, -11.36);
        ((GeneralPath) shape).lineTo(-2.53, -11.39);
        ((GeneralPath) shape).lineTo(-2.49, -11.4);
        ((GeneralPath) shape).lineTo(-2.45, -11.41);
        ((GeneralPath) shape).lineTo(-2.4, -11.42);
        ((GeneralPath) shape).lineTo(-2.29, -11.41);
        ((GeneralPath) shape).lineTo(-2.26, -11.4);
        ((GeneralPath) shape).lineTo(-2.26, -11.71);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.88, -10.87);
        ((GeneralPath) shape).lineTo(0.88, -10.81);
        ((GeneralPath) shape).lineTo(0.87, -10.76);
        ((GeneralPath) shape).lineTo(0.86, -10.7);
        ((GeneralPath) shape).lineTo(0.84, -10.65);
        ((GeneralPath) shape).lineTo(0.83, -10.61);
        ((GeneralPath) shape).lineTo(0.8, -10.58);
        ((GeneralPath) shape).lineTo(0.78, -10.55);
        ((GeneralPath) shape).lineTo(0.75, -10.52);
        ((GeneralPath) shape).lineTo(0.72, -10.49);
        ((GeneralPath) shape).lineTo(0.68, -10.47);
        ((GeneralPath) shape).lineTo(0.65, -10.45);
        ((GeneralPath) shape).lineTo(0.61, -10.43);
        ((GeneralPath) shape).lineTo(0.56, -10.42);
        ((GeneralPath) shape).lineTo(0.51, -10.41);
        ((GeneralPath) shape).lineTo(0.46, -10.4);
        ((GeneralPath) shape).lineTo(0.41, -10.4);
        ((GeneralPath) shape).lineTo(0.23, -10.39);
        ((GeneralPath) shape).lineTo(-0.47, -10.39);
        ((GeneralPath) shape).lineTo(-0.47, -10.06);
        ((GeneralPath) shape).lineTo(0.16, -10.06);
        ((GeneralPath) shape).lineTo(0.28, -10.06);
        ((GeneralPath) shape).lineTo(0.39, -10.06);
        ((GeneralPath) shape).lineTo(0.51, -10.06);
        ((GeneralPath) shape).lineTo(0.62, -10.08);
        ((GeneralPath) shape).lineTo(0.67, -10.08);
        ((GeneralPath) shape).lineTo(0.72, -10.1);
        ((GeneralPath) shape).lineTo(0.77, -10.11);
        ((GeneralPath) shape).lineTo(0.81, -10.13);
        ((GeneralPath) shape).lineTo(0.86, -10.15);
        ((GeneralPath) shape).lineTo(0.9, -10.17);
        ((GeneralPath) shape).lineTo(0.95, -10.2);
        ((GeneralPath) shape).lineTo(0.99, -10.23);
        ((GeneralPath) shape).lineTo(1.02, -10.26);
        ((GeneralPath) shape).lineTo(1.06, -10.3);
        ((GeneralPath) shape).lineTo(1.09, -10.33);
        ((GeneralPath) shape).lineTo(1.13, -10.37);
        ((GeneralPath) shape).lineTo(1.15, -10.41);
        ((GeneralPath) shape).lineTo(1.18, -10.46);
        ((GeneralPath) shape).lineTo(1.2, -10.5);
        ((GeneralPath) shape).lineTo(1.22, -10.55);
        ((GeneralPath) shape).lineTo(1.25, -10.63);
        ((GeneralPath) shape).lineTo(1.26, -10.71);
        ((GeneralPath) shape).lineTo(1.27, -10.79);
        ((GeneralPath) shape).lineTo(1.28, -10.88);
        ((GeneralPath) shape).lineTo(0.88, -10.87);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.28, -10.88);
        ((GeneralPath) shape).lineTo(1.27, -10.97);
        ((GeneralPath) shape).lineTo(1.26, -11.06);
        ((GeneralPath) shape).lineTo(1.25, -11.12);
        ((GeneralPath) shape).lineTo(1.23, -11.18);
        ((GeneralPath) shape).lineTo(1.21, -11.24);
        ((GeneralPath) shape).lineTo(1.18, -11.29);
        ((GeneralPath) shape).lineTo(1.15, -11.35);
        ((GeneralPath) shape).lineTo(1.12, -11.4);
        ((GeneralPath) shape).lineTo(1.08, -11.45);
        ((GeneralPath) shape).lineTo(1.03, -11.49);
        ((GeneralPath) shape).lineTo(0.99, -11.53);
        ((GeneralPath) shape).lineTo(0.94, -11.56);
        ((GeneralPath) shape).lineTo(0.89, -11.59);
        ((GeneralPath) shape).lineTo(0.83, -11.62);
        ((GeneralPath) shape).lineTo(0.78, -11.64);
        ((GeneralPath) shape).lineTo(0.72, -11.65);
        ((GeneralPath) shape).lineTo(0.66, -11.67);
        ((GeneralPath) shape).lineTo(0.6, -11.68);
        ((GeneralPath) shape).lineTo(0.49, -11.68);
        ((GeneralPath) shape).lineTo(0.37, -11.69);
        ((GeneralPath) shape).lineTo(0.25, -11.69);
        ((GeneralPath) shape).lineTo(0.14, -11.69);
        ((GeneralPath) shape).lineTo(-0.86, -11.69);
        ((GeneralPath) shape).lineTo(-0.86, -8.87);
        ((GeneralPath) shape).lineTo(-0.47, -8.87);
        ((GeneralPath) shape).lineTo(-0.47, -10.06);
        ((GeneralPath) shape).lineTo(-0.47, -10.39);
        ((GeneralPath) shape).lineTo(-0.47, -11.34);
        ((GeneralPath) shape).lineTo(0.26, -11.34);
        ((GeneralPath) shape).lineTo(0.38, -11.34);
        ((GeneralPath) shape).lineTo(0.49, -11.33);
        ((GeneralPath) shape).lineTo(0.55, -11.32);
        ((GeneralPath) shape).lineTo(0.6, -11.31);
        ((GeneralPath) shape).lineTo(0.65, -11.29);
        ((GeneralPath) shape).lineTo(0.7, -11.26);
        ((GeneralPath) shape).lineTo(0.73, -11.24);
        ((GeneralPath) shape).lineTo(0.76, -11.21);
        ((GeneralPath) shape).lineTo(0.79, -11.18);
        ((GeneralPath) shape).lineTo(0.81, -11.15);
        ((GeneralPath) shape).lineTo(0.83, -11.12);
        ((GeneralPath) shape).lineTo(0.85, -11.08);
        ((GeneralPath) shape).lineTo(0.86, -11.04);
        ((GeneralPath) shape).lineTo(0.87, -11.0);
        ((GeneralPath) shape).lineTo(0.88, -10.94);
        ((GeneralPath) shape).lineTo(0.88, -10.87);
        ((GeneralPath) shape).lineTo(1.28, -10.88);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.12, -9.84);
        ((GeneralPath) shape).lineTo(3.12, -9.78);
        ((GeneralPath) shape).lineTo(3.11, -9.72);
        ((GeneralPath) shape).lineTo(3.1, -9.66);
        ((GeneralPath) shape).lineTo(3.09, -9.6);
        ((GeneralPath) shape).lineTo(3.07, -9.54);
        ((GeneralPath) shape).lineTo(3.06, -9.48);
        ((GeneralPath) shape).lineTo(3.04, -9.43);
        ((GeneralPath) shape).lineTo(3.02, -9.39);
        ((GeneralPath) shape).lineTo(3.0, -9.36);
        ((GeneralPath) shape).lineTo(2.98, -9.32);
        ((GeneralPath) shape).lineTo(2.95, -9.29);
        ((GeneralPath) shape).lineTo(2.93, -9.26);
        ((GeneralPath) shape).lineTo(2.9, -9.24);
        ((GeneralPath) shape).lineTo(2.87, -9.21);
        ((GeneralPath) shape).lineTo(2.83, -9.19);
        ((GeneralPath) shape).lineTo(2.8, -9.17);
        ((GeneralPath) shape).lineTo(2.76, -9.15);
        ((GeneralPath) shape).lineTo(2.73, -9.14);
        ((GeneralPath) shape).lineTo(2.69, -9.13);
        ((GeneralPath) shape).lineTo(2.65, -9.12);
        ((GeneralPath) shape).lineTo(2.61, -9.11);
        ((GeneralPath) shape).lineTo(2.57, -9.11);
        ((GeneralPath) shape).lineTo(2.53, -9.11);
        ((GeneralPath) shape).lineTo(2.49, -9.11);
        ((GeneralPath) shape).lineTo(2.45, -9.11);
        ((GeneralPath) shape).lineTo(2.41, -9.12);
        ((GeneralPath) shape).lineTo(2.37, -9.13);
        ((GeneralPath) shape).lineTo(2.34, -9.14);
        ((GeneralPath) shape).lineTo(2.3, -9.15);
        ((GeneralPath) shape).lineTo(2.26, -9.17);
        ((GeneralPath) shape).lineTo(2.23, -9.19);
        ((GeneralPath) shape).lineTo(2.19, -9.21);
        ((GeneralPath) shape).lineTo(2.16, -9.24);
        ((GeneralPath) shape).lineTo(2.13, -9.26);
        ((GeneralPath) shape).lineTo(2.11, -9.29);
        ((GeneralPath) shape).lineTo(2.08, -9.33);
        ((GeneralPath) shape).lineTo(2.06, -9.36);
        ((GeneralPath) shape).lineTo(2.04, -9.4);
        ((GeneralPath) shape).lineTo(2.02, -9.43);
        ((GeneralPath) shape).lineTo(2.0, -9.49);
        ((GeneralPath) shape).lineTo(1.98, -9.54);
        ((GeneralPath) shape).lineTo(1.97, -9.6);
        ((GeneralPath) shape).lineTo(1.96, -9.66);
        ((GeneralPath) shape).lineTo(1.95, -9.72);
        ((GeneralPath) shape).lineTo(1.94, -9.78);
        ((GeneralPath) shape).lineTo(1.59, -9.77);
        ((GeneralPath) shape).lineTo(1.6, -9.65);
        ((GeneralPath) shape).lineTo(1.61, -9.55);
        ((GeneralPath) shape).lineTo(1.64, -9.46);
        ((GeneralPath) shape).lineTo(1.67, -9.37);
        ((GeneralPath) shape).lineTo(1.71, -9.28);
        ((GeneralPath) shape).lineTo(1.74, -9.21);
        ((GeneralPath) shape).lineTo(1.79, -9.15);
        ((GeneralPath) shape).lineTo(1.83, -9.09);
        ((GeneralPath) shape).lineTo(1.89, -9.04);
        ((GeneralPath) shape).lineTo(1.94, -8.99);
        ((GeneralPath) shape).lineTo(2.0, -8.94);
        ((GeneralPath) shape).lineTo(2.07, -8.9);
        ((GeneralPath) shape).lineTo(2.14, -8.87);
        ((GeneralPath) shape).lineTo(2.18, -8.85);
        ((GeneralPath) shape).lineTo(2.23, -8.84);
        ((GeneralPath) shape).lineTo(2.28, -8.83);
        ((GeneralPath) shape).lineTo(2.33, -8.82);
        ((GeneralPath) shape).lineTo(2.38, -8.81);
        ((GeneralPath) shape).lineTo(2.43, -8.81);
        ((GeneralPath) shape).lineTo(2.48, -8.8);
        ((GeneralPath) shape).lineTo(2.53, -8.8);
        ((GeneralPath) shape).lineTo(2.59, -8.81);
        ((GeneralPath) shape).lineTo(2.64, -8.81);
        ((GeneralPath) shape).lineTo(2.7, -8.81);
        ((GeneralPath) shape).lineTo(2.75, -8.82);
        ((GeneralPath) shape).lineTo(2.8, -8.83);
        ((GeneralPath) shape).lineTo(2.84, -8.85);
        ((GeneralPath) shape).lineTo(2.89, -8.86);
        ((GeneralPath) shape).lineTo(2.93, -8.88);
        ((GeneralPath) shape).lineTo(2.98, -8.9);
        ((GeneralPath) shape).lineTo(3.02, -8.92);
        ((GeneralPath) shape).lineTo(3.06, -8.94);
        ((GeneralPath) shape).lineTo(3.09, -8.97);
        ((GeneralPath) shape).lineTo(3.15, -9.02);
        ((GeneralPath) shape).lineTo(3.21, -9.07);
        ((GeneralPath) shape).lineTo(3.26, -9.13);
        ((GeneralPath) shape).lineTo(3.3, -9.19);
        ((GeneralPath) shape).lineTo(3.34, -9.26);
        ((GeneralPath) shape).lineTo(3.37, -9.33);
        ((GeneralPath) shape).lineTo(3.4, -9.4);
        ((GeneralPath) shape).lineTo(3.42, -9.47);
        ((GeneralPath) shape).lineTo(3.44, -9.57);
        ((GeneralPath) shape).lineTo(3.46, -9.68);
        ((GeneralPath) shape).lineTo(3.47, -9.79);
        ((GeneralPath) shape).lineTo(3.12, -9.84);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.53, -10.98);
        ((GeneralPath) shape).lineTo(2.48, -10.98);
        ((GeneralPath) shape).lineTo(2.43, -10.98);
        ((GeneralPath) shape).lineTo(2.38, -10.98);
        ((GeneralPath) shape).lineTo(2.33, -10.97);
        ((GeneralPath) shape).lineTo(2.28, -10.96);
        ((GeneralPath) shape).lineTo(2.23, -10.95);
        ((GeneralPath) shape).lineTo(2.18, -10.93);
        ((GeneralPath) shape).lineTo(2.14, -10.92);
        ((GeneralPath) shape).lineTo(2.09, -10.89);
        ((GeneralPath) shape).lineTo(2.05, -10.87);
        ((GeneralPath) shape).lineTo(2.0, -10.84);
        ((GeneralPath) shape).lineTo(1.96, -10.81);
        ((GeneralPath) shape).lineTo(1.92, -10.78);
        ((GeneralPath) shape).lineTo(1.89, -10.75);
        ((GeneralPath) shape).lineTo(1.85, -10.71);
        ((GeneralPath) shape).lineTo(1.82, -10.67);
        ((GeneralPath) shape).lineTo(1.78, -10.63);
        ((GeneralPath) shape).lineTo(1.76, -10.59);
        ((GeneralPath) shape).lineTo(1.73, -10.55);
        ((GeneralPath) shape).lineTo(1.7, -10.5);
        ((GeneralPath) shape).lineTo(1.68, -10.46);
        ((GeneralPath) shape).lineTo(1.66, -10.41);
        ((GeneralPath) shape).lineTo(1.65, -10.36);
        ((GeneralPath) shape).lineTo(1.63, -10.32);
        ((GeneralPath) shape).lineTo(1.61, -10.21);
        ((GeneralPath) shape).lineTo(1.6, -10.11);
        ((GeneralPath) shape).lineTo(1.59, -10.0);
        ((GeneralPath) shape).lineTo(1.59, -9.9);
        ((GeneralPath) shape).lineTo(1.59, -9.77);
        ((GeneralPath) shape).lineTo(1.94, -9.78);
        ((GeneralPath) shape).lineTo(1.94, -9.84);
        ((GeneralPath) shape).lineTo(1.94, -9.9);
        ((GeneralPath) shape).lineTo(1.94, -9.95);
        ((GeneralPath) shape).lineTo(1.94, -10.01);
        ((GeneralPath) shape).lineTo(1.95, -10.07);
        ((GeneralPath) shape).lineTo(1.96, -10.13);
        ((GeneralPath) shape).lineTo(1.97, -10.19);
        ((GeneralPath) shape).lineTo(1.98, -10.25);
        ((GeneralPath) shape).lineTo(2.0, -10.3);
        ((GeneralPath) shape).lineTo(2.02, -10.36);
        ((GeneralPath) shape).lineTo(2.04, -10.39);
        ((GeneralPath) shape).lineTo(2.06, -10.43);
        ((GeneralPath) shape).lineTo(2.08, -10.46);
        ((GeneralPath) shape).lineTo(2.11, -10.49);
        ((GeneralPath) shape).lineTo(2.13, -10.52);
        ((GeneralPath) shape).lineTo(2.16, -10.55);
        ((GeneralPath) shape).lineTo(2.19, -10.58);
        ((GeneralPath) shape).lineTo(2.23, -10.6);
        ((GeneralPath) shape).lineTo(2.26, -10.62);
        ((GeneralPath) shape).lineTo(2.3, -10.64);
        ((GeneralPath) shape).lineTo(2.34, -10.65);
        ((GeneralPath) shape).lineTo(2.37, -10.66);
        ((GeneralPath) shape).lineTo(2.41, -10.67);
        ((GeneralPath) shape).lineTo(2.45, -10.68);
        ((GeneralPath) shape).lineTo(2.49, -10.68);
        ((GeneralPath) shape).lineTo(2.53, -10.68);
        ((GeneralPath) shape).lineTo(2.53, -10.98);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.53, -10.68);
        ((GeneralPath) shape).lineTo(2.57, -10.68);
        ((GeneralPath) shape).lineTo(2.61, -10.67);
        ((GeneralPath) shape).lineTo(2.65, -10.67);
        ((GeneralPath) shape).lineTo(2.69, -10.66);
        ((GeneralPath) shape).lineTo(2.73, -10.65);
        ((GeneralPath) shape).lineTo(2.76, -10.63);
        ((GeneralPath) shape).lineTo(2.8, -10.62);
        ((GeneralPath) shape).lineTo(2.83, -10.6);
        ((GeneralPath) shape).lineTo(2.87, -10.57);
        ((GeneralPath) shape).lineTo(2.9, -10.55);
        ((GeneralPath) shape).lineTo(2.93, -10.52);
        ((GeneralPath) shape).lineTo(2.95, -10.49);
        ((GeneralPath) shape).lineTo(2.98, -10.46);
        ((GeneralPath) shape).lineTo(3.0, -10.43);
        ((GeneralPath) shape).lineTo(3.02, -10.39);
        ((GeneralPath) shape).lineTo(3.04, -10.36);
        ((GeneralPath) shape).lineTo(3.06, -10.3);
        ((GeneralPath) shape).lineTo(3.07, -10.25);
        ((GeneralPath) shape).lineTo(3.09, -10.19);
        ((GeneralPath) shape).lineTo(3.1, -10.13);
        ((GeneralPath) shape).lineTo(3.11, -10.07);
        ((GeneralPath) shape).lineTo(3.12, -10.01);
        ((GeneralPath) shape).lineTo(3.12, -9.95);
        ((GeneralPath) shape).lineTo(3.12, -9.9);
        ((GeneralPath) shape).lineTo(3.12, -9.84);
        ((GeneralPath) shape).lineTo(3.47, -9.79);
        ((GeneralPath) shape).lineTo(3.47, -9.89);
        ((GeneralPath) shape).lineTo(3.47, -10.01);
        ((GeneralPath) shape).lineTo(3.46, -10.13);
        ((GeneralPath) shape).lineTo(3.44, -10.23);
        ((GeneralPath) shape).lineTo(3.42, -10.33);
        ((GeneralPath) shape).lineTo(3.39, -10.42);
        ((GeneralPath) shape).lineTo(3.35, -10.51);
        ((GeneralPath) shape).lineTo(3.31, -10.57);
        ((GeneralPath) shape).lineTo(3.27, -10.64);
        ((GeneralPath) shape).lineTo(3.22, -10.7);
        ((GeneralPath) shape).lineTo(3.17, -10.75);
        ((GeneralPath) shape).lineTo(3.11, -10.8);
        ((GeneralPath) shape).lineTo(3.05, -10.84);
        ((GeneralPath) shape).lineTo(2.99, -10.88);
        ((GeneralPath) shape).lineTo(2.92, -10.92);
        ((GeneralPath) shape).lineTo(2.87, -10.93);
        ((GeneralPath) shape).lineTo(2.83, -10.95);
        ((GeneralPath) shape).lineTo(2.78, -10.96);
        ((GeneralPath) shape).lineTo(2.73, -10.97);
        ((GeneralPath) shape).lineTo(2.68, -10.98);
        ((GeneralPath) shape).lineTo(2.63, -10.98);
        ((GeneralPath) shape).lineTo(2.58, -10.98);
        ((GeneralPath) shape).lineTo(2.53, -10.98);
        ((GeneralPath) shape).lineTo(2.53, -10.68);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.22, -10.24);
        ((GeneralPath) shape).lineTo(4.2, -10.26);
        ((GeneralPath) shape).lineTo(4.19, -10.28);
        ((GeneralPath) shape).lineTo(4.17, -10.3);
        ((GeneralPath) shape).lineTo(4.16, -10.32);
        ((GeneralPath) shape).lineTo(4.15, -10.35);
        ((GeneralPath) shape).lineTo(4.15, -10.37);
        ((GeneralPath) shape).lineTo(4.15, -10.4);
        ((GeneralPath) shape).lineTo(4.15, -10.43);
        ((GeneralPath) shape).lineTo(4.15, -10.46);
        ((GeneralPath) shape).lineTo(4.16, -10.5);
        ((GeneralPath) shape).lineTo(4.18, -10.53);
        ((GeneralPath) shape).lineTo(4.19, -10.56);
        ((GeneralPath) shape).lineTo(4.22, -10.58);
        ((GeneralPath) shape).lineTo(4.24, -10.6);
        ((GeneralPath) shape).lineTo(4.27, -10.62);
        ((GeneralPath) shape).lineTo(4.3, -10.64);
        ((GeneralPath) shape).lineTo(4.34, -10.65);
        ((GeneralPath) shape).lineTo(4.37, -10.67);
        ((GeneralPath) shape).lineTo(4.41, -10.68);
        ((GeneralPath) shape).lineTo(4.44, -10.68);
        ((GeneralPath) shape).lineTo(4.48, -10.69);
        ((GeneralPath) shape).lineTo(4.52, -10.69);
        ((GeneralPath) shape).lineTo(4.56, -10.69);
        ((GeneralPath) shape).lineTo(4.63, -10.69);
        ((GeneralPath) shape).lineTo(4.71, -10.68);
        ((GeneralPath) shape).lineTo(4.78, -10.66);
        ((GeneralPath) shape).lineTo(4.85, -10.63);
        ((GeneralPath) shape).lineTo(4.88, -10.62);
        ((GeneralPath) shape).lineTo(4.91, -10.6);
        ((GeneralPath) shape).lineTo(4.93, -10.58);
        ((GeneralPath) shape).lineTo(4.95, -10.56);
        ((GeneralPath) shape).lineTo(4.97, -10.54);
        ((GeneralPath) shape).lineTo(4.99, -10.51);
        ((GeneralPath) shape).lineTo(5.01, -10.49);
        ((GeneralPath) shape).lineTo(5.02, -10.46);
        ((GeneralPath) shape).lineTo(5.04, -10.4);
        ((GeneralPath) shape).lineTo(5.05, -10.35);
        ((GeneralPath) shape).lineTo(5.38, -10.35);
        ((GeneralPath) shape).lineTo(5.38, -10.4);
        ((GeneralPath) shape).lineTo(5.38, -10.45);
        ((GeneralPath) shape).lineTo(5.37, -10.5);
        ((GeneralPath) shape).lineTo(5.35, -10.56);
        ((GeneralPath) shape).lineTo(5.33, -10.61);
        ((GeneralPath) shape).lineTo(5.3, -10.66);
        ((GeneralPath) shape).lineTo(5.26, -10.71);
        ((GeneralPath) shape).lineTo(5.22, -10.76);
        ((GeneralPath) shape).lineTo(5.18, -10.8);
        ((GeneralPath) shape).lineTo(5.13, -10.84);
        ((GeneralPath) shape).lineTo(5.08, -10.87);
        ((GeneralPath) shape).lineTo(5.02, -10.89);
        ((GeneralPath) shape).lineTo(4.97, -10.91);
        ((GeneralPath) shape).lineTo(4.92, -10.93);
        ((GeneralPath) shape).lineTo(4.86, -10.95);
        ((GeneralPath) shape).lineTo(4.81, -10.96);
        ((GeneralPath) shape).lineTo(4.75, -10.97);
        ((GeneralPath) shape).lineTo(4.69, -10.98);
        ((GeneralPath) shape).lineTo(4.64, -10.98);
        ((GeneralPath) shape).lineTo(4.58, -10.98);
        ((GeneralPath) shape).lineTo(4.52, -10.98);
        ((GeneralPath) shape).lineTo(4.46, -10.98);
        ((GeneralPath) shape).lineTo(4.4, -10.97);
        ((GeneralPath) shape).lineTo(4.35, -10.96);
        ((GeneralPath) shape).lineTo(4.29, -10.95);
        ((GeneralPath) shape).lineTo(4.23, -10.94);
        ((GeneralPath) shape).lineTo(4.18, -10.92);
        ((GeneralPath) shape).lineTo(4.12, -10.89);
        ((GeneralPath) shape).lineTo(4.09, -10.88);
        ((GeneralPath) shape).lineTo(4.05, -10.85);
        ((GeneralPath) shape).lineTo(4.02, -10.83);
        ((GeneralPath) shape).lineTo(3.99, -10.81);
        ((GeneralPath) shape).lineTo(3.96, -10.78);
        ((GeneralPath) shape).lineTo(3.94, -10.75);
        ((GeneralPath) shape).lineTo(3.91, -10.72);
        ((GeneralPath) shape).lineTo(3.89, -10.69);
        ((GeneralPath) shape).lineTo(3.87, -10.65);
        ((GeneralPath) shape).lineTo(3.85, -10.62);
        ((GeneralPath) shape).lineTo(3.84, -10.58);
        ((GeneralPath) shape).lineTo(3.82, -10.55);
        ((GeneralPath) shape).lineTo(3.81, -10.51);
        ((GeneralPath) shape).lineTo(3.81, -10.47);
        ((GeneralPath) shape).lineTo(3.8, -10.43);
        ((GeneralPath) shape).lineTo(3.8, -10.39);
        ((GeneralPath) shape).lineTo(3.8, -10.33);
        ((GeneralPath) shape).lineTo(3.81, -10.27);
        ((GeneralPath) shape).lineTo(3.82, -10.22);
        ((GeneralPath) shape).lineTo(3.84, -10.17);
        ((GeneralPath) shape).lineTo(3.86, -10.12);
        ((GeneralPath) shape).lineTo(3.89, -10.07);
        ((GeneralPath) shape).lineTo(3.92, -10.03);
        ((GeneralPath) shape).lineTo(3.96, -9.99);
        ((GeneralPath) shape).lineTo(4.0, -9.96);
        ((GeneralPath) shape).lineTo(4.04, -9.93);
        ((GeneralPath) shape).lineTo(4.22, -10.24);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.59, -8.8);
        ((GeneralPath) shape).lineTo(4.68, -8.81);
        ((GeneralPath) shape).lineTo(4.77, -8.82);
        ((GeneralPath) shape).lineTo(4.85, -8.83);
        ((GeneralPath) shape).lineTo(4.93, -8.84);
        ((GeneralPath) shape).lineTo(5.01, -8.87);
        ((GeneralPath) shape).lineTo(5.09, -8.9);
        ((GeneralPath) shape).lineTo(5.13, -8.92);
        ((GeneralPath) shape).lineTo(5.17, -8.95);
        ((GeneralPath) shape).lineTo(5.2, -8.97);
        ((GeneralPath) shape).lineTo(5.24, -9.0);
        ((GeneralPath) shape).lineTo(5.27, -9.03);
        ((GeneralPath) shape).lineTo(5.3, -9.06);
        ((GeneralPath) shape).lineTo(5.33, -9.1);
        ((GeneralPath) shape).lineTo(5.35, -9.14);
        ((GeneralPath) shape).lineTo(5.37, -9.18);
        ((GeneralPath) shape).lineTo(5.39, -9.22);
        ((GeneralPath) shape).lineTo(5.41, -9.26);
        ((GeneralPath) shape).lineTo(5.42, -9.3);
        ((GeneralPath) shape).lineTo(5.43, -9.35);
        ((GeneralPath) shape).lineTo(5.44, -9.39);
        ((GeneralPath) shape).lineTo(5.44, -9.44);
        ((GeneralPath) shape).lineTo(5.44, -9.48);
        ((GeneralPath) shape).lineTo(5.44, -9.56);
        ((GeneralPath) shape).lineTo(5.43, -9.63);
        ((GeneralPath) shape).lineTo(5.42, -9.67);
        ((GeneralPath) shape).lineTo(5.4, -9.71);
        ((GeneralPath) shape).lineTo(5.38, -9.75);
        ((GeneralPath) shape).lineTo(5.36, -9.79);
        ((GeneralPath) shape).lineTo(5.34, -9.82);
        ((GeneralPath) shape).lineTo(5.31, -9.85);
        ((GeneralPath) shape).lineTo(5.28, -9.88);
        ((GeneralPath) shape).lineTo(5.24, -9.91);
        ((GeneralPath) shape).lineTo(5.19, -9.94);
        ((GeneralPath) shape).lineTo(5.13, -9.97);
        ((GeneralPath) shape).lineTo(5.07, -10.0);
        ((GeneralPath) shape).lineTo(5.01, -10.02);
        ((GeneralPath) shape).lineTo(4.81, -10.07);
        ((GeneralPath) shape).lineTo(4.47, -10.15);
        ((GeneralPath) shape).lineTo(4.41, -10.16);
        ((GeneralPath) shape).lineTo(4.36, -10.18);
        ((GeneralPath) shape).lineTo(4.3, -10.2);
        ((GeneralPath) shape).lineTo(4.25, -10.23);
        ((GeneralPath) shape).lineTo(4.22, -10.24);
        ((GeneralPath) shape).lineTo(4.04, -9.93);
        ((GeneralPath) shape).lineTo(4.13, -9.89);
        ((GeneralPath) shape).lineTo(4.21, -9.86);
        ((GeneralPath) shape).lineTo(4.3, -9.83);
        ((GeneralPath) shape).lineTo(4.39, -9.81);
        ((GeneralPath) shape).lineTo(4.78, -9.71);
        ((GeneralPath) shape).lineTo(4.9, -9.68);
        ((GeneralPath) shape).lineTo(4.93, -9.67);
        ((GeneralPath) shape).lineTo(4.96, -9.66);
        ((GeneralPath) shape).lineTo(4.99, -9.64);
        ((GeneralPath) shape).lineTo(5.01, -9.62);
        ((GeneralPath) shape).lineTo(5.03, -9.61);
        ((GeneralPath) shape).lineTo(5.05, -9.59);
        ((GeneralPath) shape).lineTo(5.06, -9.57);
        ((GeneralPath) shape).lineTo(5.07, -9.55);
        ((GeneralPath) shape).lineTo(5.08, -9.53);
        ((GeneralPath) shape).lineTo(5.09, -9.5);
        ((GeneralPath) shape).lineTo(5.09, -9.48);
        ((GeneralPath) shape).lineTo(5.09, -9.46);
        ((GeneralPath) shape).lineTo(5.09, -9.42);
        ((GeneralPath) shape).lineTo(5.09, -9.38);
        ((GeneralPath) shape).lineTo(5.08, -9.35);
        ((GeneralPath) shape).lineTo(5.06, -9.31);
        ((GeneralPath) shape).lineTo(5.04, -9.28);
        ((GeneralPath) shape).lineTo(5.02, -9.25);
        ((GeneralPath) shape).lineTo(5.0, -9.22);
        ((GeneralPath) shape).lineTo(4.97, -9.2);
        ((GeneralPath) shape).lineTo(4.94, -9.18);
        ((GeneralPath) shape).lineTo(4.91, -9.16);
        ((GeneralPath) shape).lineTo(4.83, -9.14);
        ((GeneralPath) shape).lineTo(4.76, -9.12);
        ((GeneralPath) shape).lineTo(4.68, -9.11);
        ((GeneralPath) shape).lineTo(4.61, -9.11);
        ((GeneralPath) shape).lineTo(4.59, -8.8);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.61, -9.11);
        ((GeneralPath) shape).lineTo(4.55, -9.11);
        ((GeneralPath) shape).lineTo(4.5, -9.11);
        ((GeneralPath) shape).lineTo(4.45, -9.12);
        ((GeneralPath) shape).lineTo(4.39, -9.13);
        ((GeneralPath) shape).lineTo(4.35, -9.15);
        ((GeneralPath) shape).lineTo(4.3, -9.17);
        ((GeneralPath) shape).lineTo(4.26, -9.19);
        ((GeneralPath) shape).lineTo(4.22, -9.22);
        ((GeneralPath) shape).lineTo(4.19, -9.26);
        ((GeneralPath) shape).lineTo(4.16, -9.3);
        ((GeneralPath) shape).lineTo(4.13, -9.34);
        ((GeneralPath) shape).lineTo(4.11, -9.38);
        ((GeneralPath) shape).lineTo(4.09, -9.46);
        ((GeneralPath) shape).lineTo(4.08, -9.53);
        ((GeneralPath) shape).lineTo(3.74, -9.53);
        ((GeneralPath) shape).lineTo(3.74, -9.49);
        ((GeneralPath) shape).lineTo(3.75, -9.44);
        ((GeneralPath) shape).lineTo(3.75, -9.4);
        ((GeneralPath) shape).lineTo(3.76, -9.35);
        ((GeneralPath) shape).lineTo(3.77, -9.31);
        ((GeneralPath) shape).lineTo(3.79, -9.26);
        ((GeneralPath) shape).lineTo(3.8, -9.22);
        ((GeneralPath) shape).lineTo(3.82, -9.18);
        ((GeneralPath) shape).lineTo(3.86, -9.12);
        ((GeneralPath) shape).lineTo(3.9, -9.06);
        ((GeneralPath) shape).lineTo(3.94, -9.01);
        ((GeneralPath) shape).lineTo(3.99, -8.97);
        ((GeneralPath) shape).lineTo(4.05, -8.93);
        ((GeneralPath) shape).lineTo(4.11, -8.89);
        ((GeneralPath) shape).lineTo(4.17, -8.87);
        ((GeneralPath) shape).lineTo(4.24, -8.85);
        ((GeneralPath) shape).lineTo(4.32, -8.83);
        ((GeneralPath) shape).lineTo(4.41, -8.81);
        ((GeneralPath) shape).lineTo(4.5, -8.81);
        ((GeneralPath) shape).lineTo(4.59, -8.8);
        ((GeneralPath) shape).lineTo(4.61, -9.11);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.52, -10.1);
        ((GeneralPath) shape).lineTo(7.52, -10.2);
        ((GeneralPath) shape).lineTo(7.52, -10.3);
        ((GeneralPath) shape).lineTo(7.51, -10.39);
        ((GeneralPath) shape).lineTo(7.5, -10.49);
        ((GeneralPath) shape).lineTo(7.49, -10.54);
        ((GeneralPath) shape).lineTo(7.48, -10.6);
        ((GeneralPath) shape).lineTo(7.46, -10.65);
        ((GeneralPath) shape).lineTo(7.43, -10.69);
        ((GeneralPath) shape).lineTo(7.4, -10.73);
        ((GeneralPath) shape).lineTo(7.37, -10.77);
        ((GeneralPath) shape).lineTo(7.33, -10.81);
        ((GeneralPath) shape).lineTo(7.29, -10.84);
        ((GeneralPath) shape).lineTo(7.25, -10.87);
        ((GeneralPath) shape).lineTo(7.21, -10.89);
        ((GeneralPath) shape).lineTo(7.16, -10.91);
        ((GeneralPath) shape).lineTo(7.11, -10.93);
        ((GeneralPath) shape).lineTo(7.04, -10.95);
        ((GeneralPath) shape).lineTo(6.96, -10.96);
        ((GeneralPath) shape).lineTo(6.88, -10.97);
        ((GeneralPath) shape).lineTo(6.81, -10.97);
        ((GeneralPath) shape).lineTo(6.73, -10.97);
        ((GeneralPath) shape).lineTo(6.66, -10.96);
        ((GeneralPath) shape).lineTo(6.58, -10.94);
        ((GeneralPath) shape).lineTo(6.51, -10.92);
        ((GeneralPath) shape).lineTo(6.46, -10.89);
        ((GeneralPath) shape).lineTo(6.41, -10.87);
        ((GeneralPath) shape).lineTo(6.37, -10.83);
        ((GeneralPath) shape).lineTo(6.32, -10.8);
        ((GeneralPath) shape).lineTo(6.28, -10.76);
        ((GeneralPath) shape).lineTo(6.24, -10.72);
        ((GeneralPath) shape).lineTo(6.21, -10.68);
        ((GeneralPath) shape).lineTo(6.17, -10.63);
        ((GeneralPath) shape).lineTo(6.17, -10.92);
        ((GeneralPath) shape).lineTo(5.84, -10.92);
        ((GeneralPath) shape).lineTo(5.84, -8.87);
        ((GeneralPath) shape).lineTo(6.19, -8.87);
        ((GeneralPath) shape).lineTo(6.19, -10.04);
        ((GeneralPath) shape).lineTo(6.19, -10.11);
        ((GeneralPath) shape).lineTo(6.2, -10.18);
        ((GeneralPath) shape).lineTo(6.21, -10.24);
        ((GeneralPath) shape).lineTo(6.22, -10.29);
        ((GeneralPath) shape).lineTo(6.24, -10.34);
        ((GeneralPath) shape).lineTo(6.26, -10.39);
        ((GeneralPath) shape).lineTo(6.29, -10.43);
        ((GeneralPath) shape).lineTo(6.32, -10.48);
        ((GeneralPath) shape).lineTo(6.36, -10.52);
        ((GeneralPath) shape).lineTo(6.4, -10.55);
        ((GeneralPath) shape).lineTo(6.44, -10.58);
        ((GeneralPath) shape).lineTo(6.48, -10.6);
        ((GeneralPath) shape).lineTo(6.53, -10.62);
        ((GeneralPath) shape).lineTo(6.58, -10.64);
        ((GeneralPath) shape).lineTo(6.63, -10.65);
        ((GeneralPath) shape).lineTo(6.68, -10.66);
        ((GeneralPath) shape).lineTo(6.73, -10.66);
        ((GeneralPath) shape).lineTo(6.78, -10.67);
        ((GeneralPath) shape).lineTo(6.81, -10.67);
        ((GeneralPath) shape).lineTo(6.84, -10.66);
        ((GeneralPath) shape).lineTo(6.88, -10.66);
        ((GeneralPath) shape).lineTo(6.91, -10.65);
        ((GeneralPath) shape).lineTo(6.94, -10.64);
        ((GeneralPath) shape).lineTo(6.97, -10.63);
        ((GeneralPath) shape).lineTo(7.0, -10.61);
        ((GeneralPath) shape).lineTo(7.03, -10.6);
        ((GeneralPath) shape).lineTo(7.05, -10.57);
        ((GeneralPath) shape).lineTo(7.08, -10.55);
        ((GeneralPath) shape).lineTo(7.1, -10.53);
        ((GeneralPath) shape).lineTo(7.11, -10.5);
        ((GeneralPath) shape).lineTo(7.14, -10.44);
        ((GeneralPath) shape).lineTo(7.16, -10.38);
        ((GeneralPath) shape).lineTo(7.17, -10.31);
        ((GeneralPath) shape).lineTo(7.17, -10.25);
        ((GeneralPath) shape).lineTo(7.17, -8.87);
        ((GeneralPath) shape).lineTo(7.52, -8.87);
        ((GeneralPath) shape).lineTo(7.52, -10.1);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.63, -1.84);
        ((GeneralPath) shape).lineTo(0.0, -7.02);
        ((GeneralPath) shape).lineTo(3.63, -1.84);
        ((GeneralPath) shape).lineTo(0.0, 3.34);
        ((GeneralPath) shape).lineTo(-3.63, -1.84);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.26, -0.95);
        ((GeneralPath) shape).lineTo(-1.95, -0.5);
        ((GeneralPath) shape).lineTo(-1.95, 0.0);
        ((GeneralPath) shape).lineTo(1.95, 0.0);
        ((GeneralPath) shape).lineTo(1.95, -0.5);
        ((GeneralPath) shape).lineTo(1.33, -0.95);

        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.42, -2.41);
        ((GeneralPath) shape).lineTo(1.37, -2.51);
        ((GeneralPath) shape).lineTo(1.31, -2.6);
        ((GeneralPath) shape).lineTo(1.25, -2.69);
        ((GeneralPath) shape).lineTo(1.18, -2.78);
        ((GeneralPath) shape).lineTo(1.1, -2.86);
        ((GeneralPath) shape).lineTo(1.02, -2.93);
        ((GeneralPath) shape).lineTo(0.93, -3.0);
        ((GeneralPath) shape).lineTo(0.84, -3.06);
        ((GeneralPath) shape).lineTo(0.75, -3.11);
        ((GeneralPath) shape).lineTo(0.65, -3.16);
        ((GeneralPath) shape).lineTo(0.54, -3.2);
        ((GeneralPath) shape).lineTo(0.44, -3.24);
        ((GeneralPath) shape).lineTo(0.33, -3.26);
        ((GeneralPath) shape).lineTo(0.22, -3.28);
        ((GeneralPath) shape).lineTo(0.11, -3.29);
        ((GeneralPath) shape).lineTo(0.0, -3.29);
        ((GeneralPath) shape).lineTo(-0.11, -3.28);
        ((GeneralPath) shape).lineTo(-0.22, -3.27);
        ((GeneralPath) shape).lineTo(-0.33, -3.24);
        ((GeneralPath) shape).lineTo(-0.44, -3.21);
        ((GeneralPath) shape).lineTo(-0.54, -3.17);
        ((GeneralPath) shape).lineTo(-0.64, -3.13);
        ((GeneralPath) shape).lineTo(-0.74, -3.08);
        ((GeneralPath) shape).lineTo(-0.83, -3.02);
        ((GeneralPath) shape).lineTo(-0.92, -2.95);
        ((GeneralPath) shape).lineTo(-1.0, -2.88);
        ((GeneralPath) shape).lineTo(-1.08, -2.8);
        ((GeneralPath) shape).lineTo(-1.15, -2.72);
        ((GeneralPath) shape).lineTo(-1.22, -2.63);
        ((GeneralPath) shape).lineTo(-1.28, -2.54);
        ((GeneralPath) shape).lineTo(-1.33, -2.44);
        ((GeneralPath) shape).lineTo(-1.35, -2.41);
        ((GeneralPath) shape).lineTo(1.42, -2.41);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00D400));
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.33, -1.07);
        ((GeneralPath) shape).lineTo(1.4, -1.07);
        ((GeneralPath) shape).lineTo(1.45, -1.17);
        ((GeneralPath) shape).lineTo(1.49, -1.27);
        ((GeneralPath) shape).lineTo(1.52, -1.38);
        ((GeneralPath) shape).lineTo(1.54, -1.49);
        ((GeneralPath) shape).lineTo(1.56, -1.6);
        ((GeneralPath) shape).lineTo(1.57, -1.71);
        ((GeneralPath) shape).lineTo(1.57, -1.76);
        ((GeneralPath) shape).lineTo(-1.49, -1.76);
        ((GeneralPath) shape).lineTo(-1.49, -1.65);
        ((GeneralPath) shape).lineTo(-1.47, -1.54);
        ((GeneralPath) shape).lineTo(-1.45, -1.43);
        ((GeneralPath) shape).lineTo(-1.43, -1.32);
        ((GeneralPath) shape).lineTo(-1.39, -1.22);
        ((GeneralPath) shape).lineTo(-1.35, -1.12);
        ((GeneralPath) shape).lineTo(-1.33, -1.07);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.26, -0.95);
        ((GeneralPath) shape).lineTo(-1.31, -1.04);
        ((GeneralPath) shape).lineTo(-1.36, -1.14);
        ((GeneralPath) shape).lineTo(-1.4, -1.24);
        ((GeneralPath) shape).lineTo(-1.43, -1.35);
        ((GeneralPath) shape).lineTo(-1.46, -1.46);
        ((GeneralPath) shape).lineTo(-1.48, -1.57);
        ((GeneralPath) shape).lineTo(-1.49, -1.68);
        ((GeneralPath) shape).lineTo(-1.49, -1.79);
        ((GeneralPath) shape).lineTo(-1.48, -1.9);
        ((GeneralPath) shape).lineTo(-1.47, -2.01);
        ((GeneralPath) shape).lineTo(-1.45, -2.11);
        ((GeneralPath) shape).lineTo(-1.42, -2.22);
        ((GeneralPath) shape).lineTo(-1.38, -2.33);
        ((GeneralPath) shape).lineTo(-1.34, -2.43);
        ((GeneralPath) shape).lineTo(-1.29, -2.52);
        ((GeneralPath) shape).lineTo(-1.23, -2.62);
        ((GeneralPath) shape).lineTo(-1.16, -2.71);
        ((GeneralPath) shape).lineTo(-1.09, -2.79);
        ((GeneralPath) shape).lineTo(-1.01, -2.87);
        ((GeneralPath) shape).lineTo(-0.93, -2.94);
        ((GeneralPath) shape).lineTo(-0.84, -3.01);
        ((GeneralPath) shape).lineTo(-0.75, -3.07);
        ((GeneralPath) shape).lineTo(-0.65, -3.12);
        ((GeneralPath) shape).lineTo(-0.55, -3.17);
        ((GeneralPath) shape).lineTo(-0.45, -3.21);
        ((GeneralPath) shape).lineTo(-0.34, -3.24);
        ((GeneralPath) shape).lineTo(-0.23, -3.26);
        ((GeneralPath) shape).lineTo(-0.12, -3.28);
        ((GeneralPath) shape).lineTo(-0.01, -3.29);
        ((GeneralPath) shape).lineTo(0.1, -3.29);
        ((GeneralPath) shape).lineTo(0.21, -3.28);
        ((GeneralPath) shape).lineTo(0.32, -3.26);
        ((GeneralPath) shape).lineTo(0.43, -3.24);
        ((GeneralPath) shape).lineTo(0.53, -3.21);
        ((GeneralPath) shape).lineTo(0.63, -3.17);
        ((GeneralPath) shape).lineTo(0.73, -3.12);
        ((GeneralPath) shape).lineTo(0.83, -3.07);
        ((GeneralPath) shape).lineTo(0.92, -3.01);
        ((GeneralPath) shape).lineTo(1.01, -2.94);
        ((GeneralPath) shape).lineTo(1.09, -2.87);
        ((GeneralPath) shape).lineTo(1.17, -2.79);
        ((GeneralPath) shape).lineTo(1.24, -2.7);
        ((GeneralPath) shape).lineTo(1.31, -2.61);
        ((GeneralPath) shape).lineTo(1.37, -2.52);
        ((GeneralPath) shape).lineTo(1.42, -2.42);
        ((GeneralPath) shape).lineTo(1.46, -2.32);
        ((GeneralPath) shape).lineTo(1.5, -2.21);
        ((GeneralPath) shape).lineTo(1.53, -2.11);
        ((GeneralPath) shape).lineTo(1.55, -2.0);
        ((GeneralPath) shape).lineTo(1.56, -1.89);
        ((GeneralPath) shape).lineTo(1.57, -1.78);
        ((GeneralPath) shape).lineTo(1.56, -1.67);
        ((GeneralPath) shape).lineTo(1.55, -1.56);
        ((GeneralPath) shape).lineTo(1.54, -1.45);
        ((GeneralPath) shape).lineTo(1.51, -1.34);
        ((GeneralPath) shape).lineTo(1.48, -1.24);
        ((GeneralPath) shape).lineTo(1.43, -1.13);
        ((GeneralPath) shape).lineTo(1.39, -1.03);
        ((GeneralPath) shape).lineTo(1.33, -0.95);

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
        return 57;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 60;
    }
}

