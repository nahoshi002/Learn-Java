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
		DefaultMutableTreeNode bird = new DefaultMutableTreeNode("chim");
		bird.add(new DefaultMutableTreeNode("chimnho"));
		bird.add(new DefaultMutableTreeNode("chimto"));
		bird.add(new DefaultMutableTreeNode("chimbiendi"));
		bird.add(new DefaultMutableTreeNode("chimkhuyettat"));

		DefaultMutableTreeNode buffterfly = new DefaultMutableTreeNode("buom");
		buffterfly.add(new DefaultMutableTreeNode("buomden"));
		buffterfly.add(new DefaultMutableTreeNode("buom7mau"));
		buffterfly.add(new DefaultMutableTreeNode("buommoilon"));
		buffterfly.add(new DefaultMutableTreeNode("buomto"));
		buffterfly.add(new DefaultMutableTreeNode("buomvua"));
		// add the child nodes to the root node
		sinhvat.add(bird);
		sinhvat.add(buffterfly);

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