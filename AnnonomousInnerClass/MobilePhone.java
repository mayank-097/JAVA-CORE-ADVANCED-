package AnnonomousInnerClass;

public class MobilePhone{
	
	public void VideoCallingViaMobile(String name )
	{
		Wifi wifi = new Wifi() {

			@Override
			public String VideoCalling (String name) {
				// TODO Auto-generated method stub
				return name + " video calling done...s";
			}
			
			
		};
		
	
		String n = wifi.VideoCalling(name);
	}

}
