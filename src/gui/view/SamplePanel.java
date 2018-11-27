package gui.view;

import javax.swing.*;
import gui.controller.GuiController;

public class SamplePanel extends JPanel
{
	private GuiController appController;
	private JLabel textLabel;
	private JButton colorButton;
	
	public SamplePanel(GuiController appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("This is a color changing app");
		this.colorButton = new JButton("Click me!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
