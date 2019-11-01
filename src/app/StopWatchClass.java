package app;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class StopWatchClass extends SwingWorker<Void, Long>{

	private JLabel lblStopwatch;
	private Long score;
	private long startTime;
	
	
	
	
	
	public Long getScore() {
		return score;
	}


	public StopWatchClass(JLabel lblStopwatch,Long score) {
		super();
		this.score=score;
		this.lblStopwatch = lblStopwatch;
		
	}


	@Override
	protected Void doInBackground() throws Exception {
		startTime=System.currentTimeMillis();
		while(true) {
			
			Thread.sleep(1000);
			
			long rez=(System.currentTimeMillis()-startTime);

			
			
			

			publish(rez);
			
		}
		
	}
	
	
	
	



	@Override
	protected void process(List<Long> chunks) {
		Long update=chunks.get((chunks.size()-1));
		//----------------------------------------------------XXXXXXXX----------------------------------------
		score=10000-(update/1000);
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
		
		
		lblStopwatch.setText("h:"+hours+" m:"+minutes+" s:"+seconds);
		System.out.println(score);
		super.process(chunks);
	};
	
	

}
