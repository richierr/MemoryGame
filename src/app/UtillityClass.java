package app;


import java.util.List;

import javax.swing.SwingWorker;


public class UtillityClass {
	
	public static void stopWatch() {
		SwingWorker<Boolean, String> stopWatchThread=new SwingWorker<Boolean, String>(){
			long startTime;
			long endTime;

			@Override
			protected Boolean doInBackground() throws Exception {
				startTime=System.currentTimeMillis();
				
				
				
				return null;
			}

			@Override
			protected void process(List<String> chunks) {
				// TODO Auto-generated method stub
				super.process(chunks);
			};
			

			
		
		
		
		
		
	};
	

}
}