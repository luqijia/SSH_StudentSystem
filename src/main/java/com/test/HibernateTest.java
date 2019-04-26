package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.ActivityInfo;
import com.bean.RewardInfo;
import com.bean.ScoreInfo;
import com.bean.SelectCourseInfo;
import com.bean.StudentInfo;
import com.dao.Impl.ActivityInfoDaoImpl;
import com.dao.Impl.PunishmentInfoDaoImpl;
import com.dao.Impl.RewardInfoDaoImpl;
import com.dao.Impl.ScoreInfoDaoImpl;
import com.dao.Impl.SelectCourseInfoDaoImpl;
import com.dao.Impl.StudentInfoDapImpl;
import com.service.Impl.StudentInfoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class HibernateTest {

	@Autowired
	StudentInfoDapImpl studentInfoDapImpl;

	@Autowired
	SelectCourseInfoDaoImpl selectCourseInfoDaoImpl;

	@Autowired
	ScoreInfoDaoImpl scoreInfoDaoImpl;

	@Autowired
	RewardInfoDaoImpl rewardInfoDaoImpl;

	@Autowired
	PunishmentInfoDaoImpl punishmentInfoDaoImpl;

	@Autowired
	ActivityInfoDaoImpl activityInfoDaoImpl;

	@Autowired
	StudentInfoServiceImpl serviceImpl;

	@Test
	public void test() {
		// Student student = repository.save(new Student("2016002", "����"));
		// System.out.println("�ѱ��棺" + student);
//		for (int i = 0; i < 10; i++) {
//			StudentInfo studentInfo = new StudentInfo("201601" + i, "����", 18, "��", "�������ѧԺ", "��163��", "��У");
//			studentInfoDapImpl.insertStudent(studentInfo);
//			System.out.println("����ɹ�" + i + "����");
//		}
		// StudentInfo studentInfo = studentInfoDapImpl.findStudentById("2016001");
		// System.out.println(studentInfo);

		// List<StudentInfo> list = studentInfoDapImpl.findStudentByName("00");
		// List<StudentInfo> list = studentInfoDapImpl.findStudentsByClass("��16");
		// List<StudentInfo> list = studentInfoDapImpl.findStudentsByDept("ͨ��");
		// List<StudentInfo> list = studentInfoDapImpl.findStudentInfo("����");
		List<StudentInfo> list = serviceImpl.getStudentInfo("����");

		System.out.println(list.size());
		if (list.size() != 0) {
			for (StudentInfo studentInfo : list) {
				System.out.println(studentInfo);
			}
		} else {
			System.out.println("插入成功");
		}

		// int i = studentInfoDapImpl.updateStudentById(new
		// StudentInfo("2016003","����",18,"��","�������ѧԺ","��164��","��У"));
		// i = studentInfoDapImpl.updateStudentById(new
		// StudentInfo("2016004","����",18,"��","�������ѧԺ","��164��","��У"));
		// i = studentInfoDapImpl.updateStudentById(new
		// StudentInfo("2016005","С��",18,"Ů","ͨ�Ź���ѧԺ","��164��","��У"));
		// i = studentInfoDapImpl.updateStudentById(new
		// StudentInfo("2016006","����",18,"��","ͨ�Ź���ѧԺ","��163��","��У"));
		// i = studentInfoDapImpl.updateStudentById(new
		// StudentInfo("2016007","����",18,"��","ͨ�Ź���ѧԺ","��163��","��У"));
		//
		// System.out.println("�޸�"+i+"������");

		// studentInfoDapImpl.deleteStudentById("2016009");
		// System.out.println("ɾ���ɹ�");

	}

	@Test
	public void SCTest() {
//		for (int i = 1; i < 10; i++) {
//			SelectCourseInfo selectCourseInfo = new SelectCourseInfo("201600" + i, "����", "��163��", "�������ѧԺ", "����",
//					"����ʦ", 3);
//			selectCourseInfoDaoImpl.insertSC(selectCourseInfo);
//			System.out.println("����ɹ�" + i + "����");
//		}
		List<SelectCourseInfo> selectCourseInfo = selectCourseInfoDaoImpl.findSelectCourseInfo("学院");
		for (SelectCourseInfo selectCourseInfo2 : selectCourseInfo) {
			System.out.println(selectCourseInfo2);
		}
		
		List<ActivityInfo> findActivityInfo = activityInfoDaoImpl.findActivityInfo("学院");
		for (ActivityInfo activityInfo : findActivityInfo) {
			System.out.println(activityInfo);
		}
	}

	@Test
	public void ScoreTest() {
		for (int i = 0; i < 10; i++) {
			scoreInfoDaoImpl.insertScoreInfo(new ScoreInfo("201600" + i, "张三", "软工163班", "软件工程学院", "英语", "张老师", 88));
			System.out.println("插入" + i + "条数据");
		}
	}

	@Test
	public void RewardTest() {
		for (int i = 0; i < 10; i++) {
			rewardInfoDaoImpl
					.insertRewardInfo(new RewardInfo("201600" + i, "张三", "软工163班", "软件工程学院", "一等奖学金", "2018-10-1"));
			System.out.println("插入" + i + "条数据");
		}
	}

}
