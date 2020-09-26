/**  
*The purpose of this class is to model a television 
*@author Constance Noble, 9/25/2020
*/ 

public class Television {
	
	private final String MANUFACTURER; //hold the brand name and cannot change once the television is created
	private final int SCREEN_SIZE; // hold the size of the television screen and cannot change once television is created
	private boolean powerOn; // hold the value true if the power is on, and false if the power is off
	private int channel; //hold the value of the station that the television is showing
	private int volume; // hold a number value representing the loudness (0 being no sound)
	/**
	 * Television constructor
	 * @param brand the televisions brand
	 * @param size the televisions screen size
	 * sets default value for power to off
	 * sets default volume to 20
	 * sets default channel to 2
	 */
	public Television(String brand, int size) {
		
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	/**
	 * get the television volume
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * getter method to get the television channel
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}
	/**
	 * getter method to get the television manufacturer
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	/**
	 * getter method to get the television screen size
	 * @return the screen size
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	/**
	 * mutator method to change the television channel
	 * @param c sets the channel
	 */
	public void setChannel(int c) {
		channel = c;
	}
	/**
	 * mutator method to change the television state (on or off)
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/**
	 * mutator method to increase the television volume by one
	 */
	public void increaseVolume() {
		volume++;
	}
	/**
	 * mutator method to decrease the television volume by one
	 */
	public void decreaseVolume() {
		volume--;
	}

}
