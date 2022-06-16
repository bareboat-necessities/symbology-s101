

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYLAT26F {

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
        g.transform(new AffineTransform(3.774441f, 0, 0, 3.774441f, 26.307854f, 47.937202f));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.74, 0.0);
        ((GeneralPath) shape).lineTo(0.74, 0.0);
        ((GeneralPath) shape).lineTo(1.26, -5.4);
        ((GeneralPath) shape).lineTo(-0.21, -5.4);
        ((GeneralPath) shape).lineTo(-0.74, 0.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.54, -2.72);
        ((GeneralPath) shape).lineTo(0.36, -8.29);
        ((GeneralPath) shape).lineTo(4.27, -2.72);
        ((GeneralPath) shape).lineTo(0.36, 2.85);
        ((GeneralPath) shape).lineTo(-3.54, -2.72);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.62, -10.04);
        ((GeneralPath) shape).lineTo(-5.7, -10.05);
        ((GeneralPath) shape).lineTo(-5.78, -10.05);
        ((GeneralPath) shape).lineTo(-5.85, -10.07);
        ((GeneralPath) shape).lineTo(-5.92, -10.09);
        ((GeneralPath) shape).lineTo(-5.99, -10.12);
        ((GeneralPath) shape).lineTo(-6.06, -10.15);
        ((GeneralPath) shape).lineTo(-6.13, -10.19);
        ((GeneralPath) shape).lineTo(-6.19, -10.23);
        ((GeneralPath) shape).lineTo(-6.23, -10.26);
        ((GeneralPath) shape).lineTo(-6.26, -10.3);
        ((GeneralPath) shape).lineTo(-6.3, -10.33);
        ((GeneralPath) shape).lineTo(-6.33, -10.37);
        ((GeneralPath) shape).lineTo(-6.36, -10.41);
        ((GeneralPath) shape).lineTo(-6.39, -10.45);
        ((GeneralPath) shape).lineTo(-6.41, -10.5);
        ((GeneralPath) shape).lineTo(-6.43, -10.54);
        ((GeneralPath) shape).lineTo(-6.47, -10.62);
        ((GeneralPath) shape).lineTo(-6.49, -10.7);
        ((GeneralPath) shape).lineTo(-6.52, -10.78);
        ((GeneralPath) shape).lineTo(-6.53, -10.86);
        ((GeneralPath) shape).lineTo(-6.55, -10.95);
        ((GeneralPath) shape).lineTo(-6.56, -11.03);
        ((GeneralPath) shape).lineTo(-6.56, -11.12);
        ((GeneralPath) shape).lineTo(-6.56, -11.2);
        ((GeneralPath) shape).lineTo(-6.56, -11.29);
        ((GeneralPath) shape).lineTo(-6.96, -11.3);
        ((GeneralPath) shape).lineTo(-6.96, -11.2);
        ((GeneralPath) shape).lineTo(-6.96, -11.11);
        ((GeneralPath) shape).lineTo(-6.95, -11.02);
        ((GeneralPath) shape).lineTo(-6.95, -10.93);
        ((GeneralPath) shape).lineTo(-6.94, -10.83);
        ((GeneralPath) shape).lineTo(-6.92, -10.77);
        ((GeneralPath) shape).lineTo(-6.91, -10.7);
        ((GeneralPath) shape).lineTo(-6.89, -10.63);
        ((GeneralPath) shape).lineTo(-6.87, -10.56);
        ((GeneralPath) shape).lineTo(-6.85, -10.5);
        ((GeneralPath) shape).lineTo(-6.82, -10.43);
        ((GeneralPath) shape).lineTo(-6.79, -10.37);
        ((GeneralPath) shape).lineTo(-6.75, -10.31);
        ((GeneralPath) shape).lineTo(-6.72, -10.25);
        ((GeneralPath) shape).lineTo(-6.68, -10.2);
        ((GeneralPath) shape).lineTo(-6.63, -10.14);
        ((GeneralPath) shape).lineTo(-6.59, -10.09);
        ((GeneralPath) shape).lineTo(-6.54, -10.04);
        ((GeneralPath) shape).lineTo(-6.49, -10.0);
        ((GeneralPath) shape).lineTo(-6.43, -9.96);
        ((GeneralPath) shape).lineTo(-6.37, -9.92);
        ((GeneralPath) shape).lineTo(-6.32, -9.88);
        ((GeneralPath) shape).lineTo(-6.25, -9.85);
        ((GeneralPath) shape).lineTo(-6.19, -9.82);
        ((GeneralPath) shape).lineTo(-6.13, -9.79);
        ((GeneralPath) shape).lineTo(-6.07, -9.77);
        ((GeneralPath) shape).lineTo(-6.0, -9.76);
        ((GeneralPath) shape).lineTo(-5.94, -9.74);
        ((GeneralPath) shape).lineTo(-5.88, -9.73);
        ((GeneralPath) shape).lineTo(-5.82, -9.72);
        ((GeneralPath) shape).lineTo(-5.75, -9.72);
        ((GeneralPath) shape).lineTo(-5.69, -9.72);
        ((GeneralPath) shape).lineTo(-5.62, -9.72);
        ((GeneralPath) shape).lineTo(-5.62, -10.04);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.62, -9.72);
        ((GeneralPath) shape).lineTo(-5.55, -9.72);
        ((GeneralPath) shape).lineTo(-5.48, -9.72);
        ((GeneralPath) shape).lineTo(-5.41, -9.73);
        ((GeneralPath) shape).lineTo(-5.34, -9.73);
        ((GeneralPath) shape).lineTo(-5.25, -9.75);
        ((GeneralPath) shape).lineTo(-5.16, -9.78);
        ((GeneralPath) shape).lineTo(-5.07, -9.81);
        ((GeneralPath) shape).lineTo(-4.98, -9.85);
        ((GeneralPath) shape).lineTo(-4.9, -9.9);
        ((GeneralPath) shape).lineTo(-4.82, -9.95);
        ((GeneralPath) shape).lineTo(-4.75, -10.01);
        ((GeneralPath) shape).lineTo(-4.68, -10.08);
        ((GeneralPath) shape).lineTo(-4.61, -10.16);
        ((GeneralPath) shape).lineTo(-4.54, -10.24);
        ((GeneralPath) shape).lineTo(-4.49, -10.33);
        ((GeneralPath) shape).lineTo(-4.44, -10.43);
        ((GeneralPath) shape).lineTo(-4.39, -10.52);
        ((GeneralPath) shape).lineTo(-4.36, -10.63);
        ((GeneralPath) shape).lineTo(-4.33, -10.73);
        ((GeneralPath) shape).lineTo(-4.32, -10.83);
        ((GeneralPath) shape).lineTo(-4.3, -10.93);
        ((GeneralPath) shape).lineTo(-4.3, -11.02);
        ((GeneralPath) shape).lineTo(-4.29, -11.11);
        ((GeneralPath) shape).lineTo(-4.69, -11.12);
        ((GeneralPath) shape).lineTo(-4.69, -11.03);
        ((GeneralPath) shape).lineTo(-4.7, -10.95);
        ((GeneralPath) shape).lineTo(-4.71, -10.86);
        ((GeneralPath) shape).lineTo(-4.73, -10.78);
        ((GeneralPath) shape).lineTo(-4.76, -10.7);
        ((GeneralPath) shape).lineTo(-4.78, -10.62);
        ((GeneralPath) shape).lineTo(-4.81, -10.54);
        ((GeneralPath) shape).lineTo(-4.84, -10.49);
        ((GeneralPath) shape).lineTo(-4.86, -10.45);
        ((GeneralPath) shape).lineTo(-4.89, -10.41);
        ((GeneralPath) shape).lineTo(-4.92, -10.37);
        ((GeneralPath) shape).lineTo(-4.95, -10.33);
        ((GeneralPath) shape).lineTo(-4.98, -10.3);
        ((GeneralPath) shape).lineTo(-5.02, -10.26);
        ((GeneralPath) shape).lineTo(-5.06, -10.23);
        ((GeneralPath) shape).lineTo(-5.1, -10.2);
        ((GeneralPath) shape).lineTo(-5.14, -10.18);
        ((GeneralPath) shape).lineTo(-5.18, -10.15);
        ((GeneralPath) shape).lineTo(-5.22, -10.13);
        ((GeneralPath) shape).lineTo(-5.27, -10.11);
        ((GeneralPath) shape).lineTo(-5.32, -10.09);
        ((GeneralPath) shape).lineTo(-5.36, -10.08);
        ((GeneralPath) shape).lineTo(-5.41, -10.07);
        ((GeneralPath) shape).lineTo(-5.46, -10.06);
        ((GeneralPath) shape).lineTo(-5.52, -10.05);
        ((GeneralPath) shape).lineTo(-5.57, -10.05);
        ((GeneralPath) shape).lineTo(-5.62, -10.04);
        ((GeneralPath) shape).lineTo(-5.62, -9.72);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.62, -12.36);
        ((GeneralPath) shape).lineTo(-5.55, -12.36);
        ((GeneralPath) shape).lineTo(-5.47, -12.35);
        ((GeneralPath) shape).lineTo(-5.4, -12.34);
        ((GeneralPath) shape).lineTo(-5.32, -12.31);
        ((GeneralPath) shape).lineTo(-5.25, -12.29);
        ((GeneralPath) shape).lineTo(-5.18, -12.25);
        ((GeneralPath) shape).lineTo(-5.12, -12.22);
        ((GeneralPath) shape).lineTo(-5.05, -12.17);
        ((GeneralPath) shape).lineTo(-5.02, -12.14);
        ((GeneralPath) shape).lineTo(-4.98, -12.11);
        ((GeneralPath) shape).lineTo(-4.95, -12.07);
        ((GeneralPath) shape).lineTo(-4.92, -12.03);
        ((GeneralPath) shape).lineTo(-4.89, -11.99);
        ((GeneralPath) shape).lineTo(-4.86, -11.95);
        ((GeneralPath) shape).lineTo(-4.84, -11.91);
        ((GeneralPath) shape).lineTo(-4.81, -11.87);
        ((GeneralPath) shape).lineTo(-4.78, -11.79);
        ((GeneralPath) shape).lineTo(-4.76, -11.71);
        ((GeneralPath) shape).lineTo(-4.73, -11.63);
        ((GeneralPath) shape).lineTo(-4.71, -11.54);
        ((GeneralPath) shape).lineTo(-4.7, -11.46);
        ((GeneralPath) shape).lineTo(-4.69, -11.37);
        ((GeneralPath) shape).lineTo(-4.69, -11.29);
        ((GeneralPath) shape).lineTo(-4.69, -11.2);
        ((GeneralPath) shape).lineTo(-4.69, -11.12);
        ((GeneralPath) shape).lineTo(-4.29, -11.11);
        ((GeneralPath) shape).lineTo(-4.29, -11.2);
        ((GeneralPath) shape).lineTo(-4.29, -11.3);
        ((GeneralPath) shape).lineTo(-4.3, -11.39);
        ((GeneralPath) shape).lineTo(-4.3, -11.48);
        ((GeneralPath) shape).lineTo(-4.32, -11.57);
        ((GeneralPath) shape).lineTo(-4.33, -11.64);
        ((GeneralPath) shape).lineTo(-4.34, -11.71);
        ((GeneralPath) shape).lineTo(-4.36, -11.78);
        ((GeneralPath) shape).lineTo(-4.38, -11.85);
        ((GeneralPath) shape).lineTo(-4.41, -11.92);
        ((GeneralPath) shape).lineTo(-4.44, -11.98);
        ((GeneralPath) shape).lineTo(-4.47, -12.05);
        ((GeneralPath) shape).lineTo(-4.5, -12.11);
        ((GeneralPath) shape).lineTo(-4.56, -12.2);
        ((GeneralPath) shape).lineTo(-4.62, -12.27);
        ((GeneralPath) shape).lineTo(-4.69, -12.35);
        ((GeneralPath) shape).lineTo(-4.77, -12.41);
        ((GeneralPath) shape).lineTo(-4.85, -12.48);
        ((GeneralPath) shape).lineTo(-4.94, -12.53);
        ((GeneralPath) shape).lineTo(-5.03, -12.58);
        ((GeneralPath) shape).lineTo(-5.12, -12.61);
        ((GeneralPath) shape).lineTo(-5.18, -12.63);
        ((GeneralPath) shape).lineTo(-5.24, -12.65);
        ((GeneralPath) shape).lineTo(-5.31, -12.66);
        ((GeneralPath) shape).lineTo(-5.37, -12.67);
        ((GeneralPath) shape).lineTo(-5.43, -12.68);
        ((GeneralPath) shape).lineTo(-5.5, -12.69);
        ((GeneralPath) shape).lineTo(-5.56, -12.69);
        ((GeneralPath) shape).lineTo(-5.62, -12.69);
        ((GeneralPath) shape).lineTo(-5.62, -12.36);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.62, -12.69);
        ((GeneralPath) shape).lineTo(-5.69, -12.69);
        ((GeneralPath) shape).lineTo(-5.77, -12.69);
        ((GeneralPath) shape).lineTo(-5.84, -12.68);
        ((GeneralPath) shape).lineTo(-5.91, -12.67);
        ((GeneralPath) shape).lineTo(-6.0, -12.65);
        ((GeneralPath) shape).lineTo(-6.09, -12.63);
        ((GeneralPath) shape).lineTo(-6.18, -12.59);
        ((GeneralPath) shape).lineTo(-6.27, -12.55);
        ((GeneralPath) shape).lineTo(-6.35, -12.51);
        ((GeneralPath) shape).lineTo(-6.43, -12.45);
        ((GeneralPath) shape).lineTo(-6.5, -12.39);
        ((GeneralPath) shape).lineTo(-6.57, -12.33);
        ((GeneralPath) shape).lineTo(-6.64, -12.25);
        ((GeneralPath) shape).lineTo(-6.71, -12.16);
        ((GeneralPath) shape).lineTo(-6.76, -12.07);
        ((GeneralPath) shape).lineTo(-6.81, -11.98);
        ((GeneralPath) shape).lineTo(-6.86, -11.88);
        ((GeneralPath) shape).lineTo(-6.89, -11.78);
        ((GeneralPath) shape).lineTo(-6.92, -11.68);
        ((GeneralPath) shape).lineTo(-6.94, -11.57);
        ((GeneralPath) shape).lineTo(-6.95, -11.48);
        ((GeneralPath) shape).lineTo(-6.95, -11.39);
        ((GeneralPath) shape).lineTo(-6.96, -11.3);
        ((GeneralPath) shape).lineTo(-6.56, -11.29);
        ((GeneralPath) shape).lineTo(-6.56, -11.37);
        ((GeneralPath) shape).lineTo(-6.55, -11.46);
        ((GeneralPath) shape).lineTo(-6.54, -11.54);
        ((GeneralPath) shape).lineTo(-6.52, -11.63);
        ((GeneralPath) shape).lineTo(-6.49, -11.71);
        ((GeneralPath) shape).lineTo(-6.47, -11.79);
        ((GeneralPath) shape).lineTo(-6.43, -11.87);
        ((GeneralPath) shape).lineTo(-6.41, -11.91);
        ((GeneralPath) shape).lineTo(-6.39, -11.95);
        ((GeneralPath) shape).lineTo(-6.36, -11.99);
        ((GeneralPath) shape).lineTo(-6.33, -12.03);
        ((GeneralPath) shape).lineTo(-6.3, -12.07);
        ((GeneralPath) shape).lineTo(-6.27, -12.11);
        ((GeneralPath) shape).lineTo(-6.23, -12.14);
        ((GeneralPath) shape).lineTo(-6.19, -12.17);
        ((GeneralPath) shape).lineTo(-6.15, -12.2);
        ((GeneralPath) shape).lineTo(-6.11, -12.23);
        ((GeneralPath) shape).lineTo(-6.07, -12.25);
        ((GeneralPath) shape).lineTo(-6.03, -12.28);
        ((GeneralPath) shape).lineTo(-5.98, -12.3);
        ((GeneralPath) shape).lineTo(-5.93, -12.31);
        ((GeneralPath) shape).lineTo(-5.89, -12.33);
        ((GeneralPath) shape).lineTo(-5.84, -12.34);
        ((GeneralPath) shape).lineTo(-5.79, -12.35);
        ((GeneralPath) shape).lineTo(-5.73, -12.35);
        ((GeneralPath) shape).lineTo(-5.68, -12.36);
        ((GeneralPath) shape).lineTo(-5.62, -12.36);
        ((GeneralPath) shape).lineTo(-5.62, -12.69);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.98, -12.64);
        ((GeneralPath) shape).lineTo(-3.06, -12.65);
        ((GeneralPath) shape).lineTo(-3.14, -12.66);
        ((GeneralPath) shape).lineTo(-3.22, -12.66);
        ((GeneralPath) shape).lineTo(-3.3, -12.66);
        ((GeneralPath) shape).lineTo(-3.35, -12.66);
        ((GeneralPath) shape).lineTo(-3.41, -12.64);
        ((GeneralPath) shape).lineTo(-3.46, -12.63);
        ((GeneralPath) shape).lineTo(-3.52, -12.6);
        ((GeneralPath) shape).lineTo(-3.56, -12.58);
        ((GeneralPath) shape).lineTo(-3.6, -12.54);
        ((GeneralPath) shape).lineTo(-3.63, -12.51);
        ((GeneralPath) shape).lineTo(-3.66, -12.47);
        ((GeneralPath) shape).lineTo(-3.68, -12.43);
        ((GeneralPath) shape).lineTo(-3.69, -12.39);
        ((GeneralPath) shape).lineTo(-3.71, -12.35);
        ((GeneralPath) shape).lineTo(-3.72, -12.31);
        ((GeneralPath) shape).lineTo(-3.72, -12.27);
        ((GeneralPath) shape).lineTo(-3.73, -12.23);
        ((GeneralPath) shape).lineTo(-3.73, -12.19);
        ((GeneralPath) shape).lineTo(-3.73, -12.15);
        ((GeneralPath) shape).lineTo(-3.73, -11.85);
        ((GeneralPath) shape).lineTo(-4.1, -11.85);
        ((GeneralPath) shape).lineTo(-4.1, -11.57);
        ((GeneralPath) shape).lineTo(-3.73, -11.57);
        ((GeneralPath) shape).lineTo(-3.73, -9.79);
        ((GeneralPath) shape).lineTo(-3.38, -9.79);
        ((GeneralPath) shape).lineTo(-3.38, -11.57);
        ((GeneralPath) shape).lineTo(-2.98, -11.57);
        ((GeneralPath) shape).lineTo(-2.98, -11.85);
        ((GeneralPath) shape).lineTo(-3.38, -11.85);
        ((GeneralPath) shape).lineTo(-3.38, -12.02);
        ((GeneralPath) shape).lineTo(-3.38, -12.07);
        ((GeneralPath) shape).lineTo(-3.38, -12.11);
        ((GeneralPath) shape).lineTo(-3.37, -12.16);
        ((GeneralPath) shape).lineTo(-3.37, -12.21);
        ((GeneralPath) shape).lineTo(-3.36, -12.23);
        ((GeneralPath) shape).lineTo(-3.34, -12.25);
        ((GeneralPath) shape).lineTo(-3.32, -12.27);
        ((GeneralPath) shape).lineTo(-3.3, -12.29);
        ((GeneralPath) shape).lineTo(-3.26, -12.32);
        ((GeneralPath) shape).lineTo(-3.22, -12.33);
        ((GeneralPath) shape).lineTo(-3.18, -12.34);
        ((GeneralPath) shape).lineTo(-3.13, -12.34);
        ((GeneralPath) shape).lineTo(-3.02, -12.34);
        ((GeneralPath) shape).lineTo(-2.98, -12.33);
        ((GeneralPath) shape).lineTo(-2.98, -12.64);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.89, -12.64);
        ((GeneralPath) shape).lineTo(-1.97, -12.65);
        ((GeneralPath) shape).lineTo(-2.05, -12.66);
        ((GeneralPath) shape).lineTo(-2.12, -12.66);
        ((GeneralPath) shape).lineTo(-2.2, -12.66);
        ((GeneralPath) shape).lineTo(-2.26, -12.66);
        ((GeneralPath) shape).lineTo(-2.32, -12.64);
        ((GeneralPath) shape).lineTo(-2.37, -12.63);
        ((GeneralPath) shape).lineTo(-2.42, -12.6);
        ((GeneralPath) shape).lineTo(-2.47, -12.58);
        ((GeneralPath) shape).lineTo(-2.51, -12.54);
        ((GeneralPath) shape).lineTo(-2.54, -12.51);
        ((GeneralPath) shape).lineTo(-2.57, -12.47);
        ((GeneralPath) shape).lineTo(-2.59, -12.43);
        ((GeneralPath) shape).lineTo(-2.6, -12.39);
        ((GeneralPath) shape).lineTo(-2.61, -12.35);
        ((GeneralPath) shape).lineTo(-2.62, -12.31);
        ((GeneralPath) shape).lineTo(-2.63, -12.27);
        ((GeneralPath) shape).lineTo(-2.64, -12.23);
        ((GeneralPath) shape).lineTo(-2.64, -12.19);
        ((GeneralPath) shape).lineTo(-2.64, -12.15);
        ((GeneralPath) shape).lineTo(-2.64, -11.85);
        ((GeneralPath) shape).lineTo(-3.0, -11.85);
        ((GeneralPath) shape).lineTo(-3.0, -11.57);
        ((GeneralPath) shape).lineTo(-2.64, -11.57);
        ((GeneralPath) shape).lineTo(-2.64, -9.79);
        ((GeneralPath) shape).lineTo(-2.29, -9.79);
        ((GeneralPath) shape).lineTo(-2.29, -11.57);
        ((GeneralPath) shape).lineTo(-1.89, -11.57);
        ((GeneralPath) shape).lineTo(-1.89, -11.85);
        ((GeneralPath) shape).lineTo(-2.29, -11.85);
        ((GeneralPath) shape).lineTo(-2.29, -12.02);
        ((GeneralPath) shape).lineTo(-2.29, -12.07);
        ((GeneralPath) shape).lineTo(-2.29, -12.11);
        ((GeneralPath) shape).lineTo(-2.28, -12.16);
        ((GeneralPath) shape).lineTo(-2.27, -12.21);
        ((GeneralPath) shape).lineTo(-2.26, -12.23);
        ((GeneralPath) shape).lineTo(-2.25, -12.25);
        ((GeneralPath) shape).lineTo(-2.23, -12.27);
        ((GeneralPath) shape).lineTo(-2.21, -12.29);
        ((GeneralPath) shape).lineTo(-2.17, -12.32);
        ((GeneralPath) shape).lineTo(-2.13, -12.33);
        ((GeneralPath) shape).lineTo(-2.08, -12.34);
        ((GeneralPath) shape).lineTo(-2.04, -12.34);
        ((GeneralPath) shape).lineTo(-1.93, -12.34);
        ((GeneralPath) shape).lineTo(-1.89, -12.33);
        ((GeneralPath) shape).lineTo(-1.89, -12.64);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.25, -11.8);
        ((GeneralPath) shape).lineTo(1.24, -11.74);
        ((GeneralPath) shape).lineTo(1.24, -11.68);
        ((GeneralPath) shape).lineTo(1.22, -11.63);
        ((GeneralPath) shape).lineTo(1.21, -11.58);
        ((GeneralPath) shape).lineTo(1.19, -11.54);
        ((GeneralPath) shape).lineTo(1.17, -11.5);
        ((GeneralPath) shape).lineTo(1.14, -11.47);
        ((GeneralPath) shape).lineTo(1.11, -11.44);
        ((GeneralPath) shape).lineTo(1.08, -11.42);
        ((GeneralPath) shape).lineTo(1.05, -11.39);
        ((GeneralPath) shape).lineTo(1.01, -11.38);
        ((GeneralPath) shape).lineTo(0.97, -11.36);
        ((GeneralPath) shape).lineTo(0.92, -11.35);
        ((GeneralPath) shape).lineTo(0.87, -11.34);
        ((GeneralPath) shape).lineTo(0.82, -11.33);
        ((GeneralPath) shape).lineTo(0.77, -11.33);
        ((GeneralPath) shape).lineTo(0.59, -11.32);
        ((GeneralPath) shape).lineTo(-0.11, -11.32);
        ((GeneralPath) shape).lineTo(-0.11, -10.98);
        ((GeneralPath) shape).lineTo(0.53, -10.98);
        ((GeneralPath) shape).lineTo(0.64, -10.98);
        ((GeneralPath) shape).lineTo(0.76, -10.99);
        ((GeneralPath) shape).lineTo(0.87, -10.99);
        ((GeneralPath) shape).lineTo(0.99, -11.0);
        ((GeneralPath) shape).lineTo(1.04, -11.01);
        ((GeneralPath) shape).lineTo(1.08, -11.02);
        ((GeneralPath) shape).lineTo(1.13, -11.04);
        ((GeneralPath) shape).lineTo(1.18, -11.06);
        ((GeneralPath) shape).lineTo(1.22, -11.08);
        ((GeneralPath) shape).lineTo(1.27, -11.1);
        ((GeneralPath) shape).lineTo(1.31, -11.13);
        ((GeneralPath) shape).lineTo(1.35, -11.16);
        ((GeneralPath) shape).lineTo(1.39, -11.19);
        ((GeneralPath) shape).lineTo(1.42, -11.22);
        ((GeneralPath) shape).lineTo(1.46, -11.26);
        ((GeneralPath) shape).lineTo(1.49, -11.3);
        ((GeneralPath) shape).lineTo(1.52, -11.34);
        ((GeneralPath) shape).lineTo(1.54, -11.38);
        ((GeneralPath) shape).lineTo(1.56, -11.43);
        ((GeneralPath) shape).lineTo(1.58, -11.47);
        ((GeneralPath) shape).lineTo(1.61, -11.55);
        ((GeneralPath) shape).lineTo(1.63, -11.64);
        ((GeneralPath) shape).lineTo(1.64, -11.72);
        ((GeneralPath) shape).lineTo(1.64, -11.8);
        ((GeneralPath) shape).lineTo(1.25, -11.8);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.64, -11.8);
        ((GeneralPath) shape).lineTo(1.63, -11.89);
        ((GeneralPath) shape).lineTo(1.62, -11.99);
        ((GeneralPath) shape).lineTo(1.61, -12.05);
        ((GeneralPath) shape).lineTo(1.59, -12.11);
        ((GeneralPath) shape).lineTo(1.57, -12.16);
        ((GeneralPath) shape).lineTo(1.55, -12.22);
        ((GeneralPath) shape).lineTo(1.51, -12.27);
        ((GeneralPath) shape).lineTo(1.48, -12.33);
        ((GeneralPath) shape).lineTo(1.44, -12.37);
        ((GeneralPath) shape).lineTo(1.4, -12.42);
        ((GeneralPath) shape).lineTo(1.35, -12.45);
        ((GeneralPath) shape).lineTo(1.3, -12.49);
        ((GeneralPath) shape).lineTo(1.25, -12.52);
        ((GeneralPath) shape).lineTo(1.19, -12.54);
        ((GeneralPath) shape).lineTo(1.14, -12.56);
        ((GeneralPath) shape).lineTo(1.08, -12.58);
        ((GeneralPath) shape).lineTo(1.03, -12.59);
        ((GeneralPath) shape).lineTo(0.97, -12.6);
        ((GeneralPath) shape).lineTo(0.85, -12.61);
        ((GeneralPath) shape).lineTo(0.73, -12.62);
        ((GeneralPath) shape).lineTo(0.62, -12.62);
        ((GeneralPath) shape).lineTo(0.5, -12.62);
        ((GeneralPath) shape).lineTo(-0.5, -12.62);
        ((GeneralPath) shape).lineTo(-0.5, -9.79);
        ((GeneralPath) shape).lineTo(-0.11, -9.79);
        ((GeneralPath) shape).lineTo(-0.11, -10.98);
        ((GeneralPath) shape).lineTo(-0.11, -11.32);
        ((GeneralPath) shape).lineTo(-0.11, -12.27);
        ((GeneralPath) shape).lineTo(0.62, -12.27);
        ((GeneralPath) shape).lineTo(0.74, -12.27);
        ((GeneralPath) shape).lineTo(0.86, -12.26);
        ((GeneralPath) shape).lineTo(0.91, -12.25);
        ((GeneralPath) shape).lineTo(0.96, -12.24);
        ((GeneralPath) shape).lineTo(1.01, -12.22);
        ((GeneralPath) shape).lineTo(1.06, -12.19);
        ((GeneralPath) shape).lineTo(1.09, -12.17);
        ((GeneralPath) shape).lineTo(1.12, -12.14);
        ((GeneralPath) shape).lineTo(1.15, -12.11);
        ((GeneralPath) shape).lineTo(1.17, -12.08);
        ((GeneralPath) shape).lineTo(1.19, -12.04);
        ((GeneralPath) shape).lineTo(1.21, -12.01);
        ((GeneralPath) shape).lineTo(1.22, -11.97);
        ((GeneralPath) shape).lineTo(1.23, -11.93);
        ((GeneralPath) shape).lineTo(1.24, -11.86);
        ((GeneralPath) shape).lineTo(1.25, -11.8);
        ((GeneralPath) shape).lineTo(1.64, -11.8);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.48, -10.76);
        ((GeneralPath) shape).lineTo(3.48, -10.7);
        ((GeneralPath) shape).lineTo(3.47, -10.64);
        ((GeneralPath) shape).lineTo(3.46, -10.58);
        ((GeneralPath) shape).lineTo(3.45, -10.53);
        ((GeneralPath) shape).lineTo(3.44, -10.47);
        ((GeneralPath) shape).lineTo(3.42, -10.41);
        ((GeneralPath) shape).lineTo(3.4, -10.35);
        ((GeneralPath) shape).lineTo(3.38, -10.32);
        ((GeneralPath) shape).lineTo(3.36, -10.28);
        ((GeneralPath) shape).lineTo(3.34, -10.25);
        ((GeneralPath) shape).lineTo(3.32, -10.22);
        ((GeneralPath) shape).lineTo(3.29, -10.19);
        ((GeneralPath) shape).lineTo(3.26, -10.16);
        ((GeneralPath) shape).lineTo(3.23, -10.14);
        ((GeneralPath) shape).lineTo(3.2, -10.12);
        ((GeneralPath) shape).lineTo(3.16, -10.1);
        ((GeneralPath) shape).lineTo(3.13, -10.08);
        ((GeneralPath) shape).lineTo(3.09, -10.07);
        ((GeneralPath) shape).lineTo(3.05, -10.05);
        ((GeneralPath) shape).lineTo(3.01, -10.05);
        ((GeneralPath) shape).lineTo(2.97, -10.04);
        ((GeneralPath) shape).lineTo(2.93, -10.04);
        ((GeneralPath) shape).lineTo(2.9, -10.04);
        ((GeneralPath) shape).lineTo(2.85, -10.04);
        ((GeneralPath) shape).lineTo(2.81, -10.04);
        ((GeneralPath) shape).lineTo(2.77, -10.04);
        ((GeneralPath) shape).lineTo(2.74, -10.05);
        ((GeneralPath) shape).lineTo(2.7, -10.06);
        ((GeneralPath) shape).lineTo(2.66, -10.08);
        ((GeneralPath) shape).lineTo(2.62, -10.1);
        ((GeneralPath) shape).lineTo(2.59, -10.12);
        ((GeneralPath) shape).lineTo(2.56, -10.14);
        ((GeneralPath) shape).lineTo(2.52, -10.16);
        ((GeneralPath) shape).lineTo(2.5, -10.19);
        ((GeneralPath) shape).lineTo(2.47, -10.22);
        ((GeneralPath) shape).lineTo(2.44, -10.25);
        ((GeneralPath) shape).lineTo(2.42, -10.29);
        ((GeneralPath) shape).lineTo(2.4, -10.32);
        ((GeneralPath) shape).lineTo(2.38, -10.36);
        ((GeneralPath) shape).lineTo(2.36, -10.41);
        ((GeneralPath) shape).lineTo(2.35, -10.47);
        ((GeneralPath) shape).lineTo(2.33, -10.53);
        ((GeneralPath) shape).lineTo(2.32, -10.59);
        ((GeneralPath) shape).lineTo(2.31, -10.64);
        ((GeneralPath) shape).lineTo(2.3, -10.7);
        ((GeneralPath) shape).lineTo(1.95, -10.7);
        ((GeneralPath) shape).lineTo(1.96, -10.57);
        ((GeneralPath) shape).lineTo(1.98, -10.48);
        ((GeneralPath) shape).lineTo(2.0, -10.39);
        ((GeneralPath) shape).lineTo(2.03, -10.29);
        ((GeneralPath) shape).lineTo(2.07, -10.21);
        ((GeneralPath) shape).lineTo(2.11, -10.14);
        ((GeneralPath) shape).lineTo(2.15, -10.08);
        ((GeneralPath) shape).lineTo(2.2, -10.02);
        ((GeneralPath) shape).lineTo(2.25, -9.96);
        ((GeneralPath) shape).lineTo(2.31, -9.91);
        ((GeneralPath) shape).lineTo(2.37, -9.87);
        ((GeneralPath) shape).lineTo(2.43, -9.83);
        ((GeneralPath) shape).lineTo(2.5, -9.8);
        ((GeneralPath) shape).lineTo(2.55, -9.78);
        ((GeneralPath) shape).lineTo(2.59, -9.77);
        ((GeneralPath) shape).lineTo(2.64, -9.75);
        ((GeneralPath) shape).lineTo(2.69, -9.74);
        ((GeneralPath) shape).lineTo(2.74, -9.74);
        ((GeneralPath) shape).lineTo(2.79, -9.73);
        ((GeneralPath) shape).lineTo(2.84, -9.73);
        ((GeneralPath) shape).lineTo(2.89, -9.73);
        ((GeneralPath) shape).lineTo(2.95, -9.73);
        ((GeneralPath) shape).lineTo(3.0, -9.74);
        ((GeneralPath) shape).lineTo(3.06, -9.74);
        ((GeneralPath) shape).lineTo(3.12, -9.75);
        ((GeneralPath) shape).lineTo(3.16, -9.76);
        ((GeneralPath) shape).lineTo(3.21, -9.77);
        ((GeneralPath) shape).lineTo(3.25, -9.79);
        ((GeneralPath) shape).lineTo(3.3, -9.8);
        ((GeneralPath) shape).lineTo(3.34, -9.82);
        ((GeneralPath) shape).lineTo(3.38, -9.85);
        ((GeneralPath) shape).lineTo(3.42, -9.87);
        ((GeneralPath) shape).lineTo(3.46, -9.9);
        ((GeneralPath) shape).lineTo(3.51, -9.95);
        ((GeneralPath) shape).lineTo(3.57, -10.0);
        ((GeneralPath) shape).lineTo(3.62, -10.06);
        ((GeneralPath) shape).lineTo(3.66, -10.12);
        ((GeneralPath) shape).lineTo(3.7, -10.19);
        ((GeneralPath) shape).lineTo(3.73, -10.25);
        ((GeneralPath) shape).lineTo(3.76, -10.33);
        ((GeneralPath) shape).lineTo(3.78, -10.4);
        ((GeneralPath) shape).lineTo(3.8, -10.5);
        ((GeneralPath) shape).lineTo(3.82, -10.61);
        ((GeneralPath) shape).lineTo(3.83, -10.71);
        ((GeneralPath) shape).lineTo(3.48, -10.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.89, -11.91);
        ((GeneralPath) shape).lineTo(2.84, -11.91);
        ((GeneralPath) shape).lineTo(2.79, -11.91);
        ((GeneralPath) shape).lineTo(2.74, -11.9);
        ((GeneralPath) shape).lineTo(2.69, -11.9);
        ((GeneralPath) shape).lineTo(2.64, -11.89);
        ((GeneralPath) shape).lineTo(2.59, -11.88);
        ((GeneralPath) shape).lineTo(2.55, -11.86);
        ((GeneralPath) shape).lineTo(2.5, -11.84);
        ((GeneralPath) shape).lineTo(2.45, -11.82);
        ((GeneralPath) shape).lineTo(2.41, -11.8);
        ((GeneralPath) shape).lineTo(2.37, -11.77);
        ((GeneralPath) shape).lineTo(2.32, -11.74);
        ((GeneralPath) shape).lineTo(2.28, -11.71);
        ((GeneralPath) shape).lineTo(2.25, -11.67);
        ((GeneralPath) shape).lineTo(2.21, -11.64);
        ((GeneralPath) shape).lineTo(2.18, -11.6);
        ((GeneralPath) shape).lineTo(2.15, -11.56);
        ((GeneralPath) shape).lineTo(2.12, -11.52);
        ((GeneralPath) shape).lineTo(2.09, -11.48);
        ((GeneralPath) shape).lineTo(2.07, -11.43);
        ((GeneralPath) shape).lineTo(2.04, -11.39);
        ((GeneralPath) shape).lineTo(2.03, -11.34);
        ((GeneralPath) shape).lineTo(2.01, -11.29);
        ((GeneralPath) shape).lineTo(2.0, -11.24);
        ((GeneralPath) shape).lineTo(1.97, -11.14);
        ((GeneralPath) shape).lineTo(1.96, -11.03);
        ((GeneralPath) shape).lineTo(1.95, -10.93);
        ((GeneralPath) shape).lineTo(1.95, -10.82);
        ((GeneralPath) shape).lineTo(1.95, -10.7);
        ((GeneralPath) shape).lineTo(2.3, -10.7);
        ((GeneralPath) shape).lineTo(2.3, -10.76);
        ((GeneralPath) shape).lineTo(2.3, -10.82);
        ((GeneralPath) shape).lineTo(2.3, -10.88);
        ((GeneralPath) shape).lineTo(2.3, -10.94);
        ((GeneralPath) shape).lineTo(2.31, -11.0);
        ((GeneralPath) shape).lineTo(2.32, -11.06);
        ((GeneralPath) shape).lineTo(2.33, -11.12);
        ((GeneralPath) shape).lineTo(2.35, -11.17);
        ((GeneralPath) shape).lineTo(2.36, -11.23);
        ((GeneralPath) shape).lineTo(2.38, -11.29);
        ((GeneralPath) shape).lineTo(2.4, -11.32);
        ((GeneralPath) shape).lineTo(2.42, -11.36);
        ((GeneralPath) shape).lineTo(2.44, -11.39);
        ((GeneralPath) shape).lineTo(2.47, -11.42);
        ((GeneralPath) shape).lineTo(2.5, -11.45);
        ((GeneralPath) shape).lineTo(2.53, -11.48);
        ((GeneralPath) shape).lineTo(2.56, -11.5);
        ((GeneralPath) shape).lineTo(2.59, -11.53);
        ((GeneralPath) shape).lineTo(2.62, -11.55);
        ((GeneralPath) shape).lineTo(2.66, -11.56);
        ((GeneralPath) shape).lineTo(2.7, -11.58);
        ((GeneralPath) shape).lineTo(2.74, -11.59);
        ((GeneralPath) shape).lineTo(2.78, -11.6);
        ((GeneralPath) shape).lineTo(2.82, -11.6);
        ((GeneralPath) shape).lineTo(2.86, -11.6);
        ((GeneralPath) shape).lineTo(2.9, -11.6);
        ((GeneralPath) shape).lineTo(2.89, -11.91);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.9, -11.6);
        ((GeneralPath) shape).lineTo(2.93, -11.6);
        ((GeneralPath) shape).lineTo(2.97, -11.6);
        ((GeneralPath) shape).lineTo(3.01, -11.6);
        ((GeneralPath) shape).lineTo(3.05, -11.59);
        ((GeneralPath) shape).lineTo(3.09, -11.58);
        ((GeneralPath) shape).lineTo(3.13, -11.56);
        ((GeneralPath) shape).lineTo(3.16, -11.54);
        ((GeneralPath) shape).lineTo(3.2, -11.52);
        ((GeneralPath) shape).lineTo(3.23, -11.5);
        ((GeneralPath) shape).lineTo(3.26, -11.48);
        ((GeneralPath) shape).lineTo(3.29, -11.45);
        ((GeneralPath) shape).lineTo(3.31, -11.42);
        ((GeneralPath) shape).lineTo(3.34, -11.39);
        ((GeneralPath) shape).lineTo(3.36, -11.36);
        ((GeneralPath) shape).lineTo(3.38, -11.32);
        ((GeneralPath) shape).lineTo(3.4, -11.29);
        ((GeneralPath) shape).lineTo(3.42, -11.23);
        ((GeneralPath) shape).lineTo(3.44, -11.17);
        ((GeneralPath) shape).lineTo(3.45, -11.12);
        ((GeneralPath) shape).lineTo(3.46, -11.06);
        ((GeneralPath) shape).lineTo(3.47, -11.0);
        ((GeneralPath) shape).lineTo(3.48, -10.94);
        ((GeneralPath) shape).lineTo(3.48, -10.88);
        ((GeneralPath) shape).lineTo(3.48, -10.82);
        ((GeneralPath) shape).lineTo(3.48, -10.76);
        ((GeneralPath) shape).lineTo(3.83, -10.71);
        ((GeneralPath) shape).lineTo(3.83, -10.82);
        ((GeneralPath) shape).lineTo(3.83, -10.94);
        ((GeneralPath) shape).lineTo(3.82, -11.06);
        ((GeneralPath) shape).lineTo(3.8, -11.16);
        ((GeneralPath) shape).lineTo(3.78, -11.25);
        ((GeneralPath) shape).lineTo(3.75, -11.35);
        ((GeneralPath) shape).lineTo(3.71, -11.44);
        ((GeneralPath) shape).lineTo(3.67, -11.5);
        ((GeneralPath) shape).lineTo(3.63, -11.56);
        ((GeneralPath) shape).lineTo(3.58, -11.62);
        ((GeneralPath) shape).lineTo(3.53, -11.68);
        ((GeneralPath) shape).lineTo(3.48, -11.73);
        ((GeneralPath) shape).lineTo(3.42, -11.77);
        ((GeneralPath) shape).lineTo(3.35, -11.81);
        ((GeneralPath) shape).lineTo(3.28, -11.84);
        ((GeneralPath) shape).lineTo(3.24, -11.86);
        ((GeneralPath) shape).lineTo(3.19, -11.88);
        ((GeneralPath) shape).lineTo(3.14, -11.89);
        ((GeneralPath) shape).lineTo(3.09, -11.9);
        ((GeneralPath) shape).lineTo(3.04, -11.9);
        ((GeneralPath) shape).lineTo(2.99, -11.91);
        ((GeneralPath) shape).lineTo(2.94, -11.91);
        ((GeneralPath) shape).lineTo(2.89, -11.91);
        ((GeneralPath) shape).lineTo(2.9, -11.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.59, -11.17);
        ((GeneralPath) shape).lineTo(4.57, -11.18);
        ((GeneralPath) shape).lineTo(4.55, -11.2);
        ((GeneralPath) shape).lineTo(4.53, -11.22);
        ((GeneralPath) shape).lineTo(4.52, -11.25);
        ((GeneralPath) shape).lineTo(4.51, -11.27);
        ((GeneralPath) shape).lineTo(4.51, -11.3);
        ((GeneralPath) shape).lineTo(4.51, -11.33);
        ((GeneralPath) shape).lineTo(4.51, -11.36);
        ((GeneralPath) shape).lineTo(4.52, -11.39);
        ((GeneralPath) shape).lineTo(4.52, -11.42);
        ((GeneralPath) shape).lineTo(4.54, -11.45);
        ((GeneralPath) shape).lineTo(4.56, -11.48);
        ((GeneralPath) shape).lineTo(4.58, -11.51);
        ((GeneralPath) shape).lineTo(4.6, -11.53);
        ((GeneralPath) shape).lineTo(4.63, -11.55);
        ((GeneralPath) shape).lineTo(4.66, -11.57);
        ((GeneralPath) shape).lineTo(4.7, -11.58);
        ((GeneralPath) shape).lineTo(4.73, -11.59);
        ((GeneralPath) shape).lineTo(4.77, -11.6);
        ((GeneralPath) shape).lineTo(4.81, -11.61);
        ((GeneralPath) shape).lineTo(4.84, -11.61);
        ((GeneralPath) shape).lineTo(4.88, -11.62);
        ((GeneralPath) shape).lineTo(4.92, -11.62);
        ((GeneralPath) shape).lineTo(4.99, -11.61);
        ((GeneralPath) shape).lineTo(5.07, -11.6);
        ((GeneralPath) shape).lineTo(5.14, -11.59);
        ((GeneralPath) shape).lineTo(5.21, -11.56);
        ((GeneralPath) shape).lineTo(5.24, -11.55);
        ((GeneralPath) shape).lineTo(5.27, -11.53);
        ((GeneralPath) shape).lineTo(5.29, -11.51);
        ((GeneralPath) shape).lineTo(5.32, -11.49);
        ((GeneralPath) shape).lineTo(5.34, -11.47);
        ((GeneralPath) shape).lineTo(5.36, -11.44);
        ((GeneralPath) shape).lineTo(5.37, -11.41);
        ((GeneralPath) shape).lineTo(5.39, -11.38);
        ((GeneralPath) shape).lineTo(5.4, -11.33);
        ((GeneralPath) shape).lineTo(5.41, -11.27);
        ((GeneralPath) shape).lineTo(5.75, -11.27);
        ((GeneralPath) shape).lineTo(5.75, -11.33);
        ((GeneralPath) shape).lineTo(5.74, -11.38);
        ((GeneralPath) shape).lineTo(5.73, -11.43);
        ((GeneralPath) shape).lineTo(5.72, -11.48);
        ((GeneralPath) shape).lineTo(5.69, -11.54);
        ((GeneralPath) shape).lineTo(5.66, -11.59);
        ((GeneralPath) shape).lineTo(5.63, -11.64);
        ((GeneralPath) shape).lineTo(5.59, -11.69);
        ((GeneralPath) shape).lineTo(5.54, -11.73);
        ((GeneralPath) shape).lineTo(5.49, -11.76);
        ((GeneralPath) shape).lineTo(5.44, -11.79);
        ((GeneralPath) shape).lineTo(5.39, -11.82);
        ((GeneralPath) shape).lineTo(5.33, -11.84);
        ((GeneralPath) shape).lineTo(5.28, -11.86);
        ((GeneralPath) shape).lineTo(5.22, -11.88);
        ((GeneralPath) shape).lineTo(5.17, -11.89);
        ((GeneralPath) shape).lineTo(5.11, -11.9);
        ((GeneralPath) shape).lineTo(5.06, -11.91);
        ((GeneralPath) shape).lineTo(5.0, -11.91);
        ((GeneralPath) shape).lineTo(4.94, -11.91);
        ((GeneralPath) shape).lineTo(4.88, -11.91);
        ((GeneralPath) shape).lineTo(4.82, -11.91);
        ((GeneralPath) shape).lineTo(4.77, -11.9);
        ((GeneralPath) shape).lineTo(4.71, -11.89);
        ((GeneralPath) shape).lineTo(4.65, -11.88);
        ((GeneralPath) shape).lineTo(4.6, -11.86);
        ((GeneralPath) shape).lineTo(4.54, -11.84);
        ((GeneralPath) shape).lineTo(4.49, -11.82);
        ((GeneralPath) shape).lineTo(4.45, -11.8);
        ((GeneralPath) shape).lineTo(4.42, -11.78);
        ((GeneralPath) shape).lineTo(4.38, -11.76);
        ((GeneralPath) shape).lineTo(4.35, -11.73);
        ((GeneralPath) shape).lineTo(4.32, -11.71);
        ((GeneralPath) shape).lineTo(4.3, -11.68);
        ((GeneralPath) shape).lineTo(4.27, -11.65);
        ((GeneralPath) shape).lineTo(4.25, -11.62);
        ((GeneralPath) shape).lineTo(4.23, -11.58);
        ((GeneralPath) shape).lineTo(4.21, -11.55);
        ((GeneralPath) shape).lineTo(4.2, -11.51);
        ((GeneralPath) shape).lineTo(4.19, -11.47);
        ((GeneralPath) shape).lineTo(4.18, -11.43);
        ((GeneralPath) shape).lineTo(4.17, -11.4);
        ((GeneralPath) shape).lineTo(4.16, -11.36);
        ((GeneralPath) shape).lineTo(4.16, -11.32);
        ((GeneralPath) shape).lineTo(4.16, -11.26);
        ((GeneralPath) shape).lineTo(4.17, -11.2);
        ((GeneralPath) shape).lineTo(4.18, -11.14);
        ((GeneralPath) shape).lineTo(4.2, -11.09);
        ((GeneralPath) shape).lineTo(4.22, -11.04);
        ((GeneralPath) shape).lineTo(4.25, -11.0);
        ((GeneralPath) shape).lineTo(4.28, -10.96);
        ((GeneralPath) shape).lineTo(4.32, -10.92);
        ((GeneralPath) shape).lineTo(4.36, -10.89);
        ((GeneralPath) shape).lineTo(4.41, -10.86);
        ((GeneralPath) shape).lineTo(4.59, -11.17);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.95, -9.73);
        ((GeneralPath) shape).lineTo(5.04, -9.73);
        ((GeneralPath) shape).lineTo(5.13, -9.74);
        ((GeneralPath) shape).lineTo(5.21, -9.75);
        ((GeneralPath) shape).lineTo(5.29, -9.77);
        ((GeneralPath) shape).lineTo(5.37, -9.8);
        ((GeneralPath) shape).lineTo(5.45, -9.83);
        ((GeneralPath) shape).lineTo(5.49, -9.85);
        ((GeneralPath) shape).lineTo(5.53, -9.87);
        ((GeneralPath) shape).lineTo(5.56, -9.9);
        ((GeneralPath) shape).lineTo(5.6, -9.93);
        ((GeneralPath) shape).lineTo(5.63, -9.96);
        ((GeneralPath) shape).lineTo(5.66, -9.99);
        ((GeneralPath) shape).lineTo(5.69, -10.03);
        ((GeneralPath) shape).lineTo(5.72, -10.07);
        ((GeneralPath) shape).lineTo(5.74, -10.1);
        ((GeneralPath) shape).lineTo(5.76, -10.15);
        ((GeneralPath) shape).lineTo(5.77, -10.19);
        ((GeneralPath) shape).lineTo(5.79, -10.23);
        ((GeneralPath) shape).lineTo(5.8, -10.27);
        ((GeneralPath) shape).lineTo(5.8, -10.32);
        ((GeneralPath) shape).lineTo(5.81, -10.36);
        ((GeneralPath) shape).lineTo(5.81, -10.41);
        ((GeneralPath) shape).lineTo(5.8, -10.48);
        ((GeneralPath) shape).lineTo(5.79, -10.55);
        ((GeneralPath) shape).lineTo(5.78, -10.6);
        ((GeneralPath) shape).lineTo(5.77, -10.64);
        ((GeneralPath) shape).lineTo(5.75, -10.68);
        ((GeneralPath) shape).lineTo(5.72, -10.71);
        ((GeneralPath) shape).lineTo(5.7, -10.75);
        ((GeneralPath) shape).lineTo(5.67, -10.78);
        ((GeneralPath) shape).lineTo(5.64, -10.81);
        ((GeneralPath) shape).lineTo(5.61, -10.83);
        ((GeneralPath) shape).lineTo(5.55, -10.87);
        ((GeneralPath) shape).lineTo(5.49, -10.9);
        ((GeneralPath) shape).lineTo(5.44, -10.92);
        ((GeneralPath) shape).lineTo(5.37, -10.94);
        ((GeneralPath) shape).lineTo(5.17, -11.0);
        ((GeneralPath) shape).lineTo(4.84, -11.07);
        ((GeneralPath) shape).lineTo(4.78, -11.09);
        ((GeneralPath) shape).lineTo(4.72, -11.1);
        ((GeneralPath) shape).lineTo(4.66, -11.13);
        ((GeneralPath) shape).lineTo(4.61, -11.15);
        ((GeneralPath) shape).lineTo(4.59, -11.17);
        ((GeneralPath) shape).lineTo(4.41, -10.86);
        ((GeneralPath) shape).lineTo(4.49, -10.82);
        ((GeneralPath) shape).lineTo(4.57, -10.79);
        ((GeneralPath) shape).lineTo(4.66, -10.76);
        ((GeneralPath) shape).lineTo(4.75, -10.74);
        ((GeneralPath) shape).lineTo(5.14, -10.64);
        ((GeneralPath) shape).lineTo(5.26, -10.61);
        ((GeneralPath) shape).lineTo(5.29, -10.6);
        ((GeneralPath) shape).lineTo(5.32, -10.59);
        ((GeneralPath) shape).lineTo(5.35, -10.57);
        ((GeneralPath) shape).lineTo(5.37, -10.55);
        ((GeneralPath) shape).lineTo(5.39, -10.54);
        ((GeneralPath) shape).lineTo(5.41, -10.52);
        ((GeneralPath) shape).lineTo(5.42, -10.5);
        ((GeneralPath) shape).lineTo(5.43, -10.48);
        ((GeneralPath) shape).lineTo(5.44, -10.45);
        ((GeneralPath) shape).lineTo(5.45, -10.43);
        ((GeneralPath) shape).lineTo(5.45, -10.41);
        ((GeneralPath) shape).lineTo(5.46, -10.38);
        ((GeneralPath) shape).lineTo(5.45, -10.34);
        ((GeneralPath) shape).lineTo(5.45, -10.31);
        ((GeneralPath) shape).lineTo(5.44, -10.27);
        ((GeneralPath) shape).lineTo(5.42, -10.24);
        ((GeneralPath) shape).lineTo(5.41, -10.21);
        ((GeneralPath) shape).lineTo(5.39, -10.18);
        ((GeneralPath) shape).lineTo(5.36, -10.15);
        ((GeneralPath) shape).lineTo(5.33, -10.13);
        ((GeneralPath) shape).lineTo(5.3, -10.11);
        ((GeneralPath) shape).lineTo(5.27, -10.09);
        ((GeneralPath) shape).lineTo(5.2, -10.07);
        ((GeneralPath) shape).lineTo(5.12, -10.05);
        ((GeneralPath) shape).lineTo(5.05, -10.04);
        ((GeneralPath) shape).lineTo(4.97, -10.04);
        ((GeneralPath) shape).lineTo(4.95, -9.73);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.97, -10.04);
        ((GeneralPath) shape).lineTo(4.92, -10.04);
        ((GeneralPath) shape).lineTo(4.86, -10.04);
        ((GeneralPath) shape).lineTo(4.81, -10.05);
        ((GeneralPath) shape).lineTo(4.76, -10.06);
        ((GeneralPath) shape).lineTo(4.71, -10.07);
        ((GeneralPath) shape).lineTo(4.67, -10.1);
        ((GeneralPath) shape).lineTo(4.62, -10.12);
        ((GeneralPath) shape).lineTo(4.58, -10.15);
        ((GeneralPath) shape).lineTo(4.55, -10.19);
        ((GeneralPath) shape).lineTo(4.52, -10.22);
        ((GeneralPath) shape).lineTo(4.49, -10.27);
        ((GeneralPath) shape).lineTo(4.47, -10.31);
        ((GeneralPath) shape).lineTo(4.46, -10.39);
        ((GeneralPath) shape).lineTo(4.44, -10.46);
        ((GeneralPath) shape).lineTo(4.1, -10.46);
        ((GeneralPath) shape).lineTo(4.11, -10.42);
        ((GeneralPath) shape).lineTo(4.11, -10.37);
        ((GeneralPath) shape).lineTo(4.11, -10.32);
        ((GeneralPath) shape).lineTo(4.12, -10.28);
        ((GeneralPath) shape).lineTo(4.13, -10.23);
        ((GeneralPath) shape).lineTo(4.15, -10.19);
        ((GeneralPath) shape).lineTo(4.16, -10.15);
        ((GeneralPath) shape).lineTo(4.18, -10.11);
        ((GeneralPath) shape).lineTo(4.22, -10.05);
        ((GeneralPath) shape).lineTo(4.26, -9.99);
        ((GeneralPath) shape).lineTo(4.3, -9.94);
        ((GeneralPath) shape).lineTo(4.36, -9.89);
        ((GeneralPath) shape).lineTo(4.41, -9.86);
        ((GeneralPath) shape).lineTo(4.47, -9.82);
        ((GeneralPath) shape).lineTo(4.53, -9.79);
        ((GeneralPath) shape).lineTo(4.6, -9.77);
        ((GeneralPath) shape).lineTo(4.69, -9.75);
        ((GeneralPath) shape).lineTo(4.77, -9.74);
        ((GeneralPath) shape).lineTo(4.86, -9.73);
        ((GeneralPath) shape).lineTo(4.95, -9.73);
        ((GeneralPath) shape).lineTo(4.97, -10.04);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.88, -11.03);
        ((GeneralPath) shape).lineTo(7.88, -11.12);
        ((GeneralPath) shape).lineTo(7.88, -11.22);
        ((GeneralPath) shape).lineTo(7.87, -11.32);
        ((GeneralPath) shape).lineTo(7.86, -11.42);
        ((GeneralPath) shape).lineTo(7.86, -11.47);
        ((GeneralPath) shape).lineTo(7.84, -11.52);
        ((GeneralPath) shape).lineTo(7.82, -11.57);
        ((GeneralPath) shape).lineTo(7.79, -11.62);
        ((GeneralPath) shape).lineTo(7.76, -11.66);
        ((GeneralPath) shape).lineTo(7.73, -11.7);
        ((GeneralPath) shape).lineTo(7.7, -11.73);
        ((GeneralPath) shape).lineTo(7.66, -11.77);
        ((GeneralPath) shape).lineTo(7.61, -11.79);
        ((GeneralPath) shape).lineTo(7.57, -11.82);
        ((GeneralPath) shape).lineTo(7.52, -11.84);
        ((GeneralPath) shape).lineTo(7.48, -11.86);
        ((GeneralPath) shape).lineTo(7.4, -11.87);
        ((GeneralPath) shape).lineTo(7.32, -11.89);
        ((GeneralPath) shape).lineTo(7.25, -11.89);
        ((GeneralPath) shape).lineTo(7.17, -11.89);
        ((GeneralPath) shape).lineTo(7.09, -11.89);
        ((GeneralPath) shape).lineTo(7.02, -11.88);
        ((GeneralPath) shape).lineTo(6.95, -11.87);
        ((GeneralPath) shape).lineTo(6.87, -11.84);
        ((GeneralPath) shape).lineTo(6.82, -11.82);
        ((GeneralPath) shape).lineTo(6.78, -11.79);
        ((GeneralPath) shape).lineTo(6.73, -11.76);
        ((GeneralPath) shape).lineTo(6.68, -11.73);
        ((GeneralPath) shape).lineTo(6.64, -11.69);
        ((GeneralPath) shape).lineTo(6.6, -11.65);
        ((GeneralPath) shape).lineTo(6.57, -11.61);
        ((GeneralPath) shape).lineTo(6.54, -11.56);
        ((GeneralPath) shape).lineTo(6.54, -11.85);
        ((GeneralPath) shape).lineTo(6.21, -11.85);
        ((GeneralPath) shape).lineTo(6.21, -9.79);
        ((GeneralPath) shape).lineTo(6.55, -9.79);
        ((GeneralPath) shape).lineTo(6.55, -10.96);
        ((GeneralPath) shape).lineTo(6.55, -11.04);
        ((GeneralPath) shape).lineTo(6.56, -11.11);
        ((GeneralPath) shape).lineTo(6.57, -11.16);
        ((GeneralPath) shape).lineTo(6.58, -11.21);
        ((GeneralPath) shape).lineTo(6.6, -11.27);
        ((GeneralPath) shape).lineTo(6.62, -11.31);
        ((GeneralPath) shape).lineTo(6.65, -11.36);
        ((GeneralPath) shape).lineTo(6.68, -11.4);
        ((GeneralPath) shape).lineTo(6.72, -11.44);
        ((GeneralPath) shape).lineTo(6.76, -11.48);
        ((GeneralPath) shape).lineTo(6.8, -11.5);
        ((GeneralPath) shape).lineTo(6.85, -11.53);
        ((GeneralPath) shape).lineTo(6.89, -11.55);
        ((GeneralPath) shape).lineTo(6.94, -11.57);
        ((GeneralPath) shape).lineTo(6.99, -11.58);
        ((GeneralPath) shape).lineTo(7.04, -11.59);
        ((GeneralPath) shape).lineTo(7.09, -11.59);
        ((GeneralPath) shape).lineTo(7.14, -11.59);
        ((GeneralPath) shape).lineTo(7.17, -11.59);
        ((GeneralPath) shape).lineTo(7.21, -11.59);
        ((GeneralPath) shape).lineTo(7.24, -11.58);
        ((GeneralPath) shape).lineTo(7.27, -11.58);
        ((GeneralPath) shape).lineTo(7.31, -11.57);
        ((GeneralPath) shape).lineTo(7.34, -11.56);
        ((GeneralPath) shape).lineTo(7.36, -11.54);
        ((GeneralPath) shape).lineTo(7.39, -11.52);
        ((GeneralPath) shape).lineTo(7.42, -11.5);
        ((GeneralPath) shape).lineTo(7.44, -11.48);
        ((GeneralPath) shape).lineTo(7.46, -11.45);
        ((GeneralPath) shape).lineTo(7.48, -11.43);
        ((GeneralPath) shape).lineTo(7.5, -11.37);
        ((GeneralPath) shape).lineTo(7.52, -11.3);
        ((GeneralPath) shape).lineTo(7.53, -11.24);
        ((GeneralPath) shape).lineTo(7.53, -11.18);
        ((GeneralPath) shape).lineTo(7.53, -9.79);
        ((GeneralPath) shape).lineTo(7.88, -9.79);
        ((GeneralPath) shape).lineTo(7.88, -11.03);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.3, -2.72);
        ((GeneralPath) shape).lineTo(0.36, -7.94);
        ((GeneralPath) shape).lineTo(4.03, -2.72);
        ((GeneralPath) shape).lineTo(0.36, 2.51);
        ((GeneralPath) shape).lineTo(-3.3, -2.72);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.21, -5.4);
        ((GeneralPath) shape).lineTo(1.26, -5.4);
        ((GeneralPath) shape).lineTo(1.13, -4.02);
        ((GeneralPath) shape).lineTo(-0.34, -4.02);
        ((GeneralPath) shape).lineTo(-0.21, -5.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(RED);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.48, -2.69);
        ((GeneralPath) shape).lineTo(0.99, -2.69);
        ((GeneralPath) shape).lineTo(0.86, -1.31);
        ((GeneralPath) shape).lineTo(-0.61, -1.31);
        ((GeneralPath) shape).lineTo(-0.48, -2.69);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.21, -5.4);
        ((GeneralPath) shape).lineTo(1.26, -5.4);
        ((GeneralPath) shape).lineTo(0.74, 0.0);
        ((GeneralPath) shape).lineTo(-0.74, 0.0);
        ((GeneralPath) shape).lineTo(-0.21, -5.4);
        ((GeneralPath) shape).closePath();

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

