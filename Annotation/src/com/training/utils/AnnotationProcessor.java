package com.training.utils;

import com.training.annotaion.DataTable;
import com.training.model.Student;

public class AnnotationProcessor {
	public static void handleDataTable(Object cls)

	{
		try {
			Class intance = cls.getClass();

			DataTable annotationDataTable = (DataTable) intance.getAnnotation(DataTable.class);
			String tableName = annotationDataTable.tableName();
			System.out.println(tableName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
