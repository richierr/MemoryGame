package app;


import java.util.List;

import javax.swing.JLabel;
import javax.swing.SwingWorker;


public class UtillityClass {
	
	public static boolean valueChecker(Card a,Card b) {
		if(a.getValue()==b.getValue()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static Long gameMech() {
		Long score=(long) 0;
		
		
		
		
		return score;
		
	}
	
	
	
	public static void stopWatch(SwingWorker<Void, Long> sw,JLabel lblStopwatch) {
		
		 SwingWorker<Void, Long> stopWatchThread=new SwingWorker<Void, Long>(){
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
	sw=stopWatchThread;

}
}