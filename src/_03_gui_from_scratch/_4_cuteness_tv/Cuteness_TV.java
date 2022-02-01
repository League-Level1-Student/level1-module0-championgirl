package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_TV implements ActionListener {

	JFrame frame = new JFrame();
	JButton frogs = new JButton("Frog-Vid");
	JButton ducks = new JButton("Duck-Vid");
	JButton unicorns = new JButton("Unicorn-Vid");
	JPanel panel = new JPanel();

	public void run() {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setTitle("Cute_Vids");
		frame.add(panel);
		panel.add(frogs);
		panel.add(ducks);
		panel.add(unicorns);
		frogs.addActionListener(this);
		ducks.addActionListener(this);
		unicorns.addActionListener(this);
		frame.pack();

	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {

		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
		// work on some Linux implementations
		try {
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { "which", "xdg- open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
				}
			} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(frogs)) {

			showFrog();

		}

		else if (buttonPressed.equals(ducks)) {

			showDucks();

		}

		else if (buttonPressed.equals(unicorns)) {

			showFluffyUnicorns();

		}



	}

}
