package ManagerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Mapper.ManagerMapper;
import managerInterface.ManagerService;
import model.Manager;

@Transactional
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerMapper managerMapper;
	public Manager queryManagerByName(Manager manager) {
		//��ѯ��������û�����������ȷʱ�򷵻ز�ѯ�����������ȷ���򷵻�null
		Manager result = managerMapper.queryManagerByName(manager);
		return result;
	}

	
}
