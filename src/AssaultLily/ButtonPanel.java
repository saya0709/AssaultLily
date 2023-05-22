package AssaultLily;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	public JButton btnNewButton;
	public JButton btnNewButton_1; 
	public JButton btnNewButton_2;
	
	
	static boolean maxbetOn = true;
	static int maxbetCount = 0;
	static int leverCount = 0;
	static boolean leverOn = false;
	static int buttonCount = 0;
	static boolean leftButton = false;
	static boolean centerButton = false;
	static boolean rightButton = false;

	static int lotteryNum;
	
	static int GameCount=0;


	//BGM関連
	Clip nextEpisodeBGM;  //レバーオン時、次回予告BGM
	Clip nextEpisodeBGM_1;  //第3停止時、次回予告BGM
	Clip impactFlash;  //第3停止時、インパクトフラッシュ

	
	
	
	
	
	
	/**
	 * Create the panel.
	 */
	public ButtonPanel() {
		

		btnNewButton = new JButton("left");
		

		btnNewButton_1 = new JButton("center");
	
		
		
		
		btnNewButton_2 = new JButton("right");
		

		buttonOff();









		//グループレイアウト
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(btnNewButton)
						.addGap(44)
						.addComponent(btnNewButton_1)
						.addGap(43)
						.addComponent(btnNewButton_2)
						.addGap(77))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(28)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton)
										.addComponent(btnNewButton_1)))
						.addContainerGap(46, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}

	
	public void buttonOff() {
		
			btnNewButton.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_2.setEnabled(false);
			
		
	}
	
	
	
	public void buttonOff(int buttonCount) {
		if(buttonCount==3) {
			btnNewButton.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_2.setEnabled(false);
			
		}
	}
	
	public void buttonOn() {
		
			btnNewButton.setEnabled(true);
			btnNewButton_1.setEnabled(true);
			btnNewButton_2.setEnabled(true);
			
		
	}
	
	
	
	
	
	
	public void IF(int buttonCount) {
		if(buttonCount==1) {
//			impactFlash = BGM.createClip(new File("C:\\Users\\智志\\Desktop\\eva\\エヴァンゲリオン　インパクトフラッシュ-from-YouTube.wav"));
			FloatControl ctrl = (FloatControl)impactFlash.getControl(FloatControl.Type.MASTER_GAIN);
			impactFlash.start();
			ctrl.setValue(6);
		}
	}
	

}
