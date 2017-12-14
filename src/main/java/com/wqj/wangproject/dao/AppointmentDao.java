package com.wqj.wangproject.dao;


import org.apache.ibatis.annotations.Param;

import com.wqj.wangproject.entity.Appointment;

/** 
* @ClassName: Appointment 
* @Description: TODO
* @author wqjhky@gmail.com
* @date 2017年12月14日 下午8:47:35 
*  
*/
public interface AppointmentDao {

	/**
	 * 插入预约图书记录
	 * 
	 * @param bookId
	 * @param studentId
	 * @return 插入的行数
	 */
	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

	/**
	 * 通过主键查询预约图书记录，并且携带图书实体
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

}