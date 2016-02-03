import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class Boton extends JButton implements ActionListener{
	ImageIcon X,O;
	byte valor=0;

	public Boton(){
	X=new ImageIcon(this.getClass().getResource("X.png"));
	O=new ImageIcon(this.getClass().getResource("O.png"));
	this.addActionListener(this);

}

}

}
