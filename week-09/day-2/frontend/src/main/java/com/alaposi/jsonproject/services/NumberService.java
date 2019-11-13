package com.alaposi.jsonproject.services;

import com.alaposi.jsonproject.models.Number;
import com.alaposi.jsonproject.repositories.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberService {
  private NumberRepository numberRepository;

  @Autowired
  public NumberService(NumberRepository numberRepository) {
    this.numberRepository = numberRepository;
  }

  public List<Number> getNumbers() {
    return this.numberRepository.getAllNumbers();
  }

//  public Number getDoubledNumber(int inputNumber) {
//    Number newNumber = new Number(inputNumber);
//    numberRepository.addNumbers(newNumber);
//    numberRepository.getNumber(inputNumber).setResult(inputNumber * 2);
//    return newNumber;
//  }

  public int sum(int number) {
    int result = 0;
    for (int i = 0; i < number + 1; i++) {
      result += i;
    }
    return result;
  }

  public int factor(int number) {
    int result = 1;
    for (int i = 1; i < number + 1; i++) {
      result *= i;
    }
    return result;
  }

  public int sumArray(int[] numbers) {
    int result = 0;
    for (int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }

  public int multiplyArray(int[] numbers) {
    int result = 1;
    for (int i = 0; i < numbers.length; i++) {
      result *= numbers[i];
    }
    return result;
  }

  public int[] doubleArray(int[] numbers) {
    int[] result = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      result[i] = numbers[i] * 2;
    }
    return result;
  }
}
