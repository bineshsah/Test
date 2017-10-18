package edu.mumsched.schedule;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Standard Layout System with Fragment Expressions usage example
 */
@Controller
@Secured("ROLE_USER")
class ScheduleController {
	Iterable<Schedule> scheduleList;

   
	 private final ScheduleService scheduleService;

	 ScheduleController(ScheduleService scheduleService) {
	        this.scheduleService = scheduleService;
	    }

	@ModelAttribute("module")
    public String module() {
        return "schedules";
    }

    @RequestMapping(value = "schedule", method = RequestMethod.GET)
    public String tasks(Model model) {
        model.addAttribute("schedules", scheduleService.findAll());
        return "schedule/schedule-list";
    }

    @RequestMapping(value = "schedule/{id}", method = RequestMethod.GET)
    public String task(@PathVariable("id") Long id, Model model) {
        model.addAttribute("schedule", scheduleService.findOne(id));
        return "schedule/schedule";
    }
}
