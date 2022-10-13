import io.jbotsim.core.*;
import io.jbotsim.core.event.*;
import io.jbotsim.ui.JViewer;

import io.jbotsim.core.Point;
import java.util.LinkedList;
import java.util.Queue;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class DTN {

	public static void main(String[] args) {

		Topology tp = new Topology(600,600);
		tp.addClockListener(new Stats(tp));
		tp.setTimeUnit(1);
		new JViewer(tp);
		tp.setDefaultNodeModel(AdvisedWayPointNode.class);
		tp.addNode(300, 300, new SinkNode());
		
		for(int i = 0; i < 100; i++)
		{
			tp.addNode(-1, -1, new AdvisedWayPointNode());
		}
	}
}
