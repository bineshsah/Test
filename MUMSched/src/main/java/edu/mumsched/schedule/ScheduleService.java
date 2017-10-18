package edu.mumsched.schedule;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @PostConstruct
    private void init() {
        scheduleRepository.save(new Schedule("Oct", "Not automatically generated, remove, update, delete", "Draft"));
        scheduleRepository.save(new Schedule("Jan", "2017.10.18 15:22:42, delete", "Draft"));
    }

    Iterable<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    public Schedule findOne(Long id) {
        return scheduleRepository.findOne(id);
    }
}
