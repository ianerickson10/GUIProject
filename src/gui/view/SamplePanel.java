package gui.view;

import javax.swing.*;
import gui.controller.GuiController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

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
		colorButton.setForeground(Color.CYAN);
		appLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.add(colorButton);
		colorButton.setBackground(Color.DARK_GRAY);
		this.textLabel = new JLabel("This is a color changing app");
		
		textLabel.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 20));
		
		this.add(textLabel);
		this.setLayout(appLayout);
	}
	
	private void setupLayout()
	{
		colorButton.setHorizontalAlignment(SwingConstants.LEFT);
		appLayout.putConstraint(SpringLayout.EAST, colorButton, -168, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, colorButton, 52, SpringLayout.SOUTH, textLabel);
		appLayout.putConstraint(SpringLayout.NORTH, textLabel, 33, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, textLabel, -102, SpringLayout.EAST, this);
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
