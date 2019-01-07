package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class SampleFrame extends JFrame
{
	private GuiController appController;
	private SamplePanel appPanel;
	
	public SampleFrame(GuiController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new SamplePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Le GUI");
		this.setSize(800, 500);
		this.setResizable(true);
		this.setVisible(true);
	}
}
