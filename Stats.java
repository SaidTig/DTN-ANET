import io.jbotsim.core.Link;
import io.jbotsim.core.Node;
import io.jbotsim.core.Topology;
import io.jbotsim.core.event.ClockListener;
import io.jbotsim.core.event.TopologyListener;
import io.jbotsim.core.event.ConnectivityListener;


import java.io.*;

public class Stats implements ClockListener{
    private Topology tp;   
    Writer output;
    
    public Stats(Topology tp){
        this.tp = tp;
        tp.addClockListener(this);
    }

    @Override
    public void onClock(){
            System.out.println("Number of nodes that have transmited at time " + tp.getTime() + " is " + AdvisedWayPointNode.nbTransmission);
            writeToFile(tp.getTime() + " " + String.valueOf(AdvisedWayPointNode.nbTransmission));
    
	}
	public static void writeToFile(String text) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("new4.txt"), true));
			bw.write(text);
			bw.newLine();
			bw.close();
		} catch (Exception e) {
		}
	}
}

