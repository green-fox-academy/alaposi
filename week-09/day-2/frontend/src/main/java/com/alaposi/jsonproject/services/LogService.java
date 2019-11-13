package com.alaposi.jsonproject.services;

import com.alaposi.jsonproject.models.Log;
import com.alaposi.jsonproject.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService implements ILogService {

  LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void save(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> listAllLog() {
    List<Log> logs = new ArrayList<>();
    logRepository.findAll().forEach(logs::add);
    return logs;
  }
}
