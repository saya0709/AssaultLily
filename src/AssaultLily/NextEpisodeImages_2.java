package AssaultLily;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NextEpisodeImages_2 extends JPanel {
	static JLabel lblNewLabel;


	public NextEpisodeImages_2() {
		ImageIcon[] imageIcons = {
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\①.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\②.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\③.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\④.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑤.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑥.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑦.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑧.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑨.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑩.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑪.png"), 
				new ImageIcon("D:\\AssaultLily\\ヘルヴォル\\⑫.png"),
			
				
			
				
				
				
		};


		lblNewLabel = new JLabel(new ImageIcon("D:\\AssaultLily\\HomeImage\\ロゴ①.png"));



		Animation_1 anime = new Animation_1 (lblNewLabel,imageIcons, 12);
		anime.start();




		//グループレイアウトコード
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(33, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(40, Short.MAX_VALUE))
				);
		setLayout(groupLayout);


	}





}
