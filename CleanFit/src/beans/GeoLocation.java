package beans;

public class GeoLocation {
	private float getLatitude;
	private float getLongitude;
	
	public GeoLocation(float getLatitude, float getLongitude) {
		super();
		this.getLatitude = getLatitude;
		this.getLongitude = getLongitude;
	}

	public float getGetLatitude() {
		return getLatitude;
	}

	public void setGetLatitude(float getLatitude) {
		this.getLatitude = getLatitude;
	}

	public float getGetLongitude() {
		return getLongitude;
	}

	public void setGetLongitude(float getLongitude) {
		this.getLongitude = getLongitude;
	}

}
