package com.training.application;

import com.training.model.Manager;
import com.training.model.Student;
import com.training.utils.AnnotationProcessor;

public class Application {

	public static void main(String[] args) {
	    AnnotationProcessor.handleDataTable(new Student());
	    AnnotationProcessor.handleDataTable(new Manager());

	}

}
