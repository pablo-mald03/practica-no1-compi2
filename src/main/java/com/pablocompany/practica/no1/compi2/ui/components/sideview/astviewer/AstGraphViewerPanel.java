package com.pablocompany.practica.no1.compi2.ui.components.sideview.astviewer;

import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author pablo03
 */
//This class represents the panel to make a visualization of the AST
public class AstGraphViewerPanel extends JPanel {

    private BufferedImage image;
    private boolean isLoading = false;
    private double zoomFactor = 1.0;

    private static final double ZOOM_MIN = 0.2;
    private static final double ZOOM_MAX = 4.0;
    private static final double ZOOM_STEP = 1.15;

    public AstGraphViewerPanel() {
        setBackground(Theme.BACKGROUND_DARK.getColorSet());
        setAutoscrolls(true);

        addMouseWheelListener((MouseWheelEvent e) -> {
            if (e.isControlDown() && image != null) {
                e.consume();
                if (e.getPreciseWheelRotation() < 0) {
                    zoomIn();
                } else {
                    zoomOut();
                }
            }
        });
    }

    //Mutable state to indicate loading data
    public void setLoading(boolean loading) {
        this.isLoading = loading;
        if (loading) {
            this.image = null; 
        }
        revalidate();
        repaint();
    }

    //This method set the image
    public void setImage(BufferedImage img) {
        this.image = img;
        this.isLoading = false;
        this.zoomFactor = 1.0;
        revalidate();
        repaint();
    }

    //This method action is zoom in
    public void zoomIn() {
        if (zoomFactor < ZOOM_MAX) {
            zoomFactor *= ZOOM_STEP;
            revalidate();
            repaint();
        }
    }

    //This method action is zoom out
    public void zoomOut() {
        if (zoomFactor > ZOOM_MIN) {
            zoomFactor /= ZOOM_STEP;
            revalidate();
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        if (isLoading) {
            g2d.setColor(Theme.FOREGROUND_DARK.getColorSet());
            g2d.setFont(new Font("Liberation Mono", Font.BOLD, 15));
            String text = "Generando AST...";
            FontMetrics fm = g2d.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = (getHeight() / 2);
            g2d.drawString(text, x, y);
        } else if (image != null) {
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

            int scaledWidth = (int) (image.getWidth() * zoomFactor);
            int scaledHeight = (int) (image.getHeight() * zoomFactor);

            int x = Math.max(0, (getWidth() - scaledWidth) / 2);
            int y = Math.max(0, (getHeight() - scaledHeight) / 2);

            g2d.drawImage(image, x, y, scaledWidth, scaledHeight, this);
        } else {
            g2d.setColor(Theme.FOREGROUND_DARK.getColorSet());
            g2d.setFont(new Font("Liberation Mono", Font.PLAIN, 13));
            String text = "Sin AST generado";
            FontMetrics fm = g2d.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = (getHeight() / 2);
            g2d.drawString(text, x, y);
        }

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        if (image == null) {
            return new Dimension(400, 300);
        }
        return new Dimension(
                (int) (image.getWidth() * zoomFactor),
                (int) (image.getHeight() * zoomFactor)
        );
    }
}
