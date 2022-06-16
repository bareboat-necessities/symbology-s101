

import java.awt.*;
import java.awt.geom.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 */
public class BOYINL03MR {

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
        g.transform(new AffineTransform(3.774657f, 0, 0, 3.774657f, 28.687393f, 47.600353f));

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
        ((GeneralPath) shape).moveTo(-0.65, -4.0);
        ((GeneralPath) shape).lineTo(0.65, -4.0);
        ((GeneralPath) shape).lineTo(0.65, -5.3);
        ((GeneralPath) shape).lineTo(-0.65, -5.3);
        ((GeneralPath) shape).lineTo(-0.65, -4.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.54, 0.06);
        ((GeneralPath) shape).lineTo(-3.87, -1.84);
        ((GeneralPath) shape).lineTo(-2.59, -3.67);

        g.setStroke(new BasicStroke(0.24f, 0, 0, 4));
        g.draw(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.5, -5.22);
        ((GeneralPath) shape).lineTo(0.0, -7.37);
        ((GeneralPath) shape).lineTo(1.49, -5.24);

        g.draw(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.64, -3.6);
        ((GeneralPath) shape).lineTo(3.88, -1.84);
        ((GeneralPath) shape).lineTo(2.46, 0.17);

        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.45, 1.62);
        ((GeneralPath) shape).lineTo(0.0, 3.69);
        ((GeneralPath) shape).lineTo(-1.38, 1.72);

        g.draw(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.34, -5.1);
        ((GeneralPath) shape).lineTo(0.0, -7.02);
        ((GeneralPath) shape).lineTo(1.33, -5.12);

        g.draw(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.37, -0.05);
        ((GeneralPath) shape).lineTo(-3.63, -1.84);
        ((GeneralPath) shape).lineTo(-2.43, -3.55);

        g.draw(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.48, -3.49);
        ((GeneralPath) shape).lineTo(3.63, -1.84);
        ((GeneralPath) shape).lineTo(2.3, 0.06);

        g.draw(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.29, 1.51);
        ((GeneralPath) shape).lineTo(0.0, 3.34);
        ((GeneralPath) shape).lineTo(-1.21, 1.61);

        g.draw(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.94, -11.54);
        ((GeneralPath) shape).lineTo(-5.99, -11.58);
        ((GeneralPath) shape).lineTo(-6.04, -11.62);
        ((GeneralPath) shape).lineTo(-6.1, -11.65);
        ((GeneralPath) shape).lineTo(-6.15, -11.68);
        ((GeneralPath) shape).lineTo(-6.24, -11.7);
        ((GeneralPath) shape).lineTo(-6.32, -11.72);
        ((GeneralPath) shape).lineTo(-6.4, -11.72);
        ((GeneralPath) shape).lineTo(-6.49, -11.72);
        ((GeneralPath) shape).lineTo(-6.54, -11.72);
        ((GeneralPath) shape).lineTo(-6.59, -11.72);
        ((GeneralPath) shape).lineTo(-6.64, -11.71);
        ((GeneralPath) shape).lineTo(-6.7, -11.7);
        ((GeneralPath) shape).lineTo(-6.75, -11.68);
        ((GeneralPath) shape).lineTo(-6.8, -11.66);
        ((GeneralPath) shape).lineTo(-6.84, -11.64);
        ((GeneralPath) shape).lineTo(-6.89, -11.62);
        ((GeneralPath) shape).lineTo(-6.94, -11.59);
        ((GeneralPath) shape).lineTo(-6.98, -11.56);
        ((GeneralPath) shape).lineTo(-7.02, -11.53);
        ((GeneralPath) shape).lineTo(-7.06, -11.49);
        ((GeneralPath) shape).lineTo(-7.1, -11.46);
        ((GeneralPath) shape).lineTo(-7.13, -11.42);
        ((GeneralPath) shape).lineTo(-7.16, -11.37);
        ((GeneralPath) shape).lineTo(-7.19, -11.33);
        ((GeneralPath) shape).lineTo(-7.19, -11.67);
        ((GeneralPath) shape).lineTo(-7.59, -11.67);
        ((GeneralPath) shape).lineTo(-7.59, -9.18);
        ((GeneralPath) shape).lineTo(-7.18, -9.18);
        ((GeneralPath) shape).lineTo(-7.18, -10.65);
        ((GeneralPath) shape).lineTo(-7.17, -10.71);
        ((GeneralPath) shape).lineTo(-7.17, -10.78);
        ((GeneralPath) shape).lineTo(-7.16, -10.83);
        ((GeneralPath) shape).lineTo(-7.15, -10.88);
        ((GeneralPath) shape).lineTo(-7.14, -10.92);
        ((GeneralPath) shape).lineTo(-7.13, -10.97);
        ((GeneralPath) shape).lineTo(-7.11, -11.02);
        ((GeneralPath) shape).lineTo(-7.09, -11.06);
        ((GeneralPath) shape).lineTo(-7.06, -11.1);
        ((GeneralPath) shape).lineTo(-7.03, -11.14);
        ((GeneralPath) shape).lineTo(-6.99, -11.19);
        ((GeneralPath) shape).lineTo(-6.94, -11.24);
        ((GeneralPath) shape).lineTo(-6.88, -11.28);
        ((GeneralPath) shape).lineTo(-6.82, -11.31);
        ((GeneralPath) shape).lineTo(-6.76, -11.33);
        ((GeneralPath) shape).lineTo(-6.7, -11.35);
        ((GeneralPath) shape).lineTo(-6.63, -11.36);
        ((GeneralPath) shape).lineTo(-6.56, -11.36);
        ((GeneralPath) shape).lineTo(-6.51, -11.36);
        ((GeneralPath) shape).lineTo(-6.46, -11.35);
        ((GeneralPath) shape).lineTo(-6.41, -11.34);
        ((GeneralPath) shape).lineTo(-6.36, -11.32);
        ((GeneralPath) shape).lineTo(-6.32, -11.3);
        ((GeneralPath) shape).lineTo(-6.28, -11.27);
        ((GeneralPath) shape).lineTo(-6.25, -11.24);
        ((GeneralPath) shape).lineTo(-5.94, -11.54);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.04f, 0, 0, 4));
        g.draw(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-6.25, -11.24);
        ((GeneralPath) shape).lineTo(-6.21, -11.2);
        ((GeneralPath) shape).lineTo(-6.19, -11.16);
        ((GeneralPath) shape).lineTo(-6.16, -11.08);
        ((GeneralPath) shape).lineTo(-6.14, -11.01);
        ((GeneralPath) shape).lineTo(-6.13, -10.93);
        ((GeneralPath) shape).lineTo(-6.13, -10.85);
        ((GeneralPath) shape).lineTo(-6.13, -9.18);
        ((GeneralPath) shape).lineTo(-5.7, -9.18);
        ((GeneralPath) shape).lineTo(-5.7, -10.65);
        ((GeneralPath) shape).lineTo(-5.7, -10.71);
        ((GeneralPath) shape).lineTo(-5.7, -10.78);
        ((GeneralPath) shape).lineTo(-5.69, -10.84);
        ((GeneralPath) shape).lineTo(-5.67, -10.91);
        ((GeneralPath) shape).lineTo(-5.66, -10.95);
        ((GeneralPath) shape).lineTo(-5.65, -11.0);
        ((GeneralPath) shape).lineTo(-5.63, -11.04);
        ((GeneralPath) shape).lineTo(-5.61, -11.08);
        ((GeneralPath) shape).lineTo(-5.58, -11.12);
        ((GeneralPath) shape).lineTo(-5.56, -11.16);
        ((GeneralPath) shape).lineTo(-5.52, -11.2);
        ((GeneralPath) shape).lineTo(-5.49, -11.23);
        ((GeneralPath) shape).lineTo(-5.45, -11.26);
        ((GeneralPath) shape).lineTo(-5.4, -11.29);
        ((GeneralPath) shape).lineTo(-5.35, -11.31);
        ((GeneralPath) shape).lineTo(-5.3, -11.33);
        ((GeneralPath) shape).lineTo(-5.25, -11.34);
        ((GeneralPath) shape).lineTo(-5.2, -11.35);
        ((GeneralPath) shape).lineTo(-5.15, -11.36);
        ((GeneralPath) shape).lineTo(-5.1, -11.36);
        ((GeneralPath) shape).lineTo(-5.03, -11.36);
        ((GeneralPath) shape).lineTo(-4.97, -11.34);
        ((GeneralPath) shape).lineTo(-4.9, -11.32);
        ((GeneralPath) shape).lineTo(-4.84, -11.29);
        ((GeneralPath) shape).lineTo(-4.81, -11.27);
        ((GeneralPath) shape).lineTo(-4.78, -11.24);
        ((GeneralPath) shape).lineTo(-4.76, -11.22);
        ((GeneralPath) shape).lineTo(-4.74, -11.19);
        ((GeneralPath) shape).lineTo(-4.72, -11.15);
        ((GeneralPath) shape).lineTo(-4.7, -11.12);
        ((GeneralPath) shape).lineTo(-4.69, -11.09);
        ((GeneralPath) shape).lineTo(-4.68, -11.05);
        ((GeneralPath) shape).lineTo(-4.67, -10.96);
        ((GeneralPath) shape).lineTo(-4.66, -10.88);
        ((GeneralPath) shape).lineTo(-4.66, -10.79);
        ((GeneralPath) shape).lineTo(-4.66, -10.71);
        ((GeneralPath) shape).lineTo(-4.66, -9.18);
        ((GeneralPath) shape).lineTo(-4.25, -9.18);
        ((GeneralPath) shape).lineTo(-4.25, -10.67);
        ((GeneralPath) shape).lineTo(-4.25, -10.79);
        ((GeneralPath) shape).lineTo(-4.25, -10.91);
        ((GeneralPath) shape).lineTo(-4.25, -11.03);
        ((GeneralPath) shape).lineTo(-4.26, -11.15);
        ((GeneralPath) shape).lineTo(-4.27, -11.19);
        ((GeneralPath) shape).lineTo(-4.28, -11.24);
        ((GeneralPath) shape).lineTo(-4.29, -11.28);
        ((GeneralPath) shape).lineTo(-4.31, -11.32);
        ((GeneralPath) shape).lineTo(-4.33, -11.36);
        ((GeneralPath) shape).lineTo(-4.35, -11.4);
        ((GeneralPath) shape).lineTo(-4.37, -11.44);
        ((GeneralPath) shape).lineTo(-4.4, -11.48);
        ((GeneralPath) shape).lineTo(-4.43, -11.51);
        ((GeneralPath) shape).lineTo(-4.46, -11.54);
        ((GeneralPath) shape).lineTo(-4.5, -11.57);
        ((GeneralPath) shape).lineTo(-4.53, -11.6);
        ((GeneralPath) shape).lineTo(-4.57, -11.62);
        ((GeneralPath) shape).lineTo(-4.61, -11.64);
        ((GeneralPath) shape).lineTo(-4.65, -11.66);
        ((GeneralPath) shape).lineTo(-4.69, -11.68);
        ((GeneralPath) shape).lineTo(-4.78, -11.7);
        ((GeneralPath) shape).lineTo(-4.86, -11.71);
        ((GeneralPath) shape).lineTo(-4.95, -11.72);
        ((GeneralPath) shape).lineTo(-5.03, -11.72);
        ((GeneralPath) shape).lineTo(-5.09, -11.72);
        ((GeneralPath) shape).lineTo(-5.14, -11.72);
        ((GeneralPath) shape).lineTo(-5.2, -11.71);
        ((GeneralPath) shape).lineTo(-5.25, -11.7);
        ((GeneralPath) shape).lineTo(-5.31, -11.69);
        ((GeneralPath) shape).lineTo(-5.36, -11.67);
        ((GeneralPath) shape).lineTo(-5.41, -11.65);
        ((GeneralPath) shape).lineTo(-5.46, -11.63);
        ((GeneralPath) shape).lineTo(-5.51, -11.6);
        ((GeneralPath) shape).lineTo(-5.55, -11.57);
        ((GeneralPath) shape).lineTo(-5.6, -11.54);
        ((GeneralPath) shape).lineTo(-5.64, -11.5);
        ((GeneralPath) shape).lineTo(-5.68, -11.47);
        ((GeneralPath) shape).lineTo(-5.72, -11.43);
        ((GeneralPath) shape).lineTo(-5.75, -11.39);
        ((GeneralPath) shape).lineTo(-5.79, -11.34);
        ((GeneralPath) shape).lineTo(-5.82, -11.4);
        ((GeneralPath) shape).lineTo(-5.86, -11.45);
        ((GeneralPath) shape).lineTo(-5.9, -11.5);
        ((GeneralPath) shape).lineTo(-5.94, -11.54);
        ((GeneralPath) shape).lineTo(-6.25, -11.24);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.62, -12.6);
        ((GeneralPath) shape).lineTo(-3.62, -12.12);
        ((GeneralPath) shape).lineTo(-3.2, -12.12);
        ((GeneralPath) shape).lineTo(-3.2, -12.6);
        ((GeneralPath) shape).lineTo(-3.62, -12.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3.62, -11.67);
        ((GeneralPath) shape).lineTo(-3.62, -9.18);
        ((GeneralPath) shape).lineTo(-3.2, -9.18);
        ((GeneralPath) shape).lineTo(-3.2, -11.67);
        ((GeneralPath) shape).lineTo(-3.62, -11.67);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-2.16, -10.84);
        ((GeneralPath) shape).lineTo(-2.19, -10.86);
        ((GeneralPath) shape).lineTo(-2.21, -10.89);
        ((GeneralPath) shape).lineTo(-2.22, -10.91);
        ((GeneralPath) shape).lineTo(-2.24, -10.94);
        ((GeneralPath) shape).lineTo(-2.25, -10.97);
        ((GeneralPath) shape).lineTo(-2.25, -11.0);
        ((GeneralPath) shape).lineTo(-2.25, -11.04);
        ((GeneralPath) shape).lineTo(-2.25, -11.08);
        ((GeneralPath) shape).lineTo(-2.25, -11.11);
        ((GeneralPath) shape).lineTo(-2.23, -11.15);
        ((GeneralPath) shape).lineTo(-2.22, -11.19);
        ((GeneralPath) shape).lineTo(-2.2, -11.23);
        ((GeneralPath) shape).lineTo(-2.17, -11.26);
        ((GeneralPath) shape).lineTo(-2.14, -11.28);
        ((GeneralPath) shape).lineTo(-2.11, -11.31);
        ((GeneralPath) shape).lineTo(-2.07, -11.33);
        ((GeneralPath) shape).lineTo(-2.02, -11.34);
        ((GeneralPath) shape).lineTo(-1.98, -11.36);
        ((GeneralPath) shape).lineTo(-1.94, -11.37);
        ((GeneralPath) shape).lineTo(-1.89, -11.38);
        ((GeneralPath) shape).lineTo(-1.85, -11.39);
        ((GeneralPath) shape).lineTo(-1.8, -11.39);
        ((GeneralPath) shape).lineTo(-1.76, -11.39);
        ((GeneralPath) shape).lineTo(-1.67, -11.39);
        ((GeneralPath) shape).lineTo(-1.58, -11.37);
        ((GeneralPath) shape).lineTo(-1.49, -11.35);
        ((GeneralPath) shape).lineTo(-1.4, -11.32);
        ((GeneralPath) shape).lineTo(-1.37, -11.3);
        ((GeneralPath) shape).lineTo(-1.34, -11.28);
        ((GeneralPath) shape).lineTo(-1.31, -11.26);
        ((GeneralPath) shape).lineTo(-1.28, -11.23);
        ((GeneralPath) shape).lineTo(-1.25, -11.2);
        ((GeneralPath) shape).lineTo(-1.23, -11.17);
        ((GeneralPath) shape).lineTo(-1.21, -11.14);
        ((GeneralPath) shape).lineTo(-1.19, -11.11);
        ((GeneralPath) shape).lineTo(-1.18, -11.04);
        ((GeneralPath) shape).lineTo(-1.17, -10.97);
        ((GeneralPath) shape).lineTo(-0.76, -10.97);
        ((GeneralPath) shape).lineTo(-0.76, -11.04);
        ((GeneralPath) shape).lineTo(-0.76, -11.1);
        ((GeneralPath) shape).lineTo(-0.78, -11.16);
        ((GeneralPath) shape).lineTo(-0.79, -11.23);
        ((GeneralPath) shape).lineTo(-0.82, -11.29);
        ((GeneralPath) shape).lineTo(-0.86, -11.36);
        ((GeneralPath) shape).lineTo(-0.9, -11.42);
        ((GeneralPath) shape).lineTo(-0.95, -11.47);
        ((GeneralPath) shape).lineTo(-1.0, -11.52);
        ((GeneralPath) shape).lineTo(-1.06, -11.57);
        ((GeneralPath) shape).lineTo(-1.13, -11.6);
        ((GeneralPath) shape).lineTo(-1.19, -11.63);
        ((GeneralPath) shape).lineTo(-1.26, -11.66);
        ((GeneralPath) shape).lineTo(-1.32, -11.68);
        ((GeneralPath) shape).lineTo(-1.39, -11.7);
        ((GeneralPath) shape).lineTo(-1.46, -11.72);
        ((GeneralPath) shape).lineTo(-1.52, -11.73);
        ((GeneralPath) shape).lineTo(-1.59, -11.74);
        ((GeneralPath) shape).lineTo(-1.66, -11.74);
        ((GeneralPath) shape).lineTo(-1.73, -11.74);
        ((GeneralPath) shape).lineTo(-1.8, -11.74);
        ((GeneralPath) shape).lineTo(-1.87, -11.74);
        ((GeneralPath) shape).lineTo(-1.94, -11.73);
        ((GeneralPath) shape).lineTo(-2.01, -11.72);
        ((GeneralPath) shape).lineTo(-2.08, -11.7);
        ((GeneralPath) shape).lineTo(-2.15, -11.68);
        ((GeneralPath) shape).lineTo(-2.22, -11.66);
        ((GeneralPath) shape).lineTo(-2.28, -11.63);
        ((GeneralPath) shape).lineTo(-2.32, -11.61);
        ((GeneralPath) shape).lineTo(-2.37, -11.59);
        ((GeneralPath) shape).lineTo(-2.4, -11.56);
        ((GeneralPath) shape).lineTo(-2.44, -11.53);
        ((GeneralPath) shape).lineTo(-2.48, -11.5);
        ((GeneralPath) shape).lineTo(-2.51, -11.46);
        ((GeneralPath) shape).lineTo(-2.54, -11.43);
        ((GeneralPath) shape).lineTo(-2.57, -11.39);
        ((GeneralPath) shape).lineTo(-2.59, -11.35);
        ((GeneralPath) shape).lineTo(-2.61, -11.3);
        ((GeneralPath) shape).lineTo(-2.63, -11.26);
        ((GeneralPath) shape).lineTo(-2.64, -11.21);
        ((GeneralPath) shape).lineTo(-2.66, -11.17);
        ((GeneralPath) shape).lineTo(-2.67, -11.12);
        ((GeneralPath) shape).lineTo(-2.67, -11.07);
        ((GeneralPath) shape).lineTo(-2.67, -11.03);
        ((GeneralPath) shape).lineTo(-2.67, -10.95);
        ((GeneralPath) shape).lineTo(-2.66, -10.88);
        ((GeneralPath) shape).lineTo(-2.65, -10.81);
        ((GeneralPath) shape).lineTo(-2.63, -10.75);
        ((GeneralPath) shape).lineTo(-2.6, -10.7);
        ((GeneralPath) shape).lineTo(-2.57, -10.64);
        ((GeneralPath) shape).lineTo(-2.53, -10.59);
        ((GeneralPath) shape).lineTo(-2.48, -10.54);
        ((GeneralPath) shape).lineTo(-2.43, -10.5);
        ((GeneralPath) shape).lineTo(-2.38, -10.47);
        ((GeneralPath) shape).lineTo(-2.16, -10.84);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.72, -9.11);
        ((GeneralPath) shape).lineTo(-1.61, -9.11);
        ((GeneralPath) shape).lineTo(-1.5, -9.12);
        ((GeneralPath) shape).lineTo(-1.4, -9.13);
        ((GeneralPath) shape).lineTo(-1.31, -9.16);
        ((GeneralPath) shape).lineTo(-1.21, -9.19);
        ((GeneralPath) shape).lineTo(-1.12, -9.22);
        ((GeneralPath) shape).lineTo(-1.07, -9.25);
        ((GeneralPath) shape).lineTo(-1.02, -9.28);
        ((GeneralPath) shape).lineTo(-0.98, -9.31);
        ((GeneralPath) shape).lineTo(-0.94, -9.34);
        ((GeneralPath) shape).lineTo(-0.9, -9.38);
        ((GeneralPath) shape).lineTo(-0.86, -9.42);
        ((GeneralPath) shape).lineTo(-0.83, -9.46);
        ((GeneralPath) shape).lineTo(-0.79, -9.51);
        ((GeneralPath) shape).lineTo(-0.77, -9.56);
        ((GeneralPath) shape).lineTo(-0.74, -9.61);
        ((GeneralPath) shape).lineTo(-0.72, -9.66);
        ((GeneralPath) shape).lineTo(-0.71, -9.71);
        ((GeneralPath) shape).lineTo(-0.7, -9.76);
        ((GeneralPath) shape).lineTo(-0.69, -9.82);
        ((GeneralPath) shape).lineTo(-0.68, -9.87);
        ((GeneralPath) shape).lineTo(-0.68, -9.93);
        ((GeneralPath) shape).lineTo(-0.69, -10.01);
        ((GeneralPath) shape).lineTo(-0.7, -10.1);
        ((GeneralPath) shape).lineTo(-0.72, -10.15);
        ((GeneralPath) shape).lineTo(-0.73, -10.2);
        ((GeneralPath) shape).lineTo(-0.76, -10.25);
        ((GeneralPath) shape).lineTo(-0.78, -10.29);
        ((GeneralPath) shape).lineTo(-0.81, -10.33);
        ((GeneralPath) shape).lineTo(-0.85, -10.37);
        ((GeneralPath) shape).lineTo(-0.89, -10.41);
        ((GeneralPath) shape).lineTo(-0.93, -10.44);
        ((GeneralPath) shape).lineTo(-0.99, -10.48);
        ((GeneralPath) shape).lineTo(-1.06, -10.52);
        ((GeneralPath) shape).lineTo(-1.13, -10.55);
        ((GeneralPath) shape).lineTo(-1.21, -10.57);
        ((GeneralPath) shape).lineTo(-1.45, -10.64);
        ((GeneralPath) shape).lineTo(-1.86, -10.73);
        ((GeneralPath) shape).lineTo(-1.93, -10.75);
        ((GeneralPath) shape).lineTo(-2.0, -10.77);
        ((GeneralPath) shape).lineTo(-2.07, -10.79);
        ((GeneralPath) shape).lineTo(-2.13, -10.83);
        ((GeneralPath) shape).lineTo(-2.16, -10.84);
        ((GeneralPath) shape).lineTo(-2.38, -10.47);
        ((GeneralPath) shape).lineTo(-2.28, -10.42);
        ((GeneralPath) shape).lineTo(-2.17, -10.38);
        ((GeneralPath) shape).lineTo(-2.07, -10.35);
        ((GeneralPath) shape).lineTo(-1.96, -10.33);
        ((GeneralPath) shape).lineTo(-1.49, -10.21);
        ((GeneralPath) shape).lineTo(-1.34, -10.17);
        ((GeneralPath) shape).lineTo(-1.3, -10.16);
        ((GeneralPath) shape).lineTo(-1.27, -10.14);
        ((GeneralPath) shape).lineTo(-1.24, -10.12);
        ((GeneralPath) shape).lineTo(-1.21, -10.1);
        ((GeneralPath) shape).lineTo(-1.18, -10.08);
        ((GeneralPath) shape).lineTo(-1.17, -10.06);
        ((GeneralPath) shape).lineTo(-1.15, -10.03);
        ((GeneralPath) shape).lineTo(-1.13, -10.01);
        ((GeneralPath) shape).lineTo(-1.12, -9.98);
        ((GeneralPath) shape).lineTo(-1.11, -9.95);
        ((GeneralPath) shape).lineTo(-1.11, -9.92);
        ((GeneralPath) shape).lineTo(-1.11, -9.89);
        ((GeneralPath) shape).lineTo(-1.11, -9.85);
        ((GeneralPath) shape).lineTo(-1.12, -9.8);
        ((GeneralPath) shape).lineTo(-1.13, -9.76);
        ((GeneralPath) shape).lineTo(-1.15, -9.72);
        ((GeneralPath) shape).lineTo(-1.17, -9.68);
        ((GeneralPath) shape).lineTo(-1.19, -9.65);
        ((GeneralPath) shape).lineTo(-1.22, -9.61);
        ((GeneralPath) shape).lineTo(-1.26, -9.58);
        ((GeneralPath) shape).lineTo(-1.3, -9.56);
        ((GeneralPath) shape).lineTo(-1.34, -9.54);
        ((GeneralPath) shape).lineTo(-1.42, -9.51);
        ((GeneralPath) shape).lineTo(-1.51, -9.49);
        ((GeneralPath) shape).lineTo(-1.6, -9.48);
        ((GeneralPath) shape).lineTo(-1.7, -9.48);
        ((GeneralPath) shape).lineTo(-1.72, -9.11);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.7, -9.48);
        ((GeneralPath) shape).lineTo(-1.76, -9.47);
        ((GeneralPath) shape).lineTo(-1.83, -9.48);
        ((GeneralPath) shape).lineTo(-1.89, -9.49);
        ((GeneralPath) shape).lineTo(-1.95, -9.5);
        ((GeneralPath) shape).lineTo(-2.01, -9.52);
        ((GeneralPath) shape).lineTo(-2.06, -9.55);
        ((GeneralPath) shape).lineTo(-2.12, -9.58);
        ((GeneralPath) shape).lineTo(-2.16, -9.61);
        ((GeneralPath) shape).lineTo(-2.2, -9.66);
        ((GeneralPath) shape).lineTo(-2.24, -9.7);
        ((GeneralPath) shape).lineTo(-2.27, -9.75);
        ((GeneralPath) shape).lineTo(-2.3, -9.81);
        ((GeneralPath) shape).lineTo(-2.32, -9.9);
        ((GeneralPath) shape).lineTo(-2.33, -9.99);
        ((GeneralPath) shape).lineTo(-2.74, -9.99);
        ((GeneralPath) shape).lineTo(-2.74, -9.93);
        ((GeneralPath) shape).lineTo(-2.74, -9.88);
        ((GeneralPath) shape).lineTo(-2.73, -9.82);
        ((GeneralPath) shape).lineTo(-2.72, -9.77);
        ((GeneralPath) shape).lineTo(-2.71, -9.71);
        ((GeneralPath) shape).lineTo(-2.69, -9.66);
        ((GeneralPath) shape).lineTo(-2.67, -9.61);
        ((GeneralPath) shape).lineTo(-2.65, -9.56);
        ((GeneralPath) shape).lineTo(-2.61, -9.49);
        ((GeneralPath) shape).lineTo(-2.56, -9.42);
        ((GeneralPath) shape).lineTo(-2.5, -9.36);
        ((GeneralPath) shape).lineTo(-2.44, -9.3);
        ((GeneralPath) shape).lineTo(-2.37, -9.26);
        ((GeneralPath) shape).lineTo(-2.3, -9.21);
        ((GeneralPath) shape).lineTo(-2.22, -9.18);
        ((GeneralPath) shape).lineTo(-2.14, -9.16);
        ((GeneralPath) shape).lineTo(-2.04, -9.13);
        ((GeneralPath) shape).lineTo(-1.93, -9.12);
        ((GeneralPath) shape).lineTo(-1.83, -9.11);
        ((GeneralPath) shape).lineTo(-1.72, -9.11);
        ((GeneralPath) shape).lineTo(-1.7, -9.48);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.22, -10.84);
        ((GeneralPath) shape).lineTo(0.19, -10.86);
        ((GeneralPath) shape).lineTo(0.17, -10.89);
        ((GeneralPath) shape).lineTo(0.15, -10.91);
        ((GeneralPath) shape).lineTo(0.14, -10.94);
        ((GeneralPath) shape).lineTo(0.13, -10.97);
        ((GeneralPath) shape).lineTo(0.12, -11.0);
        ((GeneralPath) shape).lineTo(0.12, -11.04);
        ((GeneralPath) shape).lineTo(0.12, -11.08);
        ((GeneralPath) shape).lineTo(0.13, -11.11);
        ((GeneralPath) shape).lineTo(0.14, -11.15);
        ((GeneralPath) shape).lineTo(0.16, -11.19);
        ((GeneralPath) shape).lineTo(0.18, -11.23);
        ((GeneralPath) shape).lineTo(0.21, -11.26);
        ((GeneralPath) shape).lineTo(0.24, -11.28);
        ((GeneralPath) shape).lineTo(0.27, -11.31);
        ((GeneralPath) shape).lineTo(0.31, -11.33);
        ((GeneralPath) shape).lineTo(0.35, -11.34);
        ((GeneralPath) shape).lineTo(0.39, -11.36);
        ((GeneralPath) shape).lineTo(0.44, -11.37);
        ((GeneralPath) shape).lineTo(0.48, -11.38);
        ((GeneralPath) shape).lineTo(0.53, -11.39);
        ((GeneralPath) shape).lineTo(0.57, -11.39);
        ((GeneralPath) shape).lineTo(0.62, -11.39);
        ((GeneralPath) shape).lineTo(0.71, -11.39);
        ((GeneralPath) shape).lineTo(0.8, -11.37);
        ((GeneralPath) shape).lineTo(0.89, -11.35);
        ((GeneralPath) shape).lineTo(0.97, -11.32);
        ((GeneralPath) shape).lineTo(1.01, -11.3);
        ((GeneralPath) shape).lineTo(1.04, -11.28);
        ((GeneralPath) shape).lineTo(1.07, -11.26);
        ((GeneralPath) shape).lineTo(1.1, -11.23);
        ((GeneralPath) shape).lineTo(1.12, -11.2);
        ((GeneralPath) shape).lineTo(1.15, -11.17);
        ((GeneralPath) shape).lineTo(1.17, -11.14);
        ((GeneralPath) shape).lineTo(1.18, -11.11);
        ((GeneralPath) shape).lineTo(1.2, -11.04);
        ((GeneralPath) shape).lineTo(1.21, -10.97);
        ((GeneralPath) shape).lineTo(1.62, -10.97);
        ((GeneralPath) shape).lineTo(1.62, -11.04);
        ((GeneralPath) shape).lineTo(1.61, -11.1);
        ((GeneralPath) shape).lineTo(1.6, -11.16);
        ((GeneralPath) shape).lineTo(1.58, -11.23);
        ((GeneralPath) shape).lineTo(1.55, -11.29);
        ((GeneralPath) shape).lineTo(1.52, -11.36);
        ((GeneralPath) shape).lineTo(1.48, -11.42);
        ((GeneralPath) shape).lineTo(1.43, -11.47);
        ((GeneralPath) shape).lineTo(1.37, -11.52);
        ((GeneralPath) shape).lineTo(1.31, -11.57);
        ((GeneralPath) shape).lineTo(1.25, -11.6);
        ((GeneralPath) shape).lineTo(1.18, -11.63);
        ((GeneralPath) shape).lineTo(1.12, -11.66);
        ((GeneralPath) shape).lineTo(1.05, -11.68);
        ((GeneralPath) shape).lineTo(0.99, -11.7);
        ((GeneralPath) shape).lineTo(0.92, -11.72);
        ((GeneralPath) shape).lineTo(0.85, -11.73);
        ((GeneralPath) shape).lineTo(0.78, -11.74);
        ((GeneralPath) shape).lineTo(0.72, -11.74);
        ((GeneralPath) shape).lineTo(0.65, -11.74);
        ((GeneralPath) shape).lineTo(0.58, -11.74);
        ((GeneralPath) shape).lineTo(0.5, -11.74);
        ((GeneralPath) shape).lineTo(0.43, -11.73);
        ((GeneralPath) shape).lineTo(0.36, -11.72);
        ((GeneralPath) shape).lineTo(0.29, -11.7);
        ((GeneralPath) shape).lineTo(0.23, -11.68);
        ((GeneralPath) shape).lineTo(0.16, -11.66);
        ((GeneralPath) shape).lineTo(0.09, -11.63);
        ((GeneralPath) shape).lineTo(0.05, -11.61);
        ((GeneralPath) shape).lineTo(0.01, -11.59);
        ((GeneralPath) shape).lineTo(-0.03, -11.56);
        ((GeneralPath) shape).lineTo(-0.06, -11.53);
        ((GeneralPath) shape).lineTo(-0.1, -11.5);
        ((GeneralPath) shape).lineTo(-0.13, -11.46);
        ((GeneralPath) shape).lineTo(-0.16, -11.43);
        ((GeneralPath) shape).lineTo(-0.19, -11.39);
        ((GeneralPath) shape).lineTo(-0.21, -11.35);
        ((GeneralPath) shape).lineTo(-0.23, -11.3);
        ((GeneralPath) shape).lineTo(-0.25, -11.26);
        ((GeneralPath) shape).lineTo(-0.27, -11.21);
        ((GeneralPath) shape).lineTo(-0.28, -11.17);
        ((GeneralPath) shape).lineTo(-0.29, -11.12);
        ((GeneralPath) shape).lineTo(-0.29, -11.07);
        ((GeneralPath) shape).lineTo(-0.29, -11.03);
        ((GeneralPath) shape).lineTo(-0.29, -10.95);
        ((GeneralPath) shape).lineTo(-0.29, -10.88);
        ((GeneralPath) shape).lineTo(-0.27, -10.81);
        ((GeneralPath) shape).lineTo(-0.25, -10.75);
        ((GeneralPath) shape).lineTo(-0.22, -10.7);
        ((GeneralPath) shape).lineTo(-0.19, -10.64);
        ((GeneralPath) shape).lineTo(-0.15, -10.59);
        ((GeneralPath) shape).lineTo(-0.1, -10.54);
        ((GeneralPath) shape).lineTo(-0.05, -10.5);
        ((GeneralPath) shape).lineTo(0.0, -10.47);
        ((GeneralPath) shape).lineTo(0.22, -10.84);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.66, -9.11);
        ((GeneralPath) shape).lineTo(0.77, -9.11);
        ((GeneralPath) shape).lineTo(0.87, -9.12);
        ((GeneralPath) shape).lineTo(0.97, -9.13);
        ((GeneralPath) shape).lineTo(1.07, -9.16);
        ((GeneralPath) shape).lineTo(1.17, -9.19);
        ((GeneralPath) shape).lineTo(1.26, -9.22);
        ((GeneralPath) shape).lineTo(1.31, -9.25);
        ((GeneralPath) shape).lineTo(1.36, -9.28);
        ((GeneralPath) shape).lineTo(1.4, -9.31);
        ((GeneralPath) shape).lineTo(1.44, -9.34);
        ((GeneralPath) shape).lineTo(1.48, -9.38);
        ((GeneralPath) shape).lineTo(1.52, -9.42);
        ((GeneralPath) shape).lineTo(1.55, -9.46);
        ((GeneralPath) shape).lineTo(1.58, -9.51);
        ((GeneralPath) shape).lineTo(1.61, -9.56);
        ((GeneralPath) shape).lineTo(1.63, -9.61);
        ((GeneralPath) shape).lineTo(1.65, -9.66);
        ((GeneralPath) shape).lineTo(1.67, -9.71);
        ((GeneralPath) shape).lineTo(1.68, -9.76);
        ((GeneralPath) shape).lineTo(1.69, -9.82);
        ((GeneralPath) shape).lineTo(1.69, -9.87);
        ((GeneralPath) shape).lineTo(1.69, -9.93);
        ((GeneralPath) shape).lineTo(1.69, -10.01);
        ((GeneralPath) shape).lineTo(1.67, -10.1);
        ((GeneralPath) shape).lineTo(1.66, -10.15);
        ((GeneralPath) shape).lineTo(1.64, -10.2);
        ((GeneralPath) shape).lineTo(1.62, -10.25);
        ((GeneralPath) shape).lineTo(1.59, -10.29);
        ((GeneralPath) shape).lineTo(1.56, -10.33);
        ((GeneralPath) shape).lineTo(1.53, -10.37);
        ((GeneralPath) shape).lineTo(1.49, -10.41);
        ((GeneralPath) shape).lineTo(1.45, -10.44);
        ((GeneralPath) shape).lineTo(1.38, -10.48);
        ((GeneralPath) shape).lineTo(1.32, -10.52);
        ((GeneralPath) shape).lineTo(1.24, -10.55);
        ((GeneralPath) shape).lineTo(1.17, -10.57);
        ((GeneralPath) shape).lineTo(0.93, -10.64);
        ((GeneralPath) shape).lineTo(0.52, -10.73);
        ((GeneralPath) shape).lineTo(0.45, -10.75);
        ((GeneralPath) shape).lineTo(0.38, -10.77);
        ((GeneralPath) shape).lineTo(0.31, -10.79);
        ((GeneralPath) shape).lineTo(0.24, -10.83);
        ((GeneralPath) shape).lineTo(0.22, -10.84);
        ((GeneralPath) shape).lineTo(0.0, -10.47);
        ((GeneralPath) shape).lineTo(0.1, -10.42);
        ((GeneralPath) shape).lineTo(0.2, -10.38);
        ((GeneralPath) shape).lineTo(0.31, -10.35);
        ((GeneralPath) shape).lineTo(0.41, -10.33);
        ((GeneralPath) shape).lineTo(0.88, -10.21);
        ((GeneralPath) shape).lineTo(1.04, -10.17);
        ((GeneralPath) shape).lineTo(1.07, -10.16);
        ((GeneralPath) shape).lineTo(1.11, -10.14);
        ((GeneralPath) shape).lineTo(1.14, -10.12);
        ((GeneralPath) shape).lineTo(1.17, -10.1);
        ((GeneralPath) shape).lineTo(1.19, -10.08);
        ((GeneralPath) shape).lineTo(1.21, -10.06);
        ((GeneralPath) shape).lineTo(1.23, -10.03);
        ((GeneralPath) shape).lineTo(1.24, -10.01);
        ((GeneralPath) shape).lineTo(1.25, -9.98);
        ((GeneralPath) shape).lineTo(1.26, -9.95);
        ((GeneralPath) shape).lineTo(1.27, -9.92);
        ((GeneralPath) shape).lineTo(1.27, -9.89);
        ((GeneralPath) shape).lineTo(1.27, -9.85);
        ((GeneralPath) shape).lineTo(1.26, -9.8);
        ((GeneralPath) shape).lineTo(1.25, -9.76);
        ((GeneralPath) shape).lineTo(1.23, -9.72);
        ((GeneralPath) shape).lineTo(1.21, -9.68);
        ((GeneralPath) shape).lineTo(1.18, -9.65);
        ((GeneralPath) shape).lineTo(1.15, -9.61);
        ((GeneralPath) shape).lineTo(1.12, -9.58);
        ((GeneralPath) shape).lineTo(1.08, -9.56);
        ((GeneralPath) shape).lineTo(1.04, -9.54);
        ((GeneralPath) shape).lineTo(0.95, -9.51);
        ((GeneralPath) shape).lineTo(0.86, -9.49);
        ((GeneralPath) shape).lineTo(0.77, -9.48);
        ((GeneralPath) shape).lineTo(0.68, -9.48);
        ((GeneralPath) shape).lineTo(0.66, -9.11);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.68, -9.48);
        ((GeneralPath) shape).lineTo(0.62, -9.47);
        ((GeneralPath) shape).lineTo(0.55, -9.48);
        ((GeneralPath) shape).lineTo(0.49, -9.49);
        ((GeneralPath) shape).lineTo(0.42, -9.5);
        ((GeneralPath) shape).lineTo(0.37, -9.52);
        ((GeneralPath) shape).lineTo(0.31, -9.55);
        ((GeneralPath) shape).lineTo(0.26, -9.58);
        ((GeneralPath) shape).lineTo(0.21, -9.61);
        ((GeneralPath) shape).lineTo(0.17, -9.66);
        ((GeneralPath) shape).lineTo(0.14, -9.7);
        ((GeneralPath) shape).lineTo(0.1, -9.75);
        ((GeneralPath) shape).lineTo(0.08, -9.81);
        ((GeneralPath) shape).lineTo(0.06, -9.9);
        ((GeneralPath) shape).lineTo(0.04, -9.99);
        ((GeneralPath) shape).lineTo(-0.37, -9.99);
        ((GeneralPath) shape).lineTo(-0.37, -9.93);
        ((GeneralPath) shape).lineTo(-0.36, -9.88);
        ((GeneralPath) shape).lineTo(-0.35, -9.82);
        ((GeneralPath) shape).lineTo(-0.34, -9.77);
        ((GeneralPath) shape).lineTo(-0.33, -9.71);
        ((GeneralPath) shape).lineTo(-0.31, -9.66);
        ((GeneralPath) shape).lineTo(-0.29, -9.61);
        ((GeneralPath) shape).lineTo(-0.27, -9.56);
        ((GeneralPath) shape).lineTo(-0.23, -9.49);
        ((GeneralPath) shape).lineTo(-0.18, -9.42);
        ((GeneralPath) shape).lineTo(-0.13, -9.36);
        ((GeneralPath) shape).lineTo(-0.06, -9.3);
        ((GeneralPath) shape).lineTo(0.0, -9.26);
        ((GeneralPath) shape).lineTo(0.08, -9.21);
        ((GeneralPath) shape).lineTo(0.15, -9.18);
        ((GeneralPath) shape).lineTo(0.23, -9.16);
        ((GeneralPath) shape).lineTo(0.34, -9.13);
        ((GeneralPath) shape).lineTo(0.44, -9.12);
        ((GeneralPath) shape).lineTo(0.55, -9.11);
        ((GeneralPath) shape).lineTo(0.66, -9.11);
        ((GeneralPath) shape).lineTo(0.68, -9.48);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.19, -12.6);
        ((GeneralPath) shape).lineTo(2.19, -12.12);
        ((GeneralPath) shape).lineTo(2.6, -12.12);
        ((GeneralPath) shape).lineTo(2.6, -12.6);
        ((GeneralPath) shape).lineTo(2.19, -12.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.19, -11.67);
        ((GeneralPath) shape).lineTo(2.19, -9.18);
        ((GeneralPath) shape).lineTo(2.6, -9.18);
        ((GeneralPath) shape).lineTo(2.6, -11.67);
        ((GeneralPath) shape).lineTo(2.19, -11.67);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.26, -10.67);
        ((GeneralPath) shape).lineTo(5.26, -10.79);
        ((GeneralPath) shape).lineTo(5.26, -10.91);
        ((GeneralPath) shape).lineTo(5.25, -11.03);
        ((GeneralPath) shape).lineTo(5.24, -11.15);
        ((GeneralPath) shape).lineTo(5.23, -11.21);
        ((GeneralPath) shape).lineTo(5.21, -11.27);
        ((GeneralPath) shape).lineTo(5.18, -11.33);
        ((GeneralPath) shape).lineTo(5.15, -11.39);
        ((GeneralPath) shape).lineTo(5.12, -11.44);
        ((GeneralPath) shape).lineTo(5.08, -11.49);
        ((GeneralPath) shape).lineTo(5.03, -11.53);
        ((GeneralPath) shape).lineTo(4.99, -11.57);
        ((GeneralPath) shape).lineTo(4.94, -11.6);
        ((GeneralPath) shape).lineTo(4.88, -11.63);
        ((GeneralPath) shape).lineTo(4.83, -11.66);
        ((GeneralPath) shape).lineTo(4.77, -11.68);
        ((GeneralPath) shape).lineTo(4.68, -11.7);
        ((GeneralPath) shape).lineTo(4.58, -11.71);
        ((GeneralPath) shape).lineTo(4.49, -11.72);
        ((GeneralPath) shape).lineTo(4.4, -11.72);
        ((GeneralPath) shape).lineTo(4.31, -11.72);
        ((GeneralPath) shape).lineTo(4.22, -11.71);
        ((GeneralPath) shape).lineTo(4.13, -11.69);
        ((GeneralPath) shape).lineTo(4.04, -11.66);
        ((GeneralPath) shape).lineTo(3.98, -11.63);
        ((GeneralPath) shape).lineTo(3.92, -11.6);
        ((GeneralPath) shape).lineTo(3.86, -11.56);
        ((GeneralPath) shape).lineTo(3.81, -11.52);
        ((GeneralPath) shape).lineTo(3.76, -11.48);
        ((GeneralPath) shape).lineTo(3.71, -11.43);
        ((GeneralPath) shape).lineTo(3.67, -11.37);
        ((GeneralPath) shape).lineTo(3.63, -11.32);
        ((GeneralPath) shape).lineTo(3.63, -11.67);
        ((GeneralPath) shape).lineTo(3.23, -11.67);
        ((GeneralPath) shape).lineTo(3.23, -9.18);
        ((GeneralPath) shape).lineTo(3.65, -9.18);
        ((GeneralPath) shape).lineTo(3.65, -10.6);
        ((GeneralPath) shape).lineTo(3.65, -10.69);
        ((GeneralPath) shape).lineTo(3.66, -10.77);
        ((GeneralPath) shape).lineTo(3.67, -10.84);
        ((GeneralPath) shape).lineTo(3.68, -10.9);
        ((GeneralPath) shape).lineTo(3.71, -10.96);
        ((GeneralPath) shape).lineTo(3.73, -11.02);
        ((GeneralPath) shape).lineTo(3.77, -11.08);
        ((GeneralPath) shape).lineTo(3.81, -11.13);
        ((GeneralPath) shape).lineTo(3.85, -11.18);
        ((GeneralPath) shape).lineTo(3.9, -11.22);
        ((GeneralPath) shape).lineTo(3.95, -11.25);
        ((GeneralPath) shape).lineTo(4.01, -11.28);
        ((GeneralPath) shape).lineTo(4.06, -11.31);
        ((GeneralPath) shape).lineTo(4.12, -11.33);
        ((GeneralPath) shape).lineTo(4.18, -11.34);
        ((GeneralPath) shape).lineTo(4.24, -11.35);
        ((GeneralPath) shape).lineTo(4.3, -11.36);
        ((GeneralPath) shape).lineTo(4.36, -11.36);
        ((GeneralPath) shape).lineTo(4.4, -11.36);
        ((GeneralPath) shape).lineTo(4.44, -11.35);
        ((GeneralPath) shape).lineTo(4.48, -11.35);
        ((GeneralPath) shape).lineTo(4.52, -11.34);
        ((GeneralPath) shape).lineTo(4.56, -11.33);
        ((GeneralPath) shape).lineTo(4.6, -11.31);
        ((GeneralPath) shape).lineTo(4.63, -11.3);
        ((GeneralPath) shape).lineTo(4.66, -11.27);
        ((GeneralPath) shape).lineTo(4.69, -11.25);
        ((GeneralPath) shape).lineTo(4.72, -11.22);
        ((GeneralPath) shape).lineTo(4.75, -11.19);
        ((GeneralPath) shape).lineTo(4.77, -11.16);
        ((GeneralPath) shape).lineTo(4.8, -11.09);
        ((GeneralPath) shape).lineTo(4.82, -11.01);
        ((GeneralPath) shape).lineTo(4.83, -10.93);
        ((GeneralPath) shape).lineTo(4.83, -10.85);
        ((GeneralPath) shape).lineTo(4.83, -9.18);
        ((GeneralPath) shape).lineTo(5.26, -9.18);
        ((GeneralPath) shape).lineTo(5.26, -10.67);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.91, -9.23);
        ((GeneralPath) shape).lineTo(7.91, -11.67);
        ((GeneralPath) shape).lineTo(7.5, -11.67);
        ((GeneralPath) shape).lineTo(7.5, -11.39);
        ((GeneralPath) shape).lineTo(7.44, -11.46);
        ((GeneralPath) shape).lineTo(7.37, -11.53);
        ((GeneralPath) shape).lineTo(7.29, -11.6);
        ((GeneralPath) shape).lineTo(7.21, -11.65);
        ((GeneralPath) shape).lineTo(7.15, -11.68);
        ((GeneralPath) shape).lineTo(7.1, -11.7);
        ((GeneralPath) shape).lineTo(7.05, -11.72);
        ((GeneralPath) shape).lineTo(6.99, -11.73);
        ((GeneralPath) shape).lineTo(6.93, -11.74);
        ((GeneralPath) shape).lineTo(6.87, -11.74);
        ((GeneralPath) shape).lineTo(6.82, -11.75);
        ((GeneralPath) shape).lineTo(6.76, -11.74);
        ((GeneralPath) shape).lineTo(6.69, -11.74);
        ((GeneralPath) shape).lineTo(6.62, -11.73);
        ((GeneralPath) shape).lineTo(6.55, -11.72);
        ((GeneralPath) shape).lineTo(6.48, -11.7);
        ((GeneralPath) shape).lineTo(6.42, -11.68);
        ((GeneralPath) shape).lineTo(6.35, -11.65);
        ((GeneralPath) shape).lineTo(6.29, -11.61);
        ((GeneralPath) shape).lineTo(6.23, -11.58);
        ((GeneralPath) shape).lineTo(6.16, -11.52);
        ((GeneralPath) shape).lineTo(6.1, -11.46);
        ((GeneralPath) shape).lineTo(6.04, -11.4);
        ((GeneralPath) shape).lineTo(5.99, -11.33);
        ((GeneralPath) shape).lineTo(5.94, -11.25);
        ((GeneralPath) shape).lineTo(5.9, -11.18);
        ((GeneralPath) shape).lineTo(5.87, -11.1);
        ((GeneralPath) shape).lineTo(5.84, -11.02);
        ((GeneralPath) shape).lineTo(5.81, -10.94);
        ((GeneralPath) shape).lineTo(5.8, -10.87);
        ((GeneralPath) shape).lineTo(5.78, -10.8);
        ((GeneralPath) shape).lineTo(5.77, -10.73);
        ((GeneralPath) shape).lineTo(5.76, -10.65);
        ((GeneralPath) shape).lineTo(5.75, -10.58);
        ((GeneralPath) shape).lineTo(5.75, -10.51);
        ((GeneralPath) shape).lineTo(5.75, -10.43);
        ((GeneralPath) shape).lineTo(5.75, -10.35);
        ((GeneralPath) shape).lineTo(6.18, -10.38);
        ((GeneralPath) shape).lineTo(6.18, -10.46);
        ((GeneralPath) shape).lineTo(6.18, -10.53);
        ((GeneralPath) shape).lineTo(6.19, -10.6);
        ((GeneralPath) shape).lineTo(6.19, -10.66);
        ((GeneralPath) shape).lineTo(6.21, -10.73);
        ((GeneralPath) shape).lineTo(6.22, -10.8);
        ((GeneralPath) shape).lineTo(6.24, -10.86);
        ((GeneralPath) shape).lineTo(6.26, -10.93);
        ((GeneralPath) shape).lineTo(6.28, -10.99);
        ((GeneralPath) shape).lineTo(6.31, -11.04);
        ((GeneralPath) shape).lineTo(6.33, -11.08);
        ((GeneralPath) shape).lineTo(6.36, -11.13);
        ((GeneralPath) shape).lineTo(6.39, -11.17);
        ((GeneralPath) shape).lineTo(6.43, -11.21);
        ((GeneralPath) shape).lineTo(6.46, -11.24);
        ((GeneralPath) shape).lineTo(6.51, -11.27);
        ((GeneralPath) shape).lineTo(6.55, -11.3);
        ((GeneralPath) shape).lineTo(6.62, -11.33);
        ((GeneralPath) shape).lineTo(6.69, -11.35);
        ((GeneralPath) shape).lineTo(6.76, -11.36);
        ((GeneralPath) shape).lineTo(6.84, -11.37);
        ((GeneralPath) shape).lineTo(6.92, -11.37);
        ((GeneralPath) shape).lineTo(6.99, -11.36);
        ((GeneralPath) shape).lineTo(7.06, -11.34);
        ((GeneralPath) shape).lineTo(7.13, -11.31);
        ((GeneralPath) shape).lineTo(7.18, -11.28);
        ((GeneralPath) shape).lineTo(7.23, -11.25);
        ((GeneralPath) shape).lineTo(7.27, -11.21);
        ((GeneralPath) shape).lineTo(7.3, -11.17);
        ((GeneralPath) shape).lineTo(7.34, -11.13);
        ((GeneralPath) shape).lineTo(7.37, -11.09);
        ((GeneralPath) shape).lineTo(7.4, -11.04);
        ((GeneralPath) shape).lineTo(7.42, -10.99);
        ((GeneralPath) shape).lineTo(7.45, -10.91);
        ((GeneralPath) shape).lineTo(7.48, -10.83);
        ((GeneralPath) shape).lineTo(7.49, -10.74);
        ((GeneralPath) shape).lineTo(7.51, -10.65);
        ((GeneralPath) shape).lineTo(7.51, -10.54);
        ((GeneralPath) shape).lineTo(7.51, -10.42);
        ((GeneralPath) shape).lineTo(7.91, -9.23);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.51, -10.32);
        ((GeneralPath) shape).lineTo(7.51, -10.22);
        ((GeneralPath) shape).lineTo(7.49, -10.12);
        ((GeneralPath) shape).lineTo(7.48, -10.02);
        ((GeneralPath) shape).lineTo(7.46, -9.93);
        ((GeneralPath) shape).lineTo(7.43, -9.85);
        ((GeneralPath) shape).lineTo(7.39, -9.77);
        ((GeneralPath) shape).lineTo(7.34, -9.7);
        ((GeneralPath) shape).lineTo(7.3, -9.65);
        ((GeneralPath) shape).lineTo(7.25, -9.6);
        ((GeneralPath) shape).lineTo(7.19, -9.56);
        ((GeneralPath) shape).lineTo(7.13, -9.53);
        ((GeneralPath) shape).lineTo(7.07, -9.5);
        ((GeneralPath) shape).lineTo(7.0, -9.48);
        ((GeneralPath) shape).lineTo(6.94, -9.48);
        ((GeneralPath) shape).lineTo(6.87, -9.48);
        ((GeneralPath) shape).lineTo(6.79, -9.48);
        ((GeneralPath) shape).lineTo(6.71, -9.49);
        ((GeneralPath) shape).lineTo(6.64, -9.51);
        ((GeneralPath) shape).lineTo(6.57, -9.54);
        ((GeneralPath) shape).lineTo(6.52, -9.57);
        ((GeneralPath) shape).lineTo(6.48, -9.6);
        ((GeneralPath) shape).lineTo(6.43, -9.64);
        ((GeneralPath) shape).lineTo(6.4, -9.68);
        ((GeneralPath) shape).lineTo(6.36, -9.72);
        ((GeneralPath) shape).lineTo(6.33, -9.77);
        ((GeneralPath) shape).lineTo(6.3, -9.82);
        ((GeneralPath) shape).lineTo(6.28, -9.87);
        ((GeneralPath) shape).lineTo(6.25, -9.94);
        ((GeneralPath) shape).lineTo(6.23, -10.01);
        ((GeneralPath) shape).lineTo(6.21, -10.09);
        ((GeneralPath) shape).lineTo(6.2, -10.16);
        ((GeneralPath) shape).lineTo(6.19, -10.23);
        ((GeneralPath) shape).lineTo(6.18, -10.31);
        ((GeneralPath) shape).lineTo(6.18, -10.38);
        ((GeneralPath) shape).lineTo(5.75, -10.35);
        ((GeneralPath) shape).lineTo(5.75, -10.28);
        ((GeneralPath) shape).lineTo(5.76, -10.2);
        ((GeneralPath) shape).lineTo(5.76, -10.13);
        ((GeneralPath) shape).lineTo(5.78, -10.03);
        ((GeneralPath) shape).lineTo(5.8, -9.94);
        ((GeneralPath) shape).lineTo(5.83, -9.85);
        ((GeneralPath) shape).lineTo(5.87, -9.76);
        ((GeneralPath) shape).lineTo(5.91, -9.67);
        ((GeneralPath) shape).lineTo(5.96, -9.58);
        ((GeneralPath) shape).lineTo(6.01, -9.5);
        ((GeneralPath) shape).lineTo(6.07, -9.43);
        ((GeneralPath) shape).lineTo(6.1, -9.39);
        ((GeneralPath) shape).lineTo(6.14, -9.35);
        ((GeneralPath) shape).lineTo(6.18, -9.32);
        ((GeneralPath) shape).lineTo(6.22, -9.29);
        ((GeneralPath) shape).lineTo(6.26, -9.26);
        ((GeneralPath) shape).lineTo(6.3, -9.23);
        ((GeneralPath) shape).lineTo(6.35, -9.2);
        ((GeneralPath) shape).lineTo(6.39, -9.18);
        ((GeneralPath) shape).lineTo(6.49, -9.15);
        ((GeneralPath) shape).lineTo(6.59, -9.12);
        ((GeneralPath) shape).lineTo(6.69, -9.11);
        ((GeneralPath) shape).lineTo(6.79, -9.1);
        ((GeneralPath) shape).lineTo(6.84, -9.1);
        ((GeneralPath) shape).lineTo(6.89, -9.11);
        ((GeneralPath) shape).lineTo(6.95, -9.11);
        ((GeneralPath) shape).lineTo(7.0, -9.12);
        ((GeneralPath) shape).lineTo(7.05, -9.13);
        ((GeneralPath) shape).lineTo(7.09, -9.15);
        ((GeneralPath) shape).lineTo(7.14, -9.17);
        ((GeneralPath) shape).lineTo(7.19, -9.19);
        ((GeneralPath) shape).lineTo(7.23, -9.21);
        ((GeneralPath) shape).lineTo(7.28, -9.24);
        ((GeneralPath) shape).lineTo(7.32, -9.27);
        ((GeneralPath) shape).lineTo(7.36, -9.3);
        ((GeneralPath) shape).lineTo(7.4, -9.33);
        ((GeneralPath) shape).lineTo(7.43, -9.37);
        ((GeneralPath) shape).lineTo(7.47, -9.41);
        ((GeneralPath) shape).lineTo(7.5, -9.45);
        ((GeneralPath) shape).lineTo(7.5, -9.14);
        ((GeneralPath) shape).lineTo(7.91, -9.23);
        ((GeneralPath) shape).lineTo(7.51, -10.42);
        ((GeneralPath) shape).lineTo(7.51, -10.32);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.5, -9.14);
        ((GeneralPath) shape).lineTo(7.5, -9.02);
        ((GeneralPath) shape).lineTo(7.5, -8.95);
        ((GeneralPath) shape).lineTo(7.48, -8.88);
        ((GeneralPath) shape).lineTo(7.46, -8.82);
        ((GeneralPath) shape).lineTo(7.43, -8.75);
        ((GeneralPath) shape).lineTo(7.4, -8.72);
        ((GeneralPath) shape).lineTo(7.38, -8.68);
        ((GeneralPath) shape).lineTo(7.34, -8.65);
        ((GeneralPath) shape).lineTo(7.31, -8.62);
        ((GeneralPath) shape).lineTo(7.27, -8.59);
        ((GeneralPath) shape).lineTo(7.23, -8.57);
        ((GeneralPath) shape).lineTo(7.19, -8.55);
        ((GeneralPath) shape).lineTo(7.15, -8.54);
        ((GeneralPath) shape).lineTo(7.07, -8.52);
        ((GeneralPath) shape).lineTo(6.99, -8.51);
        ((GeneralPath) shape).lineTo(6.91, -8.5);
        ((GeneralPath) shape).lineTo(6.83, -8.5);
        ((GeneralPath) shape).lineTo(6.74, -8.5);
        ((GeneralPath) shape).lineTo(6.65, -8.51);
        ((GeneralPath) shape).lineTo(6.58, -8.52);
        ((GeneralPath) shape).lineTo(6.52, -8.54);
        ((GeneralPath) shape).lineTo(6.46, -8.56);
        ((GeneralPath) shape).lineTo(6.4, -8.59);
        ((GeneralPath) shape).lineTo(6.37, -8.61);
        ((GeneralPath) shape).lineTo(6.33, -8.64);
        ((GeneralPath) shape).lineTo(6.31, -8.67);
        ((GeneralPath) shape).lineTo(6.28, -8.71);
        ((GeneralPath) shape).lineTo(6.27, -8.75);
        ((GeneralPath) shape).lineTo(6.25, -8.8);
        ((GeneralPath) shape).lineTo(6.25, -8.85);
        ((GeneralPath) shape).lineTo(6.25, -8.89);
        ((GeneralPath) shape).lineTo(5.84, -8.89);
        ((GeneralPath) shape).lineTo(5.84, -8.8);
        ((GeneralPath) shape).lineTo(5.85, -8.75);
        ((GeneralPath) shape).lineTo(5.86, -8.7);
        ((GeneralPath) shape).lineTo(5.87, -8.65);
        ((GeneralPath) shape).lineTo(5.89, -8.61);
        ((GeneralPath) shape).lineTo(5.91, -8.56);
        ((GeneralPath) shape).lineTo(5.93, -8.52);
        ((GeneralPath) shape).lineTo(5.96, -8.48);
        ((GeneralPath) shape).lineTo(5.99, -8.44);
        ((GeneralPath) shape).lineTo(6.04, -8.4);
        ((GeneralPath) shape).lineTo(6.08, -8.35);
        ((GeneralPath) shape).lineTo(6.13, -8.32);
        ((GeneralPath) shape).lineTo(6.19, -8.28);
        ((GeneralPath) shape).lineTo(6.24, -8.25);
        ((GeneralPath) shape).lineTo(6.3, -8.23);
        ((GeneralPath) shape).lineTo(6.36, -8.21);
        ((GeneralPath) shape).lineTo(6.42, -8.19);
        ((GeneralPath) shape).lineTo(6.53, -8.16);
        ((GeneralPath) shape).lineTo(6.65, -8.15);
        ((GeneralPath) shape).lineTo(6.77, -8.14);
        ((GeneralPath) shape).lineTo(6.89, -8.15);
        ((GeneralPath) shape).lineTo(7.01, -8.15);
        ((GeneralPath) shape).lineTo(7.13, -8.17);
        ((GeneralPath) shape).lineTo(7.24, -8.19);
        ((GeneralPath) shape).lineTo(7.36, -8.23);
        ((GeneralPath) shape).lineTo(7.41, -8.25);
        ((GeneralPath) shape).lineTo(7.46, -8.27);
        ((GeneralPath) shape).lineTo(7.51, -8.3);
        ((GeneralPath) shape).lineTo(7.55, -8.33);
        ((GeneralPath) shape).lineTo(7.6, -8.36);
        ((GeneralPath) shape).lineTo(7.64, -8.4);
        ((GeneralPath) shape).lineTo(7.68, -8.44);
        ((GeneralPath) shape).lineTo(7.72, -8.48);
        ((GeneralPath) shape).lineTo(7.75, -8.52);
        ((GeneralPath) shape).lineTo(7.78, -8.57);
        ((GeneralPath) shape).lineTo(7.81, -8.62);
        ((GeneralPath) shape).lineTo(7.83, -8.67);
        ((GeneralPath) shape).lineTo(7.85, -8.72);
        ((GeneralPath) shape).lineTo(7.87, -8.77);
        ((GeneralPath) shape).lineTo(7.88, -8.83);
        ((GeneralPath) shape).lineTo(7.89, -8.88);
        ((GeneralPath) shape).lineTo(7.9, -9.06);
        ((GeneralPath) shape).lineTo(7.91, -9.23);
        ((GeneralPath) shape).lineTo(7.5, -9.14);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-1.26, -0.95);
        ((GeneralPath) shape).lineTo(-1.95, -0.5);
        ((GeneralPath) shape).lineTo(-1.95, 0.0);
        ((GeneralPath) shape).lineTo(1.95, 0.0);
        ((GeneralPath) shape).lineTo(1.95, -0.5);
        ((GeneralPath) shape).lineTo(1.33, -0.95);

        g.setStroke(new BasicStroke(0.12f, 0, 0, 4));
        g.draw(shape);

        // _0_0_27
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

        // _0_0_28
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

        // _0_0_29
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
        return 59;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * 
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 63;
    }
}

