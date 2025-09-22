import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  BackgroundPainter bgp = new BackgroundPainter();
    bgp.setPaint(1000);
    bgp.paintBackground("blue");
    
  BackgroundPainterExtras bgpe1 = new BackgroundPainterExtras();
bgpe1.paintExtra1("white");

 BackgroundPainterExtras bgpe2 = new BackgroundPainterExtras();
bgpe2.paintExtra2("yellow");

 CarPainter wheels = new CarPainter();
wheels.paintWheels();

 CarPainter frame = new CarPainter();
frame.paintFrame();

 CarPainter body = new CarPainter();
body.paintBody();
  }
  
}