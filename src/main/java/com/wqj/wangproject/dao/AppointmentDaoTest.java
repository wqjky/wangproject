package com.wqj.wangproject.dao;

/** 
* @ClassName: AppointmentDaoTest 
* @Description: TODO
* @author wqjhky@gmail.com
* @date 2017年12月14日 下午8:59:10 
*  
*/
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wqj.wangproject.BaseTest;
import com.wqj.wangproject.entity.Appointment;


public class AppointmentDaoTest extends BaseTest {

	@Autowired
	private AppointmentDao appointmentDao;

	@Test
	public void testInsertAppointment() throws Exception {
		long bookId = 1000;
		long studentId = 12345678910L;
		int insert = appointmentDao.insertAppointment(bookId, studentId);
		System.out.println("insert=" + insert);
	}

	@Test
	public void testQueryByKeyWithBook() throws Exception {
		long bookId = 1000;
		long studentId = 12345678910L;
		Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
		System.out.println(appointment);
		System.out.println(appointment.getBook());
	}

}
