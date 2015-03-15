package com.redpois0n.oslib.osx;

public enum OSXVersion {
	
	CHEETAH("Cheetah", "10.0"),
	PUMA("Puma", "10.1"),
	JAGUAR("Jaguar", "10.2"),
	PANTHER("Panther", "10.3"),
	TIGER("Tiger", "10.4"),
	LEOPARD("Leopard", "10.5"),
	SNOW_LEOPARD("Snow Leopard", "10.6"),
	LION("Lion", "10.7"),
	MOUNTAIN_LION("Mountain Lion", "10.8"),
	MAVERICKS("Mavericks", "10.9"),
	YOSEMITE("Yosemite", "10.10");
	
	private String search;
	private String version;
	
	private OSXVersion(String search, String version) {
		this.search = search;
		this.version = version;
	}
	
	/**
	 * Returns codename, such as Yosemite
	 * @return
	 */
	public String getDisplay() {
		return search;
	}
	
	/**
	 * Version of OS X, such as 10.10
	 * @return
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * Gets OSXVersion for this machine
	 * @return
	 */
	public static OSXVersion getFromString() {
		return getFromString(System.getProperty("os.version"));
	}
	
	/**
	 * Gets OSXVersion from string
	 * @param search Can either be version or display name ("10.10", "yosemite")
	 * @return
	 */
	public static OSXVersion getFromString(String search) {
		for (OSXVersion v : OSXVersion.values()) {
			if (v.getVersion().equalsIgnoreCase(search) || v.getDisplay().toLowerCase().contains(search.toLowerCase())) {
				return v;
			}
		}
		
		return null;
	}
	
	public static OSXVersion getExact(String display, String version) {
		for (OSXVersion v : OSXVersion.values()) {
			if (v.getDisplay().equals(display) && v.getVersion().equals(version)) {
				return v;
			}
		}
		
		return null;
	}

}
