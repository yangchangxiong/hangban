package �������;
/**
 * ������
 * @author HP
 *
 */

public class passenger implements passengerInterface{
private String names;
private int bookingNumber;
private int rows;
private int seatPosition;
/**
 * �ÿ���Ĺ��췽��
 * @param name �ÿ�����
 * @param bookingNumber Ԥ����
 * @param rows  ��λ����
 * @param seatpostion ��λ��
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