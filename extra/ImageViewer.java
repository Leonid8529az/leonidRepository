package extra;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class ImageViewer {
	public static void main(String args[]) {
		JFrame frame = new ImageViewerFrame();
		frame.setTitle("Hello Man");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class ImageViewerFrame extends JFrame {
	JLabel label;
	JFileChooser chooser;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem menuitem;
	
	public ImageViewerFrame() {
		setSize(500,500);
		
		label = new JLabel();
		add(label);
		
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu = new JMenu("DONT CLICK HERE");
		menubar.add(menu);
		menuitem = new JMenuItem("Open");
		menu.add(menuitem);
		
		menuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
		
	}
	
}