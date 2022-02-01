package _03_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton laugh = new JButton("laughter");
	JButton whistle = new JButton("Whistling");

	public void run() {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.add(panel);
		frame.pack();

		laugh.addActionListener(this);
		whistle.addActionListener(this);
		frame.add(laugh);
		frame.add(whistle);
		frame.setTitle("Sounds");
		frame.add(panel);
		panel.add(laugh);
		panel.add(whistle);
		
		frame.pack();
		frame.setTitle("Sounds");
	}

	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path + soundFile);
		if (sound.exists()) {
			new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}).start();
		} else {
			System.out.println("File does not exist");
		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(laugh)) {

			playSound("laugh.wav");

		}

		frame.pack();

		if (buttonPressed.equals(whistle)) {
			playSound("whistle.wav");
		}

		frame.pack();
	}

}
