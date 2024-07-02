import java.awt.*;
import java.awt.event.*;
public class MerryChristmas extends Frame implements WindowListener {
  private static final String titleStr = "Merry Christmas!";
  public MerryChristmas () {
    super (titleStr);
    setSize (360, 360);
    setResizable (false);
    setVisible (true);
    addWindowListener (this);
    repaint ();
  }
  public static void main (String[] args) {
    new MerryChristmas ();
  }
  public void paint (Graphics graphics) {
    graphics.setColor (Color.BLUE);
    graphics.fillRect (0, 0, 360, 360);
    graphics.setColor (Color.BLACK);
    graphics.fillRect (150, 315, 60, 45);
    int[] yP = new int[3];
    int[] xP = new int[]{180, 90, 270};
    int i;
    graphics.setColor (new Color (0, 192, 0));
    for (i = 2; i < 8; ++i) {
      yP[0] = i * 45 - (i << 2);
      yP[1] = yP[2] = yP[0] + 45;
      xP[1] = 240 + (i << 4);
      xP[2] = 360 - xP[1];
      graphics.fillPolygon (xP, yP, 3);
    }
    graphics.setColor (Color.WHITE);
    int titleLen = titleStr.length ();
    int spacing = 330 / titleLen;
    int waving = 50;
    for (i = 0; i < titleLen; ++i) {
      char[] ch = new char[1];
      ch[0] = titleStr.charAt (i);
      graphics.drawChars (ch, 0, 1,
        15 + i * spacing, waving);
      waving = 110 - waving;
    }
  }
  public void windowClosing (WindowEvent we) {
    System.exit (0);
  }
  public void windowOpened (WindowEvent we) {}
  public void windowClosed (WindowEvent we) {}
  public void windowIconified (WindowEvent we) {}
  public void windowDeiconified (WindowEvent we) {}
  public void windowActivated (WindowEvent we) {}
  public void windowDeactivated (WindowEvent we) {}
}
