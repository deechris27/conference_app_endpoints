package com.mytidbit.deeps.repository;

import com.mytidbit.deeps.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
