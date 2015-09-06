package com.mycompany.service;

import java.util.List;

import com.mycompany.model.customer;
import com.mycompany.repository.HibernateCustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.mycompany.service.CustomerService#findAll()
	 */
	private HibernateCustomerRepoImpl repo;

	public CustomerServiceImpl( )
	{
	}

	public CustomerServiceImpl( HibernateCustomerRepoImpl repo)
	{
		this.repo = repo;
	}
	@Override
	public List<customer> findAll()
	{
		return repo.findAll();
	}

	public void setRepo(HibernateCustomerRepoImpl repo) {
		this.repo = repo;
	}

}
