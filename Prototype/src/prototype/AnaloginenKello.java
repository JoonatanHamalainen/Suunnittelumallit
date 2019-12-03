package prototype;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class AnaloginenKello extends Applet {
	@Override
	public void init() {

		this.setSize(new Dimension(800, 400));
		setBackground(new Color(50, 50, 50));
		new Thread() {
			@Override
			public void run() {
				while (true) {
					repaint();
					viive();
				}
			}
		}.start();
	}

	private void viive() {
		try {

			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void paint(Graphics kello) {

		// Draw clock body center at (400, 200)
		kello.setColor(Color.white);
		kello.fillOval(300, 100, 200, 200);

		// Labeling
		kello.setColor(Color.black);
		kello.drawString("12", 390, 120);
		kello.drawString("9", 310, 200);
		kello.drawString("6", 400, 290);
		kello.drawString("3", 480, 200);
		ViisariPrototyyppi viisari = new ViisariPrototyyppi();

		ViisariPrototyyppi sekuntiViisari = (ViisariPrototyyppi) viisari.clone();
		ViisariPrototyyppi minuuttiViisari = (ViisariPrototyyppi) viisari.clone();
		ViisariPrototyyppi tuntiViisari = (ViisariPrototyyppi) viisari.clone();

		sekuntiViisari.setup(viisari.getSekunti(), 100);
		minuuttiViisari.setup(viisari.getMinuutti(), 80);
		tuntiViisari.setup(viisari.getTunti(), 50);

		kello.drawLine(400, 200, 400 + sekuntiViisari.getX(), 200 - sekuntiViisari.getY());
		kello.drawLine(400, 200, 400 + minuuttiViisari.getX(), 200 - minuuttiViisari.getY());
		kello.drawLine(400, 200, 400 + tuntiViisari.getX(), 200 - tuntiViisari.getY());
	}
}
