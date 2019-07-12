package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Expenses;

public interface IExpensesRepository extends PagingAndSortingRepository<Expenses, Integer> {

}
