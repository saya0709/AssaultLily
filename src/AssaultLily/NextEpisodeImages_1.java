package AssaultLily;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NextEpisodeImages_1 extends JPanel {
	static JLabel lblNewLabel;
	/**
	 * Create the panel.
	 */
	public NextEpisodeImages_1() {
		ImageIcon[] imageIcons = {
				new ImageIcon("D:\\AssaultLily\\一柳隊\\①.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\②.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\③.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\④.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑤.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑥.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑦.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑧.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑨.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑩.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑪.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑫.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑬.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑭.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑮.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑯.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑰.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑱.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑲.png"), 
				new ImageIcon("D:\\AssaultLily\\一柳隊\\⑳.png"),
				
				
		};
		
		lblNewLabel = new JLabel(new ImageIcon("D:\\AssaultLily\\HomeImage\\ロゴ①.png"));
		
		
		
		Animation_1 anime = new Animation_1 (lblNewLabel,imageIcons,20);
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
