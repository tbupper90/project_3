import java.util.*;

import java.awt.*;
import javax.swing.*;

/**
 * This class displays requested information using graphical elements.
 */
public class ShowGraphic 
{
	/**
	 * Displays a bar graph with requested information.
	 * @param list The list with information to display
	 * @param sortMethod How the information should be sorted
	 */
    public static void makeBarGraph(String[] names, long[] data)
	{
        // ***NOTE: Still needs window title
        
        // The barsPanel class below that extends JPanel can't read non-final
        final int entries = names.length;
        final long[] barData = data;
        final int barWidth = 40;
        
        JDialog barDialog = new JDialog();
		barDialog.setSize(600, 400);
		barDialog.setLocationRelativeTo(null);
		barDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		// Top panel that displays maximum value
        JPanel maxPanel = new JPanel();
        maxPanel.setLayout(new GridLayout());
        maxPanel.add(new JLabel("Maximum value: " + names[0] +
                ", " + data[0], JLabel.CENTER));
        
        // Bottom panel that displays minimum value
        JPanel minPanel = new JPanel();
        minPanel.setLayout(new GridLayout());
        minPanel.add(new JLabel("Minimum value: " + names[names.length-1] +
                ", " + data[names.length-1], JLabel.CENTER));
        
        // Middle panel that displays bars
        JPanel barsPanel = new JPanel()
        {
            int barLength[] = new int[entries];
            Color[] colors = {Color.DARK_GRAY, Color.LIGHT_GRAY};
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < entries; i++) {
                    barLength[i] = (int)(barData[i] / (double)barData[0]
                                         * getHeight() * 0.9);
                    g.setColor(colors[i % colors.length]);
                    g.fillRect(i * barWidth,                // x coordinate
                            getHeight() - barLength[i] - 5, // y coordinate
                            barWidth,                       // width
                            barLength[i]);                  // height
                }
                // Separator bar
                g.setColor(Color.BLACK);
                g.fillRect(0, getHeight() - 5, getWidth(), 5);
            }
        };
		barsPanel.setPreferredSize(new Dimension(barWidth * entries, 300));
		
		// Put panel with the bars onto a JScrollPane
        JScrollPane barScrollPane = new JScrollPane();
        barScrollPane.setViewportView(barsPanel);
        
		// Add components to the JDialog
        barDialog.add(maxPanel, BorderLayout.NORTH);
        barDialog.add(barScrollPane, BorderLayout.CENTER);
        barDialog.add(minPanel, BorderLayout.SOUTH);

        // Set barDialog to modal so program doesn't continue before it's closed
		barDialog.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		
		barDialog.setVisible(true);
	}
	
    /**
     * Displays a single bar composed of smaller segments
     * @param list The list with information to display
     * @param sortMethod How the information should be sorted
     */
    public static void makeSegmentGraph(String[] names, long[] data)
    {
        // Initialize variables accessible by overridden JPanels
        final int entries = names.length;
        final String[] segNames = names;
        final long[] segData = data;
        
        final int[] segLength = new int[entries];
        final int[] segmentY = new int[entries];
        int segStep = 0;
        for (int i = entries - 1; i >= 0; i--)
        {                                // Take the current data point...
            segLength[i] = (int)Math.pow(segData[i] /
                                         // divided by the smallest data point...
                                         (double)segData[entries - 1] *
                                         // multiplied by 14^5 (font size 12)...
                                         537824,
                                         // and calculate the fifth root.
                                         1.0/ 5);
            segmentY[i] = segStep;
            segStep += segLength[i];
        }
        final Color[] colors = {Color.DARK_GRAY, Color.GRAY};
        
        JDialog segDialog = new JDialog();
        segDialog.setSize(600, 400);
        segDialog.setLocationRelativeTo(null);
        segDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        // Label above the segment graph
        JPanel labelPanel = new JPanel()
        {
            String label = "*Note: Graph segments are scaled by a factor of the fifth root";
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                FontMetrics labelMetric = g.getFontMetrics();
                g.drawString(label, (getWidth() - labelMetric.stringWidth(label)) / 2, 12);
            }
        };
        labelPanel.setPreferredSize(new Dimension(0, 15));
        
        // Main panel that displays the segments
        JPanel segPanel = new JPanel()
        {
            String dataString;
            int segCenter;
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                FontMetrics segMetric = g.getFontMetrics();
                //segCenter = segMetric.stringWidth(String.valueOf(segData[0])) + 25;
                segCenter = getWidth() / 2;
                for (int i = entries - 1; i >= 0; i--) {
                    g.setColor(colors[i % colors.length]);
                    g.fillRect(segCenter - 25, segmentY[i], 50, segLength[i]);
                    dataString = String.valueOf(segData[i]);
                    g.drawString(dataString,
                            segCenter - 25 - segMetric.stringWidth(dataString),
                            segmentY[i] + segLength[i] / 2 +
                            segMetric.getAscent() / 2);                    
                    g.drawString(segNames[i],
                            segCenter + 25,
                            segmentY[i] + segLength[i] / 2 +
                            segMetric.getAscent() / 2);
                    
                }
            }
        };
        segPanel.setPreferredSize(new Dimension(400, segStep));
        
        
        JScrollPane segScrollPane = new JScrollPane();
        segScrollPane.setViewportView(segPanel);
        
        segDialog.add(labelPanel, BorderLayout.NORTH);
        segDialog.add(segScrollPane, BorderLayout.CENTER);
        
        segDialog.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
        
        segDialog.setVisible(true);
    }
    /**
     * Displays a map with requested information.
     * @param cities The list of cities to display
     */
	public static void makeWorldMap(LinkedHashMap<String, Region> cities)
	{
        System.out.println("Map!");		
	}
}
