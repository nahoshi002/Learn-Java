package Treeeee;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * JTree basic tutorial and example
 * 
 * @author wwww.codejava.net
 */
public class tree extends JFrame {
	private JTree tree;
	private JLabel selectedLabel;

	public tree() {
		// create the root node
		DefaultMutableTreeNode sinhvat = new DefaultMutableTreeNode("sinhvat");
		// create the child nodes
		DefaultMutableTreeNode SVduoinuoc = new DefaultMutableTreeNode("Duoi nuoc");
		SVduoinuoc.add(new DefaultMutableTreeNode("ca"));
		SVduoinuoc.add(new DefaultMutableTreeNode("tom"));
		SVduoinuoc.add(new DefaultMutableTreeNode("cua"));
		SVduoinuoc.add(new DefaultMutableTreeNode("oc"));

		DefaultMutableTreeNode SVtrencan = new DefaultMutableTreeNode("tren can");
		SVtrencan.add(new DefaultMutableTreeNode("cho"));
		SVtrencan.add(new DefaultMutableTreeNode("meo"));
		SVtrencan.add(new DefaultMutableTreeNode("bo"));
		SVtrencan.add(new DefaultMutableTreeNode("ga"));
		SVtrencan.add(new DefaultMutableTreeNode("va em:v"));
		// add the child nodes to the root node
		sinhvat.add(SVduoinuoc);
		sinhvat.add(SVtrencan);

		// create the tree by passing in the root node
		tree = new JTree(sinhvat);

		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();

		tree.setCellRenderer(renderer);
		tree.setShowsRootHandles(true);
		tree.setRootVisible(false);
		getContentPane().add(new JScrollPane(tree));

		selectedLabel = new JLabel();
		getContentPane().add(selectedLabel, BorderLayout.SOUTH);
		tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				selectedLabel.setText(selectedNode.getUserObject().toString());
			}
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1414, 550);
		this.setTitle("JTree Example");
		this.setSize(635, 508);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new tree();
			}
		});
	}
}