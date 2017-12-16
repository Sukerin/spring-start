package com.sukerin.DAO;

import com.sukerin.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Albert on 2017/12/16.
 */
public interface UserDAO extends PagingAndSortingRepository<User, Long> {

}
