package model;

import java.text.DecimalFormat;

public class CoordGPS {
	private static double latitude;
	private double longitude;
	
	public CoordGPS(String geometry) {
		this(getLatitudeFromGeometry(geometry),getLongitudeFromGeometry(geometry));
	}
	public CoordGPS(double lat, double lon) {
		latitude = lat;
		longitude = lon;
		
	}
	
	private static String[] extractLatLongFromGeometry(String geometry) {
		String extract = geometry.substring(2, geometry.length()-1);
		String[] coord = extract.split(", ");
		return coord;
	}
	private static double getLatitudeFromGeometry(String geometry) {
		return Double.parseDouble(extractLatLongFromGeometry(geometry)[0]);
	}
	private static double getLongitudeFromGeometry(String geometry) {
		return Double.parseDouble(extractLatLongFromGeometry(geometry)[1]);
	}
	public double getLatitude() {
		
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	double deg2rad(double deg) {
		  return deg * (Math.PI/180);
		}
	
	
	
	//fonction pour calculer la distance entre deux points.
	public double getCalculeDistance(double lon2, double lat2) {
		double lat1 = 48.8566969;
		double lon1 = 2.3514616;
		//System.out.println(lon2);
		//System.out.println(lat2);
		  var R = 6371; // Radius of the earth in km
		  var dLat = deg2rad(lat2-lat1);  // deg2rad below
		  var dLon = deg2rad(lon2-lon1); 
		  var a = 
		    Math.sin(dLat/2) * Math.sin(dLat/2) +
		    Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * 
		    Math.sin(dLon/2) * Math.sin(dLon/2)
		    ; 
		  var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
		  var d = R * c; // Distance in km
		  
		  
		 
		  
		  return d;
		}
	@Override
	public String toString() {
		System.out.println(longitude);
		return "CoordGPS [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	
}
