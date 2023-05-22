package AssaultLily;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;



public class Lever extends JPanel {
	
	static JButton btnNewButton= new JButton("MAXBET");;
	static JButton btnNewButton_1 = new JButton("lever");;
	
	Lottery lottery;
	
	
	private int lotteryNum;
	static int maxbetCount = 0;
//	static boolean maxbetOn = true;
//	static int maxbetCount = 0;
//	static int leverCount = 0;
//	static boolean leverOn = false;
//	static int buttonCount = 0;
//	static boolean leftButton = false;
//	static boolean centerButton = false;
//	static boolean rightButton = false;
//	
//	static int GameCount=0;
//	Performance_2 p2 = new Performance_2();
	

	public Lever() {	
		btnNewButton_1.setEnabled(false);  //レバー押下できない状態
		
		//maxbet
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(maxbetCount) {
				case 1:
					LilyFrame.panel_1.add(new HomeImage_777(), "HomeImage_777");
					LilyFrame.layout.show(LilyFrame.panel_1, "HomeImage_777");
					System.out.println(maxbetCount);
					btnNewButton.setEnabled(true);
					btnNewButton_1.setEnabled(false);
					maxbetCount=0;
					break;
				default:
					LilyFrame.panel_1.add(new HomeImage_1(), "HomeImage_1");
					LilyFrame.layout.show(LilyFrame.panel_1, "HomeImage_1");
					btnNewButton_1.setEnabled(true);  //レバー押下できない状態
					btnNewButton.setEnabled(false);
				}
			}
		});
		
		
		//レバー
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//抽選
				lottery = new Lottery();
				setLotteryNum(lottery.getLotteryNum());
				//レバーオフ
				btnNewButton_1.setEnabled(false);
				
				
				switch(lottery.getLotteryNum()) {
				case 1:
					maxbetCount=1;
//					btnNewButton_1.setEnabled(false);
					LilyFrame.panel_3.add(new Performance_1(), " Performance_1");
					LilyFrame.layout_2.show(LilyFrame.panel_3, " Performance_1");
					break;
				case 2:
					maxbetCount=1;
					LilyFrame.panel_3.add(new Performance_2(), " Performance_2");
					LilyFrame.layout_2.show(LilyFrame.panel_3, " Performance_2");
					break;
				case 3:
					maxbetCount=1;
					LilyFrame.panel_3.add(new Performance_3(), " Performance_3");
					LilyFrame.layout_2.show(LilyFrame.panel_3, " Performance_3");
					break;
				case 4:
					maxbetCount=1;
					LilyFrame.panel_3.add(new Performance_4(), " Performance_4");
					LilyFrame.layout_2.show(LilyFrame.panel_3, " Performance_4");
					break;
				case 5:
					maxbetCount=1;
					LilyFrame.panel_3.add(new Performance_5(), " Performance_5");
					LilyFrame.layout_2.show(LilyFrame.panel_3, " Performance_5");
					break;
				default:
					LilyFrame.panel_3.add(new Performance_0(), " Performance_0");
					LilyFrame.layout_2.show(LilyFrame.panel_3, " Performance_0");
				}
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		
		
		
		
		
		
		
		//グループレイアウト
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

	
	
	
	
	public int getLotteryNum() {
		return lotteryNum;
	}

	public void setLotteryNum(int lotteryNum) {
		this.lotteryNum = lotteryNum;
	}
}
