package com.rest.repository;

import com.rest.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Sridharan Kuppa
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
