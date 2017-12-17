package com.sukerin.DAO;

import com.sukerin.Model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Albert on 2017/12/16.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserDAO extends PagingAndSortingRepository<User, Long> {

}
