package 航班管理;

public interface passengerinterface {
	/**
	 * 获取旅客信息
	 * return 返回姓名
	 */
public String getName();
/**
 * 获取预定号
 * @return返回预定号   
 */
public int getBookingNumber();
/**
 * 获取座位排数
 * @return 返回排数
 */
public int getRow();
/**
 * 获取座位号
 * @return 座位号
 */
public int getSeatposition();
}

