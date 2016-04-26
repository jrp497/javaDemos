import java.applet.*;
import java.awt.*;
public class Applet1 extends Applet{
	String str = "";
	public void init(){
		str=str+"init()";
		}
	public void start(){
		str=str+" start()";
		}
	public void paint(Graphics g){
		str = str + " paint()";
		g.drawString(str,50,50);
		}
	public void stop(){
		str = str + " stop()";
		}
	public void destroy(){
		str = str + " destroy()";
		}
	}
/*
<applet code="Applet1" height="300" width="300">
</applet>
*/