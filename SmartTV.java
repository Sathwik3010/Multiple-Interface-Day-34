package com.codegnan.multipleInterface;

public class SmartTV implements ChannelSwitchable, VolumeAdjustable{

	@Override
	public String adjustVolume(int lvl) {
		// TODO Auto-generated method stub
		return "Volume: "+lvl;
	}

	@Override
	public String switchChannel(int num) {
		// TODO Auto-generated method stub
		return "Channel: "+num;
	}

}
