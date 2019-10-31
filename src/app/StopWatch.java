package app;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class StopWatch  {
	private SwingWorker<Void, Long> stopWatchThread;
	

	
	public SwingWorker<Void, Long> getStopWatchThread() {
		return stopWatchThread;
	}



	public  void startStopwatch(JLabel lblStopwatch) {
		this.stopWatchThread=new SwingWorker<Void, Long>(){
				long startTime=System.currentTimeMillis();;
				

				@Override
				protected Void doInBackground() throws Exception {
					while(true) {
						long rez=(System.currentTimeMillis()-startTime)/1000;
						
						//System.out.println(rez);
						publish(rez);
					}
				}
				

				@Override
				protected void process(List<Long> chunks) {
					Long update=chunks.get((chunks.size()-1));
					lblStopwatch.setText(Long.toString(update));
					super.process(chunks);
				};
				

			
			
		};
		stopWatchThread.execute();
		
	}
	
	public void stopStopwatch() {
		this.stopWatchThread.cancel(true);
	}

}
