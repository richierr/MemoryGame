package app;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class StopWatchClass extends SwingWorker<Void, Long>{

	JLabel lblStopwatch;
	
	long startTime;
	
	
	public StopWatchClass(JLabel lblStopwatch) {
		super();
		this.lblStopwatch = lblStopwatch;
		
	}


	@Override
	protected Void doInBackground() throws Exception {
		startTime=System.currentTimeMillis();
		while(true) {
			
			Thread.sleep(1000);
			
			long rez=(System.currentTimeMillis()-startTime);

			
			
			
//			System.out.println(rez);
			publish(rez);
		}
	}
	
	
	@Override
	protected void process(List<Long> chunks) {
		Long update=chunks.get((chunks.size()-1));
		//----------------------------------------------------XXXXXXXX----------------------------------------
		long uptime = chunks.get((chunks.size()-1));

		long days = TimeUnit.MILLISECONDS
		    .toDays(uptime);
		uptime -= TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS
		    .toHours(uptime);
		uptime -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS
		    .toMinutes(uptime);
		uptime -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS
		    .toSeconds(uptime);
		//----------------------------------------------------XXXXXXXX----------------------------------------
		
		//lblStopwatch.setText(Long.toString(update));
		lblStopwatch.setText("h:"+hours+" m:"+minutes+" s:"+seconds);
		super.process(chunks);
	};
	
	

}
