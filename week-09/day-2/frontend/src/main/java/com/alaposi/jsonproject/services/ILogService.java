package com.alaposi.jsonproject.services;

import com.alaposi.jsonproject.models.Log;

import java.util.List;

public interface ILogService {
  void save(Log log);
  List<Log> listAllLog();

}
