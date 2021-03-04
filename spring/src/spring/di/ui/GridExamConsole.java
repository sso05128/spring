package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("������������������������������������");
		System.out.println("��total         avg��");
		System.out.printf("%3d            %3.2f\n", exam.total(), exam.avg());
	}


}
