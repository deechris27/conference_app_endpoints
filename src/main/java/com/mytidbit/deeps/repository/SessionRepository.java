package com.mytidbit.deeps.repository;

import com.mytidbit.deeps.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
