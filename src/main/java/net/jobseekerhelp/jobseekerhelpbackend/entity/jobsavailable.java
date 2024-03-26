package net.jobseekerhelp.jobseekerhelpbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobsavailable")
public class jobsavailable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date jobentrydate;
    private String jobcreator;
    private String jobtype; //Tech or non-tech
    private String jobrole; // ex: Project Manager. technical lead, programmer, accountant etc
    private String jobskillsrequired; // technology experience etc
    private String jobapplyemail;
    private String jobcurrentstatus; // open closed
    private Date jobclosedate;
    private String jobrefresult; // reference success / failure;
}
