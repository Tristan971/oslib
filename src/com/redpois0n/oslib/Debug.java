package com.redpois0n.oslib;

import com.redpois0n.oslib.distro.DistroSpec;

public class Debug {
	
	public static void main(String[] args) {
		DistroSpec ds = DistroDetector.getDistro();
		
		System.out.println(ds.getDistro().getName());
		System.out.println(ds.getCodename());
		System.out.println(ds.getRelease());
	}

}