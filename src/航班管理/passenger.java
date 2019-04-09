package 航班管理;
/**
 * 旅游类
 * @author HP
 *
 */

public class passenger implements passengerInterface{
private String names;
private int bookingNumber;
private int rows;
private int seatPosition;
/**
 * 旅客类的构造方法
 * @param name 旅客姓名
 * @param bookingNumber 预定号
 * @param rows  座位排数
 * @param seatpostion 座位号
 * @return 
 */
public void Passenger(String names,int bookingNumber,int rows,int seatpostion) {
	this.names=names;
	this.bookingNumber=bookingNumber;
	this.rows=rows;
	this.seatPosition=seatPosition;
}
public String getName() {
	return names;
}
public int getBookingNumber() {
	return bookingNumber;
}
public int getRow() {
	return rows;
}
public int getSeatPosition() {
	return seatPosition;
}
}