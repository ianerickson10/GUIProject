package gui.view;

import javax.swing.*;
import gui.controller.GuiController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SamplePanel extends JPanel
{
	private GuiController appController;
	private JLabel textLabel;
	private JButton colorButton;
	private SpringLayout appLayout;
	
	public SamplePanel(GuiController appController)
	{
		super();
		
		this.appController = appController;
		this.colorButton = new JButton("Click me!");
		
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.add(colorButton);
		this.textLabel = new JLabel("This is a color changing app");
		this.add(textLabel);
		this.setLayout(appLayout);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, colorButton, 125, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, colorButton, 165, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, textLabel, 124, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, textLabel, -52, SpringLayout.NORTH, colorButton);
		colorButton.setHorizontalAlignment(SwingConstants.LEFT);
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundColor();
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 100);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
}
