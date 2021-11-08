package part3;

public class DeviceDB {
	
	Device ob[] = new Device[1000];
	int countDevices=0;
	
	public boolean insertNewDevice(Device de)
	{
		boolean isInserted = false;
		if(de!= null)
		{
			ob[countDevices] = de;
			ob[countDevices].setModelNumber(ob[countDevices].getRandomString());
			countDevices++;
			isInserted = true;
		}
		return isInserted;
	}
	
	public Device searchByModelNumber(String modNumber )
	{
		Device temp = null;
		for(int i=0;i<countDevices;i++)
		{
		    if(modNumber.equals(ob[i].getModelNumber()))
		    {
		    	return ob[i];
		    }
		}
		return temp;
		
	}
	
	public Device[] printDevices()
	{
		Device printD[] = new Device[countDevices];
		for(int i=0;i<countDevices;i++)
		{
			printD[i] = ob[i];
			
		}
		return printD;
		
		
	}
	
	public Device[] getDevicesWithinRange(int startRange , int endRange )
	{
		Device temp[] = new Device[countDevices];
		int k=0;
		for(int i=0;i<countDevices;i++)
		{
			if((ob[i].getCost()>=startRange) &&(ob[i].getCost()<=endRange))
			{
				temp[k++] = ob[i];
				
			}
		}
		return temp;
	}
	
	public Device[] getDeviceByFilterRangeAndBrand(int startRange , int endRange , String bName)
	{
		Device temp[] = new Device[countDevices];
		int k=0;
		for(int i=0;i<countDevices;i++)
		{
			if((ob[i].getCost()>=startRange) &&(ob[i].getCost()<=endRange)&&(bName.equals(ob[i].getBrandName())))
			{
				temp[k++] = ob[i];
				
			}
		}
		return temp;
	}
	
	public float getAvgRating(Device De[])
	{
		float avg=0 ;
		int len = De.length;
		for(int i=0;i<len;i++)
		{
			avg += (float)ob[i].getAvgRating();
		}
		avg /=len;
		return avg;
	}
	

}
