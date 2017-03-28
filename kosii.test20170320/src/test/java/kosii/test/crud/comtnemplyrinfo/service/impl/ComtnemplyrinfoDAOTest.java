package kosii.test.crud.comtnemplyrinfo.service.impl;

import javax.annotation.Resource;

import kosii.test.crud.comtnemplyrinfo.service.ComtnemplyrinfoVO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/com/**/context-*.xml" })
public class ComtnemplyrinfoDAOTest {

	@Resource(name = "comtnemplyrinfoDAO")
	private ComtnemplyrinfoDAO comtnemplyrinfoDAO;

	@Test
	public void test() {

		ComtnemplyrinfoVO vo = new ComtnemplyrinfoVO();

		vo.setEmplyrId("bhs123");
		vo.setUserNm("배현석");
		vo.setPassword("12345");
		vo.setHouseAdres("뉴뇩 5번가");
		vo.setPasswordHint("힌트");
		vo.setPasswordCnsr("123");
		vo.setHouseEndTelno("7777");
		vo.setAreaNo("777");
		vo.setZip("555");
		vo.setHouseMiddleTelno("555");
		vo.setEmplyrSttusCode("1");
		vo.setEsntlId("abc");

		try {
			comtnemplyrinfoDAO.insertComtnemplyrinfo(vo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}