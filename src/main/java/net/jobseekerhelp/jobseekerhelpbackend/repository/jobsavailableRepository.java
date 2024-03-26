package net.jobseekerhelp.jobseekerhelpbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.jobseekerhelp.jobseekerhelpbackend.entity.jobsavailable;

import java.util.Date;
import java.util.List;

public interface jobsavailableRepository extends JpaRepository<jobsavailable, Long> {

}
