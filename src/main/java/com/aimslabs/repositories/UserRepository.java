package com.aimslabs.repositories;

import com.aimslabs.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sayemkcn on 11/22/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

    User findByPhoneNumber(String phoneNumber);
}
