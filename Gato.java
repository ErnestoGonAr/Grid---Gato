import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;


public class Gato extends JFrame{
	JPanel g=new JPanel();
	Boton buttons[]=new Boton[9];

	public static void main(String []args){
		new Gato();
	}
	
	public Gato(){
                super("Gato");
                setSize(600,600);
                setResizable(false);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                g.setLayout(new GridLayout(3,3));
                for(int i=0; i<9; i++){
                        buttons[i]=new Boton();
                        g.add(buttons[i]);
                        
		}
                add(g);
                setVisible(true);
	}
}
