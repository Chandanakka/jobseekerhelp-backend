package net.jobseekerhelp.jobseekerhelpbackend.service;

import net.jobseekerhelp.jobseekerhelpbackend.entity.jobsavailable;
import net.jobseekerhelp.jobseekerhelpbackend.repository.jobsavailableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class jobsavailableservice {
    private final jobsavailableRepository JobsavailableRepository;

    @Autowired
    public jobsavailableservice(jobsavailableRepository repository) {
        this.JobsavailableRepository = repository;
    }

    public jobsavailable createEntity(jobsavailable Jobsavailable) {
        return JobsavailableRepository.save(Jobsavailable);
    }
    public List<jobsavailable> getAllEntities() {
        return JobsavailableRepository.findAll();
    }
}
