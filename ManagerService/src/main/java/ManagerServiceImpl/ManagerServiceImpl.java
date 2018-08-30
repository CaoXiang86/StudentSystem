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
		//查询结果，当用户名和密码正确时则返回查询结果，若不正确，则返回null
		Manager result = managerMapper.queryManagerByName(manager);
		return result;
	}

	
}
