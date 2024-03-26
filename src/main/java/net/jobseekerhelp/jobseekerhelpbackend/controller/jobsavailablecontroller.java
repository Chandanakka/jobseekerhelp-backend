package net.jobseekerhelp.jobseekerhelpbackend.controller;

import net.jobseekerhelp.jobseekerhelpbackend.entity.jobsavailable;
import net.jobseekerhelp.jobseekerhelpbackend.service.jobsavailableservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")

public class jobsavailablecontroller {
    private final jobsavailableservice Jobsavailableservice;

    @Autowired
    public jobsavailablecontroller(jobsavailableservice Jobsavailableservice) {
        this.Jobsavailableservice = Jobsavailableservice;
    }

    @PostMapping("/api/jobsavailable")
    public jobsavailable createEntity(@RequestBody jobsavailable Jobsavailable) {
        return Jobsavailableservice.createEntity(Jobsavailable);
    }
    @GetMapping("/api/jobslist")
    public List<jobsavailable> getAllEntities() {
        return Jobsavailableservice.getAllEntities();
    }
}
