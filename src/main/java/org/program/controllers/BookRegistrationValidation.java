package org.program.controllers;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.program.form.BookRegistrationForm;

@Component("bookRegistrationValidation")
public class BookRegistrationValidation {
	
	public boolean supports(Class<?> klass) {
		return BookRegistrationForm.class.isAssignableFrom(klass);
	}
		
		public void validate(Object target, Errors errors) {
			
			BookRegistrationForm bookRegistrationForm = (BookRegistrationForm) target;
			ValidationUtils.rejectIfEmpty(errors, "title", "Tytul nie moze byc pusty");
			ValidationUtils.rejectIfEmpty(errors, "author", "Pole autor nie moze byc puste");
			ValidationUtils.rejectIfEmpty(errors, "category", "Pole kategoria nie moze byc pusta");
			ValidationUtils.rejectIfEmpty(errors, "nsbn", "Pole nsbn nie moze byc puste");
			
			
		
		}
	}



