package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import utility.AppConstants;
import utility.GuiUtility;

public class HelpFrame extends JFrame
{
	public HelpFrame()
	{
		initGUIComponents();
	}

	private void initGUIComponents()
	{
		setTitle(Messages.getString("HelpFrame.help")); //$NON-NLS-1$
		setResizable(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		mHelpPanel = new ChessPanel();
		mHelpPanel.setLayout(new BorderLayout());

		JPanel gamePlayHelpPanel = new JPanel();
		gamePlayHelpPanel.setOpaque(false);
		JScrollPane gamePlayHelpScrollPane = new JScrollPane();
		gamePlayHelpScrollPane.setOpaque(false);
		gamePlayHelpScrollPane.setViewportView(gamePlayHelpPanel);
		gamePlayHelpScrollPane.getViewport().setOpaque(false);
		
		JPanel variantMakingHelpPanel = new JPanel();
		variantMakingHelpPanel.setOpaque(false);
		JScrollPane variantMakingHelpScrollPane = new JScrollPane();
		variantMakingHelpScrollPane.setOpaque(false);
		variantMakingHelpScrollPane.setViewportView(variantMakingHelpPanel);
		variantMakingHelpScrollPane.getViewport().setOpaque(false);
		
		JPanel generalHelpPanel = new JPanel();
		generalHelpPanel.setOpaque(false);
		JScrollPane generalHelpScrollPane = new JScrollPane();
		generalHelpScrollPane.setOpaque(false);
		generalHelpScrollPane.setViewportView(generalHelpPanel);
		generalHelpScrollPane.getViewport().setOpaque(false);
		
		JPanel pieceMakingHelpPanel = new JPanel();
		pieceMakingHelpPanel.setOpaque(false);
		JScrollPane pieceMakingHelpScrollPane = new JScrollPane();
		pieceMakingHelpScrollPane.setOpaque(false);
		pieceMakingHelpScrollPane.setViewportView(pieceMakingHelpPanel);
		pieceMakingHelpScrollPane.getViewport().setOpaque(false);
		
		JTabbedPane helpTypesTabbedPane = new JTabbedPane();
		helpTypesTabbedPane.setOpaque(false);
		helpTypesTabbedPane
				.addTab(Messages.getString("HelpFrame.generalHelp"), null, generalHelpScrollPane, Messages.getString("HelpFrame.clickForGeneralHelp") + AppConstants.APP_NAME); //$NON-NLS-1$ //$NON-NLS-2$
		helpTypesTabbedPane
				.addTab(Messages.getString("HelpFrame.gamePlayHelp"), null, gamePlayHelpScrollPane, Messages.getString("HelpFrame.clickForHelpPlaying")); //$NON-NLS-1$ //$NON-NLS-2$
		helpTypesTabbedPane
				.addTab(Messages.getString("HelpFrame.variantHelp"), null, variantMakingHelpScrollPane, Messages.getString("HelpFrame.clickForNewGameHelp")); //$NON-NLS-1$ //$NON-NLS-2$
		helpTypesTabbedPane
				.addTab(Messages.getString("HelpFrame.pieceMakingHelp"), null, pieceMakingHelpScrollPane, Messages.getString("HelpFrame.clickForPieceMakingHelp")); //$NON-NLS-1$ //$NON-NLS-2$
		helpTypesTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

		mHelpPanel.add(helpTypesTabbedPane, BorderLayout.CENTER);

		JLabel gamePlayHelpText = GuiUtility.createJLabel(Messages.getString("HelpFrame.gamePlayText")); //$NON-NLS-1$
		gamePlayHelpPanel.add(gamePlayHelpText);

		JLabel generalHelpText = GuiUtility.createJLabel(Messages.getString("HelpFrame.generalHelpText")); //$NON-NLS-1$
		generalHelpPanel.add(generalHelpText);

		JLabel variantMakingHelpText = GuiUtility.createJLabel(Messages.getString("HelpFrame.variantHelpText")); //$NON-NLS-1$
		variantMakingHelpPanel.add(variantMakingHelpText);

		JLabel pieceMakingHelpText = GuiUtility.createJLabel(Messages.getString("HelpFrame.pieceOptionsText")); //$NON-NLS-1$
		pieceMakingHelpPanel.add(pieceMakingHelpText);

		
		add(mHelpPanel);

		pack();
		Driver.centerFrame(this);
		setVisible(true);
	}

	private static final long serialVersionUID = -3375921014569944071L;
	private ChessPanel mHelpPanel;
}
